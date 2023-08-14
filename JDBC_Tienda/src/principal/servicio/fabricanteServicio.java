

package principal.servicio;

import java.util.Scanner;
import principal.entidad.Fabricante;
import principal.persistencia.FabricanteDAO;

public class fabricanteServicio {
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private FabricanteDAO dao;
    
    public fabricanteServicio(){
        this.dao = new FabricanteDAO();
    }
    
    public void crearFabricante(int codigo, String nombre) throws Exception{
        
        try {
            System.out.println("Ingrese el codigo del producto:");
            codigo = leer.nextInt();
            
            if(codigo < 0){
                throw new Exception("El valor ingresado no es correcto");
            }
            System.out.println("Ingrese el nombre del fabricante:");
            nombre = leer.next();
            
            if(nombre == null || nombre.trim().isEmpty()){
                throw new Exception("Ingrese un nombre de fabricante.");
            }
            
            Fabricante fabricante = new Fabricante();
            fabricante.setCodigo(codigo);
            fabricante.setNombre(nombre);
            
            dao.guardarNuevoFabricante(fabricante);
            
        } catch (Exception e) {
            throw e;
        }
    }
}
