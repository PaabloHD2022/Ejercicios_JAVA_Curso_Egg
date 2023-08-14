
package servicio;

import entidad.CantanteFamoso;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Pablo Demartini
 */
public class CantanteFamosoServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Map<String, String> cantantes = new HashMap<>();

    public void cantantes() {
        CantanteFamoso autor = new CantanteFamoso();
        boolean asd = false;
        do {
            System.out.println("Ingrese un cantante ");
            autor.setNombre(leer.nextLine());
            System.out.println("Ingrese el disco mas vendido");
            autor.setDiscoMasVendido(leer.nextLine());
            cantantes.put(autor.getNombre(), autor.getDiscoMasVendido());
            System.out.println("Desea seguir ingresando mas cantantes?");
            String resp = leer.next();
            leer.nextLine();
            if (resp.equalsIgnoreCase("no")) {
                asd = true;
            }
        } while (!asd);  
    }
    
    public  void mostar(){
        for (Map.Entry<String, String> entry : cantantes.entrySet()) {
            Object key = entry.getKey();
            Object val = entry.getValue();
            System.out.println("El cantante es: " + key + " Y su disco es: "  + val); 
        }
    }
    
    public void agregarCantante(){
        System.out.println("Ingrese el nuevo cantante");
        String nuevo = leer.nextLine();
        System.out.println("Ingrese su disco mas vendido");
        String disco = leer.nextLine();
        cantantes.put(nuevo, disco);
    }
    
    public void eliminarCantante(){
        System.out.println("Ingrese el cantante a eliminar");
        String eliminar = leer.nextLine();
        cantantes.remove(eliminar);
    }
    
}
