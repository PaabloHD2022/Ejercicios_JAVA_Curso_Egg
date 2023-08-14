/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Raices;
import java.util.Scanner;


/**Luego, en RaicesServicio las operaciones que se podrán realizar 
 * son las siguientes:
 * 
A Método getDiscriminante(): devuelve el valor del discriminante (double). 
* El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
 
B Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, 
* para que esto ocurra, el discriminante debe ser mayor o igual que 0.
 
C Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, 
* para que esto ocurra, el discriminante debe ser igual que 0.

D Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime 
* las 2 posibles soluciones.

E Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una 
* única raíz. Es en el caso en que se tenga una única solución posible.

F Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), 
* y mostrará por pantalla las posibles soluciones que tiene nuestra ecuación 
* con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan 
* nuestros métodos y en caso de no existir solución, se mostrará un mensaje.

 *
 * @author Pablo Demartini
 */
public class RaicesServicio {
    
    static Scanner leer = new Scanner(System.in);
    
    RaicesServicio discr1 = new RaicesServicio();    
    
    public static double getDiscriminante(Raices r){

        return (Math.pow(r.getB(), 2) - (4 *r.getA() *r.getC()));        
    }
    
    public static boolean tieneRaices(Raices r){
        
        double discriminante = getDiscriminante(r);
        
        return discriminante >= 0;
        
    }
    
    public static boolean tieneRaiz(Raices r){
        
        double discriminante = getDiscriminante(r);
        
        return discriminante == 0;
        
    }
    
    public static void obtenerRaices(Raices r) {
        if (tieneRaices(r)) {
            double x1 = (-r.getB() + Math.sqrt(getDiscriminante(r))) / (2 * r.getA());
            double x2 = (-r.getB() - Math.sqrt(getDiscriminante(r))) / (2 * r.getA());
            System.out.println("Las posibles soluciones son: x1 = " + x1 + ", x2 = " + x2);
        }
    }

    public static void obtenerRaiz(Raices r) {
        if (tieneRaiz(r)) {
            double x = -r.getB() / (2 * r.getA());
            System.out.println("La única solución posible es: x = " + x);
        } else {
            System.out.println("La ecuación no tiene una única solución.");
        }
    }
    
    public static void Calcular(Raices r){
        if(tieneRaices(r)){
            obtenerRaices(r);
        }else if(tieneRaiz(r)){
            obtenerRaiz(r);
        }else{
            System.out.println("No tiene solución posible");
        }
    }
}
