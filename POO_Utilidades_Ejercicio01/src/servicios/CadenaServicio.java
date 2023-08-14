
package servicios;

import entidades.Cadena;
import java.util.Scanner;


/*Crear una clase CadenaServicio en el
* paquete servicios que implemente los siguientes métodos:

/*a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales
que tiene la frase ingresada.

* b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb
asac".

* c) Método vecesRepetido(String letra), recibirá un carácter ingresado
por el usuario y contabilizar cuántas veces se repite el carácter en la
frase, por ejemplo: Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4
veces.

* d) Método compararLongitud(String frase), deberá comparar la longitud
de la frase que compone la clase con otra nueva frase ingresada por
el usuario.

* e) Método unirFrases(String frase), deberá unir la frase contenida en la
clase Cadena con una nueva frase ingresada por el usuario y mostrar
la frase resultante.

* f) Método reemplazar(String letra), deberá reemplazar todas las letras
“a” que se encuentren en la frase, por algún otro carácter
seleccionado por el usuario y mostrar la frase resultante.

* g) Método contiene(String letra), deberá comprobar si la frase contiene
una letra que ingresa el usuario y devuelve verdadero si la contiene y
falso si no.
 *
 * @author Pablo Demartini
 */
public class CadenaServicio {
    
    public void mostrarVocales(Cadena cadena){ 
        
        int contador = 0;
        String vocales = "aeiou";
        
        for (int i = 0; i < cadena.getFrase().length(); i++) {
            char c = cadena.getFrase().charAt(i);
            if(vocales.contains(String.valueOf(c)))
            {
                contador++;
            }                       
        }   System.out.println("La frase " + cadena.getFrase() +  " tiene " + contador + " Vocales");             
    }  
    
//    public void invertirFrase(Cadena cadena){
//        String frase = cadena.getFrase();
//        StringBuilder fraseInvertida = new StringBuilder();
//        
//        for (int i = frase.length()-1; i >= 0; i--) {
//            fraseInvertida.append(frase.charAt(i));
//        }
//            System.out.println("Frase invertida: " + fraseInvertida.toString());
//    }
    
    public void invertirFrase(Cadena cadena) {
        StringBuilder builder = new StringBuilder(cadena.getFrase());
        builder.reverse();
        System.out.println("La frase invertida es: " + builder.toString());
    }
    
    public void vecesRepetido(Cadena cadena, String letra){
        String frase = cadena.getFrase().toLowerCase();
        char caracter = letra.toLowerCase().charAt(0);
        int contador = 0;
        
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == caracter){
                contador++;                
            }            
        }        
            System.out.println("El caracter '" + caracter + "' se repite " + contador + " veces.");
    }
    
    public void compararLongitud(Cadena cadena, String frase) {
        
        Scanner leer = new Scanner(System.in);       
        System.out.println("Ingrese una nueva frase: ");
        String frase2 = leer.nextLine();
        
        int longitudFrase = cadena.getFrase().length();
        int longitudNuevaFrase = frase2.length();

        if (longitudNuevaFrase > longitudFrase) {
            System.out.println("La segunda frase es mas larga.");
        } else if (longitudNuevaFrase < longitudFrase) {
            System.out.println("La primer frase ingresada es más larga.");
        } else {
            System.out.println("Ambas frases tienen la misma longitud.");
        }
    }
    
    public void unirFrases(Cadena cadena, String frase3) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una tercer frase:");
        frase3 = leer.nextLine();
        String fraseUnida = cadena.getFrase() + " " + frase3;
        System.out.println("Frase resultante de unir la frase inicial y la nueva tercer frase: " + fraseUnida);
    }

    public void reemplazar(Cadena cadena, String letra, String reemplazo) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el caracter por el que va a reemplazar la letra a");
        String c = leer.next();
        
        String frase = cadena.getFrase();
        frase = frase.toLowerCase();
        String fraseModificada = frase.replace("a", c);
        System.out.println("Frase resultante: " + fraseModificada);
    }

    public boolean contiene(Cadena cadena) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra = leer.next();
       
        if (cadena.getFrase().contains(letra)){
            System.out.println("Verdadero");
            return true;
        }else{
            System.out.println("Falso");
            return false;
        }               
    }
}