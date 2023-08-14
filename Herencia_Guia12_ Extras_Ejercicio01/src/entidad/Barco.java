
package entidad;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Pablo Demartini
 */
public class Barco extends AlquilerBarco {
    
    protected String matricula;
    protected double eslora;
    protected Integer anioFabricacion;
    protected Double moduloAlquiler;

    public Barco() {
    }

    public Barco(String matricula, double eslora, Integer anioFabricacion, Double moduloAlquiler) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
        this.moduloAlquiler = moduloAlquiler;
    }

    public Barco(String matricula, double eslora, Integer anioFabricacion, Double moduloAlquiler, String nombre, Integer dni, LocalDate fechaAlquiler, LocalDate fechaDevolucion, Integer diasDeAmarre, Integer amarre) {
        super(nombre, dni, fechaAlquiler, fechaDevolucion, diasDeAmarre, amarre);
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
        this.moduloAlquiler = moduloAlquiler;
    }

    public Double getModuloAlquiler() {
        return moduloAlquiler;
    }

    public void setModuloAlquiler(Double moduloAlquiler) {
        this.moduloAlquiler = moduloAlquiler;
    }

    @Override
    public Integer getDiasDeAmarre() {
        return diasDeAmarre;
    }

    @Override
    public void setDiasDeAmarre(Integer diasDeAmarre) {
        this.diasDeAmarre = diasDeAmarre;
    }    

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Integer anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
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
        System.out.println("Matricula del barco:");
        matricula = leer.next();
        System.out.println("Eslora del barco:");
        eslora = leer.nextDouble();
        System.out.println("Año de fabricacion:");
        anioFabricacion = leer.nextInt();          
    }
    
    public void crearModuloAlquiler(){      
        moduloAlquiler = eslora * 10 * diasDeAmarre;        
    }   
    
}
