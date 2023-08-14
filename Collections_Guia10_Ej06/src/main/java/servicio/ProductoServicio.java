
package servicio;

import entidad.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
public class ProductoServicio {
    
    private Map<String, Double> productos;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public ProductoServicio(){
        productos = new HashMap();
    }
    
    public void agregarProducto(String nombreProducto, Double precioProducto){
        
        productos.put(nombreProducto, precioProducto);
        System.out.println("Se agregó el producto a la lista");
    }
        
    public void modificarProducto(String nombreProducto, Double nuevoPrecio){
        
        if(productos.containsKey(nombreProducto)){
            productos.put(nombreProducto, nuevoPrecio);
            System.out.println("----------------------------------------------------");
            System.out.println("El precio del producto se ha actualizado en la lista");
            System.out.println("----------------------------------------------------");
            
        }else{
            System.out.println("-------------------------------------------------");
            System.out.println("El producto ingresado no se encuentra en la lista");
            System.out.println("-------------------------------------------------");
        }
    }
    
    public void eliminarProducto(String nombreProducto){
        
        if (productos.containsKey(nombreProducto)) {
            productos.remove(nombreProducto);
            System.out.println("-----------------------------------------");
            System.out.println("El producto ha sido eliminado de la lista");
            System.out.println("-----------------------------------------");
            
        } else {
            System.out.println("-------------------------------------------------");
            System.out.println("El producto ingresado no se encuentra en la lista");
            System.out.println("-------------------------------------------------");
        }
    }
    
    public void mostrarProductos(){
        if (productos.isEmpty()) {            
            System.out.println("------------------------");
            System.out.println("Lista de productos vacia");
            System.out.println("------------------------");

        } else {
            System.out.println("------------------------");
            System.out.println("Productos de la tienda: ");
            System.out.println("------------------------");
            for (Map.Entry<String, Double> entry : productos.entrySet()) {
                String nombreProducto = entry.getKey();
                Double precioProducto = entry.getValue();
                System.out.println("Producto: " +nombreProducto + " precio: $ " + precioProducto);
            }
        }
    }
}


