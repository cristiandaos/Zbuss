
package CONTROLADOR;

import MODELO.Conexion;
import VISTA.Panel_GestionVentas;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class CTRL_PanelVentas {
         private Panel_GestionVentas panel;
         private Conexion cone=new Conexion();
         
         public CTRL_PanelVentas(Panel_GestionVentas panel){
                  
                  this.panel=panel;
                  ListarVentas();
    
         }
         
         private void ListarVentas(){
                  panel.TBLventas.getTableHeader().setFont(new Font("Consolas", Font.PLAIN, 16));
                  panel.TBLventas.getTableHeader().setBorder(new EmptyBorder(1,1,1,1));
                  panel.TBLventas.getTableHeader().setForeground(Color.GREEN);
                  panel.TBLventas.getTableHeader().setBackground(new Color(6,6,6));
                  
                  DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                  centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
                  
                  PreparedStatement ps=null;
                  ResultSet rs=null;
                  Connection con=cone.getConnection();
                  try {
                           DefaultTableModel modelo=new DefaultTableModel(){
                           @Override
                                    public boolean isCellEditable(int row, int column) {
                                             if (column==6) {
                                                      return true;
                                             }else{
                                                      return false;
                                             }
                                    }
                           };   
                           panel.TBLventas.setModel(modelo);  
                           ps=con.prepareStatement("SELECT venta_id,venta_fecha,venta_hora,venta_viaje_id,venta_pasajeroPrincipal_dni,venta_num_asientos,venta_asientos,venta_ganancia FROM Ventas ");
                           rs=ps.executeQuery();
                           ResultSetMetaData rsMD=(ResultSetMetaData) rs.getMetaData();
                           int cantColumnas=rsMD.getColumnCount();
                           modelo.addColumn("ID");
                           modelo.addColumn("Fecha");
                           modelo.addColumn("Hora");
                           modelo.addColumn("Viaje");
                           modelo.addColumn("Pasajero");
                           modelo.addColumn("Cantidad");
                           modelo.addColumn("Asientos");
                           modelo.addColumn("Ganancia");
                           int espacios[]={40,80,80,80,120,80,170,90};
                           for (int j = 0; j < cantColumnas; j++) {
                                     panel.TBLventas
                                             .getColumnModel().getColumn(j).setPreferredWidth(espacios[j]);
                                     panel.TBLventas.getColumnModel().getColumn(j).setCellRenderer(centerRenderer);
                           }
                           while (rs.next()) {
                                     Object [] filas = new Object[cantColumnas];
                                     for (int i = 0; i < cantColumnas; i++) {
                                              filas[i]= rs.getObject(i+1);
                                     }
                                     modelo.addRow(filas);
                           }
                  } catch (SQLException e) {
                           System.err.println(e);
                  }finally{
                           try {
                                    con.close();
                           } catch (SQLException ex) {
                                    System.out.println(ex);
                           }
                  }
         }
         
         public Panel_GestionVentas  getPanel(){
                  return panel;
         }
    
}
