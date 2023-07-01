
package DAO;
import MODELO.Acompañantes;
import MODELO.Conexion;
import java.sql.*;

public class AcompañantesDAO extends Conexion{
         public boolean registrar(Acompañantes acompa){
                  PreparedStatement ps = null;
                  Connection con = getConnection();
                  try{
                            ps = con.prepareStatement("INSERT INTO Acompañantes(acompañante_dni, acompañante_pasajeroPrincipal,acompañante_viaje_id,acompañante_nombre,acompañante_apellido_paterno,acompañante_apellido_materno,acompañante_edad,acompañante_asiento) VALUES(?,?,?,?,?,?,?,?)");
                            ps.setString(1, acompa.getDni());
                            ps.setString(2, acompa.getPasajeroPrincipal().getDni());
                            ps.setInt(3, acompa.getViajeId());
                            ps.setString(4, acompa.getNombre());
                            ps.setString(5, acompa.getApePaterno());
                            ps.setString(6, acompa.getApeMaterno());
                            ps.setInt(7, acompa.getEdad());
                            ps.setString(8, acompa.getAsiento());

                            ps.execute();
                            return true; 
                  }catch(SQLException  e){
                           System.out.println(e);
                            return false;
                  }
         }
         
                  public boolean ExisteEnPasajeros(Acompañantes acompa){
                  PreparedStatement ps=null;
                  Connection con=getConnection();
                  ResultSet rs=null;
                  try {
                           ps=con.prepareStatement("SELECT * FROM PasajerosPrincipales WHERE pasajeroPrincipal_dni=? AND pasajeroPrincipal_viaje_id=?");
                           ps.setString(1, acompa.getDni());
                           ps.setInt(2, acompa.getViajeId());
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
         public boolean ExisteEnAcompañantes(Acompañantes acompa){
                  PreparedStatement ps=null;
                  Connection con=getConnection();
                  ResultSet rs=null;
                  try {
                           ps=con.prepareStatement("SELECT * FROM Acompañantes WHERE acompañante_dni=? AND acompañante_viaje_id=?");
                           ps.setString(1,acompa.getDni());
                           ps.setInt(2, acompa.getViajeId());
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
