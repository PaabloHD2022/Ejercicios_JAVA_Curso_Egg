/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12ejer1;

import guia12ejer1.entidad.Animal;
import guia12ejer1.entidad.Caballo;
import guia12ejer1.entidad.Gato;
import guia12ejer1.entidad.Perro;
import java.util.ArrayList;

/**
 *
 * @author eglys
 */
public class Guia12Ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList <Animal> animales = new ArrayList();
        
        Animal a= new Animal();
        Animal b= new Perro();
        Animal c= new Gato();
        
        animales.add(a);
        animales.add(b);
        animales.add(c);
        
        for (Animal animale : animales) {
            animale.hacerRuido();
        }
        
        Animal perro1= new Perro("Manchas", "Perrarina", 10, "pitbull");
        Animal gato1= new Gato("Pelusa", "galletas", 5, "siames");
        Animal caballo1= new Caballo("Spark", "pasto", 8, "fino");
        
        perro1.alimentarse();
        gato1.alimentarse();
        caballo1.alimentarse();
        
        
        
    }
    
}
