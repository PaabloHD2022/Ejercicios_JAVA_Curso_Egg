/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Estudiantes;
import java.util.Scanner;

/**
 *
 * @author Pablo Demartini
 */
public class EstudiantesServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Estudiantes crearEstudiante(){
        Estudiantes estudiante = new Estudiantes();
        System.out.print("Ingrese nombre: ");
        estudiante.setAlumno(leer.next());
        System.out.print("Ingrese la nota del alumno: ");
        estudiante.setNota(leer.nextDouble());
        return estudiante;        
    }
    
}
