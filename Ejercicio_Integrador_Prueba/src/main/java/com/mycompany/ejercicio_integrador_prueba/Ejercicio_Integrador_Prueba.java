

package com.mycompany.ejercicio_integrador_prueba;

import entidades.Estudiante;
import servicios.EstudiantesServicio;

/**
 *
 * @author Pablo Demartini
 */
public class Ejercicio_Integrador_Prueba {

    public static void main(String[] args) {
        
        Estudiante es = new Estudiante();
        EstudiantesServicio eS = new EstudiantesServicio();
        
       Estudiante[] notas = new Estudiante[4];
       String [] notaSuperior = new String[4];
       String [] notaInferior = new String [4];
       double suma = 0;
       double promedio;
       
        for (int i = 0; i < 4; i++) {
            notas[i] = eS.crearEsctudiante();
            suma+= notas[i].getNota();
        }
        
        promedio = suma / 4;
        System.out.println("El promedio de notas del curso es: " + promedio);
        
        int j = 0;
        
        System.out.println("Los alumnos con nota mayor al promedio son: " );
        for (int i = 0; i < 4; i++) {
            if(notas[i].getNota()>promedio){
                notaSuperior[j] = notas[i].getAlumno();
                System.out.println(notaSuperior[j]);
                j++;
            }
        }
        
        System.out.println("Los alumnos con nota menor al promedio son: ");
        for (int i = 0; i < 4; i++) {
             if(notas[i].getNota()<promedio){
                notaInferior[j] = notas[i].getAlumno();
                System.out.println(notaInferior[j]);
                j++;
            }            
        }
    }
}
