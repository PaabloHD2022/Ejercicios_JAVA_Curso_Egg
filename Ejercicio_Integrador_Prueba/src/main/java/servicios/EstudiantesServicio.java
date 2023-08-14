/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Estudiante;
import java.util.Scanner;

/**
 *
 * @author Pablo Demartini
 */
public class EstudiantesServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
   
    //Cargamos los datos de los estudiantes.
    public Estudiante crearEsctudiante(){
        
        Estudiante estudiantes = new Estudiante();{
            System.out.println("Ingrese el nombre del estudiante: ");
            estudiantes.setAlumno(leer.next());
            System.out.println("Ingrese la nota del estudiante: ");
            estudiantes.setNota(leer.nextDouble());
            
            return estudiantes;
        }        
    }   
}
