
package persistencia;

import entidades.Libro;

public class LibroDAO extends DAO <Libro> {
    
    @Override
    public void persistirEntidad(Libro object){
        super.persistirEntidad(object);
    }
    
    @Override
    public void actualizarEntidad(Libro object){
        super.actualizarEntidad(object);
    }
    
    @Override
    public void borrarEntidad(Libro object){
        super.borrarEntidad(object);
    }   

}
