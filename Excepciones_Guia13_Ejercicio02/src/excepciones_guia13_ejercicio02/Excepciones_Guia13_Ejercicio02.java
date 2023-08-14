
package excepciones_guia13_ejercicio02;

/**Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
 *
 * @author Pablo Demartini
 */
public class Excepciones_Guia13_Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int edades[]= {10,20,30,40};
    try {
        System.out.println("La edad de la persona es: " + edades[0]); 
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Fuera de Rango"); 
    }
    }
    
}
