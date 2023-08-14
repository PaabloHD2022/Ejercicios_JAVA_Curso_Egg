
package poo_utilidades_05;

import entidad.Persona;
import servicios.PersonaServicio;

/**
 *
 * @author Pablo Demartini
 */
public class POO_Utilidades_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PersonaServicio personaService = new PersonaServicio();

        Persona persona = personaService.crearPersona();

        int edad = personaService.calcularEdad(persona);
        System.out.println("La edad de " + persona.getNombre() + " es: " + edad + " años");

        int edadComparar = 40;
        boolean esMenor = personaService.menorQue(persona, edadComparar);
        System.out.println(persona.getNombre() + (esMenor ? " es" : " no es") + " menor que " + edadComparar + " años");

        System.out.println("Información de la persona:");
        personaService.mostrarPersona(persona);
    }
}
    

