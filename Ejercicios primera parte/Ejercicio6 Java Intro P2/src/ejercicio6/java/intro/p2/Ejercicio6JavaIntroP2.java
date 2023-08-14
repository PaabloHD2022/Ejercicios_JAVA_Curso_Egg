/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6.java.intro.p2;

import java.util.Scanner;

/**
 *
 * @author Pablo Demartini
 */
public class Ejercicio6JavaIntroP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        int num1;
        int num2;
        
        System.out.println("Por favor ingrese un numero: ");
        
        num1 = leer.nextInt();
        
        System.out.println("Por favor ingrese otro numero: ");
        
        num2 = leer.nextInt();
        
        if (num1 > 25){
            
        System.out.println("El primer numero ingresado es mayor a 25");        
        }
        else{
            
        System.out.println("El primer numero ingresado es menor a 25");
        }
        if (num2 > 25){
            
        System.out.println("El segundo numero ingresado es mayor a 25");            
        }
        else {
      
        System.out.println("El segundo numero ingresado es menor a 25");
        }
    }
}
