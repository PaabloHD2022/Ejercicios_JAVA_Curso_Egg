package tienda.servicios;

import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.persistencia.fabricanteDAO;

public class fabricanteServicio {
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private final fabricanteDAO dao;
    
    public fabricanteServicio(){
        this.dao = new fabricanteDAO();
    }
    
    public void crearFabricante() throws Exception{
        
        try {
            System.out.println("Ingrese el codigo del fabricante:");
            int codigo = leer.nextInt();
            if(codigo <1){
                throw new Exception("El codigo debe ser mayor a Cero");
            }
            System.out.println("Ingrese el nombre del fabricante:");
            String nombre = leer.next();
            if(nombre == null || nombre.trim().isEmpty()){
                throw new Exception("Debe indicar un nombre de fabricante");
            }
            
            Fabricante fab = new Fabricante();
            fab.setCodigo(codigo);
            fab.setNombre(nombre);
            dao.crearFabricante(fab);
            
        } catch (Exception e) {
            throw e;
        }        
    }
    
    public void modificarFabricante(int codigo, String nombre){
        
        
    }

}
