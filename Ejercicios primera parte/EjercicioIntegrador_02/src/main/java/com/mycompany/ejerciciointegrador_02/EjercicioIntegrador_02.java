
package com.mycompany.ejerciciointegrador_02;

import entidades.Empleados;
import servicios.EmpleadosServicios;

/**
 *
 * @author Pablo Demartini
 */
public class EjercicioIntegrador_02 {

    public static void main(String[] args) {        
        
        Empleados empleados = new Empleados();
        EmpleadosServicios eS = new EmpleadosServicios();
        
       Empleados[] sueldoEmpleados = new Empleados[10];
       String [] sueldoSuperior = new String[10];
       String [] sueldoInferior = new String [10];
       double suma = 0;
       double promedio;
       
        for (int i = 0; i < 10; i++) {
            sueldoEmpleados[i] = eS.crearEmpleados();
            suma+= sueldoEmpleados[i].getSueldoEmpleados();
        }
        
        promedio = suma / 10;
        System.out.println("El sueldo promedio de los empleados es:  " + promedio);
        
        int j = 0;
        
            System.out.println("Los empleados con sueldo mayor al promedio son: ");
            
            for (int i = 0; i < 10; i++) {
                if(sueldoEmpleados[i].getSueldoEmpleados() > promedio){
                    sueldoSuperior[j] = sueldoEmpleados[i].getNombreEmpleados();
                    System.out.println(sueldoSuperior[j]);
                    j++;
                }
            }
            
            System.out.println("Los empleados con sueldo menor al promedio son: ");
            
            for (int i = 0; i < 10; i++) {
                if(sueldoEmpleados[i].getSueldoEmpleados() < promedio){
                    sueldoInferior[j] = sueldoEmpleados[i].getNombreEmpleados();
                    System.out.println(sueldoInferior[j]);
                    j++;
                 }
            }
      }
}

