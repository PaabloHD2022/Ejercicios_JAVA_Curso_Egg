/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_claseservicio_extra_01;

import Entidad.Raices;
import Servicio.RaicesServicio;
import java.util.Scanner;

/**
 *
 * @author Pablo Demartini
 */
public class POO_ClaseServicio_Extra_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        //Pedimos ingresar los valores de los 3 coeficientes
        System.out.println("Ingrese el valor de A");
        double A = leer.nextDouble();
        System.out.println("Ingrese el valor de B");
        double B = leer.nextDouble();
        System.out.println("Ingrese el valor de C");
        double C = leer.nextDouble();
        
        
        Raices r = new Raices(A, B, C);       
        
        //Llamamos a las funciones desde RaicesServicio
        double Discriminante = RaicesServicio.getDiscriminante(r);
        boolean tieneRaices = RaicesServicio.tieneRaices(r);
        boolean tieneRaiz = RaicesServicio.tieneRaiz(r);
        
        //Mostramos en pantalla lo que devuelven las funciones en cada caso.
        System.out.println("La discriminante es: " + Discriminante);
        System.out.println("Tiene raices?" + tieneRaices);
        System.out.println("Tiene una unica raiz?" + tieneRaiz);
        
        RaicesServicio.Calcular(r);
    }    
}
