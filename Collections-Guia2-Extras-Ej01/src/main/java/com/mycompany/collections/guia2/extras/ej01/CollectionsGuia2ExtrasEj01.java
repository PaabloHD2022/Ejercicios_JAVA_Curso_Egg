

package com.mycompany.collections.guia2.extras.ej01;

import servicio.NumeroServicio;

/**1. Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
 *
 * @author Pablo Demartini
 */
public class CollectionsGuia2ExtrasEj01 {

    public static void main(String[] args) {
        
        NumeroServicio num = new NumeroServicio();
        num.ingresarNumeros();
        num.mostrar();
        System.out.println("La suma de los numeros de la lista es: " + num.sumar());
        System.out.println("El promedio de los numeros de las lista es: " + num.promedio());
    }
}
