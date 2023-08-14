

package com.mycompany.collections_guia10_extra_01;

import java.util.ArrayList;
import java.util.List;
import servicio.AlumnoServicio;



/**
 *
 * @author Pablo Demartini
 */
public class Collections_Guia10_Extra_01 {

    public static void main(String[] args) {
        List<String>listAlumnos = new ArrayList<>();
        AlumnoServicio aServ = new AlumnoServicio();
        
        aServ.cargarAlumnos();
        aServ.nmostrarAlumnos();
        
    }
}
