/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ejerciciosextra_01;

import Cancion.Cancion;

/**Desarrollar una clase Cancion con los siguientes atributos: título y autor. 
 * Se deberá definir además dos constructores: uno vacío que inicializa el título y el autor a cadenas vacías 
 * y otro que reciba como parámetros el título y el autor de la canción. Se deberán además definir los métodos 
 * getters y setters correspondientes.
 *
 * @author Pablo Demartini
 */
public class POO_EjerciciosExtra_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cancion C1 = new Cancion();
        
        C1.crearCancion();
        
        System.out.println("El titulo de la cancion es: "+ C1.getTitulo() + " y el autor de la misma es: " + C1.getAutor());
    }
    
}
