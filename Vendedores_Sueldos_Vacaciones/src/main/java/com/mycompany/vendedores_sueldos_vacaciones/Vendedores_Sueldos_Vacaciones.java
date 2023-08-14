

package com.mycompany.vendedores_sueldos_vacaciones;

import entidades.Vendedor;
import servicio.VendedorServicio;

/**
 *
 * @author Pablo Demartini
 */
public class Vendedores_Sueldos_Vacaciones {

    public static void main(String[] args) {
        
        VendedorServicio vs = new VendedorServicio();
        Vendedor v1 = vs.altaVendedor();
        
        vs.sueldoMensual(v1);
        vs.vacaciones(v1);       
    }
}
