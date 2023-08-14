
package servicios;

import entidades.Editorial;
import java.util.Scanner;
import persistencia.EditorialDAO;

public class EditorialServicio {
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");    
    EditorialDAO dao = new EditorialDAO();
    
    public Editorial crearEditorial(){
        Editorial editorial = new Editorial();
        System.out.println("Ingrese el nombre de la editorial");
        String nombre = leer.next();
        editorial.setNombre(nombre);
        editorial.setAlta(true);
        dao.persistirEntidad(editorial);
        System.out.println("Editorial guardada exitosamente!");
        
        return editorial;
    }
    
    

}
