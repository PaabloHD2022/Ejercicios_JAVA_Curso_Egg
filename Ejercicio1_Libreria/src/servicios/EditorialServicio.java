

package servicios;

import entidades.Editorial;
import java.util.List;
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
        System.out.println("Se guardo la editorial con exito!");
        return editorial;        
    }
    
    public Editorial crearEditorial(String nombre){
        Editorial editorial = new Editorial();
        editorial.setNombre(nombre);
        editorial.setAlta(true);
        
        dao.persistirEntidad(editorial);
        System.out.println("Se guardo la editoral con exito1");
        return editorial;        
    }
    
    public void darAltaBajaModificar(){
        Integer id;
        do {
            System.out.println("Ingrese el ID de la editorial que desea dar ALTA/BAJA/MODIFICAR");
            try {
                id= leer.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("El ID ingresado no es correcto");
            }
        } while (true);
        Editorial editorial = dao.buscarEditorial(id);
        int opcion;
        do {
            System.out.println("1 - ALTA/BAJA \n2 - MODIFICAR");
            try {
                opcion = leer.nextInt();
                if (!(opcion == 1 || opcion == 2)) {
                    System.out.println("La opcion ingresada no es correcta");
                }else{
                    break;
                }
            } catch (Exception e) {
                System.out.println("La opcion ingresada no es correcta");
            }
        } while (true);
        switch(opcion){
            case 1 -> {
                if(editorial.getAlta()){
                    editorial.setAlta(Boolean.FALSE);
                }else{
                    editorial.setAlta(true);
                }
            }
            case 2 -> {
                System.out.println("Ingrese el cliente que desea modificar");
                String nombreEditorial = leer.next();
                editorial.setNombre(nombreEditorial);
            }
        }
        dao.actualizarEntidad(editorial);
    }
    
    public List<Editorial> buscarEditorialNombre(){
        System.out.println("Ingrese el nombre de la editorial");
        String nombre = leer.next();
        return dao.buscarEditorialNombre(nombre);
    }
    
    public List<Editorial> buscarEditorialNombre(String nombre){
        return dao.buscarEditorialNombre(nombre);
    }
}
