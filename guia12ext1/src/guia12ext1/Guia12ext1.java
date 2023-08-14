/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12ext1;

import entidades.Alquiler;
import entidades.BarcoAMotor;
import entidades.Velero;
import entidades.YateDeLujo;
import java.util.Scanner;

/**
 *
 * @author Loscortes
 */
public class Guia12ext1 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        Alquiler a1 = new Alquiler();
        int op;
        int precio;
        

        do {
        System.out.println("QUE BARCO VA A INGRESAR A NUESTRA HERMOSA INSTITUCION");
        System.out.println("1 - Barco a motor");
        System.out.println("2 - Velero");
        System.out.println("3 - Yate de lujo");
        System.out.println("4 - Carcacha");
        System.out.println("5 - Salir");
        op = leer.nextInt();
            switch (op) {
                case 1:
                    BarcoAMotor bm = new BarcoAMotor();
                    bm.crearBarco();
                    bm.crearModulo();
                    a1.crearAlquiler();
                    precio = bm.getModulo() * a1.getDiasAlq();
                    System.out.println("El monto a pagar por el barco a motor es: " + precio);
                    break;
                case 2:
                    Velero v = new Velero();
                    v.crearBarco();
                    v.crearModulo();
                    a1.crearAlquiler();
                    precio = v.getModulo() * a1.getDiasAlq();
                    System.out.println("El monto a pagar por el velero: " + precio);
                    break;
                case 3:
                    YateDeLujo y = new YateDeLujo();
                    y.crearBarco();
                    y.crearModulo();
                    a1.crearAlquiler();
                    precio = y.getModulo() * a1.getDiasAlq();
                    System.out.println("El monto a pagar por el Yate de lujo: " + precio);
                    break;
                case 4:
                    System.out.println("vola de aca croto");
                    break;
                case 5:
                    System.out.println("Te re fuiste gato....");
                    break;
                default:
                    System.out.println("No sabe leer.....");
                 break;
            }
            

        } while (op != 5);
    
    }
}
