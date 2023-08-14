package MainLibreria;

import java.util.Scanner;
import servicios.AutorServicio;
import servicios.EditorialServicio;
import servicios.LibroServicio;
import servicios.ClienteServicio;
import servicios.PrestamoServicio;

public class MainLibreria {

    public static void main(String[] args) {
        AutorServicio as = new AutorServicio();
        EditorialServicio es = new EditorialServicio();
        LibroServicio ls= new LibroServicio();
        ClienteServicio cs = new ClienteServicio();
        PrestamoServicio ps = new PrestamoServicio();
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        
        boolean menu = true;
        do {
            int opcion = 0;
            do {
                try {
                    System.out.println("");
                    System.out.println("Bienvenido a la libreria");
                    System.out.println("");
                    System.out.println("Seleccione una opcion de la lista");
                    System.out.println("");
                    System.out.println("1 - Ingresar autor, editorial, libro o cliente");
                    System.out.println("2 - Dar alta/baja autor, editorial, libro o cliente");
                    System.out.println("3 - Buscar autor por nombre");
                    System.out.println("4 - Buscar libro por ISBN");
                    System.out.println("5 - Buscar libro por título");
                    System.out.println("6 - Buscar libro/s por nombre de autor");
                    System.out.println("7 - Buscar libro/s por nombre de editorial");
                    System.out.println("8 - Registrar prestamo");
                    System.out.println("9 - Salir");
            
                opcion = leer.nextInt();
                break;
            } catch (Exception e) {
                leer.next();
                System.out.println("");
                System.out.println("Opción no válida.");
            }
            } while (menu);            
            switch(opcion){
                case 1 -> {
                    do {
                        try {
                            System.out.println("Seleccione que item desea ingresar");
                            System.out.println("1 - Autor");
                            System.out.println("2 - Editorial");
                            System.out.println("3 - Libro");
                            System.out.println("4 - Cliente");
                            opcion = leer.nextInt();
                            break;
                        } catch (Exception e) {
                            leer.next();
                            System.out.println("Opcion incorrecta");
                        }
                    } while (true);
                    switch (opcion){
                        case 1 -> as.crearAutor();
                        case 2 -> es.crearEditorial();
                        case 3 -> ls.crearLibro();
                        case 4 -> cs.crearCliente();
                        default -> System.out.println("Opcion incorrecta");                            
                    }
                }
                case 2 -> {
                    do {
                        try {
                            System.out.println("Seleccione que item desea dar de ALTA/BAJA");
                            System.out.println("1 - Autor");
                            System.out.println("2 - Editorial");
                            System.out.println("3 - Libro");
                            System.out.println("4 - Cliente");
                            opcion = leer.nextInt();
                            break;
                        } catch (Exception e) {
                            leer.next();
                            System.out.println("Opcion incorrecta");
                        }
                    } while (true);
                    switch (opcion){
                        case 1 -> as.darAltaBajaModificar();
                        case 2 -> es.darAltaBajaModificar();
                        case 3 -> ls.darAltaBajaModificar();
                        case 4 -> cs.darAltaBajaModificar();
                        default -> System.out.println("Opcion incorrecta");
                    }
                }
                case 3 -> System.out.println(as.buscarAutorNombre());
                case 4 -> ls.buscarLibroISBN();
                case 5 -> ls.buscarLibroTitulo();
                case 6 -> ls.buscarLibroAutor();
                case 7 -> ls.buscarLibroEditorial();
                case 8 -> ps.prestarLibro();
                case 9 -> {
                    menu = false;
                    System.out.println("Salio del programa");
                }
                default -> System.out.println("Opcion incorrecta, seleccione una opcion disponible del menu.");                    
            }            
        } while (menu);        
    }    
}
