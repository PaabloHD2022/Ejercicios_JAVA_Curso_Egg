/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ejerciciosextra_03;

import Juego.Juego;

/**
 *
 * @author Pablo Demartini
 */
public class POO_EjerciciosExtra_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Juego J1 = new Juego();
        
        J1.iniciar_juego(); 
        
        System.out.println("Ganeste " + J1.ganados + " vez/veces en " + J1.intentos + " intentos");
        System.out.println("");
    }    
}
