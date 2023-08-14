/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_claseservicio_ejercicio_01;

import Entidades.CuentaBancaria;
import java.util.Scanner;
import Servicios.ServicioCuentaBancaria;

/**
 *
 * @author Pablo Demartini
 */
public class POO_ClaseServicio_Ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner leer = new Scanner(System.in);

    ServicioCuentaBancaria Servicio = new ServicioCuentaBancaria();
    
        int opcion;
    do{
       System.out.println("Ingrese una opcion:");
        System.out.println("");
        System.out.println("----------Menú----------");
        System.out.println("1 - Ingresar dinero");
        System.out.println("2 - Retirar dinero");
        System.out.println("3 - Extraccion rápida");
        System.out.println("4 - COnsulta de saldo");
        System.out.println("5 - Consultar datos de cuenta");
        System.out.println("6 - Salir");
        System.out.println("");        
        
        CuentaBancaria cuenta1 = Servicio.crearCuentaBancaria();
        opcion = leer.nextInt();
        switch(opcion){

            case 1:
                Servicio.depositarDinero(cuenta1, opcion);
            break;

            case 2:           
                Servicio.retirarDinero(cuenta1, opcion);
            break;

            case 3:
                Servicio.extraccionRapida(cuenta1);
            break;

            case 4:
               Servicio.consultarSaldo(cuenta1);
            break;

            case 5:
                Servicio.consultarDatos(cuenta1);
            break;

            case 6:
                System.out.println("Ha salido correctamente");
            break;
            } 
        }while (opcion !=6);
    }
}


