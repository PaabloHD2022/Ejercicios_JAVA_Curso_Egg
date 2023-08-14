

package servicios;

import entidades.Autor;
import entidades.Editorial;
import entidades.Libro;
import java.util.List;
import java.util.Scanner;
import persistencia.LibroDAO;

public class LibroServicio {
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    LibroDAO dao = new LibroDAO();
    AutorServicio as = new AutorServicio();
    EditorialServicio es = new EditorialServicio();
    
    public void crearLibro(){
        Libro libro = new Libro();
        
        do {
            System.out.println("Ingrese el ISBN del libro");
            try {
                long ISBN = leer.nextLong();
                libro.setISBN(ISBN);
                break;
            } catch (Exception e) {
                System.out.println("Error al ingresar el ISBN");
                leer.next();
            }
        } while (true);
        
        do {
            System.out.println("Ingrese el titulo del libro");
            String titulo = leer.next();
            libro.setTitulo(titulo);
            if(buscarLibroTitulo(titulo).isEmpty()){
                break;
            }            
        } while (true);
        
        do {
            System.out.println("Ingrese el año de publicacion del libro");
            try {
                int anio = leer.nextInt();
                libro.setAnio(anio);
                break;
            } catch (Exception e) {
                System.out.println("Error al cargar el año de publicacion");
                leer.next();
            }           
        } while (true);
        
        do {            
            System.out.println("Ingrese la cantidad de ejemplares");
            try {
                int cantidadEjemplares = leer.nextInt();
                libro.setEjemplares(cantidadEjemplares);
                libro.setEjemplaresRestantes((libro.getEjemplares()) - (libro.getEjemplaresPrestados()));
                break;
            } catch (Exception e) {
                System.out.println("Error al ingresar la cantidad de ejemplares");
                leer.nextInt();
            }
        } while (true);
            libro.setAlta(true);
        
        do {
            System.out.println("Ingrese el nombre del autor");
            String nombreAutor = leer.next();
            if(as.buscarAutorNombre(nombreAutor).isEmpty()){
                System.out.println("Autor no encontrado, ¿Desea registrar el nuevo autor S/N?");
                String respuesta = leer.next();
                if(respuesta.equalsIgnoreCase("S")){
                    Autor autor = as.crearAutor(nombreAutor);
                    libro.setAutor(autor);                    
                    break;
                }
            }else{
                System.out.println("Autor ya registrado");
                libro.setAutor(as.buscarAutorNombre(nombreAutor).get(0));
                break;
            }            
        } while (true);
        
        do {
            System.out.println("Ingrese el nombre de la editorial");
            String nombreEd = leer.next();
            if(es.buscarEditorialNombre(nombreEd).isEmpty()){
                System.out.println("Editorial no encontrada, ¿desea registrarla? S/N");
                String respuesta = leer.next();
                if(respuesta.equalsIgnoreCase("S")){
                    Editorial editorial = es.crearEditorial(nombreEd);
                    libro.setEditorial(editorial);
                    break;
                }
            }            
        } while (true);
        dao.persistirEntidad(libro);     
    }
    
    public void buscarLibroTitulo(){
        System.out.println("Ingrese el titulo del libro");
        String titulo = leer.next();
        System.out.println(dao.buscarLibroTitulo(titulo));
    }
    
    public List<Libro> buscarLibroTitulo(String titulo){
        List<Libro> libros = dao.buscarLibroTitulo(titulo);
        return libros;
    }
    
