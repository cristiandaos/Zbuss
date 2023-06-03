
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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;


public class CTRL_PanelTerminales implements ActionListener,MouseListener{
         
         private  Panel_GestionTerminales panel;
         
         private TerminalesDAO terminalDAO=new TerminalesDAO();
         
         private Conexion cone=new Conexion();
         
         public CTRL_PanelTerminales(Panel_GestionTerminales panel){
                  this.panel=panel;
                  
                  this.panel.BTN_eliminar_terminal.addActionListener(this);
                  
                  this.panel.BTN_guardar_terminal.addActionListener(this);
                  
                  this.panel.BTN_nuevo_terminal.addActionListener(this);
                  
                  this.panel.TBLterminales.addMouseListener(this);
                  
                  ListarTerminales();
         }
         
         public Panel_GestionTerminales getPanel(){
                  return panel;
         }
         
         
        void Seleccionar(Terminales terminal){
                panel.TXT_nombre_Terminal.setText(terminal.getNombre());
                panel.TXT_direccion_Terminal.setText(terminal.getDireccion());
                panel.CB_estado_Terminal.setSelectedItem(terminal.getEstado());
        
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
                           
                           if (panel.TBLterminales.getSelectedRow()>-1) {
                                    int fila=panel.TBLterminales.getSelectedRow();
                                    int id=(int) panel.TBLterminales.getValueAt(fila,0);
                                    Terminales terminalModificada=terminalDAO.ObtenerDatos(id);
                                    terminalModificada.setNombre(panel.TXT_nombre_Terminal.getText());
                                    terminalModificada.setDireccion(panel.TXT_direccion_Terminal.getText());
                                    terminalModificada.setEstado(panel.CB_estado_Terminal.getSelectedItem().toString());
                                    terminalDAO.ModificarTerminal(terminalModificada, id);
                                    ReiniciarCampos();
                                    ListarTerminales();
                           }else{
                                    Terminales terminal=new Terminales(panel.TXT_nombre_Terminal.getText(), 
                                                                                                   panel.TXT_direccion_Terminal.getText(), 
                                                                                                   panel.CB_estado_Terminal.getSelectedItem().toString());
                                   if (terminal.ConAtributosVacios()) {
                                             Emergente msg=new Emergente(null, "Error en el registro de una Terminal","No debe dejar campos vacios");
                                             return;
                                    } 
                                    terminalDAO.RegistrarTerminal(terminal);
                                    ReiniciarCampos();
                                    ListarTerminales();
                           }

                  }
                  if (e.getSource()==panel.BTN_nuevo_terminal) {
                           ReiniciarCampos();
                           ListarTerminales();
                  }
                  
                  if (e.getSource()==panel.BTN_eliminar_terminal) {
                           int fila=panel.TBLterminales.getSelectedRow();
                           int id=(int) panel.TBLterminales.getValueAt(fila,0);
                           terminalDAO.EliminarTerminal(id);
                           ListarTerminales();
                  }
  
         }

    @Override
    public void mouseClicked(MouseEvent e) {
      
    }

    @Override
    public void mousePressed(MouseEvent e) {
                  if (e.getSource()==panel.TBLterminales) {
                           int fila=panel.TBLterminales.getSelectedRow();
                           int id=(int) panel.TBLterminales.getValueAt(fila,0);
                           Terminales terminal=terminalDAO.ObtenerDatos(id);
                          Seleccionar(terminal);
                  }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
                  if (e.getSource()==panel.TBLterminales) {
                           int fila=panel.TBLterminales.getSelectedRow();
                           int id=(int) panel.TBLterminales.getValueAt(fila,0);
                           Terminales terminal=terminalDAO.ObtenerDatos(id);
                          Seleccionar(terminal);
                  }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
      
    }

    @Override
    public void mouseExited(MouseEvent e) {
       
    }
}
