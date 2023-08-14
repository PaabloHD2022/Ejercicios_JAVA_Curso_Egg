/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_integrador;

import entidades.Estudiantes;
import java.util.Arrays;
import servicios.EstudiantesServicio;

/**Una escuela ha terminado su ciclo lectivo y todos sus alumnos ya rindieron el
examen final. La escuela nos ha pedido que calculemos el promedio de notas
final de todos sus alumnos y saber qué alumnos han recibido una nota por
encima de ese promedio.
Para esto vamos a tener que crear un objeto de tipo Estudiante, sus atributos
van a ser nombre y nota (representando la nota obtenida en el final).
La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8
estudiantes con sus respectivas notas.
Una vez creado los estudiantes deberemos guardar los estudiantes en un
arreglo de objetos tipo Estudiante, usando ese arreglo tenemos que realizar las
dos tareas que nos ha pedido la escuela. 

* 1. Calcular y mostrar el promedio de notas de todo el curso

* 2. Retornar otro arreglo con los nombre de los alumnos que recibieron una
nota mayor al promedio del curso

* 3. Por último, deberemos mostrar todos los estudiantes con una nota
mayor al promedio.

* Nota: para crear un vector de objetos la definición es la siguiente:
Objeto nombreVector[] = new Objeto[];
 *
 * @author Pablo Demartini
 */
public class Ejercicio_Integrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Estudiantes[] notas = new Estudiantes[8];
        String[] arregloSuperior = new String[8];
        double suma = 0;
        double promedio;
        EstudiantesServicio es = new EstudiantesServicio();

        for (int i = 0; i < 8; i++) {
            notas[i] = es.crearEstudiante();
            suma += notas[i].getNota();

        }
        promedio = suma / 8;
        System.out.println("El promedio del curso es: " + promedio);
        int j = 0;
        System.out.println("Los alumnos con nota mayor al promedio son:");
        for (int i = 0; i < 8; i++) {
            if (notas[i].getNota() > promedio) {
                arregloSuperior[j] = notas[i].getAlumno();
                System.out.println(arregloSuperior[j]);
                j++;                
            }
        }
    }    
}
