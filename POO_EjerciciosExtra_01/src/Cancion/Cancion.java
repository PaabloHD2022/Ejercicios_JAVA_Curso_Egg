/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cancion;

import java.util.Scanner;

/**Desarrollar una clase Cancion con los siguientes atributos: título y autor. 
 * Se deberá definir además dos constructores: uno vacío que inicializa el título y el autor a cadenas vacías 
 * y otro que reciba como parámetros el título y el autor de la canción. Se deberán además definir los métodos 
 * getters y setters correspondientes.
 *
 * @author Pablo Demartini
 */
public class Cancion {
    
    Scanner leer = new Scanner(System.in);
    
    private String titulo;
    private String autor;

    public Cancion() {
        this.titulo = "";
        this.autor = "";
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Scanner getLeer() {
        return leer;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
    
    public void crearCancion(){
        
        System.out.println("Ingrese el titulo de la canción: ");
        String titulo = leer.nextLine();
        setTitulo(titulo);
        
        System.out.println("Ingrese el autor de la canción: ");
        String autor = leer.nextLine();
        setAutor(autor);
    }
    
    
    
}
