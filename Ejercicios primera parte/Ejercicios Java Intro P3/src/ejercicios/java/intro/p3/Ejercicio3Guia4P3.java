/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.java.intro.p3;

import java.util.Scanner;

/**
 *
 * @author Pablo Demartini
 */
public class Ejercicio3Guia4P3 {

    /**Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda, 
     * estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de euros y la moneda a convertir 
     * que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
     
     * El cambio de divisas es:
     * 0.86 libras es un 1 €
     * 1.28611 $ es un 1 €
     * 129.852 yenes es un 1 €

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);        
        System.out.print("Introduce una cantidad de euros: "); //Ingresar la cantidad de euros        
        double euros = leer.nextDouble(); //Leer los euros.        
        System.out.print("Introduce la moneda a convertir (dolares, yenes o libras): "); //Seleccionar la moneda a convertir los euros.        
        String moneda = leer.next(); //Leer moneda        
        
        convertirMoneda(euros, moneda); // La funcion recibe como parametros la cantidad de euros y la moneda a convertir.
    }
    
    public static void convertirMoneda(double euros, String moneda) {
        double cambio = 0;
               
        switch(moneda) {
            case "dolares":
                cambio = 1.18;
                break;
            case "yenes":
                cambio = 129.58;
                break;
            case "libras":
                cambio = 0.86;
                break;
            default:
                System.out.println("Moneda no válida.");
                return;
        }
        double resultado = euros * cambio;        
        System.out.println(euros + " €uros equivalen a: " + resultado + " " + moneda);
    }
}














//La función convertirMoneda recibe la cantidad de euros y la moneda a convertir como parámetros 
//y utiliza una estructura de control switch para determinar el tipo de cambio correspondiente a la moneda. 
//Luego realiza la conversión y muestra el resultado por pantalla utilizando System.out.printf. 
//El símbolo de la moneda se guarda en la variable simbolo para incluirlo en el mensaje de salida.

//En el método main se solicita al usuario que introduzca la cantidad de euros y la moneda a convertir, 
//y se llama a la función convertirMoneda con estos valores.