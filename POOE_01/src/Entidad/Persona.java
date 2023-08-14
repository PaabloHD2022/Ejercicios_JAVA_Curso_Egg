/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Pablo Demartini
 */
  public class Persona {

    public Persona() {
    }
    
    public String nombre;
    public int edad;
    public String sexo;
    public int Dni;
    public double altura; 

    public Persona(String nombre, int edad, String sexo, int Dni, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.Dni = Dni;
        this.altura = altura;
    }   
}

