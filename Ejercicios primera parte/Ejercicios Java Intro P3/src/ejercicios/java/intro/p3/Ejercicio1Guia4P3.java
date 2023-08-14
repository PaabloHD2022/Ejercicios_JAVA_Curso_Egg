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
public class Ejercicio1Guia4P3 {

    /**Crea una aplicación que le pida dos números al usuario y este pueda elegir 
     * entre sumar, restar, multiplicar y dividir. La aplicación debe tener una función
     * para cada operación matemática y deben devolver sus resultados para imprimirlos en el main.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2;
        
        System.out.println("Ingrese el primer número: ");
        num1 = input.nextDouble();
        
        System.out.println("Ingrese el segundo número: ");
        num2 = input.nextDouble();
        
        System.out.println("Seleccione la operación matemática: ");
        System.out.println("-------------------------------------");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("-------------------------------------");
        int opcion = input.nextInt();
        
        double resultado;
        
        switch (opcion) {
            case 1:
                resultado = sumar(num1, num2);
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 2:
                resultado = restar(num1, num2);
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case 3:
                resultado = multiplicar(num1, num2);
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            case 4:
                resultado = dividir(num1, num2);
                System.out.println("El resultado de la división es: " + resultado);
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                break;
        }
    }
    
    public static double sumar(double num1, double num2) { //Funcion suma.
        return num1 + num2;
    }
    
    public static double restar(double num1, double num2) { //Funcion resta.
        return num1 - num2;
    }
    
    public static double multiplicar(double num1, double num2) { //Funcion multiplicar.
        return num1 * num2;
    }
    
    public static double dividir(double num1, double num2) { // Funcion division.
        if (num2 == 0) {
            System.out.println("Error: División por cero no permitida.");
            return 0;
        } else {
            return num1 / num2;
        }
    }
}












//Esta aplicación le pide al usuario dos números, luego le permite seleccionar una operación matemática 
//(sumar, restar, multiplicar o dividir) y realiza la operación correspondiente utilizando funciones separadas 
//para cada operación. El resultado se imprime en la consola. 

//Ten en cuenta que se ha incluido una validación para evitar la división por cero.





