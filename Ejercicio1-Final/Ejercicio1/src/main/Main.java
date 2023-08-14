package main;

import java.util.Scanner;
import servicios.AutorServicio;
import servicios.EditorialServicio;
import servicios.LibroServicio;

public class Main {

    public static void main(String[] args) {
        AutorServicio as = new AutorServicio();
        EditorialServicio es = new EditorialServicio();
        LibroServicio ls = new LibroServicio();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean menu = true;
        do {
            System.out.println("\n");
            System.out.println("1. Agregar autor, editorial, o libro.");
            System.out.println("2. Dar de alta/baja autor, editorial, o libro.");
            System.out.println("3. Buscar Autor por nombre");
            System.out.println("4. Buscar libro por ISBN");
            System.out.println("5. Buscar libro por Título");
            System.out.println("6. Buscar libro/s por nombre de Autor");
            System.out.println("7. Buscar libro/s por nombre de Editorial");
            System.out.println("8. Salir");

            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("1. Autor");
                    System.out.println("2. Editorial");
                    System.out.println("3. Libro");
                    opcion = leer.nextInt();
                    switch (opcion) {
                        case 1:
                            as.crearAutor();
                            break;
                        case 2:
                            es.crearEditorial();
                            break;
                        case 3:
                            ls.crearLibro();
                            break;
                        default:
                            System.out.println("Opción no reconocida.");
                    }
                    break;
                case 2:
                    System.out.println("1. Autor");
                    System.out.println("2. Editorial");
                    System.out.println("3. Libro");
                    opcion = leer.nextInt();

                    switch (opcion) {
                        case 1:
                            as.darAltaBajaModificar();
                            break;
                        case 2:
                            es.darAltaBajaModifcar();
                            break;
                        case 3:
                            ls.darAltaBajaModificar();
                            break;
                        default:
                            System.out.println("Opción no reconocida.");
                    }
                    break;
                case 3:
                    System.out.println(as.buscarAutorNombre());
                    break;
                case 4:
                    ls.buscarLibroISBN();
                    break;
                case 5:
                    ls.buscarLibroTitulo();
                    break;
                case 6:
                    ls.buscarLibroAutor();
                    break;
                case 7:
                    ls.buscarLibroEditorial();
                    break;
                case 8:
                    menu = false;
                    System.out.println("Gracias por usar mi programa!");
                    break;
                default:
                    System.out.println("Opción no reconocida. Por favor, elige una opción del menú.");
            }
        } while (menu);
    }
}
