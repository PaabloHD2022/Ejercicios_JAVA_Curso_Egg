/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado;

import java.util.Scanner;

/**
 *
 * @author Pablo Demartini
 */
public class Empleado {
    Scanner leer = new Scanner(System.in);
    
        public String nombre;
        public int edad;
        public double salario_actual;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario_actual) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario_actual = salario_actual;
    }
    
    public void crearCalcularAumento(){
        System.out.println("Ingrese nombre del empleado:");
        nombre = leer.nextLine();
        System.out.println("Ingrese edad del empleado:");
        edad = leer.nextInt();
        System.out.println("Ingrese el salario actual del empleado:");
        salario_actual = leer.nextDouble();
        
        if(edad >= 30){
            salario_actual += salario_actual * 10 / 100;
            System.out.println("-----------------------------------------------------");
            System.out.println(nombre + " ,Su salario se ha incrementado un 10%. Nuevo salario $" + salario_actual);
        }else{
            salario_actual += salario_actual * 5 / 100;
            System.out.println("------------------------------------------------------");
            System.out.println(nombre + " ,Su salario se ha incrementado un 5%. Nuevo salario $" + salario_actual);
        }
    }
}
    
        
    

