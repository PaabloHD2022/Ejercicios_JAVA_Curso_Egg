
package persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class DAO <T> {
    
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistencia_Libreria_Ejercicio01_PU");
    protected EntityManager em = emf.createEntityManager(); //Instanciamos el entity manager.
    
    protected void conectarBase(){
        if(!em.isOpen()){
            em = emf.createEntityManager();
        }
    }
    
    protected void desconectarBase(){
        if(em.isOpen()){
            em.close();
        }
    }
    
    protected void persistirEntidad(T object){
        try {
            conectarBase();
            em.getTransaction().begin();
            em.persist(object);
            em.getTransaction().commit();
            desconectarBase();
        } catch (Exception e) {
            System.out.println("No se pudo cargar");
            if(em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
        }finally{
            desconectarBase();
        }              
    }
    
    protected void actualizarEntidad(T object){
        try {
            em.getTransaction().begin();
            em.merge(object);
            em.getTransaction().commit();  
        } catch (Exception e) {
            System.out.println("No se pudo actualizar");
            if(em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
        }finally{
            desconectarBase();
        }            
    }
    
    protected void borrarEntidad(T object){
        try {
            em.getTransaction().begin();
            em.remove(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("No se pudo borrar");
            if(em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
        }finally{
            desconectarBase();
        }
    }
}
