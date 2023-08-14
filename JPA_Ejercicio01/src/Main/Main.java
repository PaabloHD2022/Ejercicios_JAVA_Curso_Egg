package Main;

import persistencia.AutorDAO;
import servicios.AutorServicio;
import servicios.EditorialServicio;
import servicios.LibroServicio;


public class Main {

    public static void main(String[] args) {
        
        AutorServicio as = new AutorServicio();
        EditorialServicio es = new EditorialServicio();
        LibroServicio ls = new LibroServicio();
//        as.crearAutor();
//        es.crearEditorial();
        ls.crearLibro();
        
        
        
    }
    
}
