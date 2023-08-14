 
package servicios;

import entidades.Estudiante;
import java.util.Scanner;

/**
 *
 * @author Pablo Demartini
 */
public class EstudianteServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //Ingresamos los alumnos.
    public void cargaAlumnos(Estudiante[] Alumnos){
        
        int nota;
        String nombre;
        
        //Usamos un for para cargar los nombres de los alumnos y sus notas
        
        for (int i = 0; i < Alumnos.length; i++) {
            
            System.out.println("Ingrese el nombre del estudiante N°: " + ( i  + 1) +  " = ");
            nombre = leer.next();
            System.out.println("Ingrese la nota del estudiante N°: " + ( i + 1 )+ " = ");
            nota = leer.nextInt();
                    
            do{                
                if(nota < 1 || nota > 10){
                    System.out.println("La nota debe tener una valor entre 1 y 10, ingrese una nota correcta...");
                    nota = leer.nextInt();
                }                
            }while (nota < 1 || nota > 10);
            Alumnos[i] = new Estudiante();
            Alumnos[i].setNombre(nombre);
            Alumnos[i].setNota(nota);                   
        }
    }   
        
         //Calcular y mostrar el promedio de notas de todo el curso
        
    public void mostrarPromedio(Estudiante[] Alumnos){
        double sumaNotas = 0;
        
        for (Estudiante Alumno : Alumnos) {
            
             sumaNotas += Alumno.getNota();           
        }
        System.out.println("El Promedio de las notas del curso es de : " + (sumaNotas / Alumnos.length));
    }
            
    //Retornar un arreglo con los nombre de los alumnos que recibieron una nota mayor al promedio del curso
        
    public Object[] mayorAlPromedio(Estudiante[] Alumnos){
        int contador = 0;
        int sumaNotas = 0;
                    
        for (Estudiante Alumno : Alumnos) {
            sumaNotas += Alumno.getNota();
        }
        int promedio = sumaNotas / Alumnos.length;
        
        for (Estudiante Alumno : Alumnos) {
            if(Alumno.getNota() >= promedio){
                contador++;
            }
        }
        
        String[] nombresMayorPromedio = new String[contador];
        for (int i = 0; i < contador; i++) {
            if (Alumnos[i].getNota() >= promedio) {
                nombresMayorPromedio[i] = Alumnos[i].getNombre();
            }
        }
        return nombresMayorPromedio;
    }
    
    public void mejoresAlumnos(Object[] nombresAlumnos){
        
        //Mostramos todos los estudiantes con una nota mayor al promedio.
        
        System.out.println("Lista de los mejores alumnos del curso: ");
        for (Object nombresAlumno : nombresAlumnos) {
            System.out.println("Alumno : " + nombresAlumno);
        }
    }   
}
