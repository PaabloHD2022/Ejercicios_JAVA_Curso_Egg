
package servicio;

import entidad.EdificioDeOficinas;
import java.util.Scanner;

/**
 *
 * @author Pablo Demartini
 */
public class EdificioDeOficinasServicio extends EdificioDeOficinas {
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    public void cantidadPersonas(){       
        System.out.println("CREAR EDIFICIO DE OFICINAS");
        System.out.println("Ingrese la cantidad de pisos:");
        cantPisos = leer.nextInt();
        System.out.println("Ingrese cantidad de oficinas por piso:");
        cantOficinas = leer.nextInt();
        System.out.println("Ingrese la cantidad de personas por oficina:");
        cantPersonas = leer.nextInt();  
        
        int totalPersonasPorPiso = cantOficinas * cantPersonas;
        int totalPersonasEdificio = cantOficinas * cantPersonas * cantPisos;
        
        System.out.println("La cantidad de personas por piso es de: " + totalPersonasPorPiso);
        System.out.println("La cantidad total de personas en el edificio: " + totalPersonasEdificio);
    }
    
    public void crearEdificioOficina(){
        
        System.out.println("Ingrese el ancho del edificio:");
        ancho = leer.nextDouble();
        System.out.println("Ingrese el alto del edificio:");
        alto = leer.nextDouble();
        System.out.println("Ingrese el largo del edificio");
        largo = leer.nextDouble();
        
    }
    
}
