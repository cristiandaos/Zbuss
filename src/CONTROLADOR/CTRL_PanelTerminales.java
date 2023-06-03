
package CONTROLADOR;

import MODELO.Conexion;
import MODELO.Terminales;
import MODELO.TerminalesDAO;
import UTILIDADES.Emergente;
import VISTA.Panel_GestionTerminales;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;


public class CTRL_PanelTerminales implements ActionListener{
         
         private  Panel_GestionTerminales panel;
         
         private TerminalesDAO terminalDAO=new TerminalesDAO();
         
         private Conexion cone=new Conexion();
         
         public CTRL_PanelTerminales(Panel_GestionTerminales panel){
                  this.panel=panel;
                  
                  this.panel.BTN_eliminar_terminal.addActionListener(this);
                  
                  this.panel.BTN_guardar_terminal.addActionListener(this);
                  
                  this.panel.BTN_nuevo_terminal.addActionListener(this);
                  
                  ListarTerminales();
         }
         
         public Panel_GestionTerminales getPanel(){
                  return panel;
         }
         
         void ReiniciarCampos(){
                  panel.TXT_nombre_Terminal.setText(null);
                  panel.TXT_direccion_Terminal.setText(null);
                  panel.CB_estado_Terminal.setSelectedIndex(0);
             
         }
         
         private void ListarTerminales(){
                  panel.TBLterminales.getTableHeader().setFont(new Font("Consolas", Font.PLAIN, 16));
                  panel.TBLterminales.getTableHeader().setBorder(new LineBorder(Color.WHITE,1));
                  panel.TBLterminales.getTableHeader().setForeground(Color.GREEN);
                  panel.TBLterminales.getTableHeader().setBackground(new Color(6,6,6));
                  
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
                  panel.TBLterminales.setModel(modelo);  
                  PreparedStatement ps=null;
                  ResultSet rs=null;
                  Connection con=cone.getConnection();
                  ps=con.prepareStatement("SELECT terminal_id,terminal_nombre,terminal_dirección,terminal_estado FROM Terminales ");
                  rs=ps.executeQuery();
                  ResultSetMetaData rsMD=(ResultSetMetaData) rs.getMetaData();
                  int cantColumnas=rsMD.getColumnCount();
                  modelo.addColumn("ID");
                  modelo.addColumn("Nombre");
                  modelo.addColumn("Dirección");
                  modelo.addColumn("Estado"); 
                  int espacios[]={40,160,250,100};
                  for (int j = 0; j < cantColumnas; j++) {
                           panel.TBLterminales.getColumnModel().getColumn(j).setPreferredWidth(espacios[j]);
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
                  }
    } 
        
         
    @Override
         public void actionPerformed(ActionEvent e) {
                  if (e.getSource()==panel.BTN_guardar_terminal) {
                          Terminales terminal=new Terminales(panel.TXT_nombre_Terminal.getText(), 
                                                                                          panel.TXT_direccion_Terminal.getText(), 
                                                                                          panel.CB_estado_Terminal.getSelectedItem().toString());
                          
                          if (terminal.ConAtributosVacios()) {
                                    Emergente msg=new Emergente(null, "Error en el registro de una Terminal","No debe dejar campos vacios");
                                    return;
                           }
                           
                           terminalDAO.RegistrarTerminal(terminal);
                           ReiniciarCampos();
                  }
                  if (e.getSource()==panel.BTN_nuevo_terminal) {
                           ReiniciarCampos();
                  }
  
         }
}
