package tienda.persistencia;

import tienda.entidades.Producto;

public final class productoDAO extends DAO {
    
    //a) Lista el nombre de todos los productos que hay en la tabla producto.
    public void mostrarTodosLosNombresDeProductos() throws Exception{
        
        try {
            String sql = "SELECT nombre FROM producto";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }finally{
            desconectarBase();
        }       
    }
    
    //b) Lista los nombres y los precios de todos los productos de la tabla producto.
    public void mostrarNombreYPrecioDeTodosLosProductos() throws Exception{
        try {
            String sql = "SELECT nombre, precio FROM producto ORDER BY nombre";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }finally{
            desconectarBase();
        }
    }
    
    //c) Listar aquellos productos que su precio esté entre 120 y 202.
    public void mostrarProductosRangoPrecio120202() throws Exception{
        
        try {
            String sql = "SELECT nombre, precio FROM producto\n" +
                         "WHERE precio BETWEEN 120 AND 202";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }finally{
            desconectarBase();
        }
        
    }
    
    //d) Buscar y listar todos los Portátiles de la tabla producto.
    public void listarPortatiles() throws Exception{
        
        try {
            String sql = "SELECT * FROM producto WHERE nombre LIKE 'Portatil%'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }finally{
            desconectarBase();
        }
    }
    
    //e) Listar el nombre y el precio del producto más barato.
    public void listarProductoMasBarato() throws Exception{
        
        try {
            String sql = "SELECT nombre, precio FROM producto WHERE precio= (SELECT MIN(precio) FROM producto)";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }finally{
            desconectarBase();
        }
    }
    
    //f) Ingresar un producto a la base de datos.
    public void guardarProducto( Producto producto) throws Exception{
        
        try {
            if(producto == null){
                throw new Exception("Debe indicar el producto");
            }
            String sql = "INSERT INTO producto(clave, nombre, precio, codigo_fabricante)" + "VALUES ('" + producto.getCodigo() + "' , '" + producto.getNombre() + "', '" + producto.getPrecio() + "', '" + producto.getCodigoFabricante() +"');";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }finally{
            desconectarBase();
        }
    }
    
    //h) Editar un producto con datos a elección.
    public void editarProducto(Producto producto) throws Exception{
        
        try {
            String sql = "UPDATE Usuario SET "
                    + "clave = '" + producto.getCodigo() + "' WHERE nombre = '" + producto.getNombre() + "';";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }finally{
            desconectarBase();
        }
    }
}