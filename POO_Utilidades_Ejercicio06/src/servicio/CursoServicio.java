
package servicio;

import entidad.Curso;
import java.util.Arrays;
import java.util.Scanner;

/*A continuación, se implementarán los siguientes métodos:

* Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a las clases. 
* Nosotros nos encargaremos de almacenar esta información en un arreglo e iterar con un bucle, 
* solicitando en cada repetición que se ingrese el nombre de cada alumno.

* Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario y después 
* se le asignan a sus respectivos atributos para llenar el objeto Curso. En este método invocamos al
* método cargarAlumnos() para asignarle valor al atributo alumnos -- Los atributos serán: nombreCurso, 
* cantidadHorasPorDia, cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos.

* Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por curso. 
* Para ello, se deben multiplicar la cantidad de horas por día, el precio por hora, la cantidad de alumnos 
* y la cantidad de días a la semana que se repite el encuentro.

 *
 * @author Pablo Demartini
 */
public class CursoServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //Cargamos los alumnos.
    public String[] cargarAlumnos(int longitudVector){
        String[] alumnos = new String[longitudVector];
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingrese el nombre del alumno:");
            alumnos[i] = leer.next();
        }
        return alumnos;
    }
    //Creacion de los cursos
    public Curso crearCurso(){
        //Instanciamos curso
        Curso curso = new Curso();
        System.out.println("Ingrese el nombre del curso:");//Pedimos dato del curso al usuario y se lee y guarda en setNombreCurso
        curso.setNombreCurso(leer.next());
        System.out.println("Ingrese la cantidad de horas diarias:");//Pedimos cantidad de horas al usuario y se lee y guarda en setCantidadDeHoras
        curso.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Ingrese la cantidad de dias por semana:");//Pedimos cantidad de dias por semana y se lee y guarda en SetCantidadDeDiasPorSemana
        curso.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("Ingrese el turno del curso (Mañana o Tarde)");//Pedimos que turno va a ser el curso y se lee y guarda en setTurno
        curso.setTurno(leer.next());
        System.out.println("Ingrese el precio por hora:"); //Pedimos el precio por hora del curso y se lee y guarda en setPrecioPorHora.
        curso.setPrecioPorHora(leer.nextInt());
        
        //No hacemos un sout para cargar los alumnos y su cantidad porque los toma del metodo "cargarAlumnos".
        curso.setAlumnos(cargarAlumnos(5)); //Tomamos la cantidad de alumnos en base a la carga de alumnos del metodo cargarAlumnos.
        return curso;
    }
    
    public void mostrarAlumnos(Curso curso) {
        System.out.println(Arrays.toString(curso.getAlumnos()));
    }

    public void calcularGananciaSemanal(Curso curso) {
        System.out.println("La ganancia semanal es de " + (curso.getCantidadDiasPorSemana() * curso.getCantidadHorasPorDia() * curso.getPrecioPorHora() * curso.getAlumnos().length));
    }
    
}