    public void buscarLibroAutor(){
        System.out.println("Ingrese el nombre del autor");
        String nombreAutor = leer.next();
        List<Libro> libros = dao.buscarLibroAutor(nombreAutor);
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
    
    public void buscarLibroEditorial(){
        System.out.println("Ingrese el nombre de la editorial");
        String nombreEditorial = leer.next();
        List<Libro> libros = dao.buscarLibroEditorial(nombreEditorial);
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
    
    public void darAltaBajaModificar(){
        long ISBN;
        do {
            System.out.println("Ingrese el ISBN del libro que desea dar ALTA/BAJA/MODIFICAR");
            try {
                ISBN = leer.nextLong();
                break;
            } catch (Exception e) {
                System.out.println("Error al ingresar el ISBN");
                leer.next();
            }
        } while (true);
        Libro libro = dao.buscarLibroISBN(ISBN);
        int opcion;
        do {
            System.out.println("1 - ALTA/BAJA \n 2 - MODIFICAR");
            try {
                opcion = leer.nextInt();
                if(!(opcion == 1 || opcion == 2)){
                    System.out.println("La opcion ingresada no es correcta");
                }else{
                    break;
                }
            } catch (Exception e) {
                System.out.println("La opcion ingresada no es correcta");
            }
        } while (true);
        switch (opcion){
            case 1 -> { 
                if(libro.getAlta()){
                    libro.setAlta(Boolean.FALSE);
                }else{
                    libro.setAlta(true);
                }
            }
            case 2 -> {
                System.out.println("Seleccione que desea Modificar");
                System.out.println("1 - Año de edicion");
                System.out.println("2 - Autor");
                System.out.println("3 - Editorial");
                System.out.println("4 - Título");
                System.out.println("5 - Cantidad de ejemplares");
                opcion = leer.nextInt();
                switch (opcion){
                    case 1 -> {
                        System.out.println("Ingrese año de edicion");
                        int anio = leer.nextInt();
                        libro.setAnio(anio);
                }
                    case 2 -> {
                        do {
                            System.out.println("Ingrese el nombre del autor");
                            String nombreAutor = leer.next();
                            if(as.buscarAutorNombre(nombreAutor).isEmpty()){
                                System.out.println("Autor no registrado, ¿Desea registralo? S/N");
                                String respuesta = leer.next();
                                if(respuesta.equalsIgnoreCase("S")){
                                    Autor autor = as.crearAutor(nombreAutor);
                                    libro.setAutor(autor);
                                    break;
                                }
                            }else{
                                System.out.println("Autor ya registrado");
                                libro.setAutor(as.buscarAutorNombre(nombreAutor).get(0));
                                break;
                            }                            
                        } while (true);
                }
                    case 3 -> {
                        do {
                            System.out.println("Ingrese el nombre de la editorial");
                            String nombreEditorial = leer.next();
                            if(es.buscarEditorialNombre(nombreEditorial).isEmpty()){
                                System.out.println("Editorial no registrada, ¿Desa registrarla? S/N");
                                String respuesta = leer.next();
                                if(respuesta.equalsIgnoreCase("S")){
                                    Editorial editorial = es.crearEditorial(nombreEditorial);
                                    libro.setEditorial(editorial);
                                    break;
                                }
                            }else{
                                System.out.println("Editorial ya registrada");
                                libro.setEditorial(es.buscarEditorialNombre(nombreEditorial).get(0));
                                break;
                            }
                        } while (true);
                }
                    case 4 -> {
                        System.out.println("Ingrese el título que desea modificar");
                        String titulo = leer.next();
                        libro.setTitulo(titulo);
                }
                    case 5 -> {
                        System.out.println("Ingrese la cantidad de ejemplares");
                        int cantidadEjemplares = leer.nextInt();
                        if(libro.getEjemplaresRestantes() == libro.getEjemplares()){
                            libro.setEjemplaresRestantes(cantidadEjemplares);
                        }                       
                        libro.setEjemplaresRestantes(cantidadEjemplares);
                    }
                }
            }                
        }
        dao.actualizarEntidad(libro);
    }
    
    public void buscarLibroISBN(){
        do {
            System.out.println("Ingrese el ISBN del libro que desea buscar");
            try {
                long isbn = leer.nextLong();
                System.out.println(dao.buscarLibroISBN(isbn));                
            } catch (Exception e) {
                System.out.println("El numero ingresado no corresponde");
            }
        } while (true);        
    }
}
