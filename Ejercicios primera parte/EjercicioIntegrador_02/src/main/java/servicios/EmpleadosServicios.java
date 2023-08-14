
package servicios;

import entidades.Empleados;
import java.util.Scanner;

/**
 *
 * @author Pablo Demartini
 */
public class EmpleadosServicios {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Empleados crearEmpleados(){
        
        Empleados empleado = new Empleados();{
        System.out.println("Ingrese el nombre del empleado: ");
        empleado.setNombreEmpleados(leer.next());
        System.out.println("Ingrede el sueldo del empleado: ");
        empleado.setSueldoEmpleados(leer.nextFloat());
        
        return empleado;
        }        
    }    
}
