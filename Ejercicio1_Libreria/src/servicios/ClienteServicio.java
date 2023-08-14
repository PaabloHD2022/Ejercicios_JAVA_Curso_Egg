

package servicios;

import entidades.Cliente;
import java.util.List;
import java.util.Scanner;
import persistencia.ClienteDAO;

public class ClienteServicio {
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    ClienteDAO dao = new ClienteDAO();
    
    public Cliente crearCliente(){
        Cliente cliente = new Cliente();
        
        System.out.println("Ingrese el nombre del cliente");
        String nombre = leer.next();
        cliente.setNombre(nombre);
        System.out.println("Ingrese el apellido del cliente");
        String apellido = leer.next();
        cliente.setApellido(apellido);
        System.out.println("Ingrese el telefono del cliente");
        String telefono = leer.next();
        cliente.setTelefono(telefono);
        
        do {
            try {                
        System.out.println("Ingrese el DNI del cliente");
        Long dni = leer.nextLong();
        cliente.setDocumento(dni);
        if(buscarClienteDNI(dni).isEmpty()){
            break;
                }else{
                    System.out.println("El DNI ingresado ya esta registrado");
                }
            } catch (Exception e) {
                leer.next();
            }
        } while (true);
        cliente.setAlta(true);
        dao.persistirEntidad(cliente);
        System.out.println("Cliente guardado exitosamente");
        return cliente;        
    }
    
    public Cliente crearCliente(String nombre){
        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setAlta(true);
        dao.persistirEntidad(cliente);
        System.out.println("Cliente guardado exitosamente");
        return cliente;
    }
    
    public void darAltaBajaModificar(){
        Integer id;
        do {
            System.out.println("Ingrese el ID del cliente que desea dar ALTA/BAJA/MODIFICAR");
            try {
                id= leer.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("El ID ingresado no es correcto");
            }
        } while (true);
        Cliente cliente = dao.buscarCliente(id);
        int opcion;
        do {
            System.out.println("1 - ALTA/BAJA \n 2 - MODIFICAR");
            try {
                opcion = leer.nextInt();
                if (!(opcion == 1 || opcion == 2)) {
                    System.out.println("La opcion ingresada no es correcta");
                }else{
                    break;
                }
            } catch (Exception e) {
                System.out.println("La opcion ingresada no es correcta");
            }
        } while (true);
        switch(opcion){
            case 1 -> {
                if(cliente.getAlta()){
                    cliente.setAlta(Boolean.FALSE);
                }else{
                    cliente.setAlta(true);
                }
            }
            case 2 -> {
                System.out.println("Ingrese el cliente que desea modificar");
                String nombreCliente = leer.next();
                cliente.setNombre(nombreCliente);
            }
        }
        dao.actualizarEntidad(cliente);
    }
    
    public List<Cliente> buscarClienteNombre(){
        System.out.println("Ingrese el nombre del cliente");
        String nombre = leer.next();
        return dao.buscarClienteNombre(nombre);
    }
    
    public List<Cliente> buscarClienteNombre(String nombre){
        return dao.buscarClienteNombre(nombre);
    }
    
    public List<Cliente> buscarClienteDNI(){
        System.out.println("Ingrese el DNI del cliente");
        long dni = leer.nextLong();
        return dao.buscarClienteDNI(dni);
    }
    
    public List<Cliente> buscarClienteDNI(Long documento){
        List<Cliente> clientes =  dao.buscarClienteDNI(documento);
        return clientes;
        
    }

}
