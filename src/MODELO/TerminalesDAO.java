
package MODELO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class TerminalesDAO extends Conexion{
         public void RegistrarTerminal(Terminales terminal){
                  PreparedStatement ps=null;
                  Connection con =getConnection();
                  try{
                           ps=con.prepareStatement("INSERT INTO Terminales(terminal_nombre,terminal_dirección,terminal_estado) VALUES(?,?,?)");
                           ps.setString(1,terminal.getNombre());
                           ps.setString(2,terminal.getDireccion());
                           ps.setString(3,terminal.getEstado());
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
    
}
