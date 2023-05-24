
package MODELO;
import java.sql.*;




public class Conexion {
         private final String base="ZBUSSBD";
         private final String user="admin";
         private final String password="mysql";
         private final String url="jdbc:mysql://155.248.192.192:3306/"+base;
         private Connection con=null;
         
         public Connection getConnection() {
         try {
                  Class.forName("com.mysql.cj.jdbc.Driver");
                  con = DriverManager.getConnection(url, user, password);
                  System.out.println("Conexion exitosa con la base de datos: " + base);
                  } catch (ClassNotFoundException e) {
                  System.out.println("Error al cargar el driver de MySQL: " + e.getMessage());
                  } catch (SQLException e) {
                  System.out.println("Error al establecer la conexión: " + e.getMessage());
                  }
                  return con;
         }
         
}
