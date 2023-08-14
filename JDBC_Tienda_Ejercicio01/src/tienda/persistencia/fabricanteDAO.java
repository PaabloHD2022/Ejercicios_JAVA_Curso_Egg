package tienda.persistencia;

import tienda.entidades.Fabricante;

public final class fabricanteDAO extends DAO {
    
    //Metodo para guardar nuevos fabricantes
    //g) Ingresar un fabricante a la base de datos
    public void crearFabricante(Fabricante fabricante) throws Exception{
        
        try {
            if(fabricante == null){
                throw new Exception("Debe indicar el fabricante");
            }
            
            String sql = "INSERT INTO fabricante (clave, nombre)" + "VALUES ('" + fabricante.getCodigo() + "','" + fabricante.getNombre() + "');";
            insertarModificarEliminar(sql);            
        } catch (Exception e) {
            throw e;
        }finally{
            desconectarBase();
        }        
    }
    
    /*Metodo para modificar fabricantes*/
    public void modificarFabricante(Fabricante fabricante) throws Exception{
        
        try {
            if(fabricante == null){
                throw new Exception("Ingrese el usuario que desea modificar");                 
            }
            String sql = "UPDATE fabricante SET " + "codigo = '" + fabricante.getCodigo() + "' WHERE nombre = '" + fabricante.getNombre() + "'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }      
    }
    
    /*Metodo para eliminar fabricantes*/
    public void elimimarFabricante(String nombre) throws Exception{
        
        try {
            String sql = "DELETE FROM fabricante WHERE nombre = '" + nombre + "'";
            insertarModificarEliminar(sql);            
        } catch (Exception e) {
            throw e;
        }finally{
            desconectarBase();
        }        
    }    
}
