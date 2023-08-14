
package entidad;

/**
 *
 * @author Pablo Demartini
 */
public abstract class Edificio {
    
    protected double alto;
    protected double ancho;
    protected double largo;

    public Edificio(){
        
    }    
    
    public Edificio(double alto, double ancho, double largo) {
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }
    
    public abstract void calcularSuperficie();
    public abstract void calcularVolumen();
    
}
