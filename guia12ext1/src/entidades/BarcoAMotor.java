/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;




public class BarcoAMotor extends Barco {
 protected Integer potencia;
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    public BarcoAMotor() {
    }



    public BarcoAMotor(Integer potencia, Integer matricula, Integer eslora, Integer anioFabricacion, Integer modulo) {
        super(matricula, eslora, anioFabricacion, modulo);
        this.potencia = potencia;
    }

    public Integer getPotencia() {
        return potencia;
    }

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

    public Integer getModulo() {
        return modulo;
    }

    public void setModulo(Integer modulo) {
        this.modulo = modulo;
    }

 
     @Override
     public void crearBarco(){
     super.crearBarco();
     System.out.println("Ingrese la potencia: ");
     potencia = leer.nextInt();

    } 
     @Override
     public void crearModulo(){
    super.crearModulo();
    modulo+= potencia;

    }

}
