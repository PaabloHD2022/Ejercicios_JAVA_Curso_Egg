
package com.mycompany.guia10extras2.servicios;

import com.mycompany.guia10extras2.entidades.Numero;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class NumeroServicio {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> numeros = new ArrayList<>();
    
    public void ingresarNumeros(){
        Numero num = new Numero();
        do {            
            System.out.println("Ingrese un numero");
            num.setNum(sc.nextInt());
            if(num.getNum() == -99){
                continue;
            }
            numeros.add(num.getNum());
        } while (num.getNum() != -99);
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
        promedio = (double)sumatoria/numeros.size();
        return promedio;
    }
}
