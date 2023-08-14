
package servicios;

import entidades.Autor;
import entidades.Editorial;
import entidades.Libro;
import java.util.Scanner;
import persistencia.LibroDAO;

public class LibroServicio {
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    LibroDAO dao = new LibroDAO();
    EditorialServicio es = new EditorialServicio();
    AutorServicio as = new AutorServicio();
    
    public void crearLibro(){
        Libro libro = new Libro();
        System.out.println("Ingrese el ISBN del libro");
        long ISBN = leer.nextLong();
        libro.setISBN(ISBN);
        System.out.println("Ingrese el titulo del libro");
        String titulo = leer.next();
        libro.setTitulo(titulo);
        System.out.println("Ingrese el año de edicion");
        int anio = leer.nextInt();
        libro.setAnio(anio);
        System.out.println("Ingrese la cantidad de ejemplares a ingresar");
        int cantidadEjemplares = leer.nextInt();
        libro.setEjemplares(cantidadEjemplares);
        libro.setEjemplaresRestantes(cantidadEjemplares);
        libro.setEjemplaresPrestados(0);
        libro.setAlta(true);
        Autor autor = as.crearAutor();
        libro.setAutor(autor);
        Editorial editorial = es.crearEditorial();
        libro.setEditorial(editorial);
        dao.persistirEntidad(libro);        
    }
}
