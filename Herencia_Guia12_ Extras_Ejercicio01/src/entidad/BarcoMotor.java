
package entidad;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Pablo Demartini
 */
public class BarcoMotor extends Barco {
    
    protected Double potenciaCV;

    public BarcoMotor() {
    }

    public BarcoMotor(Double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public BarcoMotor(Double potenciaCV, String matricula, double eslora, Integer anioFabricacion, Double moduloAlquiler) {
        super(matricula, eslora, anioFabricacion, moduloAlquiler);
        this.potenciaCV = potenciaCV;
    }

    public BarcoMotor(Double potenciaCV, String matricula, double eslora, Integer anioFabricacion, Double moduloAlquiler, String nombre, Integer dni, LocalDate fechaAlquiler, LocalDate fechaDevolucion, Integer diasDeAmarre, Integer amarre) {
        super(matricula, eslora, anioFabricacion, moduloAlquiler, nombre, dni, fechaAlquiler, fechaDevolucion, diasDeAmarre, amarre);
        this.potenciaCV = potenciaCV;
    }

    public Double getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(Double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public String getMatricula() {
        return matricula;
    }

    @Override
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public double getEslora() {
        return eslora;
    }

    @Override
    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    @Override
    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }

    @Override
    public void setAnioFabricacion(Integer anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public Double getModuloAlquiler() {
        return moduloAlquiler;
    }

    @Override
    public void setModuloAlquiler(Double moduloAlquiler) {
        this.moduloAlquiler = moduloAlquiler;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public Integer getDni() {
        return dni;
    }

    @Override
    public void setDni(Integer dni) {
        this.dni = dni;
    }

    @Override
    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    @Override
    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    @Override
    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    @Override
    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    @Override
    public Integer getDiasDeAmarre() {
        return diasDeAmarre;
    }

    @Override
    public void setDiasDeAmarre(Integer diasDeAmarre) {
        this.diasDeAmarre = diasDeAmarre;
    }

    @Override
    public Integer getAmarre() {
        return amarre;
    }

    @Override
    public void setAmarre(Integer amarre) {
        this.amarre = amarre;
    }
    
    public void crearBarco(){
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        crearAlquilerBarco();
        System.out.println("Potencia del barco (CV)");
        potenciaCV = leer.nextDouble();
        
    }
    
    public void crearModuloAlquiler(){
        
        super.moduloAlquiler += potenciaCV;
        
    }
    
    
    
}
