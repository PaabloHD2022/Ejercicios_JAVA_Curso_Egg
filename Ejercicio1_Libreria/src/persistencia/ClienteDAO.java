

package persistencia;

import entidades.Cliente;
import java.util.List;

public class ClienteDAO extends DAO<Cliente> {
    
    @Override
    public void persistirEntidad(Cliente cliente) {
        super.persistirEntidad(cliente);
    }

    @Override
    public void actualizarEntidad(Cliente cliente) {
        super.actualizarEntidad(cliente);
    }

    @Override
    public void borrarEntidad(Cliente cliente) {
        super.borrarEntidad(cliente);
    }

    public Cliente buscarCliente(Integer id) {
        conectarBase();
        Cliente cliente = em.find(Cliente.class, id);
        desconectarBase();
        return cliente;
    }

    public List<Cliente> buscarClienteNombre(String nombre) {
        conectarBase();
        List<Cliente> clientes = em.createQuery("SELECT *FROM Cliente c WHERE c.nombre = :nombre").setParameter("nombre", nombre).getResultList();
        desconectarBase();
        return clientes;
    }
    
    public List<Cliente> buscarClienteDNI(Long documento){
        conectarBase();
        List<Cliente> clientes = em.createQuery("SELECT * FROM Cliente c WHERE c.documento = :documento").setParameter("DNI", documento).getResultList();
        desconectarBase();
        return clientes;
    }

}
