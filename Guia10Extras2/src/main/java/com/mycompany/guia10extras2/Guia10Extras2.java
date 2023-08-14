

package com.mycompany.guia10extras2;

import com.mycompany.guia10extras2.servicios.NumeroServicio;

/**
 *
 * @author Usuario
 */
public class Guia10Extras2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        NumeroServicio num = new NumeroServicio();
        num.ingresarNumeros();
        num.mostrar();
        System.out.println("La suma de los numeros de la lista es: ");
        System.out.println(num.sumar());
        System.out.println("El promedio de los numeros de las lista es: " + num.promedio());
    }
}
