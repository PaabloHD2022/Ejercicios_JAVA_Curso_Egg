/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operacion;

import java.util.Scanner;

/**
 *
 * @author Pablo Demartini
 */
public class Operacion {
    
    Scanner leer = new Scanner(System.in);
    
    private double Num1;
    private double Num2;
    //Constructor vacio
    public Operacion(){        
    }
    //Constructor con valores pasados por parametro
    public Operacion(double Num1, double Num2) {
        this.Num1 = Num1;
        this.Num2 = Num2;
    }
    //Metodos set---------------------------Inicio
    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public void setNum1(double Num1) {
        this.Num1 = Num1;
    }

    public void setNum2(double Num2) {
        this.Num2 = Num2;
    }
    //Metodos set---------------------------fin
    
    //Metodos get---------------------------Inicio
    public Scanner getLeer() {
        return leer;
    }

    public double getNum1() {
        return Num1;
    }

    public double getNum2() {
        return Num2;
    }   
    //Metodos get---------------------------fin
    
    //Ingreso de valores a Num1 y Num2
    public void crearOperacion(){
        System.out.println("Ingrese el primer numero:");
        double Num1 = leer.nextDouble();
        setNum1(Num1);
        System.out.println("Ingrese el segundo numero:");
        double Num2 = leer.nextDouble();
        setNum2(Num2);
    }
    //Metodo suma
    public double Sumar(){
        double Sumar = (getNum1() + getNum2());
        return Sumar;
    }
    //Metodo resta
    public double Restar(){
        double Restar = (getNum1() - getNum2());
        return Restar;
    }
    //Metodo Multiplicar
    public double Multiplicar(){
        double Multiplicar = (getNum1() * getNum2());
            if(Multiplicar == 0){
                System.out.println(Multiplicar + "ERROR!!!");
            }
            return Multiplicar;             
    }
    //Metodo Dividir
    public double Dividir(){
        double Dividir = (getNum1() / getNum2());
            if(getNum2() == 0){
                System.out.println(Dividir + "ERROR!!! No se puede dividir por cero");
            }
            return Dividir;           
    }
}

