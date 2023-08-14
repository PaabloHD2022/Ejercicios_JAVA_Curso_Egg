

package com.mycompany.collections.guia2.extras.ej03;

import java.util.Scanner;
import servicio.CantanteFamosoServicio;

/**
 *
 * @author Pablo Demartini
 */
public class CollectionsGuia2ExtrasEj03 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        CantanteFamosoServicio fama = new CantanteFamosoServicio();
        int opcion = 0;
        do {
            System.out.println("--------------------------------");
            System.out.println("\tMENU");
            System.out.println("\t1- Cantantes ");
            System.out.println("\t2- Eliminar cantantes ");
            System.out.println("\t3- Mostrar");
            System.out.println("\t4- Agregar cantantes");
            System.out.println("\t5- Salir");
            System.out.println("--------------------------------");
            System.out.println("Inrese una opcion");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    fama.cantantes();
                    break;
                case 2:
                    fama.eliminarCantante();
                    break;
                case 3:
                    fama.mostar();
                    break;
                case 4:
                    fama.agregarCantante();break;
                case 5:
                    System.out.println("Hasta Luego!");
            }
        } while (opcion != 5);
    }
}
