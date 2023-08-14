
package servicios;

import entidades.Autor;
import java.util.Scanner;
import persistencia.AutorDAO;

public class AutorServicio {
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");    
    AutorDAO dao = new AutorDAO();
    
    public Autor crearAutor(){
        Autor autor = new Autor();
        System.out.println("Ingrese el nombre del autor");
        String nombre = leer.next();
        autor.setNombre(nombre);
        autor.setAlta(true);
        dao.persistirEntidad(autor);
        System.out.println("Autor guardado exitosamente!");
        
        return autor;
    }

}
