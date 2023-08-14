/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.Arrays;


/**Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números reales. 
 * Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
 
 * Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
 
 * Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
 
 * Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
 
 * Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
 
 * En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.

 *
 * @author Pablo Demartini
 */
public class ArregloServicios {
    
    public void inicializarA(double[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Math.round(Math.random()*50 + 1);
        }
    }
    
    public void mostrar(double[] arreglo) {
        System.out.println(Arrays.toString(arreglo));
    }
    
    public void ordenar(double[] arreglo) {
        Arrays.sort(arreglo);
        for (int i = 0; i < arreglo.length / 2; i++) {
            double temp = arreglo[i];
            arreglo[i] = arreglo[arreglo.length - 1 - i];
            arreglo[arreglo.length - 1 - i] = temp;
        }
    }
    
    public void inicializarB(double[] arregloA, double[] arregloB) {
        for (int i = 0; i < 10; i++) {
            arregloB[i] = arregloA[i];
        }
        for (int i = 10; i < arregloB.length; i++) {
            arregloB[i] = 0.5;
        }
    }    
}
