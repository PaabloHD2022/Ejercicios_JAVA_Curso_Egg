/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Pablo Demartini
 */
public class CafeteraServicio {
    
    Scanner leer = new Scanner(System.in);
    
    Cafetera cafetera = new Cafetera(100,50);
    
    public void llenarCafetera(){
        cafetera.setCantidadActual(cafetera.getCantidadActual());
        System.out.println("La cafetera tiene: " + cafetera.getCantidadActual() + " cápsulas de café");
    }
    
    public void servirTaza(int taza){       

        if(taza < cafetera.getCantidadActual()){
            System.out.println("Su taza se lleno por completo");
        }else if(taza == 2 && cafetera.getCantidadActual() == 1 ){
            System.out.println("Su taza se llenó por la mitad");
        }else if(taza == 2 && cafetera.getCantidadActual() == 0){
            System.out.println("Su taza no puede ser llenada");
        }else if(taza == 1 && cafetera.getCantidadActual() == 1 ){
            System.out.println("Su taza se llenó por completo");
        }else if(taza == 1 && cafetera.getCantidadActual() == 0){
            System.out.println("Su taza no puede ser llenada");       
        }
        cafetera.setCantidadActual(cafetera.getCantidadActual() - taza);
    }
    
    public void mostrar(){
        System.out.println ("La cantidad actual es: " + cafetera.getCantidadActual() + " cápsulas de café");
    }
    
    public void vaciarCafetera(){
        cafetera.setCantidadActual(0);
    }
    
    public void rellenarCafetera(){
        System.out.println("Ingrese la cantidad de cápsulas a llenar:");
        int llenar = leer.nextInt();
        cafetera.setCantidadActual(cafetera.getCantidadActual() + llenar);
    }
}
