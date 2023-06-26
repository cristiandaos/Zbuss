
package DAO;

import MODELO.Conexion;
import MODELO.Ventas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VentasDAO extends Conexion{
         public boolean registrar(Ventas venta){
                  PreparedStatement ps = null;
                  Connection con = getConnection();
                  try{
                            ps = con.prepareStatement("INSERT INTO Ventas( venta_fecha,venta_hora,venta_viaje_id,venta_pasajeroPrincipal_dni,venta_num_asientos,venta_asientos,venta_ganancia) VALUES(?,?,?,?,?,?,?)");
                            ps.setString(1, venta.getFecha());
                            ps.setString(2, venta.getHora());
                            ps.setInt(3, venta.getViaje().getId());
                            ps.setString(4, venta.getPasajeroPrincipal().getDni());
                            ps.setInt(5, venta.getNumAsientos());
                            ps.setString(6, venta.getAsientos());
                            ps.setDouble(7, venta.getGanancia());
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
}
