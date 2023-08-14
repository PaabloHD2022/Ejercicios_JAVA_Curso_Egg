
package entidad;

/**
 *
 * @author Pablo Demartini
 */
public class CantanteFamoso {
    
    private String nombreCantante;
    private String discoMasVendido;

    public CantanteFamoso() {
    }

    public CantanteFamoso(String nombreCantante, String discoMasVendido) {
        this.nombreCantante = nombreCantante;
        this.discoMasVendido = discoMasVendido;
    }

    public String getNombreCantante() {
        return nombreCantante;
    }

    public void setNombreCantante(String nombreCantante) {
        this.nombreCantante = nombreCantante;
    }

    public String getDiscoMasVendido() {
        return discoMasVendido;
    }

    public void setDiscoMasVendido(String discoMasVendido) {
        this.discoMasVendido = discoMasVendido;
    }    
    
}
