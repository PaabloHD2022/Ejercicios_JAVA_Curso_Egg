

package tienda.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DAO {
    
    protected Connection conexion = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;
    
    //Constantes paracomunicarse a la base de datos.
    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "tienda";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    
    //Metodo para conectarse a la base de datos.
    protected void conectarBase() throws ClassNotFoundException, SQLException{         
        try {
            Class.forName(DRIVER);
            String urlBaseDeDatos = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false";
            conexion = DriverManager.getConnection(urlBaseDeDatos, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            throw ex;
        }
    }
    
    //Metodo para desconectarse de la base de datos.
    protected void desconectarBase() throws Exception{
        try {
            if(resultado != null){
                resultado.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
            if (conexion != null) {
                conexion.close();
            }           
        } catch (Exception e) {
            throw e;
        }
    }
    
    //Metodo para insertar, modificar o eliminar datos de la base de datos.
    protected void insertarModificarEliminar(String sql) throws SQLException, ClassNotFoundException, Exception{
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
        } catch (SQLException | ClassNotFoundException e) {
            //conexion.rollback();
            /*
                Descomentar la linea anterior si desean tener en cuenta el rollback.
                Correr el siguiente script en  MySQL Workbench                
                SET autocommit=1;
                COMMIT;                
                Sin Rollback igual funciona. 
                El rollback sirve para parar el proceso que se haya iniciado en caso de error en la carga de la base de datos.            
            */
            throw e;
        }finally{
            desconectarBase();
        }
    }
    
    //Metodo para consultar base de datos.
    protected void consultarBase(String sql)throws Exception{
        try {
            conectarBase(); //Conecta a la base de datos.
            sentencia = conexion.createStatement(); //Creamos y ejecutamos la sentencia para consultar a la base de datos.
            resultado = sentencia.executeQuery(sql); //guarda los resultados de la consulta.
        } catch (Exception e) {
            throw e;
        }
    }
}
