/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_01;

import Libro.Libro;
import java.util.Scanner;

/**Crear una clase llamada Libro que contenga los siguientes atributos: 
 * ISBN, Título, Autor, Número de páginas, y un constructor con todos 
 * los atributos pasados por parámetro y un constructor vacío. 
 * Crear un método para cargar un libro pidiendo los datos al usuario y luego 
 * informar mediante otro método el número de ISBN, el título, el autor del libro 
 * y el número de páginas.

 *
 * @author Pablo Demartini
 */
public class Ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese 1 si desea buscar un libro o 2 si desea registrar un nuevo libro:");
        int opcion = leer.nextInt();
        Libro L1 = new Libro();
        switch (opcion) {
            case 1:
                System.out.println("El numero de ISBN es:" + "");
                System.out.println("El título es:" + "");
                System.out.println("El autor es:" + "");
                System.out.println("La cantidad de páginas es:" + "");
                
                break;
            case 2:
                System.out.println("Ingrese el ISBN");
                L1.isbn = leer.nextInt();
                System.out.println("Ingrese el Titulo");
                L1.titulo = leer.next();
                System.out.println("Ingrese el Autor");
                L1.autor = leer.next();
                System.out.println("Ingrese la cantidad de paginas");
                L1.Npaginas = leer.nextInt();
                
                System.out.println("");
                System.out.println("Resultado del registro del nuevo libro");
                System.out.println("---------------------------------------------");
                System.out.println("ISBN: " + L1.isbn);
                System.out.println("Titulo: " + L1.titulo);
                System.out.println("Nombre del autor: " + L1.autor);
                System.out.println("Cantidad de paginas: " +L1.Npaginas);
                System.out.println("---------------------------------------------");                
                break;               
        }       
    }    
}
