
package DAO;
import MODELO.Conexion;
import MODELO.Viajes;
import java.sql.*;



public class ViajesDAO extends Conexion{
    
         
         public boolean Registrar(Viajes viaje){
                  PreparedStatement ps=null;
                  Connection con =getConnection();
                  try{
                           ps=con.prepareStatement("INSERT INTO Viajes(viaje_terminal_salida,viaje_terminal_llegada,viaje_fecha_salida,viaje_fecha_llegada,viaje_hora_salida,viaje_hora_llegada,viaje_duracion,viaje_distancia,viaje_asientos_Dispo,viaje_precio,viaje_img_Refe) VALUES(?,?,?,?,?,?,?,?,?,?,?)");
                           ps.setInt(1,viaje.getTerminalSalida());
                           ps.setInt(2,viaje.getTerminalLlegada());
                           ps.setString(3, viaje.getFechaSalida());
                           ps.setString(4, viaje.getFechaLlegada());
                           ps.setString(5,viaje.getHoraSalida());
                           ps.setString(6, viaje.getHoraLlegada());
                           ps.setString(7, viaje.getDuracion());
                           ps.setString(8, viaje.getDistancia());
                           ps.setInt(9,viaje.getAsientosDispo());
                           ps.setDouble(10,viaje.getPrecio());
                           ps.setBytes(11,viaje.getImg());
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
         
         public boolean Modificar(Viajes viaje, int id){
                  PreparedStatement ps=null;
                  Connection con =getConnection();
                  try {
                           ps=con.prepareStatement("UPDATE Viajes SET viaje_terminal_salida=?,viaje_terminal_llegada=?,viaje_fecha_salida=?,viaje_fecha_llegada=?,viaje_hora_salida=?,viaje_hora_llegada=?,viaje_duracion=?, viaje_distancia=?,viaje_asientos_Dispo=?,viaje_precio=?, viaje_img_Refe=? WHERE viaje_id=?");
                           ps.setInt(1,viaje.getTerminalSalida());
                           ps.setInt(2,viaje.getTerminalLlegada());
                           ps.setString(3, viaje.getFechaSalida());
                           ps.setString(4, viaje.getFechaLlegada());
                           ps.setString(5,viaje.getHoraSalida());
                           ps.setString(6, viaje.getHoraLlegada());
                           ps.setString(7, viaje.getDuracion());
                           ps.setString(8, viaje.getDistancia());
                           ps.setInt(9,viaje.getAsientosDispo());
                           ps.setDouble(10,viaje.getPrecio());
                           ps.setBytes(11,viaje.getImg());
                           ps.setInt(12,id);
                           ps.execute();
                           return true;
                  }catch(SQLException ex) {
                           System.err.println(ex);
                           return false;
                  }
         
         }
         
         public boolean Eliminar(int id){
                  PreparedStatement ps=null;
                  Connection con =getConnection();
                  try {
                           ps=con.prepareStatement("DELETE FROM Viajes WHERE viaje_id=?");
                           ps.setInt(1,id);
                           ps.execute();
                           return true;
                  }catch (SQLException ex) {
                           System.out.println(ex);
                           return false;
                  }finally{
                           try {
                                    con.close();
                           } catch (Exception e) {
                                    System.out.println(e);
                           }
                  
                  }
         
         }
         
         public Viajes ObtenerDatos(int id){
                  PreparedStatement ps=null;
                  Connection con=getConnection();
                  ResultSet rs=null;
                  try {
                           ps=con.prepareStatement("SELECT * FROM Viajes WHERE viaje_id=?");
                           ps.setInt(1, id);
                           rs=ps.executeQuery();
                           if (rs.next()) {
                                    Viajes viaje=new Viajes  ( rs.getInt("viaje_terminal_salida"),
                                                                               rs.getInt("viaje_terminal_llegada"),
                                                                               rs.getString("viaje_fecha_salida"),
                                                                               rs.getString("viaje_fecha_llegada"),
                                                                               rs.getString("viaje_hora_salida"),
                                                                               rs.getString("viaje_hora_llegada"),
                                                                               rs.getString("viaje_duracion"),
                                                                               rs.getString("viaje_distancia"),
                                                                               rs.getInt("viaje_asientos_Dispo"),
                                                                               rs.getDouble("viaje_precio"),
                                                                               rs.getBytes("viaje_img_Refe")); 
                                    return viaje ;
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
         
         public int CantidadViajes(){
                  int cantidad=0;
                  PreparedStatement ps=null;
                  Connection con=getConnection();
                  ResultSet rs=null;
                  try {
                           ps=con.prepareStatement("SELECT count(*) AS cantidad_viajes FROM Viajes");
                           rs=ps.executeQuery(); 
                           if (rs.next()) {
                                    cantidad=Integer.parseInt(rs.getString("cantidad_viajes"));
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
                  return cantidad;
         }
         
         public boolean ActualizarAsientosDisponibles(Viajes viaje){
                  PreparedStatement ps=null;
                  Connection con =getConnection();
                  try {
                           ps=con.prepareStatement("UPDATE Viajes SET viaje_asientos_Dispo=? WHERE viaje_id=?");
                           ps.setInt(1, viaje.getAsientosDispo());
                           ps.setInt(2,viaje.getId());
                           ps.execute();
                           return true;
                  }catch(SQLException ex) {
                           System.err.println(ex);
                           return false;
                  }
         
         }
         
         public int ObtenerIDgenerado(){
                  PreparedStatement ps=null;
                  ResultSet rs=null;
                  Connection con=getConnection();
                  try {
                           ps=con.prepareStatement("SELECT MAX(viaje_id) AS IDgenerado FROM Viajes");
                           rs=ps.executeQuery();
                           if (rs.next()) {
                                    int id=rs.getInt("IDgenerado");
                                    return  id;    
                            }        
                  } catch (SQLException e) {
                           System.out.println(e);
                  }
                 return 0;
        }
}
