/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Persona;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
 * Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
 * devuelve un booleano.
 *
 * Metodo crearPersona(): el método crear persona, le pide los valores de los
 * atributos al usuario y después se le asignan a sus respectivos atributos para
 * llenar el objeto Persona. Además, comprueba que el sexo introducido sea
 * correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
 *
 * Método calcularIMC(): calculara si la persona está en su peso ideal (peso
 * en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que
 * 20, significa que la persona está por debajo de su peso ideal y la función
 * devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
 * (incluidos), significa que la persona está en su peso ideal y la función
 * devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor
 * que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
 *
 * A continuación, en la clase main hacer lo siguiente: Crear 4 objetos de tipo
 * Persona con distintos valores, a continuación, llamaremos todos los métodos
 * para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
 * sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
 * persona es mayor de edad.
 *
 * Por último, guardaremos los resultados de los métodos calcularIMC y
 * esMayorDeEdad en distintas variables(arrays), para después calcular un
 * porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en
 * su peso ideal y cuantos, por encima, y también calcularemos un porcentaje de
 * cuantos son mayores de edad y cuantos menores. Para esto, podemos crear unos
 * métodos adicionales.
 *
 * @author Pablo Demartini
 */
public class PersonaServicio {

    double edad;

    // Chequear que sea mayor de edad
    public static boolean esMayorDeEdad(Persona persona) {

        try {
            return persona.getEdad() >= 18;
        } catch (InputMismatchException e) {
            System.out.println("El numero tiene que ser mayor de 18");
        }

    }

    static Scanner leer = new Scanner(System.in);

    // Metodo crear persona
    public static Persona crearPersona() {
        System.out.println("Ingrese su nombre:");
        String nombre = leer.next();
        int edad = 0;

        try {
            System.out.println("Ingrese la edad:");
            edad = leer.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Lo ingresado no es un numero");
        }
        ;

        String sexo;
        boolean gender = false;
        // Do While para que repita la pregunta del sexo hasta que sea correcto
        do {
            System.out.println("Ingrese el sexo");
            sexo = leer.next();
            if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("H") || sexo.equalsIgnoreCase("O")) {
                System.out.println("Seleccion del sexo correcta");
                gender = true;
            } else {
                System.out.println("El sexo seleccionado es incorrecto");
            }
        } while (!gender);
        System.out.println("Ingrese el peso");
        double peso = leer.nextDouble();
        System.out.println("Ingrese la altura");
        double altura = leer.nextDouble();
        // Retorna la persona.
        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public static int calcularIMC(Persona persona) {

        int valor = 0;

        double imc = persona.getPeso() / (persona.getAltura() * persona.getAltura());
        if (imc < 20) {
            valor = -1;

        }
        if (imc > 20 && imc < 25) {
            valor = 0;

        }
        if (imc > 25) {
            valor = 1;

        }
        return valor;
    }
}
