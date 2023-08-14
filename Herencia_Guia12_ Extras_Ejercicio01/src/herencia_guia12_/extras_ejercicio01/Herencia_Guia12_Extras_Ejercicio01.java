
package herencia_guia12_.extras_ejercicio01;

import entidad.Barco;
import entidad.BarcoMotor;
import entidad.Velero;
import entidad.YateLujo;
import java.util.Scanner;

/**
 *
 * @author Pablo Demartini
 */
public class Herencia_Guia12_Extras_Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        Barco barco = new Barco();
        Velero velero = new Velero();
        BarcoMotor bm = new BarcoMotor();
        YateLujo yate = new YateLujo();        
        
        int opcion;
        double precio;
        
        do {
            System.out.println("----------------------------------------------------------------");
            System.out.println("--------------------COMPAÑIA DE AMARRES-------------------------");
            System.out.println("Ingrese el tipo de embarcacion:");
            System.out.println("1 - Velero");
            System.out.println("2 - Barco a motor");
            System.out.println("3 - Yate de lujo");
            System.out.println("4 - SALIR");
            System.out.println("----------------------------------------------------------------");
            
            opcion = leer.nextInt();
            
                switch(opcion){
                    
                    case 1 -> {                   
                        velero.crearBarco();
                        velero.crearModuloAlquiler();
                        precio = velero.getModuloAlquiler();                            
                        System.out.println("El importe total por el alquiler del amarre es: " + precio);
                }
                    case 2 -> {
                        bm.crearBarco();
                        bm.crearModuloAlquiler();
                        precio = bm.getModuloAlquiler();
                        System.out.println("El importe total por el alquiler del amarre es: " + precio);
                }
                    case 3 -> {
                        yate.crearBarco();
                        yate.crearModuloAlquiler();
                        precio = yate.getModuloAlquiler();
                        System.out.println("El importe total por el alquiler del amarre es: " + precio);
                }
                    case 4 -> System.out.println("Ha salido correctamente");                   
            }            
        
        } while (opcion !=4);
        
    }
    
}
