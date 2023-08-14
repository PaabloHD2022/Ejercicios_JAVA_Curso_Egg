/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.java.intro.p3;

import java.util.Scanner;

/**Diseñe una función que pida el nombre y la edad de N personas e imprima los datos 
 * de las personas ingresadas por teclado e indique si son mayores o menores de edad. 
 * Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
 * mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 *
 * @author Pablo Demartini
 */
public class Ejercicio2Guia4P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String seguir = "Si"; //Variable seguir que se inicializa con "Sí".
        
        while (seguir.equalsIgnoreCase("Si")) {
            
            System.out.print("Ingrese el nombre: "); //Se pide el ingreso del nombre.
            String nombre = leer.nextLine();
            
            System.out.print("Ingrese la edad: "); //Se pide el ingreso de la edad.
            int edad = leer.nextInt();
            leer.nextLine(); // Limpiar el buffer
            
            String mensaje; //Validamos la edad para ver si son mayor o menor de edad.
            if (edad >= 18) {
                mensaje = "es mayor de edad";
            } else {
                mensaje = "es menor de edad";
            }
            
            System.out.println(nombre + " " + mensaje);
            
            System.out.print("¿Quiere seguir mostrando personas? (Si/No): ");
            seguir = leer.nextLine();
        }        
        System.out.println("Fin del programa.");
        leer.close();
    }
}

