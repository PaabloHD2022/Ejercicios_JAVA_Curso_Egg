
package servicio;

import entidades.Vendedor;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Pablo Demartini
 */
public class VendedorServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Vendedor altaVendedor(){  
        
        //Instanciar objeto tipo vendedor
        
        Vendedor v1 = new Vendedor();
        
        System.out.println("Ingrese el nombre del vendedor:");
        v1.setNombre(leer.next());
        System.out.println("Ingrese el DNI del vendedor:");
        v1.setDni(leer.nextInt());
        System.out.println("Ingrese el sueldo básico del vendedor:");
        v1.setSueldoBasico(leer.nextDouble());
        System.out.println("Ingrese el dia que comenzó a trabajar:");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes que comenzó a trabajar:");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año que comenzó a trabajar:");
        int anio = leer.nextInt();
        
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        v1.setFechaInicio(fecha); 
        
        return v1;        
    }
    
    public void sueldoMensual(Vendedor v1){        
        System.out.println("Ingrese ventas totales del vendedor:");
        double ventas = leer.nextDouble();
        v1.setComisiones(ventas*0.15);
        v1.setSueldoMensual(v1.getSueldoBasico() + v1.getSueldoBasico());
        System.out.println("El sueldo mensual del vendedor: " + v1.getNombre() + " es de $ " + v1.getSueldoMensual());          
        
    }
    
    public void vacaciones(Vendedor v1){
        Date hoy = new Date();
        int antiguedad = hoy.getYear() - v1.getFechaInicio().getYear();
        
        if(antiguedad < 5){
            System.out.println("Le corresponden 14 dias de vacaciones");
        }else if(antiguedad < 10){
            System.out.println("Le corresponden 21 dias de vacaciones");
        }else if(antiguedad < 20){
            System.out.println("Le corresponden 28 dias de vacaciones");
        }else if(antiguedad > 20){
            System.out.println("Le corresponden 35 dias de vacaciones");
        }else{
            System.out.println("Le corresponden vacaciones proporcionales");
        }
    }
    
}
