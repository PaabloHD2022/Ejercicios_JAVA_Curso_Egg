/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Puntos;

import java.util.Scanner;

/**Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, 
 * sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. 
 * Generar un objeto puntos usando un método crearPuntos() que le pide al usuario 
 * los dos números y los ingresa en los atributos del objeto. 
 * Después, a través de otro método calcular y devolver la distancia que existe entre 
 * los dos puntos que existen en la clase Puntos. Para conocer como calcular 
 * la distancia entre dos puntos consulte el siguiente link:
 * 
/*http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html

 *
 * @author Pablo Demartini
 */
public class Puntos {
    Scanner leer = new Scanner(System.in);
    
    private double coordenadaX1;
    private double coordenadaY1;
    private double coordenadaX2;
    private double coordenadaY2;
    
    public Puntos(){
        
    }

    public Puntos(double coordenadaX1, double coordenadaY1, double coordenadaX2, double coordenadaY2) {
        this.coordenadaX1 = coordenadaX1;
        this.coordenadaY1 = coordenadaY1;
        this.coordenadaX2 = coordenadaX2;
        this.coordenadaY2 = coordenadaY2;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public void setCoordenadaX1(double coordenadaX1) {
        this.coordenadaX1 = coordenadaX1;
    }

    public void setCoordenadaY1(double coordenadaY1) {
        this.coordenadaY1 = coordenadaY1;
    }

    public void setCoordenadaX2(double coordenadaX2) {
        this.coordenadaX2 = coordenadaX2;
    }

    public void setCoordenadaY2(double coordenadaY2) {
        this.coordenadaY2 = coordenadaY2;
    }

    public Scanner getLeer() {
        return leer;
    }

    public double getCoordenadaX1() {
        return coordenadaX1;
    }

    public double getCoordenadaY1() {
        return coordenadaY1;
    }

    public double getCoordenadaX2() {
        return coordenadaX2;
    }

    public double getCoordenadaY2() {
        return coordenadaY2;
    }    
    
    public void crearPuntos(){
        System.out.println("Ingrese el valor de la coordenada x1");
        double coordenadaX1 = leer.nextDouble();
        setCoordenadaX1(coordenadaX1);        
        System.out.println("Ingrese el valor de la coordenada y1");
        double coordenadaY1 = leer.nextDouble();
        setCoordenadaY1(coordenadaY1);
        System.out.println("Ingrese el valor de la coordenada x2");
        double coordenadaX2 = leer.nextDouble();
        setCoordenadaX2(coordenadaX2);
        System.out.println("Ingrese el valor de la coordenada y2");
        double coordenadaY2 = leer.nextDouble();
        setCoordenadaY2(coordenadaY2);
    }
    
    public double calcularDistancia(){
        return Math.sqrt(Math.pow((coordenadaX2 - coordenadaX1), 2) + Math.pow((coordenadaY2 - coordenadaY1), 2));        
    }
}