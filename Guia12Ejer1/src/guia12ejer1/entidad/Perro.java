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
public class Perro extends Animal {

    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    public Perro() {
    }
    
    
    @Override
    public void hacerRuido(){
        System.out.println("Guao");
    }
    
    @Override
    public void alimentarse(){
        System.out.println("Yo me alimento de perrarina");
    }
}
