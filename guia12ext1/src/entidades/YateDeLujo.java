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
public class YateDeLujo extends BarcoAMotor {
private int camarotes;
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public YateDeLujo() {
    }

    public YateDeLujo(int camarotes, Integer potencia, Integer matricula, Integer eslora, Integer anioFabricacion, int modulo) {
        super(potencia, matricula, eslora, anioFabricacion, modulo);
        this.camarotes = camarotes;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

@Override
    public Integer getPotencia() {
        return potencia;
    }

@Override
    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

@Override
    public Integer getMatricula() {
        return matricula;
    }

@Override
    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

@Override
    public Integer getEslora() {
        return eslora;
    }

@Override
    public void setEslora(Integer eslora) {
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
    public Integer getModulo() {
        return modulo;
    }

    public void setModulo(int modulo) {
        this.modulo = modulo;
    }

    @Override
    public void crearBarco(){
    super.crearBarco();
    System.out.println("Ingrese la cantidad de camarotes: ");
    camarotes = leer.nextInt();
    }

    @Override
    public void crearModulo(){    
    super.crearModulo();
    System.out.println("Ingrese la cantidad de camarotes: ");
    modulo += camarotes;    

    }
}
