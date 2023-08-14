
package persistencia;

import entidades.Autor;

public class AutorDAO extends DAO <Autor> {
    
    @Override
    public void persistirEntidad(Autor object){
        super.persistirEntidad(object);
    }
    
    @Override
    public void actualizarEntidad(Autor object){
        super.actualizarEntidad(object);
    }
    
    @Override
    public void borrarEntidad(Autor object){
        super.borrarEntidad(object);
    }

}
