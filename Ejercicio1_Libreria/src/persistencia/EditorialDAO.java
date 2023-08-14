

package persistencia;

import entidades.Editorial;
import java.util.List;

public class EditorialDAO extends DAO<Editorial> {
    
    @Override
    public void persistirEntidad(Editorial editorial) {
        super.persistirEntidad(editorial);
    }

    @Override
    public void actualizarEntidad(Editorial editorial) {
        super.actualizarEntidad(editorial);
    }

    @Override
    public void borrarEntidad(Editorial editorial) {
        super.borrarEntidad(editorial);
    }

    public Editorial buscarEditorial(Integer id) {
        conectarBase();
        Editorial autor = em.find(Editorial.class, id);
        desconectarBase();
        return autor;
    }

    public List<Editorial> buscarEditorialNombre(String nombre) {
        conectarBase();
        List<Editorial> editoriales = em.createQuery("SELECT * FROM Editorial e where e.nombre = :nombre").setParameter("nombre", nombre).getResultList();
        desconectarBase();
        return editoriales;
    }

}
