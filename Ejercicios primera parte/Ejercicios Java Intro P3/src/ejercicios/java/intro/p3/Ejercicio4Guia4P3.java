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
public class Ejercicio4Guia4P3 {

    /**Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por parámetro para que nos indique 
    * si es o no un número primo, debe devolver true si es primo, sino false.
    * Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, 
    * sin embargo, 17 si es primo.

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = leer.nextInt();        
        
            if (esPrimo(numero)){
                System.out.println(numero + " es un número primo.");
            }else{
                System.out.println(numero + " no es un número primo.");
            }       
    }
    
    //Funcion que define si el numero ingresado es primo...
    public static boolean esPrimo(int numero) {
        boolean prime = false;
        int contador = 0;
            
        for( int i = 1; i<=numero ; i++){
            
        double resultado = numero % i;
        if (resultado == 0){
            contador++;
        }
    }
        if (contador == 2){
            prime = true;
        }
        return prime;
    }
}