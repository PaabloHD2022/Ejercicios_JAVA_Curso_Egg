/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**Realizar una clase llamada ParDeNumeros que tenga como atributos dos números reales 
 * con los cuales se realizarán diferentes operaciones matemáticas. 
 * La clase debe tener un constructor vacío, getters y setters.  
 * En el constructor vacío se usará el Math.random para generar los dos números. 
 *
 * @author Pablo Demartini
 */
public class ParDeNumeros {
    private double num1;
    private double num2;
    
    public ParDeNumeros() {
        this.num1 = Math.round(Math.random()*10 + 1);//Generamos numeros aleatoreos (Math.random())y los redondeamos Math.round() 
        this.num2 = Math.round(Math.random()*10 + 1);
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }   
}
