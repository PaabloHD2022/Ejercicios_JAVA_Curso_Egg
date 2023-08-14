

package principal.persistencia;

import principal.entidad.Fabricante;
import principal.servicio.fabricanteServicio;

public class FabricanteDAO extends DAO {
    
    public final fabricanteServicio FabricanteServicio;
    
    public FabricanteDAO(){
        this.FabricanteServicio = new fabricanteServicio();
    }
    
    public void guardarNuevoFabricante(Fabricante fabricante) throws Exception{
        
        try {
            if(fabricante == null){
                throw new Exception("Debe indicar el fabricante");
            }
            String sql = "INSERT INTO Fabricante(codigo, nombre)" + "VALUES ('" + fabricante.getCodigo() + "' , '"  + fabricante.getNombre() + " );";
            System.out.println(sql);
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }finally{
            desconectarBase();
        }
    }
    
    public Fabricante buscarFabricantePorCodigo(int codigo_fabricante) throws Exception{
        
        try {
            
            String sql = "SELECT * FROM fabricante WHERE codigo_fabricante = '" + codigo_fabricante + "'";
            consultarBase(sql);
            Fabricante fabricante = null;
            while(resultado.next()){
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));
            }
            return fabricante;
        } catch (Exception e) {
            throw e;
        }finally{
            desconectarBase();
        }        
    }
}
