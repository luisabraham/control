package Modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    public static Connection con;
     public static final String USERNAME = "root";
    public static final String PASSWORD = "lima1";
    public static final String HOST = "localhost";
    public static final String PORT = "3306";
    public static final String DATABASE = "computu";
    public static final String CLASSNAME = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://"+ HOST +":"+PORT+"/"+DATABASE;
    
    private Conexion(){
        
    }
     
       public static Connection conectar() {
  
        try {
                if(con==null)
                {
                Class.forName(CLASSNAME);
                con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
                }
                } 
        catch (ClassNotFoundException e) {
               System.out.println("Error");
            } 
        catch (SQLException e) {
               System.out.println("Error");
            }
           return con;
        }
       public static void desconectar() throws SQLException{
           con.close();
           con=null;
           
       }
    
}