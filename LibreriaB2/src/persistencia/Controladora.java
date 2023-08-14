
package persistencia;

import entidades.Autor;
import entidades.Editorial;
import entidades.Libro;
import persistencia.exceptions.NonexistentEntityException;

public class Controladora {
    
    AutorJpaController ajpa = new AutorJpaController();
    EditorialJpaController ejpa = new EditorialJpaController();
    LibroJpaController ljpa = new LibroJpaController();

    public void crearAutor(Autor autor) {
        ajpa.crear(autor);
    }

    public void crearLibro(Libro libro) throws Exception {
        ljpa.create(libro);
    }

    public void crearEditorial(Editorial editorial) {
        ejpa.create(editorial);
    }

    public void eliminarAutor(Autor autor) throws NonexistentEntityException {
        ajpa.eliminar(autor.getId());
    }

    public void modificarAutor(Autor autor) throws Exception {
        ajpa.editar(autor);
    }
    
    
    
    
}
