
package poo_ejercicios_guia_practica_04;

import Rectangulo.Rectangulo;

/* Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura. 
 * La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario. 
 * También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo. 
 * Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. 
 * Se deberán además definir los métodos getters, setters y constructores correspondientes.
 * Superficie = base * altura / Perímetro = (base + altura) * 2.
 *
 * @author Pablo Demartini
 */
public class Ejercicio_04 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Rectangulo R1 = new Rectangulo();
        
        R1.crearRectangulo();
        
        System.out.println("La superficie del rectangulo es: " + R1.Superficie());
        System.out.println("El perimetro del rectangulo es: " +R1.Perimetro());
        System.out.println("Representacion del rectangulo con asteriscos es: "+ R1.RectAsteriscos());
    }    
}
