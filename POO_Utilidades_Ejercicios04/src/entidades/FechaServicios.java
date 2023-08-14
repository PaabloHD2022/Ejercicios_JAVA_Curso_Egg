
package entidades;

import java.util.Date;
import java.util.Scanner;

/*Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService, 
* en paquete Servicios, que tenga los siguientes métodos:
* Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. 
* Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el objeto Date. 
* Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
* Método fechaActual que cree un objeto fecha con el día actual. 
* Para esto usaremos el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
* El método debe retornar el objeto Date.
* Método diferencia que reciba las dos fechas por parámetro y retorna la 
* diferencia de años entre una y otra (edad del usuario).

* Si necesiten acá tienen más información en clase Date: Documentacion Oracle
*
* @author Pablo Demartini
*/

public class FechaServicios {
    Scanner leer = new Scanner(System.in);
    Date fecha = new Date();
    
    public void fechaNacimiento(Date fecha){
        System.out.println("Ingrese día, mes y año de nacimiento:");
        fecha.setDate(leer.nextInt());
        fecha.setMonth(leer.nextInt());
        fecha.setYear(leer.nextInt());        
    }
    
    public Date fechaActual(){
        //Date fechaHoy = new Date();
        return new Date();     
    }
    
    public int diferencia(Date fecha1, Date fecha2){
               
        int diferencia= fecha2.getYear() - fecha1.getYear();
        if (fecha1.getMonth() > fecha2.getMonth()) {
            diferencia--;
        } 
        return diferencia;                       
    }
}
