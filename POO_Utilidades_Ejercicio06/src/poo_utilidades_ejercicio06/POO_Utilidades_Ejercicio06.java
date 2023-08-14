
package poo_utilidades_ejercicio06;

import entidad.Curso;
import servicio.CursoServicio;

/**
 *
 * @author Pablo Demartini
 */
public class POO_Utilidades_Ejercicio06 {

    
    public static void main(String[] args) {
        
        CursoServicio CS = new CursoServicio();//Instanciamos CursoServicio
        Curso curso = CS.crearCurso();//Instanciamos Curso
        
        CS.mostrarAlumnos(curso);//Mostramos los alumnos del curso creado
        CS.calcularGananciaSemanal(curso);//Mostramos la ganancia del curso en una semana en base a las horas, dias, alumnos y precio/hora.
        
    }
    
}
