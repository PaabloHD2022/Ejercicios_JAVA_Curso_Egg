
package servicio;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 *
 * @author Pablo Demartini
 */
public class PaisesServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private HashSet<String> paises = new HashSet<>();
    
    public void leerPaises(){
        
        String seguirCargando = "S";        
        String respuesta;
        
        do {
            System.out.println("Ingrese un pais a la lista:");
            String pais = leer.next();
            paises.add(pais);
            
            System.out.println("¿Desea ingresar otro pais? (S/N)");                       
            respuesta = leer.next();
            
        } while (seguirCargando.equalsIgnoreCase(respuesta));        
    }
    
    public void mostrarPaises(){
        System.out.println("-------------------------------------------");
        System.out.println("Listado de países ingresados:");
        System.out.println("-------------------------------------------");
        for (String paise : paises) {
            System.out.println(paise);
        }        
    }

    public void ordenarPaises(){
        TreeSet<String> paisesOrdenados = new TreeSet<>(paises);
        System.out.println("-------------------------------------------");
        System.out.println("Listado de paises ordenado alfabeticamente");
        System.out.println("-------------------------------------------");
        for (String paisesOrdenado : paisesOrdenados) {
            System.out.println(paisesOrdenado);
        }        
    }
    
    public void eliminarPais(){
        
        System.out.println("-------------------------------------------");
        System.out.println("Ingrese el pais a eliminar de la lista:");
        System.out.println("-------------------------------------------");
        String paisEliminar = leer.next();
        
        Iterator<String> it = paises.iterator();        
        
        while(it.hasNext()){            
            if(it.next().equals(paisEliminar)){
            it.remove();
                System.out.println("El pais" + paisEliminar + " Ha sido eliminado.");
            } else {
                System.out.println("El pais: " + paisEliminar + " no se encuentra en la lista");
                break;
            }
        }                        
            System.out.println("-------------------------------------------");
            System.out.println("Listado actualizado de paises:");
            System.out.println("-------------------------------------------");        
            for (String paise : paises){
            System.out.println(paise);
        }
    }      
}