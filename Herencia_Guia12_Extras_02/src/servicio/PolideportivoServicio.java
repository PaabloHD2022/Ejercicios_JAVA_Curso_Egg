
package servicio;

import entidad.Polideportivo;
import java.util.Scanner;

/**
 *
 * @author Pablo Demartini
 */
public class PolideportivoServicio extends Polideportivo {
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    public void crearPolideportivo(){
        
        int techado = 0;
        int abierto = 0;
        System.out.println("CREAR POLIDEPORTIVO");
        System.out.println("Ingrese el nombre del polideportivo:");
        nombre = leer.next();
        System.out.println("La instalacion es TECHADA (S/N)");
        tipoInstalacion = leer.next();
        
        if (tipoInstalacion.equalsIgnoreCase("S")) {
            tipoInstalacion = "Techado";
            techado ++;
        }else{
            tipoInstalacion = "Abierto";
            abierto ++;
        }       
        
        System.out.println("Ingrese el ancho del polideportivo:");
        ancho = leer.nextDouble();
        System.out.println("Ingrese el alto del polideportivo:");
        alto = leer.nextDouble();
        System.out.println("Ingrese el largo del polideportivo");
        largo = leer.nextDouble();
        
        System.out.println(techado + "Polideportivos son techados");
        System.out.println(abierto + "Polideportivos son abiertos");
        
    }
    
}
