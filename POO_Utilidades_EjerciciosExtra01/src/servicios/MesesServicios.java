
package servicios;

import entidad.Meses;
import java.util.Scanner;


/* Crea una clase en Java donde declares una variable de tipo array de Strings que 
 * contenga los doce meses del año, en minúsculas. A continuación, declara una variable 
 * mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo, 
 * mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. 
 * Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar 
 * adivinar el mes secreto.  Un ejemplo de ejecución del programa podría ser este:
 * 
   Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
   No ha acertado. Intente adivinarlo introduciendo otro mes: agosto   
   ¡Ha acertado!
 *
 * @author Pablo Demartini
 */
public class MesesServicios {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void adivinarMes(){
        
        String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto"
                              , "septiembre", "octubre", "noviembre", "diciembre"};
        String mesSecreto = mes[9];
        int contador = 5;        
        
        for (int i = 0; i < mes.length; i++) {
            System.out.println("Escriba el nombre del mes secreto:");
            String mesIngresado = leer.next().toLowerCase();
           if(!mesIngresado.equals(mesSecreto) && contador > 1){
                contador--;
                System.out.println("El mes ingresado no es correcto, vuelva a intentar. Tiene " + contador + " oportunidades más para adivinar." );
            }else if(mesIngresado.equals(mesSecreto)){
                System.out.println("¡Ganaste! El mes " + mesIngresado + " es el mes secreto.");
                break;
            }else{
                contador--;
                System.out.println("Se acabaron las oportunidades. El mes secreto era " + mesSecreto + ".");
                break;
            }
        }        
    }
}





