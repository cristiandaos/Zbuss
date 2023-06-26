
package CONTROLADOR;

import MODELO.Conexion;
import MODELO.Terminales;
import DAO.TerminalesDAO;
import UTILIDADES.Emergente;
import UTILIDADES.PlaceHolder;
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
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
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
                  
                  PlaceHolder Nombre=new PlaceHolder("Nombre", this.panel.TXT_nombre_Terminal, PlaceHolder.Visibilidad.ALWAYS);
                  
                  PlaceHolder Direccion=new PlaceHolder("Dirección de la Terminal", this.panel.TXT_direccion_Terminal, PlaceHolder.Visibilidad.ALWAYS);
                  
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
                           panel.TBLterminales.setModel(modelo);  
                           ps=con.prepareStatement("SELECT terminal_id,terminal_nombre,terminal_dirección,terminal_estado FROM Terminales ");
                           rs=ps.executeQuery();
                           ResultSetMetaData rsMD=(ResultSetMetaData) rs.getMetaData();
                           int cantColumnas=rsMD.getColumnCount();
                           modelo.addColumn("ID");
                           modelo.addColumn("Nombre");
                           modelo.addColumn("Dirección");
                           modelo.addColumn("Estado"); 
                           int espacios[]={40,160,320,90};
                           for (int j = 0; j < cantColumnas; j++) {
                                     panel.TBLterminales.getColumnModel().getColumn(j).setPreferredWidth(espacios[j]);
                                     panel.TBLterminales.getColumnModel().getColumn(j).setCellRenderer(centerRenderer);
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
                                    
                                    if (terminalModificada.ConAtributosVacios()) {
                                             Emergente msg=new Emergente(null, "Error", "Hay campos vacios en la modificación de la terminal ", Emergente.Tipo.MessageDialog);
                                             return;
                                    }
                                    
                                    terminalDAO.Modificar(terminalModificada, id);
                                    ReiniciarCampos();
                                    ListarTerminales();
                                    
                                     Emergente msg=new Emergente(null, "Modificación","Terminal modificada correctamente",Emergente.Tipo.MessageDialog);
                           }else{
                               
                                    Terminales terminal=new Terminales(panel.TXT_nombre_Terminal.getText(), 
                                                                                                   panel.TXT_direccion_Terminal.getText(), 
                                                                                                   panel.CB_estado_Terminal.getSelectedItem().toString());
                                   if (terminal.ConAtributosVacios()) {
                                             Emergente msg=new Emergente(null, "Error ","Hay campos vacios en el registro de una Terminal",Emergente.Tipo.MessageDialog);
                                             return;
                                    } 
                                   
                                    terminalDAO.Registrar(terminal);
                                    ReiniciarCampos();
                                    ListarTerminales();
                                    
                                    Emergente msg=new Emergente(null, "Registro","Terminal registrada correctamente",Emergente.Tipo.MessageDialog);
                           }

                  }
                  if (e.getSource()==panel.BTN_nuevo_terminal) {
                           ReiniciarCampos();
                           ListarTerminales();
                  }
                  
                  if (e.getSource()==panel.BTN_eliminar_terminal) {
                           int fila=panel.TBLterminales.getSelectedRow();
                           
                           if (fila<0) {
                                    Emergente msg=new Emergente(null, "Error","No hay ninguna terminal seleccionada",Emergente.Tipo.MessageDialog);
                                    return;
                           }
                           
                           int id=(int) panel.TBLterminales.getValueAt(fila,0);
                           terminalDAO.Eliminar(id);
                           ReiniciarCampos();
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
