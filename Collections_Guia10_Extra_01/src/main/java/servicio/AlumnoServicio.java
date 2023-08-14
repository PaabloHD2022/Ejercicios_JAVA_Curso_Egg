
package servicio;

import java.util.ArrayList;
import java.util.List;
import entidad.Alumno;
import java.util.Scanner;



/*Crea una clase Alumnos, donde tendrá como Atributos el nombre, apellido, la nacionalidad y su fecha de nacimiento.
* La nacionalidad podrá ser ARGENTINA – CHILENA – VENEZOLANA solamente.

/**Necesidades:
* 1 - Crear los métodos de A-B-M (Alta – Baja – modificación ) que manipulen los objetos de este tipo.
* 2 - Crear una lista de 20 alumnos (hacer uso del constructor que recibe parámetros , para no hacer carga manual de los datos)
* 3 - Ordenar y mostrar la lista de alumnos ordenados por orden alfabético según su apellido de forma ascendente.
* 4 - Ordenar y mostrar la lista de alumnos ordenados por orden alfabético según su nombre de forma descendente.
* 5 - Con un alumno especifico (suponiendo que no existen dos alumnos con el mismo nombre y apellido), 
*     mostrar por pantalla su edad. Considerar, el manejo de fechas, utilizando el atributo fecha de nacimiento.
* 6 - Crear listas paralelas de Alumnos, según la nacionalidad.
* 7 - Realizar un reporte final de datos que informe:
*     Cuantos alumnos son mayores de 25 años.
*     Cuantos alumnos tiene su apellido que comienzan con letra L o P
*     Cuantos alumnos hay de nacionalidad ARGENTINA – CHILENA – VENEZOLANA.

* Recordar:
* Hacer uso de paquetes y clases correspondientes para buena estructura de nuestro proyecto.
* Todos los métodos deben ser pensados para reutilizar y adaptarse a futuros cambios 
* (por ejemplo, mañana quiero carga de 30 alumnos, y las instrucciones deben prevenir esta modificación)
 *
 * @author Pablo Demartini
 */
public class AlumnoServicio {
    
    List<String>listAlumnos = new ArrayList<>();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void cargarAlumnos(){
        Alumno alumno = new Alumno();
        
        System.out.println("Ingrese el nombre del alumno:");
        alumno.setNombre(leer.next());
        System.out.println("Ingrese el apellido del alumno:");
        alumno.setApellido(leer.next());
        System.out.println("Ingrese la nacionalidad del alumno (Argentina - Chilena - Venezolana");
        alumno.setNacionalidad(leer.next());
        System.out.println("Ingrese dia de nacimiento del alumno:");
        alumno.setDiaNac(leer.nextInt());
        System.out.println("Ingrese mes de nacimiento del alumno:");
        alumno.setMesNac(leer.nextInt());
        System.out.println("Ingrese el año de nacimiento del alumno:");
        alumno.setAnioNac(leer.nextInt());
    }
    
    public void nmostrarAlumnos(){
        for (String listAlumno : listAlumnos) {
            System.out.println(listAlumno.toString());
        }
    }
}
