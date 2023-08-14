
package servicio;

import entidad.Ficha;
import java.util.ArrayList;
import java.util.Collections;

/**Implementa un clase Ficha (de dominó) con su constructor y sus getters, con un toString() 
 * (que imprima el “seis-zero” como “6:0|” y con un método llamado “Ficha girarFicha()” que gire la ficha 
 * (el “6:0|” pasaría a ser “0:6|”). Implementa también el método “boolean esUnDoble()”. 
 * A) Ahora implementa con ArrayLists una clase que genere todas las fichas desde el doble 0 al doble MAX_NUM. 
 * Después, el programa, actuando como si fuera un robot jugando al solitario, empezará por tirar el doble más grande 
 * e irá tirando fichas (las jugadas tienen que ser legales) hasta que haya tirado todas sus fichas 
 * (de su “mano” a la “mesa) o ya no pueda tirar ninguna ficha más.
 * 
 * Tu ejecución puede ser diferente de las de los ejemplos dependiendo de cómo lo implementes.
 *
 * @author Pablo Demartini
 */
public class FichaServicio {

    Ficha ficha1 = new Ficha(0,0);
    Ficha ficha2 = new Ficha(0,1);
    Ficha ficha3 = new Ficha(0,2);
    Ficha ficha4 = new Ficha(0,3);
    Ficha ficha5 = new Ficha(0,4);
    Ficha ficha6 = new Ficha(0,5);
    Ficha ficha7 = new Ficha(0,6);
    Ficha ficha8 = new Ficha(1,1);
    Ficha ficha9 = new Ficha(1,2);
    Ficha ficha10 = new Ficha(1,3);
    Ficha ficha11 = new Ficha(1,4);
    Ficha ficha12 = new Ficha(1,5);
    Ficha ficha13 = new Ficha(1,6);
    Ficha ficha14 = new Ficha(2,2);
    Ficha ficha15 = new Ficha(2,3);
    Ficha ficha16 = new Ficha(2,4);
    Ficha ficha17 = new Ficha(2,5);
    Ficha ficha18 = new Ficha(2,6);
    Ficha ficha19 = new Ficha(3,3);
    Ficha ficha20 = new Ficha(3,4);
    Ficha ficha21 = new Ficha(3,5);
    Ficha ficha22 = new Ficha(3,6);
    Ficha ficha23 = new Ficha(4,4);
    Ficha ficha24 = new Ficha(4,5);
    Ficha ficha25 = new Ficha(4,6);
    Ficha ficha26 = new Ficha(5,5);
    Ficha ficha27 = new Ficha(5,6);
    Ficha ficha28 = new Ficha(6,6);
    
    public void repartirFichas(){
        ArrayList<Ficha> fichas = new ArrayList<>();
                
        fichas.add(ficha1);
        fichas.add(ficha2);
        fichas.add(ficha3);
        fichas.add(ficha4);
        fichas.add(ficha5);
        fichas.add(ficha6);
        fichas.add(ficha7);
        fichas.add(ficha8);
        fichas.add(ficha9);
        fichas.add(ficha10);
        fichas.add(ficha11);
        fichas.add(ficha12);
        fichas.add(ficha13);
        fichas.add(ficha14);
        fichas.add(ficha15);
        fichas.add(ficha16);
        fichas.add(ficha17);
        fichas.add(ficha18);
        fichas.add(ficha19);
        fichas.add(ficha20);
        fichas.add(ficha21);
        fichas.add(ficha22);
        fichas.add(ficha23);
        fichas.add(ficha24);
        fichas.add(ficha25);
        fichas.add(ficha26);
        fichas.add(ficha27);
        fichas.add(ficha28);
        
        Collections.shuffle(fichas);
        
        for (int i = 0; i < fichas.size(); i++) {
            System.out.println(fichas);
        }
        
    }

}




//En esta implementación, la clase Ficha representa una ficha de dominó. Tiene un constructor para establecer los valores de los lados de la ficha, getters para obtener los valores de los lados, un método girarFicha() que devuelve una nueva ficha girada y un método esUnDoble() que verifica si la ficha es un doble.
//
//La clase JuegoDomino utiliza un ArrayList llamado fichas para almacenar todas las fichas generadas desde el doble 0 hasta el doble maxNum. El constructor del juego genera todas las fichas y las agrega al ArrayList.
//
//El método jugar() simula el juego del solitario de dominó. Comienza jugando el doble más grande y luego busca una ficha que coincida con uno de los lados de la última ficha jugada. Si encuentra una ficha válida, la juega, la elimina de la lista de fichas y actualiza la última ficha jugada. El bucle continúa hasta que no se puedan jugar más fichas o la lista de fichas esté vacía.
//
//En el método main, se crea una instancia de JuegoDomino y se llama al método jugar() para comenzar el juego. Puedes ajustar el valor de maxNum para especificar el número máximo de las fichas de dominó que se generarán.






