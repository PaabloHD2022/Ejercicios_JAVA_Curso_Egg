
package entidad;

/**
 *
 * @author Pablo Demartini
 */
public class Circulo implements CalculosFormas {
    
    protected double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularArea(){
        return PI * Math.pow(radio, 2);
    }
    
    @Override
    public double calcularPerimetro(){
        return 2 * PI  * radio;
    }
    
}
