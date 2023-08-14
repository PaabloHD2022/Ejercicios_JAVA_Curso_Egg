/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**Vamos a realizar una clase llamada Raices, donde representaremos
 * los valores de una ecuación de 2º grado. 
 * Tendremos los 3 coeficientes como atributos, llamémosles 
 * a, b y c. 
 * Hay que insertar estos 3 valores para construir el objeto 
 * a través de un método constructor.
 *
 * @author Pablo Demartini
 */
public class Raices {
    
    private double A;
    private double B;
    private double C;

    public Raices() {
    }

    public Raices(double A, double B, double C) {
        this.A = A;
        this.B = B;
        this.C = C;
        
    }

    public void setA(double A) {
        this.A = A;
    }

    public void setB(double B) {
        this.B = B;
    }

    public void setC(double C) {
        this.C = C;
    }       

    public double getA() {
        return A;
    }

    public double getB() {
        return B;
    }

    public double getC() {
        return C;
    }       
}
