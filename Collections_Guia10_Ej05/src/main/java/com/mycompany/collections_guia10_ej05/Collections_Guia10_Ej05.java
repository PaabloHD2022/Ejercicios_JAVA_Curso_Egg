

package com.mycompany.collections_guia10_ej05;

import servicio.PaisesServicio;


/**
 *
 * @author Pablo Demartini
 */
public class Collections_Guia10_Ej05 {

    public static void main(String[] args) {
        PaisesServicio ps = new PaisesServicio();
        
        ps.leerPaises();
        ps.mostrarPaises();
        ps.ordenarPaises();
        ps.eliminarPais();        
    }
}
