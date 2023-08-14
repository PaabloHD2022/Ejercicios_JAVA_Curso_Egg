

package com.mycompany.collections.guia2.extra.ej02;

import java.util.Scanner;
import servicio.CantanteFamosoServicio;

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
public class CollectionsGuia2ExtraEj02 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        CantanteFamosoServicio fama = new CantanteFamosoServicio();
        int opcion = 0;
        do {
            System.out.println("\t\tMENU");
            System.out.println("\t1- Cantantes ");
            System.out.println("\t2- Eliminar cantantes ");
            System.out.println("\t3- Mostrar");
            System.out.println("\t4- Agregar cantantes");
            System.out.println("\t5- Salir");
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
                    fama.mostrarCantantes();
                    break;
                case 4:
                    fama.agregarCantante();
                    break;
                case 5:
                    System.out.println("Hasta Luego!");
            }

        } while (opcion != 5);
        
    }
}
