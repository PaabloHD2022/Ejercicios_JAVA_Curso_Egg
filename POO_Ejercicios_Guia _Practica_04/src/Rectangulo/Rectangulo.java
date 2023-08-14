
package Rectangulo;

import java.util.Scanner;

/**Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura. 
 * La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario. 
 * También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo. 
 * Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. 
 * Se deberán además definir los métodos getters, setters y constructores correspondientes.
 * Superficie = base * altura / Perímetro = (base + altura) * 2.

 *
 * @author Pablo Demartini
 */
public class Rectangulo {
    
    Scanner leer = new Scanner(System.in);
    
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Scanner getLeer() {
        return leer;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }
    
    public void crearRectangulo(){
        System.out.println("Ingrese el valor de la base:");
        int base = leer.nextInt();
        setBase(base);
        System.out.println("Ingrese el valor de la altura:");
        int altura = leer.nextInt();
        setAltura(altura);
    }
    
    public int Superficie(){
        int Superficie = (getBase()* getAltura());
        System.out.println("----------------------------------");
        return Superficie;
    }
    
    public int Perimetro(){
        int Perimetro = (getBase() + getAltura())*2;
        System.out.println("----------------------------------");
        return Perimetro;
    }   
    
    public int RectAsteriscos(){
        System.out.println("----------------------------------");
        if(base > 0 && altura > 0){
            //Linea superior del cuadrado
            for(int i = 0; i < base; i++){
                System.out.print("*");                
            }            
            System.out.println(); //Imprime un salto de linea.
            
            //Centro del cuadrado
            for(int i = 0; i < base - 2; i++){
                System.out.print("*");
                for(int j = 0; j < altura -2; j++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }          
            
            //Linea inferior del cuadrado
            for(int i = 0; i < base; i++){
                System.out.print("*");
            }
        }else{
            System.out.println("El numero ingresado no corresponde...");
        }
        System.out.println("                                         ");
        System.out.println("                                         ");
        return 0;       
    }
    
}
