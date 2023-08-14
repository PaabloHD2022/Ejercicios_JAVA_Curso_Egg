/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;


import Entidades.CuentaBancaria;
import java.util.Scanner;

/**Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos: numeroCuenta(entero), 
 * dniCliente(entero largo), saldoActual. Agregar constructor vacío, con parámetros, getters y setters.

 Agregar la clase ServicioCuentaBancaria en el paquete Servicios que contenga:
a - Método para crear cuenta pidiéndole los datos al usuario.
b - Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
c - Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. 
    Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
d - Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
e - Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
f - Método consultarDatos: permitirá mostrar todos los datos de la cuenta.

 *
 * @author Pablo Demartini
 */
public class ServicioCuentaBancaria {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public CuentaBancaria crearCuentaBancaria() {
        System.out.println("Ingrese el número de cuenta:");
        int numeroCuenta = leer.nextInt();
        System.out.println("Ingrese el DNI del cliente:");
        long dniCliente = leer.nextLong();
        System.out.println("Ingrese el saldo inicial:");
        double saldoActual = leer.nextDouble();

        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
    }

    public void depositarDinero(CuentaBancaria cuenta, double cantidadDeposito) {
        System.out.println("Ingrese el monto a depositar:");
        cantidadDeposito = leer.nextDouble();
        cuenta.setSaldoActual(cuenta.getSaldoActual() + cantidadDeposito);
    }

    public void retirarDinero(CuentaBancaria cuenta, double cantidadRetiro){
        System.out.println("Ingrese el monto a retirar");
        cantidadRetiro = leer.nextDouble();
        double saldoActual = cuenta.getSaldoActual();
        double retiro = (saldoActual >= cantidadRetiro) ? cantidadRetiro : saldoActual;
        cuenta.setSaldoActual(saldoActual - retiro);
    }

    public void extraccionRapida(CuentaBancaria cuenta) {
        System.out.println("Se extrajo " + (cuenta.getSaldoActual() * 0.2));
        cuenta.setSaldoActual(cuenta.getSaldoActual() * 0.8);
    }

    public void consultarSaldo(CuentaBancaria cuenta) {
        System.out.println("Saldo actual: " + cuenta.getSaldoActual());
    }

    public void consultarDatos(CuentaBancaria cuenta) {
        System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("DNI del cliente: " + cuenta.getDniCliente());
        System.out.println("Saldo actual: " + cuenta.getSaldoActual());
    }
}




//        //Instanciacion
//        CuentaBancaria cuentaNueva = new CuentaBancaria();
//        //Asignacion de atributos
//        System.out.println("Ingrese numero de cuenta:");
//        cuentaNueva.setNumeroCuenta(leer.nextInt());
//        System.out.println("Ingrese su DNI:");
//        cuentaNueva.setDniCliente(leer.nextLong());
//        System.out.println("Ingrese el saldo a depositar:");
//        cuentaNueva.setSaldoActual(leer.nextDouble());
//        //Retorno
//        return cuentaNueva();
//    } 
//    
//    public void ingresarDinero(double deposito, CuentaBancaria cuenta){
//        double ctaAux = cuenta.getSaldoActual()+deposito;
//        cuenta.setSaldoActual(ctaAux);
//    }
//    
//    public void consultarSaldo(CuentaBancaria cuenta){
//        System.out.println("El saldo actual es: "+cuenta.getSaldoActual());
//    }
//    
//    public void retirarDinero(CuentaBancaria cuenta, double retiro){
//        System.out.println("¿Cuanto dinero desea retirar?");
//        retiro = leer.nextDouble();
//        System.out.println("Usted desea retirar: "+retiro);
//        System.out.println("El saldo actual es de: "+cuenta.getSaldoActual());
//        
//        if (retiro > cuenta.getSaldoActual()) {
//            cuenta.setSaldoActual(cuenta.getSaldoActual()-cuenta.getSaldoActual());
//            System.out.println("Se retirara: "+cuenta.getSaldoActual());
//        }
//    }                 
//    
//    public void extraccionRapida(CuentaBancaria cuenta, double extraccion){
//        System.out.println("Extraccion rapida, ingrese el monto a retirar:");
//        extraccion = leer.nextDouble();
//        
//        if (extraccion > cuenta.getSaldoActual()*0.2) {
//            System.out.println("No se puede realizar la extraccion, el monto supera el 20% del saldo actual");
//        } else {
//            cuenta.setSaldoActual(cuenta.getSaldoActual()-extraccion);
//            System.out.println("El nuevo saldo es de: "+cuenta.getSaldoActual());
//        }
//    }
//    
//    public void consultarDatos(CuentaBancaria cuentaNueva){
//        System.out.println("La info de su cuenta es: "+cuentaNueva.toString());
//    }

