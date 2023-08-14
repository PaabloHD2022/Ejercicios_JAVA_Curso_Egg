/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Pablo Demartini
 */
public class Estudiantes {
    
    private String alumno;
    private double nota;

    public Estudiantes() {
    }

    public Estudiantes(String alumno, double nota) {
        this.alumno = alumno;
        this.nota = nota;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
