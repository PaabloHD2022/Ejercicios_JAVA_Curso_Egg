/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12ejer1.entidad;

/**
 *
 * @author eglys
 */
public class Gato extends Animal{

    public Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    public Gato() {
    }
    
    
    @Override
    public void hacerRuido(){
        System.out.println("Miau");
    }
    
    @Override
    public void alimentarse(){
        System.out.println("Yo me alimento de galletas");
    }
}
