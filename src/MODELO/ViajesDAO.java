
package MODELO;
import java.sql.*;



public class ViajesDAO extends Conexion{
    
         
         public void RegistrarViaje(Viajes viaje){
                  PreparedStatement ps=null;
                  Connection con =getConnection();
                  try{
                           ps=con.prepareStatement("INSERT INTO Viajes( viaje_id,viaje_terminal_salida,viaje_terminal_llegada,viaje_fecha_salida,viaje_fecha_llegada,viaje_hora_salida,viaje_hora_llegada,viaje_distancia,viaje_asientos_Dispo,viaje_precio,viaje_img_Refe) VALUES(?,?,?,?,?,?,?,?,?,?,?)");
                           ps.setInt(1,viaje.getId());
                           ps.setString(2,viaje.getTerminalSalida());
                           ps.setString(3,viaje.getTerminalLlegada());
                           ps.setString(4, viaje.getFechaSalida());
                           ps.setString(5, viaje.getFechaLlegada());
                           ps.setString(6,viaje.getHoraSalida());
                           ps.setString(7, viaje.getHoraLlegada());
                           ps.setString(8, viaje.getDistancia());
                           ps.setInt(9,viaje.getAsientosDispo());
                           ps.setDouble(10,viaje.getPrecio());
                           ps.setBytes(11,viaje.getImg());
                           ps.execute();
                  }catch(SQLException ex){
                           System.err.println(ex);
                  }finally{
                           try {
                                    con.close();
                           } catch (SQLException ex) {
                                    System.out.println(ex);
                           }
                  } 
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
         

}
