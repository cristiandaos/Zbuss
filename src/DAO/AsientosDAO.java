
package DAO;

import MODELO.Acompañantes;
import MODELO.Conexion;
import MODELO.PasajeroPrincipal;
import MODELO.Viajes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AsientosDAO extends Conexion{
    
        public boolean DeshabilitarAsiento(PasajeroPrincipal pprincipal){
                  PreparedStatement ps=null;
                  Connection con =getConnection();
                  try{
                           ps=con.prepareStatement("UPDATE Asientos SET asiento_estado='Ocupado' WHERE asiento_viaje_id=? AND asiento_codigo=? ");
                           ps.setInt(1, pprincipal.getViajeId());
                           ps.setString(2, pprincipal.getAsiento());
                           ps.execute();
                           return true;
                  }catch(SQLException ex){
                           System.out.println(ex);
                           return false;
                  }
        }
        
        public boolean DeshabilitarAsiento(Acompañantes acomp){
                  PreparedStatement ps=null;
                  Connection con =getConnection();
                  try{
                           ps=con.prepareStatement("UPDATE Asientos SET asiento_estado='Ocupado' WHERE asiento_viaje_id=? AND asiento_codigo=? ");
                           ps.setInt(1, acomp.getViajeId());
                           ps.setString(2, acomp.getAsiento());
                           ps.execute();
                           return true;
                  }catch(SQLException ex){
                           System.out.println(ex);
                           return false;
                  }
        }
        
         public void ActivarAsientos(int id){
                  PreparedStatement ps=null;
                  Connection con=getConnection();
                  String sql="INSERT INTO Asientos (asiento_viaje_id, asiento_codigo, asiento_estado) VALUES (?,?,?)";
                  try{
                           for (int i = 1; i <= 40; i++) {
                                    ps=con.prepareStatement(sql);
                                    ps.setInt(1, id);
                                    ps.setString(2, "A"+i);
                                    ps.setString(3, "Disponible");
                                    ps.execute();
                           }
                  }catch(SQLException ex){
                           System.out.println(ex);
                  }
                  
         } 
}
