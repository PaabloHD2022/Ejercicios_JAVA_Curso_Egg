

package com.mycompany.collections_guia10_ej06;

import entidad.Producto;
import java.util.HashMap;
import java.util.Scanner;
import servicio.ProductoServicio;

/**Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 *
 * @author Pablo Demartini
 */
public class Collections_Guia10_Ej06 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Producto p = new Producto();
        ProductoServicio ps = new ProductoServicio();
        int opcion = 0;
        
        do {
            System.out.println("------------Menú----------");
            System.out.println("1 - Cargar productos");
            System.out.println("2 - Modificar precios");
            System.out.println("3 - Eliminar productos");
            System.out.println("4 - Mostrar producto");
            System.out.println("5 - SALIR");
            System.out.println("--------------------------");
            System.out.println("Elija una de las opciones:");
            System.out.println("--------------------------");
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("ingrese el nombre del producto: ");
                    String nombreProducto = leer.next();
                    System.out.println("ingrese el precio del producto: ");
                    Double precioProducto = leer.nextDouble();
                    ps.agregarProducto(nombreProducto, precioProducto);
                break;
                
                case 2:
                    System.out.println("ingrese producto ha modificar: ");
                    String nombreModificar = leer.next();
                    System.out.println("ingrese precio a modificar: ");
                    Double nuevoPrecio = leer.nextDouble();
                    ps.modificarProducto(nombreModificar, nuevoPrecio);                    
                break;
                
                case 3:
                    System.out.println("ingrese el nombre del producto que desea eliminar: ");
                    String nombreEliminar = leer.next();
                    ps.eliminarProducto(nombreEliminar);                    
                break;
                
                case 4:
                    ps.mostrarProductos();                    
                break;
                
                case 5:
                    System.out.println("ha salido correctamente de la app");                    
                break;
                
                default:
                  System.out.println("la opcion ingresada es incorrecta");                        
            }
            
        } while (opcion != 5);        
    }
}



/*public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      ProductoServicio p = new ProductoServicio();
      int opcion = 0;
      
      do{
          System.out.println("---------menu--------");
          System.out.println("1. agregar producto ");
          System.out.println("2. modificar precio ");
          System.out.println("3. eliminar producto ");
          System.out.println("4. mostrar producto ");
          System.out.println("5. salir");
          opcion = leer.nextInt();
          
          switch(opcion){
              case 1:
                  System.out.println("ingrese el nombre del producto: ");
                  String nombre = leer.next();
                  System.out.println("ingrese el precio del producto: ");
                  Double precio = leer.nextDouble();
                  p.agregarProducto(nombre, precio);
              break;
              case 2:
                  System.out.println("ingrese producto ha modificar: ");
                  String nombreModificar = leer.next();
                  System.out.println("ingrese precio a modificar: ");
                  Double nuevoPrecio = leer.nextDouble();
                  p.modificarProducto(nombreModificar, nuevoPrecio);
                  break;
              case 3:
                  System.out.println("ingrese el nombre del producto que desea eliminar: ");
                  String nombreEliminar = leer.next();
                  p.eliminarProducto(nombreEliminar);
                  break;
              case 4:
                  p.mostrarProducto();
                  break;
              case 5:
                  System.out.println("ha salido de la app");
                  break;
              default:
                  System.out.println("la opcion ingresada es incorrecta");
          }
      }while(opcion !=5);      
    }    
}*/


//Servicio

/*package Servicio;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Juan
 */
//public class ProductoServicio {
//
//    private Map< String, Double> productos;
//
//    public ProductoServicio() {
//        productos = new HashMap<>();
//
//    }
//
//    public void agregarProducto(String nombre, Double precio) {
//        productos.put(nombre, precio);
//        System.out.println("el producto ha sido agregado correctamente");
//    }
//
//    public void modificarProducto(String nombre, Double nuevoPrecio) {
//        if (productos.containsKey(nombre)) {
//            productos.put(nombre, nuevoPrecio);
//            System.out.println("el precio ha sido modificado");
//        } else {
//            System.out.println("el producto no esta en la lista");
//        }
//    } 
//
//    public void eliminarProducto(String nombre) {
//        if (productos.containsKey(nombre)) {
//            productos.remove(nombre);
//            System.out.println("el producto ha sido eliminado");
//
//        } else {
//            System.out.println("el producto no esta en la lista");
//        }
//
//    }
//
//    public void mostrarProducto() {
//        if (productos.isEmpty()) {
//            System.out.println("la lista de productos esta vacia");
//
//        } else {
//            System.out.println("los productos de la tienda son: ");
//            for (Map.Entry<String, Double> entry : productos.entrySet()) {
//                String nombre = entry.getKey();
//                Double precio = entry.getValue();
//                System.out.println(nombre + " precio: $ " + precio);
//            }
//
//        }
//    }
//}*/*/
