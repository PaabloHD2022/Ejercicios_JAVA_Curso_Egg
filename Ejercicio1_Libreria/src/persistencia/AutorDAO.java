

package persistencia;

import entidades.Autor;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class AutorDAO extends DAO<Autor> {
    
    @Override
    public void persistirEntidad(Autor autor) {
        super.persistirEntidad(autor);
    }

    @Override
    public void actualizarEntidad(Autor autor) {
        super.actualizarEntidad(autor);
    }

    @Override
    public void borrarEntidad(Autor autor) {
        super.borrarEntidad(autor);
    }

    public Autor buscarAutor(Integer id) {
        conectarBase();
        Autor autor = em.find(Autor.class, id);
        desconectarBase();
        return autor;
    }

//    public List<Autor> buscarAutorNombre(String nombre) {
//        conectarBase();
//        List<Autor> autores = em.createQuery("SELECT * FROM autor WHERE nombre = :nombre").setParameter("nombre", nombre).getResultList();
//        desconectarBase();
//        return autores;
//    }
//    
//    public List<Autor> buscarAutorNombre(String nombre) {
//    conectarBase();
//    List<Autor> autores = em.createQuery("SELECT a FROM autor a WHERE a.NOMBRE = :NOMBRE", Autor.class)
//                            .setParameter("nombre", nombre)
//                            .getResultList();
//    desconectarBase();
//    return autores;
//}
    
    public List<Autor> buscarAutorNombre(String nombre) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Ejercicio1_LibreriaPU"); // Cambia "nombreUnidadPersistencia" al nombre de tu unidad de persistencia
    EntityManager em = emf.createEntityManager();
    
    try {
        TypedQuery<Autor> query = em.createQuery("SELECT a FROM Autor a WHERE a.nombre = :nombre", Autor.class);
        query.setParameter("nombre", nombre);
        List<Autor> autores = query.getResultList();
        return autores;
    } finally {
        em.close();
        emf.close();
    }
}


}
