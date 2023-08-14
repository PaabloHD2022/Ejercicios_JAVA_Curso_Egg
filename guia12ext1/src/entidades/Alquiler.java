/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

//En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

    //nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
    //amarre y el barco que lo ocupará.
    public class Alquiler {
    private String nombre;
    private Integer dni;
    private LocalDate fechaIngreso;
    private LocalDate fechaEgreso;
    private Integer PosAmarre;
    private int diasAlq;
    private Barco barco;

    public Scanner s = new Scanner(System.in).useDelimiter("\n");
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    
    public Alquiler() {
    }

    public Alquiler(String nombre, Integer dni, LocalDate fechaIngreso, LocalDate fechaEgreso, Integer PosAmarre, Barco barco) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaIngreso = fechaIngreso;
        this.fechaEgreso = fechaEgreso;
        this.PosAmarre = PosAmarre;
        this.barco = barco;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setFechaEgreso(LocalDate fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }

    public void setPosAmarre(Integer PosAmarre) {
        this.PosAmarre = PosAmarre;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public int getDiasAlq() {
        return diasAlq;
    }

    public void setDiasAlq(int diasAlq) {
        this.diasAlq = diasAlq;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", dni=" + dni + ", fechaIngreso=" + fechaIngreso + ", fechaEgreso=" + fechaEgreso + ", PosAmarre=" + PosAmarre + ", barco=" + barco + ", s=" + s + ", formatter=" + formatter + '}';
    }

    public void crearAlquiler(){
        System.out.println("Ingrese nombre"); 
        nombre = s.next();
        System.out.println("Ingrese dni");  
        dni = s.nextInt();
        System.out.println("Ingrese Fecha de ingreso"); 
        String aux = s.next();
        fechaIngreso = LocalDate.parse(aux, formatter);
        System.out.println("Ingrese Fecha de Egreso"); 
        String aux1 = s.next();
        fechaEgreso = LocalDate.parse(aux1, formatter);
        diasAlq = (int) ChronoUnit.DAYS.between(fechaIngreso, fechaEgreso);    
        System.out.println("Los dias de alquiler son: " + diasAlq);
        System.out.println("Ingrese posicion de amarre"); 
        PosAmarre = s.nextInt();
        //barco.crearBarco();
        //int precio = barco.modulo * diasAlq;
    }
}
