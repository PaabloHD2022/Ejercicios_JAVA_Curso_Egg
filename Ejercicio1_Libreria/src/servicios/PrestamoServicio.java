
package servicios;

import entidades.Cliente;
import entidades.Libro;
import entidades.Prestamo;
import java.util.Scanner;
import persistencia.PrestamoDAO;

public class PrestamoServicio {
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    PrestamoDAO dao = new PrestamoDAO();
    LibroServicio ls = new LibroServicio();
    ClienteServicio cs = new ClienteServicio();
    
    public void prestarLibro(){
        boolean bucleTitulo = true;
        Prestamo prestamo = new Prestamo();
        do {
            do {
                System.out.println("Ingrese el titulo del libro que desea retirar");
                String titulo = leer.next();
                if(ls.buscarLibroTitulo(titulo).isEmpty()){
                    System.out.println("No hay stock del libro solicitado");
                    System.out.println("¿Desea solicitar otro libro? S/N");
                    String respuesta = leer.next();
                    if(!respuesta.equalsIgnoreCase("S")){
                        break;
                    }
                }else{
                    Libro libro = ls.buscarLibroTitulo(titulo).get(0);
                    if(libro.getEjemplaresRestantes()>0){
                        libro.setEjemplaresPrestados(libro.getEjemplaresPrestados()+1);
                        libro.setEjemplaresRestantes(libro.getEjemplaresRestantes()-1);
                        prestamo.setLibro(libro);
                        ls.dao.actualizarEntidad(libro);
                        System.out.println("Disponible, ejemplares restantes: " + libro.getEjemplaresRestantes());
                        break;
                    }else{
                        System.out.println("No disponible, ejemplares restantes: " + libro.getEjemplaresRestantes());
                        System.out.println("¿Desea solicitar otro libro? S/N");
                        String respuesta = leer.next();
                        if(!respuesta.equalsIgnoreCase("S")){
                            break;
                        }
                    }
                }
            } while (bucleTitulo);
            Cliente cliente;
            do {
                System.out.println("Ingrese el DNI del cliente");
                long dni = leer.nextInt();
                if(cs.buscarClienteDNI().isEmpty()){
                    System.out.println("No hay registro del DNI ingresado. ¿Desea registrarlo? S/N");
                    String respuesta2 = leer.next();
                    if(!respuesta2.equalsIgnoreCase("S")){
                        cliente = cs.crearCliente();
                    }
                }else{
                    cliente = cs.buscarClienteDNI(dni).get(0);
                    prestamo.setCliente(cliente);
                    break;
                }
            } while (true);
            dao.persistirEntidad(prestamo);
            System.out.println("¿Desea realizar otro prestamo? S/N");
            String respuesta3 = leer.next();
            if(!respuesta3.equalsIgnoreCase("S")){
                break;
            }            
        } while (true);
    }
}
