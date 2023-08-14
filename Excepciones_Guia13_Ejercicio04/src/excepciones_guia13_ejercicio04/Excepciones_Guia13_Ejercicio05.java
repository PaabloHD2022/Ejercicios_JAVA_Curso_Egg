
package excepciones_guia13_ejercicio04;

import entidad.Juego;

/**Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 *
 * @author Pablo Demartini
 */
public class Excepciones_Guia13_Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Juego juego = new Juego();
        
        int num = juego.numeroAleatorio();
        
        juego.numeroAleatorio();
        System.out.println(num);
        juego.adivinarNumero(num);
        
    }
    
    
    
}
