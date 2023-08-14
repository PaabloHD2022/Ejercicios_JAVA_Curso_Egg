/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro;

/**
 *
 * @author Pablo Demartini
 */
public class Libro {    
    
    public int isbn;
    public String titulo;
    public String autor;
    public int Npaginas;

    public Libro() {
    }

    public Libro(int isbn, String titulo, String autor, int Npaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.Npaginas = Npaginas;
    }    
}
