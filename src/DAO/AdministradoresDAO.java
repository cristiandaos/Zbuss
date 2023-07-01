
package DAO;

import MODELO.Administrador;
import MODELO.Conexion;
import java.sql.*;



public class AdministradoresDAO extends Conexion{
    
    public boolean registrar(Administrador admin){
         PreparedStatement ps=null;
         Connection con =getConnection();
         try{
                  ps=con.prepareStatement("INSERT INTO Administradores(admin_dni, admin_nombre,admin_apellido_paterno,admin_apellido_materno,admin_correo,admin_contraseña) VALUES(?,?,?,?,?,?)");
                  ps.setString(1,admin.getDni());
                  ps.setString(2,admin.getNombre());
                  ps.setString(3,admin.getApellidoPaterno());
                  ps.setString(4,admin.getApellidoMaterno());
                  ps.setString(5, admin.getCorreo());
                  ps.setString(6, admin.getContraseña());
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
    
         public boolean Modificar(Administrador admin){
                  PreparedStatement ps=null;
                  Connection con =getConnection();
                  try{
                           ps=con.prepareStatement("UPDATE Administradores SET admin_nombre=?,admin_apellido_paterno=?,admin_apellido_materno=?,admin_correo=?,admin_contraseña=? WHERE admin_dni=?");
                           ps.setString(1,admin.getNombre());
                           ps.setString(2,admin.getApellidoPaterno());
                           ps.setString(3,admin.getApellidoMaterno());
                           ps.setString(4, admin.getCorreo());
                           ps.setString(5, admin.getContraseña());
                           ps.setString(6, admin.getDni());
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
    
         public boolean Eliminar(String dni){
                  PreparedStatement ps=null;
                  Connection con =getConnection();
                  try{
                           ps=con.prepareStatement("DELETE  FROM Administradores WHERE admin_dni=?");
                           ps.setString(1, dni);
                           ps.execute();
                           return true;
                  }catch(SQLException ex){
                           System.err.println(ex);
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
                           ps=con.prepareStatement("SELECT * FROM Administradores WHERE admin_correo=? AND admin_contraseña=?");
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
         
         public Administrador ObtenerDatos(String dni){
                  PreparedStatement ps=null;
                  Connection con=getConnection();
                  ResultSet rs=null;
                  try {
                           ps=con.prepareStatement("SELECT * FROM Administradores WHERE admin_dni=?");
                           ps.setString(1, dni);
                           rs=ps.executeQuery();
                           if (rs.next()) {
                                    Administrador admin=new Administrador(rs.getString("admin_dni"),
                                                                               rs.getString("admin_nombre"),
                                                                               rs.getString("admin_apellido_paterno"),
                                                                               rs.getString("admin_apellido_materno"),
                                                                               rs.getString("admin_correo"),
                                                                               rs.getString("admin_contraseña"));
                                    return admin ;
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
         
         public Administrador ObtenerDatos(String correo, String contraseña){
                  PreparedStatement ps=null;
                  Connection con=getConnection();
                  ResultSet rs=null;
                  try {
                           ps=con.prepareStatement("SELECT * FROM Administradores WHERE admin_correo=? AND admin_contraseña=?");
                           ps.setString(1, correo);
                           ps.setString(2,contraseña);
                           rs=ps.executeQuery();
                           if (rs.next()) {
                                    Administrador admin=new Administrador(rs.getString("admin_dni"),
                                                                               rs.getString("admin_nombre"),
                                                                               rs.getString("admin_apellido_paterno"),
                                                                               rs.getString("admin_apellido_materno"),
                                                                               rs.getString("admin_correo"),
                                                                               rs.getString("admin_contraseña"));
                                    return admin ;
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
    
}
