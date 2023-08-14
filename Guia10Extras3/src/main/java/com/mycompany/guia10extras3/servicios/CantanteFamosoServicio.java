
package com.mycompany.guia10extras3.servicios;

import com.mycompany.guia10extras3.entidades.CantanteFamoso;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CantanteFamosoServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Map<String, String> cantantes = new HashMap<>();

    public void cantantes() {
        CantanteFamoso autor = new CantanteFamoso();
        boolean asd = false;
        do {
            System.out.println("Ingrese un cantante ");
            autor.setNombre(sc.nextLine());
            System.out.println("Ingrese el disco mas vendido");
            autor.setDiscoMasVendido(sc.nextLine());
            cantantes.put(autor.getNombre(), autor.getDiscoMasVendido());
            System.out.println("Desea seguir ingresando mas cantantes?");
            String resp = sc.next();
            sc.nextLine();
            if (resp.equalsIgnoreCase("no")) {
                asd = true;
            }
        } while (!asd);  
    }
    
    public  void mostar(){
        for (Map.Entry<String, String> entry : cantantes.entrySet()) {
            Object key = entry.getKey();
            Object val = entry.getValue();
            System.out.println("El cantante es: " + key + " Y su disco es: "  + val); 
        }
    }
    
    public void agregarCantante(){
        System.out.println("Ingrese el nuevo cantante");
        String nuevo = sc.nextLine();
        System.out.println("Ingrese su disco mas vendido");
        String disco = sc.nextLine();
        cantantes.put(nuevo, disco);
    }
    
    public void eliminarCantante(){
        System.out.println("Ingrese el cantante a eliminar");
        String eliminar = sc.nextLine();
        cantantes.remove(eliminar);
    }
}
