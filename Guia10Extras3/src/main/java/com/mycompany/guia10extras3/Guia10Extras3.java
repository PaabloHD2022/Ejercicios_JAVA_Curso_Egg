
package com.mycompany.guia10extras3;

import com.mycompany.guia10extras3.entidades.CantanteFamoso;
import com.mycompany.guia10extras3.servicios.CantanteFamosoServicio;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia10Extras3 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        CantanteFamosoServicio fama = new CantanteFamosoServicio();
        int opcion = 0;
        do {
            System.out.println("\t MENU");
            System.out.println("\t1- Cantantes ");
            System.out.println("\t2- Eliminar cantantes ");
            System.out.println("\t3- Mostrar");
            System.out.println("\t4- Agregar cantantes");
            System.out.println("\t5- Salir");
            System.out.println("Inrese una opcion");
            opcion = sc.nextInt();
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
