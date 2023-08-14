
package entidad;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Pablo Demartini
 */
public class Velero extends Barco {
    
    protected int mastiles;

    public Velero() {
    }

    public Velero(int mastiles) {
        this.mastiles = mastiles;
    }

    public Velero(int mastiles, String matricula, double eslora, Integer anioFabricacion, Double moduloAlquiler) {
        super(matricula, eslora, anioFabricacion, moduloAlquiler);
        this.mastiles = mastiles;
    }

    public Velero(int mastiles, String matricula, double eslora, Integer anioFabricacion, Double moduloAlquiler, String nombre, Integer dni, LocalDate fechaAlquiler, LocalDate fechaDevolucion, Integer diasDeAmarre, Integer amarre) {
        super(matricula, eslora, anioFabricacion, moduloAlquiler, nombre, dni, fechaAlquiler, fechaDevolucion, diasDeAmarre, amarre);
        this.mastiles = mastiles;
    }

    @Override
    public Double getModuloAlquiler() {
        return moduloAlquiler;
    }

    @Override
    public void setModuloAlquiler(Double moduloAlquiler) {
        this.moduloAlquiler = moduloAlquiler;
    }

    

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(Integer mastiles) {
        this.mastiles = mastiles;
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
    
    @Override
    public void crearBarco(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        
        crearAlquilerBarco();
        System.out.println("Numero de mastiles:");
        mastiles = leer.nextInt();
        leer.nextLine();
    }
    
    @Override
    public void crearModuloAlquiler(){        
        moduloAlquiler += mastiles;    
    }   
    
    
}
