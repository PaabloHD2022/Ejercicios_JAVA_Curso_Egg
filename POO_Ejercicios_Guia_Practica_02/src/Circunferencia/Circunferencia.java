/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Circunferencia;

import java.util.Scanner;

/**
 *
 * @author Pablo Demartini
 */
public class Circunferencia {
    Scanner leer = new Scanner(System.in);    
    
    private double radio;
    
    //Instatacion utilizando el constructor vacío
    public Circunferencia() {
    }
    
    //Instatacion utilizando el constructor por parametro. 
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Scanner getLeer() {
        return leer;
    }

    public double getRadio() {
        return radio;
    }
    
    public void crearCircunferencia(){
        System.out.println("Ingrese el valor del radio:");
        double radio = leer.nextDouble();
        setRadio(radio);
    }   
        public double calcularArea(){
            if(radio < 0){
                System.out.println("El valor del radio no puede ser negativo...");
            }
        return Math.PI * Math.pow(radio,2);
    }
   
        public double calcularPerimetro(){
            if(radio < 0){
                System.out.println("El valor del radio no puede ser negativo...");
            }
        return 2*Math.PI * radio;
    }
    
            
}
    
    
    

