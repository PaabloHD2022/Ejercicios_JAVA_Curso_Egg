package servicios;

import entidades.Autor;
import entidades.Editorial;
import entidades.Libro;
import java.util.Scanner;
import persistencia.Controladora;

public class LibroServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Libro libro = new Libro();
    Controladora control = new Controladora();
    
    
    public void crearLibro(Autor autor,Editorial editorial) throws Exception {
        System.out.println("-------------CREAR LIBRO------------\n");
        System.out.println("Ingrese el ISBN del libro:");
        libro.setIsbn(leer.nextLong());
        System.out.println("Ingrese el título del libro: ");
        libro.setTitulo(leer.next());
        System.out.println("Ingrese año de la publicación del libro: ");
        libro.setAnio(leer.nextInt());
        System.out.println("Ingrese la cantidad de ejemplares: ");
        libro.setEjemplares(leer.nextInt());
        System.out.println("Ingrese la cantidad de ejemplares prestados: ");
        libro.setEjemplaresPrestados(leer.nextInt());
        libro.setEjemplaresRestantes(libro.getEjemplares() - libro.getEjemplaresPrestados());
        libro.setAlta(true);
        libro.setAutor(autor);
        libro.setEditorial(editorial);
        control.crearLibro(libro);

    }
    

}
