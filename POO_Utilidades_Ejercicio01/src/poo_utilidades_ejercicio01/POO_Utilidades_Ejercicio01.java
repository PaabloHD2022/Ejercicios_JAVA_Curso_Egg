package poo_utilidades_ejercicio01;

import entidades.Cadena;
import java.util.Scanner;
import servicios.CadenaServicio;

/**
 *
 * @author Pablo Demartini
 */
public class POO_Utilidades_Ejercicio01 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = leer.nextLine();
        frase = frase.toLowerCase();
        
        Cadena cadena = new Cadena(frase);
        CadenaServicio cServicio = new CadenaServicio();        
       
        cServicio.mostrarVocales(cadena);
        cServicio.invertirFrase(cadena);
        cServicio.vecesRepetido(cadena, frase);
        cServicio.compararLongitud(cadena, frase);
        cServicio.unirFrases(cadena, frase);
        cServicio.reemplazar(cadena, frase, frase);
        cServicio.contiene(cadena);        
    }    
}
