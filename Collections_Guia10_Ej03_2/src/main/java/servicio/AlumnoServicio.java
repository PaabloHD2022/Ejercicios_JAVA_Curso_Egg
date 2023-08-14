
package servicio;

import entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 *
 * @author Pablo Demartini
 */
public class AlumnoServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void cargarAlumno(ArrayList<Alumno> listaAlumnos) {
        
        String respuesta;
        
        do {
            Alumno alumno = new Alumno();
            System.out.println("Ingrese el nombre del alumno");
            alumno.setNombre(leer.next());
            System.out.println("Ingrese las 3 notas del alumno");
            ArrayList<Integer> notas = new ArrayList();
            
            for (int i = 0; i < 3; i++) {
                notas.add(leer.nextInt());
            }
            alumno.setNotas(notas);
            listaAlumnos.add(alumno);
            
            System.out.println("Desea cargar otro alumno? S/N");
            respuesta = leer.next();
        } while (respuesta.equalsIgnoreCase("S"));           
            
        
        for (Alumno listaAlumno : listaAlumnos) {
            System.out.println(listaAlumnos.toString());
        }        
    }
    
    public void notaFinal(ArrayList<Alumno> listaAlumnos) {

        System.out.println("Ingrese un nombre de un alumno a buscar");
        String busqueda = leer.next();
        Integer promedio = 0;
        int cont=0;

        for (Alumno listaAlumno : listaAlumnos) {
            if (busqueda.equalsIgnoreCase(listaAlumno.getNombre())) {
                ArrayList<Integer> aux2 = listaAlumno.getNotas();
                for (Integer integer : aux2) {
                promedio += integer;
                cont++;
                }
                System.out.println("El promedio del alumno "+ busqueda +" es de:" + (promedio/3));
            }
        }
            if(cont==0){
                System.out.println("no se encontro el alumno");       
        }
    }   
}
