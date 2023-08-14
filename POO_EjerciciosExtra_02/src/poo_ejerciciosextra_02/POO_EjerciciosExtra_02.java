/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ejerciciosextra_02;

import Puntos.Puntos;

/**
 *
 * @author Pablo Demartini
 */
public class POO_EjerciciosExtra_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Puntos D1 = new Puntos();
        
        D1.crearPuntos();
        
        System.out.println("La distancia entre los puntos es: " + D1.calcularDistancia());            
    }    
}
