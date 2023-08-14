

package principal.servicio;

import java.util.Collection;
import java.util.Scanner;
import principal.entidad.Producto;
import principal.persistencia.ProductoDAO;

public class productoServicio {
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private ProductoDAO dao;
    
    public productoServicio(){
        this.dao = new ProductoDAO();
    }
    
    public void crearProducto(int codigo, String nombre, Double precio, int codigo_fabricante) throws Exception{
        
        try {
            System.out.println("Ingrese el codigo de producto:");
            codigo = leer.nextInt();
            
            if(codigo < 0){
                throw new Exception("Debe ingresar un valor correcto para el ID.");
            }
            System.out.println("Ingrese el nombre del producto:");
            nombre = leer.next();
            
            if(nombre == null || nombre.trim().isEmpty()){
                throw new Exception("Ingrese el nombre del producto.");
            }
            System.out.println("Ingrese el precio del producto:");
            precio = leer.nextDouble();
            
            if(precio <=0){
                throw new Exception("El valor del precio no puede ser igual o menor a CERO.");
            }
            System.out.println("Ingrese el codigo de fabricante:");
            codigo_fabricante = leer.nextInt();
            
            if(codigo_fabricante <0){
                throw new Exception("El codigo de fabricante no es correcto.");
            }
            
            Producto producto = new Producto();
            producto.setCodigo(codigo);
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigoFabricante(codigo_fabricante);
            
            dao.guardarNuevoProducto(producto);
              
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Producto buscarProductoPorCodigo(int codigo) throws Exception{
        try {
            System.out.println("Ingrese el codigo del producto deseado.");
            codigo = leer.nextInt();
            if(codigo <0){
                throw new Exception("El codigo ingresado no existe");
            }
            Producto producto = buscarProductoPorCodigo(codigo);
            return producto;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void eliminarProducto(int codigo) throws Exception{
        
        try {
            if(codigo <0){
                throw new Exception("Debe ingresar un codigo de producto");
            }
            dao.eliminarProducto(codigo);
        } catch (Exception e) {
            throw e;
        }        
    }
    
    public Producto editarProducto(int codigo, String nombre, Double precio, int codigo_fabricante) throws Exception{
        
        try {            
            if(codigo < 0){
                throw new Exception("Debe ingresar el ID del producto.");
            }            
            if(nombre == null || nombre.trim().isEmpty()){
                throw new Exception("Debe ingresar el nombre del producto");
            }            
            if(precio <=0){
                throw new Exception("El precio ingresado no es correcto.");
            }            
            if(codigo_fabricante <0){
                throw new Exception("El codigo de fabricante ingresado no es correcto.");
            }            
            Producto producto = buscarProductoPorCodigo(codigo);
            return producto;
        } catch (Exception e) {
            e.printStackTrace();            
            throw e;
        }        
    }  
    
    public Collection<Producto> listarProducto() throws Exception{
        
        try {
            Collection<Producto> productos = dao.listarProductos();
            return productos;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void imprimirProductos() throws Exception{
        
        try {
            Collection<Producto> productos = listarProducto();
            if(productos.isEmpty()){
                throw new Exception("No existen productos para imprimir");
            }else{
                for(Producto p : productos){
                    System.out.println(p);
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Collection<Producto> listarProductosYPrecios() throws Exception{
        
        try {
            Collection<Producto> productos = dao.listarProductosYPrecios();
            return productos;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Collection<Producto> listarProductosPrecioEntre102Y202() throws Exception{
        
        try {
        Collection<Producto> productos = dao.listarProductosPrecioEntre102Y202();
        return productos;
        } catch (Exception e) {
            throw e;
        }
    }    
}
