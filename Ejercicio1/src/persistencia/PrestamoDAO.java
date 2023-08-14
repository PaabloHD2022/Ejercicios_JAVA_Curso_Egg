package persistencia;

import entidades.Prestamo;

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

    public Prestamo buscarPrestamoId(Integer id) {
        conectarBase();
        Prestamo prestamo = em.find(Prestamo.class, id);
        desconectarBase();
        return prestamo;
    }

}
