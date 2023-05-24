
package MODELO;
import java.sql.*;

public class SociosDAO extends Conexion {
         public boolean registrar(Socios socio){
                  PreparedStatement ps=null;
                  Connection con =getConnection();
                  try{
                           ps=con.prepareStatement("INSERT INTO Socios(socio_dni, socio_nombre,socio_apellido_paterno,socio_apellido_materno,socio_correo,socio_nacimiento,socio_numero,socio_contraseña,socio_puntos) VALUES(?,?,?,?,?,?,?,?,?)");
                           ps.setString(1,socio.getDni());
                           ps.setString(2,socio.getNombre());
                           ps.setString(3,socio.getApellidoPaterno());
                           ps.setString(4,socio.getApellidoMaterno());
                           ps.setString(5, socio.getCorreo());
                           ps.setString(6, socio.getNacimiento());
                           ps.setString(7, socio.getNumero());
                           ps.setString(8, socio.getContraseña());
                           ps.setInt(9, socio.getPuntos());
                           ps.execute();
                           return true;
                  }catch(SQLException ex){
                           System.out.println(ex);
                           return false;
                  }finally{
                           try {
                                    con.close();
                           } catch (SQLException ex) {
                                    System.out.println(ex);
                           }
                  }

        }
    
    
}
