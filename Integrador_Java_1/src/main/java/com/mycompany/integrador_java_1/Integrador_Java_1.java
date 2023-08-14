

package com.mycompany.integrador_java_1;

import entidades.Estudiante;
import servicios.EstudianteServicio;

/**
 *
 * @author Pablo Demartini
 */
public class Integrador_Java_1 {

    public static void main(String[] args) {
        
        EstudianteServicio eSS = new EstudianteServicio();
        
        Estudiante[] eS = new Estudiante[8];
        
        eSS.cargaAlumnos(eS); // Llama al metodo cargar Alumnos y su notas
        eSS.mostrarPromedio(eS); //Llama al metodo que calcula el promedio de las notas ingresadas.
        Object [] Lista = eSS.mayorAlPromedio(eS); // Crea una lista con los nombres de los alumnos con notas arriba del promedio
        eSS.mejoresAlumnos(Lista); // Muestra la lista de los alumnos con notas arriba del promedio.
    }
}

