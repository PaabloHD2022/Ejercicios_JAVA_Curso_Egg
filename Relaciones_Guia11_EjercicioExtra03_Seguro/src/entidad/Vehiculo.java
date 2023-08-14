
package entidad;

import enums.Color;
import enums.Tipo;


/**
 *
 * @author Pablo Demartini
 */
public class Vehiculo {
    
    private String marca;
    private String modelo;
    private int anio;
    private long numeroMotor;
    private String chasis;
    private Color color;
    private Tipo tipo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int anio, long numeroMotor, String chasis, Color color, Tipo tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.numeroMotor = numeroMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public long getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(long numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", numeroMotor=" + numeroMotor + ", chasis=" + chasis + ", color=" + color + ", tipo=" + tipo + '}';
    }  
    
}
