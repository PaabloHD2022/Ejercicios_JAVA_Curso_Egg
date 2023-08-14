/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_claseservicio_ejercicio_02;

import Servicio.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author Pablo Demartini
 */
public class POO_ClaseServicio_Ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        CafeteraServicio cafe1 = new CafeteraServicio(); //Instanciamos
        
        String opcion;
        
        do{
            System.out.println("Bienvenido al Programa Nespresso...");
            System.out.println("----------------------------");
            System.out.println("Elija una opción del menú:");
            System.out.println("----------------------------");
            System.out.println("A - Llenar cafetera");
            System.out.println("B - Servir Taza");
            System.out.println("C - Vaciar Cafetera");
            System.out.println("D - Volver a llenar cafetera");
            System.out.println("E - Salir");
            System.out.println("----------------------------");
        
        opcion = leer.next();
            
        switch(opcion){
            case "A":
                cafe1.llenarCafetera();
            break;
            
            case "B":
                System.out.println("Ingrese la medida de la taza 1 - pequeña / 2 - grande");
                int taza= leer.nextInt();
                cafe1.servirTaza(taza);
                cafe1.mostrar();
            break;
            
            case "C":
                cafe1.vaciarCafetera();
                cafe1.mostrar();
            break;
            
            case "D":
                cafe1.rellenarCafetera();
                cafe1.mostrar();    
            break; 
            
            case "E":
                System.out.println("Ha salido correctamente del menú");    
            break; 
            }
        
        }while (opcion != "E");
    }    
}
