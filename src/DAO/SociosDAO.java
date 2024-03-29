
package DAO;
import MODELO.Conexion;
import MODELO.Socios;
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
         public boolean Actualizar(Socios socio){
                  PreparedStatement ps=null;
                  Connection con =getConnection();
                  try{
                           ps=con.prepareStatement("UPDATE Socios SET socio_nombre=?,socio_apellido_paterno=?,socio_apellido_materno=?,socio_correo=?,socio_nacimiento=?,socio_numero=?,socio_contraseña=? WHERE socio_dni=?");
                           ps.setString(1,socio.getNombre());
                           ps.setString(2,socio.getApellidoPaterno());
                           ps.setString(3,socio.getApellidoMaterno());
                           ps.setString(4, socio.getCorreo());
                           ps.setString(5, socio.getNacimiento());
                           ps.setString(6, socio.getNumero());
                           ps.setString(7, socio.getContraseña());
                           ps.setString(8,socio.getDni());
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
         
         public boolean Eliminar(Socios socio){
                  PreparedStatement ps=null;
                  Connection con =getConnection();
                  try{
                           ps=con.prepareStatement("DELETE FROM Socios WHERE socio_dni=?");
                           ps.setString(1,socio.getDni());
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
         
         public  boolean Validar(String correo, String contraseña){
                  PreparedStatement ps=null;
                  Connection con=getConnection();
                  ResultSet rs=null;
                  try {
                           ps=con.prepareStatement("SELECT * FROM Socios WHERE socio_correo=? AND socio_contraseña=?");
                           ps.setString(1, correo);
                           ps.setString(2,contraseña);
                           rs=ps.executeQuery();
                           if (rs.next()) {
                                    return true;
                           }

                  } catch (SQLException e) {
                            System.out.println(e);
                  }finally{
                           try {
                                    con.close();
                           } catch (SQLException ex) {
                                    System.out.println(ex);
                           }
                  }
                  return false;
         }
         
         public Socios ObtenerDatos(String correo, String contraseña){
                  PreparedStatement ps=null;
                  Connection con=getConnection();
                  ResultSet rs=null;
                  try {
                           ps=con.prepareStatement("SELECT * FROM Socios WHERE socio_correo=? AND socio_contraseña=?");
                           ps.setString(1, correo);
                           ps.setString(2,contraseña);
                           rs=ps.executeQuery();
                           if (rs.next()) {
                                    Socios socio=new Socios(rs.getString("socio_dni"),
                                                                               rs.getString("socio_nombre"),
                                                                               rs.getString("socio_apellido_paterno"),
                                                                               rs.getString("socio_apellido_materno"),
                                                                               rs.getString("socio_correo"),
                                                                               rs.getString("socio_nacimiento"),
                                                                               rs.getString("socio_numero"),
                                                                               rs.getString("socio_contraseña"),
                                                                               rs.getInt("socio_puntos")); 
                                    return socio ;
                           }

                  } catch (SQLException e) {
                            System.out.println(e);
                  }finally{
                           try {
                                    con.close();
                           } catch (SQLException ex) {
                                    System.out.println(ex);
                           }
                  }
                  return null;

         }
         public boolean  ActualizarPuntos(Socios socio){
                  PreparedStatement ps=null;
                  Connection con=getConnection();
                  try {
                           ps=con.prepareStatement("UPDATE Socios SET socio_puntos=? WHERE socio_dni=?");
                           ps.setInt(1, socio.getPuntos());
                           ps.setString(2,socio.getDni());
                           ps.execute();
                           
                           return true;
                           
                  } catch (SQLException e) {
                            System.out.println(e);
                  }finally{
                           try {
                                    con.close();
                           } catch (SQLException ex) {
                                    System.out.println(ex);
                           }
                  }
                  return false;
         }
}
    
    

