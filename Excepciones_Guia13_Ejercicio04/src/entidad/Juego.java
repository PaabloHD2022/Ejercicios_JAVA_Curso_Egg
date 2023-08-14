
package entidad;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * @author Pablo Demartini
 */
public class Juego {
    
    public int numeroAleatorio(){
        
        return (int)(Math.random()*500 + 1);
    }
   
    public void adivinarNumero(int numeroAleatorio){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        int numeroIngresado;
        
        int contador = 5;        
        
        try{
            do {
            System.out.println("Ingrese un numero");
            numeroIngresado = leer.nextInt();
            if (numeroIngresado > numeroAleatorio) {
                System.out.println("EL numero ingresado es mayor al numero a adivinar,  te quedan: " + (contador-1) + " intentos");
            }else if(numeroIngresado < numeroAleatorio){
                System.out.println("EL numero ingresado es menor al numero a adivinar,  te quedan: " + (contador-1) + " intentos");
            }else if(numeroIngresado == numeroAleatorio){
                System.out.println("Felicitaciones, has adivinado el numero secreto");
            } 
           contador--;
        } while (numeroIngresado!=numeroAleatorio && contador >0); 
            if(contador == 0){
                System.out.println("No has acertado, el numero aleatorio es: " + numeroAleatorio);
        }       
        
        }catch(InputMismatchException e){
            System.out.println("Deben ser numeros, NO LETRAS!!!");
            System.out.println("Error" + e.getMessage());
            System.out.println("Error" + e);
            System.out.println(e.fillInStackTrace());
        }catch(Exception e){
            
        }            
    }
       
}
