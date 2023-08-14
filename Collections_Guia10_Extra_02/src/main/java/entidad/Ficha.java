
package entidad;

/**Implementa un clase Ficha (de dominó) con su constructor y sus getters, con un toString() 
 * (que imprima el “seis-zero” como “6:0|” y con un método llamado “Ficha girarFicha()” que gire la ficha 
 * (el “6:0|” pasaría a ser “0:6|”). Implementa también el método “boolean esUnDoble()”. 
 * 
 * A) Ahora implementa con ArrayLists una clase que genere todas las fichas desde el doble 0 al doble MAX_NUM. 
 * Después, el programa, actuando como si fuera un robot jugando al solitario, empezará por tirar el doble más grande 
 * e irá tirando fichas (las jugadas tienen que ser legales) hasta que haya tirado todas sus fichas 
 * (de su “mano” a la “mesa) o ya no pueda tirar ninguna ficha más.
 * 
 * Tu ejecución puede ser diferente de las de los ejemplos dependiendo de cómo lo implementes.
 *
 * @author Pablo Demartini
 */
public class Ficha {
    private int lado1;
    private int lado2;
    
    public Ficha(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public int getLado1() {
        return lado1;
    }
    
    public int getLado2() {
        return lado2;
    }
    
    public Ficha girarFicha() {
        return new Ficha(lado2, lado1);
    }
    
    public boolean esUnDoble() {
        return lado1 == lado2;
    }
    
    public String toString() {
        return "|" + lado1 + ":" + lado2 + "|"; //Retorna la ficha de dominó con el formato |02 : 06|
    }
}
