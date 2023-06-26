
package DAO;

import MODELO.Conexion;
import MODELO.Terminales;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class TerminalesDAO extends Conexion{
         public boolean Registrar(Terminales terminal){
                  PreparedStatement ps=null;
                  Connection con =getConnection();
                  try{
                           ps=con.prepareStatement("INSERT INTO Terminales(terminal_nombre,terminal_dirección,terminal_estado) VALUES(?,?,?)");
                           ps.setString(1,terminal.getNombre());
                           ps.setString(2,terminal.getDireccion());
                           ps.setString(3,terminal.getEstado());
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
         
         public boolean Modificar(Terminales terminal,int id){
                  PreparedStatement ps=null;
                  Connection con =getConnection();
                  try{
                           ps=con.prepareStatement("UPDATE Terminales SET terminal_nombre=?,terminal_dirección=?, terminal_estado=?  WHERE terminal_id=?");
                           ps.setString(1,terminal.getNombre());
                           ps.setString(2,terminal.getDireccion());
                           ps.setString(3,terminal.getEstado());
                           ps.setInt(4, id);
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
         
         public boolean Eliminar(int id){
                  PreparedStatement ps=null;
                  Connection con =getConnection();
                  try{
                           ps=con.prepareStatement("DELETE * FROM Terminales WHERE terminal_id=?");
                           ps.setInt(1, id);
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
         
         public Terminales ObtenerDatos(int id){
                  PreparedStatement ps=null;
                  Connection con=getConnection();
                  ResultSet rs=null;
                  try {
                           ps=con.prepareStatement("SELECT * FROM Terminales WHERE terminal_id=?");
                           ps.setInt(1, id);
                           rs=ps.executeQuery();
                           if (rs.next()) {
                                    Terminales terminal=new Terminales(rs.getString("terminal_nombre"),
                                                                               rs.getString("terminal_dirección"),
                                                                               rs.getString("terminal_estado")); 
                                    return terminal ;
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
