
package MODELO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PasajerosPrincipalesDAO extends Conexion{
         public boolean registrar(PasajeroPrincipal PPrincipal){
                  PreparedStatement ps = null;
                  Connection con = getConnection();
                  try{
                            ps = con.prepareStatement("INSERT INTO PasajerosPrincipales(pasajeroPrincipal_dni, pasajeroPrincipal_viaje_id,pasajeroPrincipal_nombre,pasajeroPrincipal_apellido_paterno,pasajeroPrincipal_apellido_materno,pasajeroPrincipal_edad,pasajeroPrincipal_asiento) VALUES(?,?,?,?,?,?,?)");
                            ps.setString(1, PPrincipal.getDni());
                            ps.setInt(2, PPrincipal.getViajeId());
                            ps.setString(3, PPrincipal.getNombre());
                            ps.setString(4, PPrincipal.getApePaterno());
                            ps.setString(5, PPrincipal.getApeMaterno());
                            ps.setInt(6, PPrincipal.getEdad());
                            ps.setString(7, PPrincipal.getAsiento());

                            ps.execute();
                            return true; 
                  }catch(SQLException  e){
                            return false;
                  }finally{
                           try{
                                    con.close();
                           }catch(SQLException e){
                                    System.out.println(e);
                           }
                  }
         }
}
