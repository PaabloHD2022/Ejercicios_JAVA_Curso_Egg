

package com.mycompany.collections_guia10_ej04;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;
import servicio.PeliculaServicio;

/**
 *
 * @author Pablo Demartini
 */
public class Collections_Guia10_Ej04 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PeliculaServicio peliculaServ = new PeliculaServicio();
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        
        peliculaServ.cargarPeliculas(peliculas);
        peliculaServ.mostrarPeliculas(peliculas);
        peliculaServ.mostrarPeliculasMasDeUnaHora(peliculas);
        peliculaServ.ordenarPeliculasMayorAMenor(peliculas);
        peliculaServ.ordenarPeliculasMenorAMayor(peliculas);
        peliculaServ.ordenAlfabeticoTitulos(peliculas);
        peliculaServ.ordenAlfabeticoDirectores(peliculas);
        
    }
}
