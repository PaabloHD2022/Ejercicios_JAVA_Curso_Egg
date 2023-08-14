
package servicio;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
   tendremos una clase Pelicula con el título, director y duración de la película (en horas).
   
   *Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
    que se pide a continuación:

*   En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
    todos sus datos y guardándolos en el objeto Pelicula.
    Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
    crear otra Pelicula o no.
    Después de ese bucle realizaremos las siguientes acciones:
* 
* • Mostrar en pantalla todas las películas.
  • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
  • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
  • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
  • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
  • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla
 *
 * @author Pablo Demartini
 */
public class PeliculaServicio {
    
    
    public void cargarPeliculas(ArrayList<Pelicula> peliculas){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String seguirCargando = "SI";        
        String respuesta;
        
        do {
        System.out.println("Ingrese el titulo de la pelicula:");
        String nombrePelicula = leer.next();
        System.out.println("Ingrese el nombre del director de la pelicula:");
        String nombreDirector = leer.next();
        System.out.println("Ingrese la duracion de la pelicula (En horas)");
        double duracionPelicula = leer.nextDouble();
        Pelicula pelicula = new Pelicula(nombrePelicula, nombreDirector, duracionPelicula);
        peliculas.add(pelicula);
        System.out.println("Desea cargar otra pelicula? (SI/NO)");
        respuesta = leer.next();
            
        } while (seguirCargando.equalsIgnoreCase(respuesta));       
    }
    
    public void mostrarPeliculas(ArrayList<Pelicula> peliculas){
            System.out.println("Listado de las peliculas ingresadas");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);            
        }   System.out.println("--------------------------------------------------------------------------------------");
    }
    
    public void mostrarPeliculasMasDeUnaHora (ArrayList<Pelicula> peliculas){
            System.out.println("Listado de las peliculas con duracion mayor a 1 hora");
        for(Pelicula pelicula : peliculas) {           
            if(pelicula.getDuracion() > 1)                
            System.out.println("La pelicula: " + pelicula.getTitulo() + " tiene una duracion de: " + pelicula.getDuracion());                
        }   
            System.out.println("--------------------------------------------------------------------------------------");
    }
    
    public void ordenarPeliculasMayorAMenor (ArrayList<Pelicula> peliculas){
            System.out.println("Listado de peliculas ordenado de mayor a menor por duración");
            Collections.sort(peliculas, Pelicula.CompararDuracion.reversed());
            mostrarPeliculas(peliculas);
            System.out.println("--------------------------------------------------------------------------------------");
    }
    
    public void ordenarPeliculasMenorAMayor (ArrayList<Pelicula> peliculas){
            System.out.println("Listado de peliculas ordenado de menor a mayor por duración");
            Collections.sort(peliculas, Pelicula.CompararDuracion);
            mostrarPeliculas(peliculas);
            System.out.println("--------------------------------------------------------------------------------------");
    }
    
    public void ordenAlfabeticoTitulos(ArrayList<Pelicula> peliculas){
            System.out.println("Listado de peliculas por orden alfabetico (Titulo)");
            Collections.sort(peliculas, Pelicula.CompararTitulo);
            mostrarPeliculas(peliculas);
            System.out.println("--------------------------------------------------------------------------------------");
    }
    
    public void ordenAlfabeticoDirectores(ArrayList<Pelicula> peliculas){
            System.out.println("Listado de peliculas por orden alfabetico (Nombres Directores)");
            Collections.sort(peliculas, Pelicula.CompararDirector);
            mostrarPeliculas(peliculas);
            System.out.println("--------------------------------------------------------------------------------------");
    }    
    
}
