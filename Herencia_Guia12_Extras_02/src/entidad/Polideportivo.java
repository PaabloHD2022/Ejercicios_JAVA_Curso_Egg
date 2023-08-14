
package entidad;

/**
 *
 * @author Pablo Demartini
 */
public class Polideportivo extends Edificio {
    
    protected String nombre;
    protected String tipoInstalacion;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, String tipoInstalacion) {
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public Polideportivo(String nombre, String tipoInstalacion, double alto, double ancho, double largo) {
        super(alto, ancho, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    @Override
    public void calcularSuperficie() {
        System.out.println("La superficie del polideportivo es de: " + largo * ancho);
    }

    @Override
    public void calcularVolumen() {
        System.out.println("La superficie del polideportivo es de: " + largo * ancho * alto);
    }    
    
}
