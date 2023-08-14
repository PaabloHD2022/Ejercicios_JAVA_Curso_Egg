
package excepciones_guia13_ejercicio03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
 *
 * @author Pablo Demartini
 */
public class Excepciones_Guia13_Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        
        try {
            DivisionNumero asd = new DivisionNumero();
            DivisionNumero asd2 = new DivisionNumero();
            System.out.println("Ingrese el primer numero");
            String num = leer.next();
            System.out.println("Ingrese el segundo numero");
            String num2 = leer.next();
            System.out.println("Ingrese otro numero");
            int num5 = leer.nextInt();
            int num3 = Integer.parseInt(num);
            int num4 = Integer.parseInt(num2);
            
            asd.division(num3, num4);
            asd2.division(num3, num5);

        } catch (ArithmeticException e) {
            System.out.println("Error" + e.getMessage());
            System.out.println("Error" + e);
            System.out.println(e.fillInStackTrace());
            System.out.println("No se puede dividir por 0");
        } catch (NumberFormatException e){
            System.out.println("Error" + e.getMessage());
            System.out.println("Error" + e);
            System.out.println(e.fillInStackTrace());
            System.out.println("Deben ser numeros, NO LETRAS!!!");
        } catch (InputMismatchException e){
            System.out.println("Error" + e.getMessage());
            System.out.println("Error" + e);
            System.out.println(e.fillInStackTrace());
            System.out.println("Deben ser numeros!!!");
        }catch(Exception e){
             System.out.println("Error" + e);                
        }finally{
            System.out.println("Saliendo del programa...");
        }
    }
}
    

