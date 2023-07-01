
package DAO;

import MODELO.Conexion;
import MODELO.PasajeroPrincipal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PasajerosPrincipalesDAO extends Conexion{
    
         public boolean registrar(PasajeroPrincipal PPrincipal){
                  PreparedStatement ps = null;
                  Connection con = getConnection();
                  try{
                            ps = con.prepareStatement("INSERT INTO PasajerosPrincipales(pasajeroPrincipal_dni, pasajeroPrincipal_viaje_id,pasajeroPrincipal_nombre,pasajeroPrincipal_apellido_paterno,pasajeroPrincipal_apellido_materno,pasajeroPrincipal_edad,pasajeroPrincipal_correo,pasajeroPrincipal_asiento) VALUES(?,?,?,?,?,?,?,?)");
                            ps.setString(1, PPrincipal.getDni());
                            ps.setInt(2, PPrincipal.getViajeId());
                            ps.setString(3, PPrincipal.getNombre());
                            ps.setString(4, PPrincipal.getApePaterno());
                            ps.setString(5, PPrincipal.getApeMaterno());
                            ps.setInt(6, PPrincipal.getEdad());
                            ps.setString(7, PPrincipal.getCorreo());
                            ps.setString(8, PPrincipal.getAsiento());

                            ps.execute();
                            return true; 
                  }catch(SQLException  e){
                            System.out.println(e);
                            return false;
                  }finally{
                           try{
                                    con.close();
                           }catch(SQLException e){
                                    System.out.println(e);
                           }
                  }
         }
         public boolean ExisteEnPasajeros(PasajeroPrincipal PPrincipal){
                  PreparedStatement ps=null;
                  Connection con=getConnection();
                  ResultSet rs=null;
                  try {
                           ps=con.prepareStatement("SELECT * FROM PasajerosPrincipales WHERE pasajeroPrincipal_dni=? AND pasajeroPrincipal_viaje_id=?");
                           ps.setString(1, PPrincipal.getDni());
                           ps.setInt(2, PPrincipal.getViajeId());
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
         public boolean ExisteEnAcompañantes(PasajeroPrincipal PPrincipal){
                  PreparedStatement ps=null;
                  Connection con=getConnection();
                  ResultSet rs=null;
                  try {
                           ps=con.prepareStatement("SELECT * FROM Acompañantes WHERE acompañante_dni=? AND acompañante_viaje_id=?");
                           ps.setString(1, PPrincipal.getDni());
                           ps.setInt(2, PPrincipal.getViajeId());
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
}
