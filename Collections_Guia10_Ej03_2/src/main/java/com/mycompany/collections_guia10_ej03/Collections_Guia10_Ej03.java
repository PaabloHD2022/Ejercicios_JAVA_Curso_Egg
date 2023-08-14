

package com.mycompany.collections_guia10_ej03;

import entidad.Alumno;
import java.util.ArrayList;
import servicio.AlumnoServicio;

/**
 *
 * @author Pablo Demartini
 */
public class Collections_Guia10_Ej03 {

    public static void main(String[] args) {
        ArrayList<Alumno> listaAlumnos = new ArrayList();
        AlumnoServicio as = new AlumnoServicio();
        Alumno a = new Alumno();
        
        as.cargarAlumno(listaAlumnos);
        as.notaFinal(listaAlumnos);
        
    }
}
