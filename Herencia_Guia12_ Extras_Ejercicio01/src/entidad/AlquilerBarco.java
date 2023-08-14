
package entidad;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author Pablo Demartini
 */
public class AlquilerBarco {
    
    protected String nombre;
    protected Integer dni;
    protected LocalDate fechaAlquiler;
    protected LocalDate fechaDevolucion;
    protected Integer diasDeAmarre;
    protected Integer amarre;

    public AlquilerBarco() {
    }

    public AlquilerBarco(String nombre, Integer dni, LocalDate fechaAlquiler, LocalDate fechaDevolucion, Integer diasDeAmarre, Integer amarre) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.diasDeAmarre = diasDeAmarre;
        this.amarre = amarre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Integer getDiasDeAmarre() {
        return diasDeAmarre;
    }

    public void setDiasDeAmarre(Integer diasDeAmarre) {
        this.diasDeAmarre = diasDeAmarre;
    }    

    public Integer getAmarre() {
        return amarre;
    }

    public void setAmarre(Integer amarre) {
        this.amarre = amarre;
    }

    @Override
    public String toString() {
        return "AlquilerBarco{" + "nombre=" + nombre + ", dni=" + dni + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", diasDeAmarre=" + diasDeAmarre + ", amarre=" + amarre + '}';
    }

    public void crearAlquilerBarco(){
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        System.out.println("Nombre del cliente:");
        nombre = leer.nextLine();
        System.out.println("DNI del cliente:");
        dni = leer.nextInt();
        leer.nextLine();
        System.out.println("Fecha de comienzo de amarre (dd/mm/yyyy");
        String fecha1 = leer.nextLine();
        fechaAlquiler = LocalDate.parse(fecha1, formatter);
        System.out.println("Fecha de comienzo de amarre (dd/mm/yyyy");
        String fecha2 = leer.nextLine();
        fechaDevolucion = LocalDate.parse(fecha2, formatter);
        diasDeAmarre = (int) ChronoUnit.DAYS.between(fechaAlquiler, fechaDevolucion);
        System.out.println("Dias de amarre: " + diasDeAmarre);
        System.out.println("Numero de amarre:");
        amarre = leer.nextInt();
    }  
    
}
