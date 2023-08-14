/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuenta;

import java.util.Scanner;

/**Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, crea un método "retirar_dinero" 
 * que permita retirar una cantidad de dinero del saldo de la cuenta. 
 * Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.
 *
 * @author Pablo Demartini
 */
public class Cuenta {
    
    Scanner leer = new Scanner(System.in);
    
    public int saldoInicial;
    public int retiro;
    public String titular;
    public int opcion;
    public int deposito;
    public String desicion;

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public Cuenta() {
    }

    public Cuenta(int saldoInicial, int retiro, String titular, int opcion, int deposito, String desicion) {
        this.saldoInicial = saldoInicial;
        this.retiro = retiro;
        this.titular = titular;
        this.opcion = opcion;
        this.deposito = deposito;
        this.desicion = desicion;
    }   
    
    public void crearRetirar_Dinero(){
            saldoInicial = 10000;           
            
            do{
                System.out.println("Ingrese el nombre del titular de la cuenta");
                titular = leer.nextLine();
            
                System.out.println("Hola: " + titular + " Elija una de las siguientes opciones:");
            
                System.out.println("---------------------");
                System.out.println("--------Menú---------");
                System.out.println("---------------------");
                System.out.println("1 - Retirar dinero");
                System.out.println("2 - Ingresar dinero");
                System.out.println("3 - Salir");
                System.out.println("---------------------");
            
                opcion = leer.nextInt();
                       
            switch (opcion) {
            case 1:
                System.out.println("Ingrese el monto a retirar");
                retiro = leer.nextInt();
                if(retiro <= saldoInicial){
                saldoInicial-=retiro;
                System.out.println("----------------------------------------");
                System.out.println("El monto a retirar es: $" + retiro);
                System.out.println("Nuevo saldo: $" + saldoInicial);
                System.out.println("----------------------------------------");
                }else{
                System.out.println("--------------------------------------------------------------");
                System.out.println("no dispone del saldo suficiente para realizar esta transacción");
                System.out.println("Saldo disponible: $" + saldoInicial);
                System.out.println("--------------------------------------------------------------");
            }    
                break;
            
            case 2:
                System.out.println("Ingrese el monto a depositar");
                deposito = leer.nextInt();
                if(deposito > 0){
                saldoInicial+=deposito;
                System.out.println("----------------------------------------");
                System.out.println("El monto a depositar es: $" + deposito);
                System.out.println("Nuevo saldo: $" + saldoInicial);
                System.out.println("----------------------------------------");
                }else{
                System.out.println("----------------------------------------");
                System.out.println("El monto ingresado no corresponde");
                System.out.println("----------------------------------------");                
            }
                break;
            
            case 3:               
                System.out.println("Seguro desea salir? SI/NO");
                desicion = leer.next();
                
                if(desicion == "SI"){
                    System.out.println("Ha salido correctamente");
                }
            default:           
            }
        }while(desicion != "NO");    
    }           
}
            
























//            System.out.println("-----------------------------------------------");
//            System.out.println("Hola " + titular + " ingrese el monto a retirar");
//            do{
//            
//            System.out.println("-----------------------------------------------");
//            System.out.println("Su saldo disponible es: $" + saldoInicial);
//            System.out.println("-----------------------------------------------");
//            
//            retiro = leer.nextInt();
//
//            if(retiro <= saldoInicial){
//                saldoInicial-=retiro;
//            System.out.println("----------------------------------------");
//                System.out.println("El monto a retirar es: $" + retiro);
//                System.out.println("Nuevo saldo: $" + saldoInicial);
//            System.out.println("----------------------------------------");
//            }else{
//                System.out.println("--------------------------------------------------------------");
//                System.out.println("no dispone del saldo suficiente para realizar esta transacción");
//                System.out.println("Saldo disponible: $" + saldoInicial);
//                System.out.println("--------------------------------------------------------------");
//            }       
//        }while(saldoInicial !=0);
//        System.out.println("El titular no corresponde.");
//    }

    
