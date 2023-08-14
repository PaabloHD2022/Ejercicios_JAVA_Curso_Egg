/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.clase.pkg2;

import java.util.Scanner; //Se importa cuando utilizas Scanner.

/**
 *
 * @author Pablo Demartini
 */
public class EjerciciosClase2 {
    /*
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*-----------------------------------------------------------------------------------------------*/
        
        /*Ejercicio 1: Escribir un programa que pida dos números enteros por teclado y calcule
             la suma de los dos. El programa deberá después mostrar el resultado de la suma*/
        
        /*Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese un numero por favor: "); //Pide al usuario que ingrese un numero
        
        int numEntero1 = leer.nextInt(); // Lo guarda en una variable
        
        System.out.println("Ingrese otro numero por favor: "); //Vuelve a pedir al usuario que ingrese un numero
        
        int numEntero2 = leer.nextInt(); // Lo guarda en otra variable
        
        int sumaNum = numEntero1 + numEntero2; // Realiza la suma de las dos variables
        
        System.out.println("La suma de los numeros ingresados es: " + sumaNum); //Muestra por pantalla la suma de los numeros ingresados*/
               
        /*-----------------------------------------------------------------------------------------------*/
        
        /*Ejercicio 2: Escribir un programa que pida tu nombre, lo guarde en una variable y lo
             muestre por pantalla. */
        
        /*Scanner leer = new Scanner (System.in);
        
        System.out.println("Escriba un numero: "); //Pide ingresar al usuario un numero
        
        int numero = leer.nextInt(); // Guarda ese numero en una variable llamada "numero"
        
        System.out.println("El numero es: " + numero); //Muestra por pantalla el numero ingresado guardado en la variable numero*/
        
        /*-----------------------------------------------------------------------------------------------*/
        
        /* Ejercicio 3: Pedir al usuario que ingrese una frase y que el programa la muestre
         * y la convierta a mayusculas y minusculas...
        Nota: investigar la función toUpperCase() y toLowerCase() en Java.
        
        /*Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese una frase por favor: "); //Pide al usuario ingresar una frase
        
        String frase = leer.nextLine(); // Lee la frase ingresada 
                                        // "leer.next lee la primer palabra de la frase.
                                        // "leer.nextLine lee la frase completa.
        
        String fraseMayusculas = frase.toUpperCase(); //Convierte la frase a mayusculas
        
        String fraseMinusculas = frase.toLowerCase(); //Convierte la frase a minusculas
        
        System.out.println("La frase es: " + frase);
        System.out.println("La frase en minusculas es: " + fraseMinusculas);
        System.out.println("La frase en mayusculas es: " + fraseMayusculas);   */
        
        /*-----------------------------------------------------------------------------------------------*/
        
        /* Ejercicio 4:  Dada una cantidad de grados centígrados se debe mostrar su
            equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
        
        /*Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de grados centigrados ");
        
        float gradosC = leer.nextInt();
        
        float gradosF = 32 + (9 * gradosC / 5);
        
        System.out.println("Los grados centigrados ingresados equivalen a: " + gradosF + " grados Farenheit");*/
        
        /*-----------------------------------------------------------------------------------------------*/
        
        /* Ejercicio 5: Escribir un programa que lea un número entero por teclado y muestre
           por pantalla el doble, el triple y la raíz cuadrada de ese número.
           Nota: investigar la función Math.sqrt().*/
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero por favor: "); //Pide ingresar un numero
        
        int numero = leer.nextInt(); //Guarda ese numero en una variable
        
        int doble = numero * 2; // En la variable doble se calcula el doble del numero ingresado
        
        int triple = numero * 3; // En la variable triple se calcula el triple del numero ingresado
        
        double raizCuadrada = Math.sqrt(numero); //En la variable raizCuadrada se calcula la raiz del numero ingresado con la funcion
        // Math.sqrt() pasando como parametro a la funcion el numero ingresado "Math.sqrt(numero)"
        
        System.out.println("El doble del numero ingresado es: " + doble); //Muestra el doble del numero ingresado
        
        System.out.println("El triple del numero ingresado es: " + triple); //Muestra el triple del numero ingresado
        
        System.out.println("La raiz cuadrada del numero ingresado es: " + raizCuadrada); //Muestra la raiz cuadrada del numero ingresado
    }
}



