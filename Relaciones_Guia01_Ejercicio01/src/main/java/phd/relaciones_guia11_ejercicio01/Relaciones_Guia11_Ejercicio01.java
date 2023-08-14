

package phd.relaciones_guia11_ejercicio01;

import entidad.Perro;
import entidad.Persona;

/**Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 *
 * @author Pablo Demartini
 */
public class Relaciones_Guia11_Ejercicio01 {

    public static void main(String[] args) {
        
        
        Perro perro1 = new Perro("Chiquito", "Callejero", 5, "mediano");         
        Perro perro2 = new Perro("Grandote", "Callejero", 5, "Grande");       
        Persona p1 = new Persona("Pedro", "Perez", 34, 20220220, perro1);        
        Persona p2 = new Persona("Carlos", "Perez", 35, 20225225, perro2);
                
//        System.out.println(p1.toString());
//        System.out.println(p2.toString());  

         p1.mostrar();
         p2.mostrar();
         
    }
}
