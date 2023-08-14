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
public class Velero extends Barco {
private int mastiles;
Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    public Velero() {
    }

    public Velero(int mastiles) {
        this.mastiles = mastiles;
    }

    public Velero(int mastiles, Integer matricula, Integer eslora, Integer anioFabricacion,int modulo) {
        super(matricula, eslora, anioFabricacion,modulo);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public int getModulo() {
        return modulo;
    }

    public void setModulo(int modulo) {
        this.modulo = modulo;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
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
@Override
public void crearBarco(){
super.crearBarco();
System.out.println("Ingrese cantidad de mastiles: ");
mastiles = leer.nextInt();
}
@Override
public void crearModulo(){
super.crearModulo();
modulo += mastiles;
}

}
