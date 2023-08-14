
package entidad;

/**
 *
 * @author Pablo Demartini
 */
public class EdificioDeOficinas extends Edificio {
    
    protected int cantOficinas;
    protected int cantPersonas;
    protected int cantPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int cantOficinas, int cantPersonas, int cantPisos) {
        this.cantOficinas = cantOficinas;
        this.cantPersonas = cantPersonas;
        this.cantPisos = cantPisos;
    }

    public EdificioDeOficinas(int cantOficinas, int cantPersonas, int cantPisos, double alto, double ancho, double largo) {
        super(alto, ancho, largo);
        this.cantOficinas = cantOficinas;
        this.cantPersonas = cantPersonas;
        this.cantPisos = cantPisos;
    }    

    @Override
    public void calcularSuperficie() {
        System.out.println("La superficie del edificio de oficinas es de: " + largo * ancho);
    }

    @Override
    public void calcularVolumen() {
        System.out.println("La superficie del edificio de oficinas es de: " + largo * ancho * alto);
    }
       
}
