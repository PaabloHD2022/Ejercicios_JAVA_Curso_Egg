
package servicio;

import entidad.CantanteFamoso;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**2. Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
cada cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios.
 *
 * @author Pablo Demartini
 */
public class CantanteFamosoServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Map<String, String> cantantes = new HashMap<>();
    
    public void cantantes() {
        CantanteFamoso autor = new CantanteFamoso();
        boolean asd = true;
        do {
            System.out.println("Ingrese un cantante ");
            autor.setNombreCantante(leer.nextLine());
            System.out.println("Ingrese el disco mas vendido");
            autor.setDiscoMasVendido(leer.nextLine());
            cantantes.put(autor.getNombreCantante(), autor.getDiscoMasVendido());
            System.out.println("Desea seguir ingresando mas cantantes?");
            String resp = leer.next();
            leer.nextLine();
            if (resp.equalsIgnoreCase("no")) {
                asd = false;
            }
        } while (asd);  
    }
    public  void mostrarCantantes(){
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
