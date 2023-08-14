

package principal.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import principal.entidad.Producto;
import principal.servicio.productoServicio;

public class ProductoDAO extends DAO {
    
    public final productoServicio productoServicio;
    
    public ProductoDAO(){
        this.productoServicio = new productoServicio();
    }
    
    public void guardarNuevoProducto(Producto producto) throws Exception{
        
        try {
            if(producto == null){
                throw new Exception("Debe indicar el producto");
            }
            String sql = "INSERT INTO Producto (codigo, nombre, precio, codigo_fabricante)" 
                    + "VALUES ('" + producto.getCodigo() + "' , '" + producto.getNombre() + "' , '" + producto.getPrecio() + "' , '" + producto.getCodigoFabricante() + " );";
            System.out.println(sql);
            insertarModificarEliminar(sql);            
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }finally{
            desconectarBase();
        }        
    }
        
    public void modificarProducto(Producto producto) throws Exception{
        
        try {
            if(producto == null){
                throw new Exception("Debe indicar el producto que desea eliminar");
            }
            String sql = "UPDATE Producto SET" + "codigo = '" + producto.getCodigo() + "' , nombre = '" + producto.getNombre() + "' "
                    + ", precio = '" + producto.getPrecio() + "' , codigo fabricante = '" + producto.getCodigoFabricante() + "'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }finally{
            desconectarBase();
        }        
    }
    
    public Collection <Producto> listarProductos() throws Exception{
        
        try {
            String sql = "SELECT * FROM producto";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList<>();
            while(resultado.next()){
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);                
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
       
    /*a) Lista el nombre de todos los productos que hay en la tabla producto.*/
    public Collection<Producto> listarNombreProductos() throws Exception{
        
        try {
            String sql = "SELECT nombre, FROM producto";
            
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList<>();
            while(resultado.next()){
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                productos.add(producto);
            }
            
            return productos;            
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema.");
        }finally{
            desconectarBase();
        }         
    }
    
    /*b) Lista los nombres y los precios de todos los productos de la tabla producto.*/
    public Collection<Producto> listarProductosYPrecios() throws Exception{
        
        try {
            String sql = "SELECT nombre, precio, FROM producto";
            
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList<>();
            while(resultado.next()){
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
                productos.add(producto);
            }
            
            return productos;            
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema.");
        }finally{
            desconectarBase();
        }         
    }
    
    /*c) Listar aquellos productos que su precio esté entre 120 y 202.*/
    public Collection<Producto> listarProductosPrecioEntre102Y202() throws Exception{
        
        try {
            String sql = "SELECT * FROM producto WHERE precio BETWEEN 102 AND 202";
            
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList<>();
            while(resultado.next()){
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            
            return productos;            
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema.");
        }finally{
            desconectarBase();
        }         
    }
    
    /*d) Buscar y listar todos los Portátiles de la tabla producto.*/
    public Collection<Producto> listarPortatiles() throws Exception{
        try {
            String sql = "SELECT * FROM producto WHERE nombre LIKE 'Portatil%'";
            
            consultarBase(sql);
            
            Producto producto = null;
            Collection<Producto> productos = new ArrayList<>();
            while(resultado.next()){
                producto  =new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            
            return productos;            
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        }finally{
            desconectarBase();
        }
    }
    
    /*e) Listar el nombre y el precio del producto más barato.*/
    public Producto listarProductoMasBarato() throws Exception{
        
        try {
            String sql = "SELECT * FROM producto WHERE precio = "
                    + "(SELECT MIN(precio) FROM producto) ORDER BY nombre LIMIT 1;";
            consultarBase(sql);
            Producto producto = null;
            while(resultado.next()){
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));                
            }
            
            return producto;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }finally{
            desconectarBase();
        }        
    }
    
    public Producto buscarProductoPorCodigo(int codigo) throws Exception{
        
        try {
            
            String sql = "SELECT * FROM producto WHERE codigo = " + codigo + "";
            consultarBase(sql);
            Producto producto = null;
            while(resultado.next()){
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                          
            }
            desconectarBase();
            return producto;            
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }        
    }
    
    public void eliminarProducto(int codigo) throws Exception{
        
        try {
            String sql = "DELETE FROM producto WHERE codigo = '" + codigo + "'";
            
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }finally{
            desconectarBase();
        }
    }
}
