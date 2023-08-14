/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_claseservicio_ejercicio_03;

import Entidades.Persona;
import Servicio.PersonaServicio;

/*
* @author Pablo Demartini
*/
public class POO_ClaseServicio_Ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        //Creamos arreglo personas   
        Persona[] personas = new Persona[4];
        //Inicializamos arreglos de imc y de mayor de edad
        int[]imc2 = new int[4];
        boolean[]mEdad = new boolean[4];
        //Recorremos el arreglo personas para crear cada una de las 4 que necesitamos
        for (int i = 0; i < personas.length ; i++) {
            personas[i] = PersonaServicio.crearPersona();            
        }
        //Volvemos a recorrer el arreglo de personas para calcular si son mayor de edad o no
        //y para saber si en base al peso ingresado tiene sobrepeso, peso ideal o bajo peso.
        for (int i = 0; i < personas.length ; i++) {
            if (PersonaServicio.esMayorDeEdad(personas[i])) {
                System.out.println(personas[i].getNombre() + " Es mayor de edad");                
            }else{
                System.out.println(personas[i].getNombre() + " Es menor de edad");
            }
            switch(PersonaServicio.calcularIMC(personas[i])){
            case 1:
                System.out.println(" Usted tiene sobrepeso");
            break;
            
            case 0:
                System.out.println(" Su peso es ideal");
            break;
            
            case -1:
                System.out.println(" Su peso esta por debajo del peso regular");
            break;           
        }           
    }
        //Volvemos a recorrer el arreglo personas en esta caso para calcular los siguientes valores:
        int contadorMayorEdad = 0;
        int contadorMenorEdad = 0;
        int contadorBajoPeso = 0;
        int contadorPesoIdeal = 0;
        int contadorSobrePeso = 0;
        
        for (int i = 0; i < imc2.length; i++) {
            imc2[i] = PersonaServicio.calcularIMC(personas[i]);
            mEdad[i] = PersonaServicio.esMayorDeEdad(personas[i]);
            if(mEdad[i] == true){
                contadorMayorEdad++;
            }else{
                contadorMenorEdad++;
            }
            if(imc2[i] == 0){
                contadorPesoIdeal++;
            }
            if(imc2[i] == 1){
                contadorSobrePeso++;
            }
            if(imc2[i] == -1){
                contadorBajoPeso++;
            }
        }
        
        //Mostramos por pantalla el porcentaje de personas mayor de edad, menor de edad, con sobre peso, peso ideal y bajo peso.
        System.out.println("El porcentaje de personas mayores es: " + contadorMayorEdad * 100 / 4);
        System.out.println("El porcentade de personas menores es: " + contadorMenorEdad * 100 / 4);
        System.out.println("El porcentaje de personas con sobre peso es: " + contadorSobrePeso * 100 / 4);
        System.out.println("El porcentaje de personas con peso ideal es: " + contadorPesoIdeal * 100 / 4);
        System.out.println("El porcentaje de personas con peso bajo es: " + contadorBajoPeso * 100 / 4);
    }
}