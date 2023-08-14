package poo_utilidades_ejercicios04;

import entidades.FechaServicios;
import java.util.Date;

/**
 *
 * @author Pablo Demartini
 */
public class POO_Utilidades_Ejercicios04 {

    public static void main(String[] args){
        
        FechaServicios FS =new FechaServicios();
        Date fn = new Date();
        FS.fechaNacimiento(fn);
        System.out.println("Fecha de Nacimiento = " + fn.getDate()+"/"+fn.getMonth()+"/"+fn.getYear());
        Date fh=FS.fechaActual();
        fh.setYear(fh.getYear()+1900);
        fh.setMonth(fh.getMonth()+1);
        System.out.println("Fecha de Hoy = " + fh.getDate()+"/"+fh.getMonth()+"/"+fh.getYear());
        System.out.println("hora actual "+fh.getHours()+":"+fh.getMinutes());
        int edad = FS.diferencia(fn, fh);
        System.out.println("La edad es: "+ edad);
    }    
}


    

