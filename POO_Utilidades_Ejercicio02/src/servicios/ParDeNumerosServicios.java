
package servicios;

import entidades.ParDeNumeros;

/* Crear una clase ParDeNumerosService, en el paquete Servicios, 
 * que deberá además implementar los siguientes métodos:
 * 
 * Método mostrarValores que muestra cuáles son los dos números guardados.

 * Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor

 * Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. 
 * Previamente se deben redondear ambos valores.

 * Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. 
 * Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 *
 * @author Pablo Demartini
 */
public class ParDeNumerosServicios {
    
    private ParDeNumeros parDeNumeros;
    
    public ParDeNumerosServicios(ParDeNumeros parDeNumeros) {
        this.parDeNumeros = parDeNumeros;
    }
    
    //Metodo get para tomar el valor de num1 y num2
    public void mostrarValores() {
        System.out.println("Número 1: " + parDeNumeros.getNum1());
        System.out.println("Número 2: " + parDeNumeros.getNum2());
        System.out.println("----------------------------------------------------------------");
    }
    
    //Metodo para devolver el numero mayor de los dos numeros ingresados aleatoreamente
    public double devolverMayor() {
        double mayor = Math.max(parDeNumeros.getNum1(), parDeNumeros.getNum2());
        System.out.println("El mayor de los numeros aleatoreos es: " + mayor);
        System.out.println("----------------------------------------------------------------");
        return mayor;        
    }
    
    //Metodo para calcular la potencia del numero mayor elevado al menor de los ingresados aleatoreamente.
    public double calcularPotencia() {
        double mayor = Math.max(parDeNumeros.getNum1(), parDeNumeros.getNum2());
        double menor = Math.min(parDeNumeros.getNum1(), parDeNumeros.getNum2());
        System.out.println("El numero mayor elevado al numero menor es: " + Math.pow(mayor, menor));
        System.out.println("----------------------------------------------------------------");
        return Math.pow(mayor, menor);
    }    
    
    //Metodo para calcular la raiz cuadrada del numero menor ingresado aleatoreamente.
    public double calcularRaiz() {
        double menor = Math.min(parDeNumeros.getNum1(), parDeNumeros.getNum2());
        menor = Math.abs(menor);
        System.out.println("La raiz cuadrada del numero menor es: "+ Math.sqrt(menor));
        System.out.println("----------------------------------------------------------------");
        return Math.sqrt(menor);
    }
}
