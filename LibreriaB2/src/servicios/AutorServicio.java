package servicios;

import entidades.Autor;
import java.util.Scanner;
import persistencia.Controladora;
import persistencia.exceptions.NonexistentEntityException;

public class AutorServicio {

    Scanner leer = new Scanner(System.in);

    Autor autor = new Autor();
    Controladora control = new Controladora();

    public Autor crearAutor() {
        System.out.println("-------------CREAR AUTOR------------\n");
        System.out.println("Ingrese el nombre del autor: ");
        autor.setNombre(leer.nextLine());
        autor.setAlta(true);
        control.crearAutor(autor);
        return autor;
    }
    public void eliminarAutor() throws NonexistentEntityException{
        System.out.println("-------------ELIMINAR AUTOR------------\n");
        System.out.println("Ingrese el ID a eliminar");
        autor.setId(leer.nextInt());
        control.eliminarAutor(autor);
        
    }
    public void modificarAutor() throws Exception{
        System.out.println("Ingrese el ID del Autor a modificar: ");
        autor.setId(leer.nextInt());        
        System.out.println("Ingrese el nuevo nombre del Autor: ");
        autor.setNombre(leer.next());
        autor.setAlta(true);
        control.modificarAutor(autor);       
        
    }
}
