

package persistencia;

import entidades.Prestamo;
import java.util.List;

public class PrestamoDAO extends DAO<Prestamo> {
    
    @Override
    public void persistirEntidad(Prestamo prestamo) {
        super.persistirEntidad(prestamo);
    }

    @Override
    public void actualizarEntidad(Prestamo prestamo) {
        super.actualizarEntidad(prestamo);
    }

    @Override
    public void borrarEntidad(Prestamo prestamo) {
        super.borrarEntidad(prestamo);
    }

    public Prestamo buscarPrestamo(Integer id) {
        conectarBase();
        Prestamo prestamo = em.find(Prestamo.class, id);
        desconectarBase();
        return prestamo;
    }

    public List<Prestamo> buscarPrestamoNombre(String nombre) {
        conectarBase();
        List<Prestamo> prestamos = em.createQuery("SELECT * FROM Prestamo p where p.nombre = :nombre").setParameter("nombre", nombre).getResultList();
        desconectarBase();
        return prestamos;
    }

}
