/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooe_01;

import Entidad.Persona;

/**
 *
 * @author Pablo Demartini
 */
public class POOE_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {         
        
          //Instanciacion utilizando el constructor con datos
          Persona Persona1 = new Persona("Abril", 13, "Femenino", 33333333, 1.60);
          Persona Persona2 = new Persona("Dante", 9, "Masculino", 33333333, 1.10);
          Persona Persona3 = new Persona("Noe", 47, "Femenino", 25252525, 1.65);
          Persona Persona4 = new Persona("Pablo", 52, "Masculino", 20222222, 1.74);          

          //Instanciacion utilizando el constructor vacio  

//          Persona Persona1 = new Persona();
//          Persona Persona2 = new Persona();
//          Persona Persona3 = new Persona();
//          Persona Persona4 = new Persona();
          
          Persona1.nombre = "Abril";
          Persona1.edad = 13;
          Persona1.sexo = "Femenino";
          Persona1.Dni = 33333333;
          Persona1.altura = 1.60;

          Persona2.nombre = "Dante";
          Persona2.edad = 9;
          Persona2.sexo = "Masculino";
          Persona2.Dni = 33333333;
          Persona2.altura = 1.10;
         
          Persona3.nombre = "Noe";
          Persona3.edad = 47;
          Persona3.sexo = "Femenino";
          Persona3.Dni = 33333333;
          Persona3.altura = 1.65;
          
          Persona4.nombre = "Pablo";
          Persona4.edad = 52;
          Persona4.sexo = "Masculino";
          Persona4.Dni = 20222222;
          Persona4.altura = 1.74;
          
          //Mostramos los datos en pantalla
          
          System.out.println("Nombre: " + Persona1.nombre + " - " + "Edad: " + Persona1.edad+ " - " + "Sexo: " + Persona1.sexo);
          System.out.println("Nombre: " + Persona2.nombre + " - " + "Edad: " + Persona2.edad+ " - " + "Sexo: " + Persona2.sexo);
          System.out.println("Nombre: " + Persona3.nombre + " - " + "Edad: " + Persona3.edad+ " - " + "Sexo: " + Persona3.sexo);
          System.out.println("Nombre: " + Persona4.nombre + " - " + "Edad: " + Persona4.edad+ " - " + "Sexo: " + Persona4.sexo);
    }   
}
