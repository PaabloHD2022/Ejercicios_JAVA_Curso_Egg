/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7.java.intro.p2;

import java.util.Scanner;

/**
 *
 * @author Pablo Demartini
 */
public class Ejercicio7JavaIntroP2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int opcion;
        
        System.out.println("Por favor ingrese el numero de motor: ");
        
        opcion = leer.nextInt();
        
        switch(opcion){
            case 1:                
                System.out.println("La bomba es una bomba de agua");
            break;
            
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
            break;
            
            case 3:
                System.out.println("La bomba es una bomba de hormigon");
            break;
            
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
            break;            
            
            default:
                System.out.println("No existe un valor válido para tipo de bomba”");                                   
        }       
    }   
}
