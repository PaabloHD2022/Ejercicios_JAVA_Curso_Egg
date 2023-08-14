/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.util.Scanner;

/**Crea una clase "Juego" que tenga un método "iniciar_juego" que permita 
 * a dos jugadores jugar un juego de adivinanza de números. 
 * El primer jugador elige un número y el segundo jugador intenta adivinarlo. 
 * El segundo jugador tiene un número limitado de intentos y recibe una pista 
 * de "más alto" o "más bajo" después de cada intento. 
 * El juego termina cuando el segundo jugador adivina el número o se queda sin intentos. 
 * Registra el número de intentos necesarios para adivinar el número 
 * y el número de veces que cada jugador ha ganado.

 *
 * @author Pablo Demartini
 */
public class Juego {
   
    Scanner leer = new Scanner(System.in);
    
    public int numeroIncognita;
    public int numero;
    public int intentos;
    public int ganados;
    public int intentosMaximos = 5;
    
    public void iniciar_juego(){        
        intentos = 0;
        ganados = 0;
        
        System.out.println("Bienvenidos al juego de adivinanza de números.");
        System.out.println("El jugador 1 elegirá un número y el jugador 2 intentará adivinarlo.");
        System.out.println("El jugador 2 recibirá una pista de \"más alto\" o \"más bajo\" después de cada intento.");
        System.out.println("El juego termina cuando el jugador 2 adivina el número o se queda sin intentos.");
        
        System.out.println("Ingrese el numero incognita");
        numeroIncognita = leer.nextInt();
 
        do{
            System.out.println("Ingrese un número");
            numero = leer.nextInt();
            if (numero == numeroIncognita) {
                System.out.println("Adivino el número");
                intentos++;
                ganados++;
            }if(numero < numeroIncognita){
                System.out.println("El número a adivinar es mayor, vuelva a intentar");
                intentos++;
                intentosMaximos--;
            }if(numero > numeroIncognita){
                System.out.println("El número a adivinar es menor, vuelva a intentar");
                intentos++;
                intentosMaximos--;
            }                
        }while(numero != numeroIncognita && intentosMaximos!=5 );              
    }   
}
