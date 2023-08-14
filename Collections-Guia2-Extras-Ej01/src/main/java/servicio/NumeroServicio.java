
package servicio;

import entidad.Numero;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pablo Demartini
 */
public class NumeroServicio {   
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Integer> numeros = new ArrayList<>();
    
    public void ingresarNumeros(){
        Numero num = new Numero();
        do {            
            System.out.println("Ingrese un numero a la lista:");
            num.setNumero(sc.nextInt());
            //El if se usa para que el -99 no entre a la sumatoria de numeros.
            //Se suma el resto de numero ingresados menos el -99.
            if(num.getNumero() == -99){
                continue; //Corta el ingreso de numeros cuando se ingresa -99.
            }
            numeros.add(num.getNumero());
        } while (num.getNumero() != -99);
    }
    
    public void mostrar(){
        for (Integer numero : numeros) {
            System.out.println(numero); 
        }
    }
    
    public int sumar(){
        int suma = 0;
        for (Integer numero : numeros) {
            suma += numero;
        }
       return  suma;
    }
    
    public double promedio(){
        double promedio;
        int sumatoria = sumar();
        promedio = (double)sumatoria/numeros.size();// El double delante de sumatoria devuelve el resultado con decimales. Sino se redondea el resultado.
        return promedio;
    }        
}
    

