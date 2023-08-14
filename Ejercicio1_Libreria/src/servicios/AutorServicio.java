

package servicios;

import entidades.Autor;
import java.util.List;
import java.util.Scanner;
import persistencia.AutorDAO;

public class AutorServicio {    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    AutorDAO dao = new AutorDAO();
    
    public Autor crearAutor(){        
        Autor autor = new Autor();
        do {
            System.out.println("Ingrese el nombre del Autor");  
            autor.setNombre(leer.next());
            if(buscarAutorNombre(autor.getNombre()).isEmpty()){
                break;
            }else{
                System.out.println("El autor ya se encuentra registrado");
            }
        } while (true);        
        autor.setAlta(true);        
        dao.persistirEntidad(autor);
        System.out.println("Autor guardado exitosamente!");
        return autor;       
    }
    
    public Autor crearAutor(String nombre){
        Autor autor = new Autor();
        autor.setNombre(nombre);
        autor.setAlta(true);        
        dao.persistirEntidad(autor);
        System.out.println("Autor guardado exitosamente");
        return autor;       
    }
    
    public void darAltaBajaModificar(){
        Integer id;
        do {
            System.out.println("Ingrese el ID del autor que desea dar: ALTA/BAJA/MODIFICAR");
            try {
                id=leer.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Error al ingresar el ID");
            }
        } while (true);
        Autor autor = dao.buscarAutor(id);
        int opcion;
        do {
            System.out.println("1 - ALTA/BAJA \n 2 - MODIFICAR");
            try {
                opcion = leer.nextInt();
                if(!(opcion == 1 || opcion == 2)){
                    System.out.println("La opcion seleccionada no es correcta");
                }else{
                    break;
                }
            } catch (Exception e) {
                System.out.println("La opcion seleccionada no es correcta");
            }
        } while (true);
        switch(opcion){
            case 1 -> {
                if(autor.getAlta()){
                    autor.setAlta(Boolean.FALSE);
                }else{
                    autor.setAlta(true);
                }
            }
            case 2 -> {
                System.out.println("Ingrese el nombre de autor que desea modificar");
                String nombreAutor = leer.next();
                autor.setNombre(nombreAutor);
            }
        }
        dao.actualizarEntidad(autor);        
    }
    
    public List<Autor> buscarAutorNombre(){
        System.out.println("Ingrese el nombre dlel autor");
        String nombre = leer.next();
        return dao.buscarAutorNombre(nombre);
    }
    
    public List<Autor> buscarAutorNombre(String nombre){
        return dao.buscarAutorNombre(nombre);        
    }
}
