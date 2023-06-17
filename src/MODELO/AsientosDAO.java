
package MODELO;

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
}
