/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author Loscortes
 */
public abstract class Barco {
protected Integer matricula;
protected Integer eslora;
protected Integer anioFabricacion;
protected Integer modulo;
public static Scanner s = new Scanner(System.in).useDelimiter("\n");
    public Barco() {
    }

    public Barco(Integer matricula, Integer eslora, Integer anioFabricacion, Integer modulo) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
        this.modulo = modulo;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Integer anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public Barco(Integer modulo) {
        this.modulo = modulo;
    }

    public void crearBarco(){
        System.out.println("ingrese matricula");    
        matricula = s.nextInt();
        System.out.println("ingrese eslora");
        eslora = s.nextInt();
        System.out.println("ingrese año de fabricaci{on");    
        anioFabricacion = s.nextInt();
    }    
    
    public void crearModulo(){
    modulo = eslora * 10;    
    
    }

}