/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exceptions_guia13_ejercicio08;

import static entidad.Uno.metodo1;
import static entidad.Dos.metodo2;
import static entidad.Tres.metodo3;

/**
 *
 * @author Pablo Demartini
 */
public class Exceptions_Guia13_Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
        System.out.println( metodo1 ()) ;
        } catch(Exception e) {
        System.err.println("Excepcion en metodo () " ) ;
        e.printStackTrace();
        }
    }
        
}
    

