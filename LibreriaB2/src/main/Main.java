package main;

import java.util.logging.Level;
import java.util.logging.Logger;
import servicios.AutorServicio;
import servicios.EditorialServicio;
import servicios.LibroServicio;

public class Main {

    public static void main(String[] args) {

        try {
            AutorServicio as = new AutorServicio();
            EditorialServicio es = new EditorialServicio();
            LibroServicio ls = new LibroServicio();
            //ls.crearLibro(as.crearAutor(), es.crearEditorial());
            as.eliminarAutor();
            //as.modificarAutor();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
