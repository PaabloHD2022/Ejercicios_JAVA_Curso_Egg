/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectangulo;

import java.util.Scanner;

/**Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método "calcular_area" 
 * que calcule y devuelva el área del rectángulo. Luego crea un objeto "rectangulo1" de la clase "Rectángulo" 
 * con lados de 4 y 6 y imprime el área del rectángulo.

 *
 * @author Pablo Demartini
 */
public class Rectangulo {
    
    Scanner leer = new Scanner(System.in);
    
     public int lado1;
     public int lado2;
     public int area;
     
     public void crearCalcular_Area(){
         
         System.out.println("Ingrese el valor del lado1:");
         lado1 = leer.nextInt();
         System.out.println("Ingrese el valor del lado2:");
         lado2 = leer.nextInt();
         area = lado1 * lado2;
         
         System.out.println("El area del rectángulo es: " + area);         
     }
}
