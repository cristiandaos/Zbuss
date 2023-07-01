
package CONTROLADOR;

import DAO.AdministradoresDAO;
import MODELO.*;
import UTILIDADES.Emergente;
import UTILIDADES.PlaceHolder;
import VISTA.Panel_GestionAdministradores;
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
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class CTRL_PanelAdministradores implements ActionListener,MouseListener{
    
         private Panel_GestionAdministradores panel;
         private Conexion cone=new Conexion();
         private AdministradoresDAO adminDAO=new AdministradoresDAO();
         
         public CTRL_PanelAdministradores(Panel_GestionAdministradores panel){
                  this.panel=panel;
                  
                  this.panel.BTN_eliminar_admin.addActionListener(this);
                  
                  this.panel.BTN_guardar_admin.addActionListener(this);
                  
                  this.panel.BTN_nuevo_admin.addActionListener(this);
                  
                  this.panel.TBLadministradores.addMouseListener(this);
                  
                  PlaceHolder nombre=new PlaceHolder("Nombre",this.panel.TXT_nombre_admin, PlaceHolder.Visibilidad.ALWAYS);
                  PlaceHolder apellidoPat=new PlaceHolder("Apellido Paterno",this.panel.TXT_apePat_admin, PlaceHolder.Visibilidad.ALWAYS);
                  PlaceHolder apellidoMat=new PlaceHolder("Apellido Materno",this.panel.TXT_apeMat_admin, PlaceHolder.Visibilidad.ALWAYS);
                  PlaceHolder correo=new PlaceHolder("Correo Electrónico",this.panel.TXT_correo_admin, PlaceHolder.Visibilidad.ALWAYS);
                  PlaceHolder contraseña=new PlaceHolder("Contraseña",this.panel.TXT_contraseña_admin, PlaceHolder.Visibilidad.ALWAYS);

                  ListarAdministradores();
                  
   
         }
         
         public Panel_GestionAdministradores getPanel(){
                  return panel;
         }
         
         void ReiniciarCampos(){
                  panel.TXT_dni_admin.setEnabled(true);
                  panel.TXT_dni_admin.requestFocus();
                  panel.TXT_dni_admin.setText(null);
                  panel.TXT_nombre_admin.setText(null);
                  panel.TXT_apePat_admin.setText(null);
                  panel.TXT_apeMat_admin.setText(null);
                  panel.TXT_correo_admin.setText(null);
                  panel.TXT_contraseña_admin.setText(null);
         
         }
         
         void ListarAdministradores(){
                  panel.TBLadministradores.getTableHeader().setFont(new Font("Consolas", Font.PLAIN, 14));
                  panel.TBLadministradores.getTableHeader().setBorder(new EmptyBorder(1,1,1,1));
                  panel.TBLadministradores.getTableHeader().setForeground(Color.GREEN);
                  panel.TBLadministradores.getTableHeader().setBackground(new Color(6,6,6));
                  
                  DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                  centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
                  
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
                  panel.TBLadministradores.setModel(modelo);  
                  PreparedStatement ps=null;
                  ResultSet rs=null;
                  Connection con=cone.getConnection();
                  ps=con.prepareStatement("SELECT admin_dni,admin_nombre,admin_apellido_paterno,admin_apellido_materno,admin_correo,admin_contraseña FROM Administradores ");
                  rs=ps.executeQuery();
                  ResultSetMetaData rsMD=(ResultSetMetaData) rs.getMetaData();
                  int cantColumnas=rsMD.getColumnCount();
                  modelo.addColumn("DNI");
                  modelo.addColumn("Nombre");
                  modelo.addColumn("A. Paterno");
                  modelo.addColumn("A. Materno");
                  modelo.addColumn("Correo Electrónico");
                  modelo.addColumn("Contraseña");
                  int espacios[]={80,140,140,140,220,180};
                  for (int j = 0; j < cantColumnas; j++) {
                           panel.TBLadministradores.getColumnModel().getColumn(j).setPreferredWidth(espacios[j]);
                           panel.TBLadministradores.getColumnModel().getColumn(j).setCellRenderer(centerRenderer);
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
         
         void  Seleccionar(Administrador admin){
                  panel.TXT_dni_admin.setText(admin.getDni());
                  panel.TXT_dni_admin.setEnabled(false);
                  panel.TXT_nombre_admin.setText(admin.getNombre());
                  panel.TXT_apePat_admin.setText(admin.getApellidoPaterno());
                  panel.TXT_apeMat_admin.setText(admin.getApellidoMaterno());
                  panel.TXT_correo_admin.setText(admin.getCorreo());
                  panel.TXT_contraseña_admin.setText(admin.getContraseña());
         }

        @Override
        public void actionPerformed(ActionEvent e) {
                  if (e.getSource()==panel.BTN_nuevo_admin) {
                           ReiniciarCampos();
                           ListarAdministradores();
                  }
                  
                  if (e.getSource()==panel.BTN_guardar_admin) {
                      
                           if (panel.TBLadministradores.getSelectedRow()>-1) {
                                    int fila=panel.TBLadministradores.getSelectedRow();
                                    String dni = (String) panel.TBLadministradores.getValueAt(fila,0);
                                    Administrador adminModificado=adminDAO.ObtenerDatos(dni);
                                    
                                    adminModificado.setDni(panel.TXT_nombre_admin.getText());
                                    adminModificado.setNombre(panel.TXT_nombre_admin.getText());
                                    adminModificado.setApellidoPaterno(panel.TXT_apePat_admin.getText());
                                    adminModificado.setApellidoMaterno(panel.TXT_apeMat_admin.getText());
                                    adminModificado.setCorreo(panel.TXT_correo_admin.getText());
                                    adminModificado.setContraseña(panel.TXT_contraseña_admin.getText());
                                    
                                    if (adminModificado.ConAtributosVacios()) {
                                             Emergente msg=new Emergente(null, "Error", "Hay campos vacios en la modificación de un administrador", Emergente.Tipo.MessageDialog);
                                             msg.MostrarMSG();
                                             return;
                                    }
                                    if (!adminModificado.CorreoValido()) {
                                             Emergente msg=new Emergente(null, "Error", "El administrador debe tener un correo válido", Emergente.Tipo.MessageDialog);
                                             msg.MostrarMSG();
                                             return;
                                    }
                                    if (adminDAO.Modificar(adminModificado)) {
                                            ReiniciarCampos();
                                            ListarAdministradores();
                                            Emergente msg=new Emergente(null, "Modificación","Administrador modificado correctamente", Emergente.Tipo.MessageDialog);
                                            msg.MostrarMSG();
                                    }
                                    
                           }else{
                                    Administrador admin=new Administrador(panel.TXT_dni_admin.getText(),
                                                                                                            panel.TXT_nombre_admin.getText(), 
                                                                                                            panel.TXT_apePat_admin.getText(),
                                                                                                            panel.TXT_apePat_admin.getText(), 
                                                                                                            panel.TXT_correo_admin.getText(), 
                                                                                                            panel.TXT_contraseña_admin.getText());
                                    if (admin.ConAtributosVacios()) {
                                             Emergente msg=new Emergente(null, "Error", "Hay campos vacios en el registro de un administrador", Emergente.Tipo.MessageDialog);
                                             msg.MostrarMSG();
                                             return;
                                    }
                                    if (!admin.dniValido()) {
                                             Emergente msg=new Emergente(null, "Error", "El administrador debe tener un dni válido", Emergente.Tipo.MessageDialog);
                                             msg.MostrarMSG();
                                             return;
                                    }
                                    if (!admin.CorreoValido()) {
                                             Emergente msg=new Emergente(null, "Error", "El administrador debe tener un dni válido", Emergente.Tipo.MessageDialog);
                                             msg.MostrarMSG();
                                             return;
                                    }
                                    if (adminDAO.registrar(admin)) {
                                             ReiniciarCampos();
                                             ListarAdministradores();
                                             Emergente msg=new Emergente(null, "Registro","Administrador registrado correctamente", Emergente.Tipo.MessageDialog);
                                             msg.MostrarMSG();
                                    }
                           }
                  }
                  
                  if (e.getSource()==panel.BTN_eliminar_admin) {
                           int fila=panel.TBLadministradores.getSelectedRow();
                           
                           if (fila<0) {
                                    Emergente msg=new Emergente(null, "Error","No hay ningún administrador seleccionado",Emergente.Tipo.MessageDialog);
                                    msg.MostrarMSG();
                                    return;
                           }
                           
                           String dni = (String) panel.TBLadministradores.getValueAt(fila,0);
                           if (adminDAO.Eliminar(dni)) {
                                    ReiniciarCampos();
                                    ListarAdministradores();
                                    Emergente msg=new Emergente(null, "Eliminación","Administrador elimininado correctamente", Emergente.Tipo.MessageDialog);
                                    msg.MostrarMSG();
                           }

                  }
        }

        @Override
         public void mouseClicked(MouseEvent e) {

         }

        @Override
         public void mousePressed(MouseEvent e) { 
                  if (e.getSource()==panel.TBLadministradores) {
                           int fila=panel.TBLadministradores.getSelectedRow();
                           String dni = (String) panel.TBLadministradores.getValueAt(fila,0);
                           Administrador admin= adminDAO.ObtenerDatos(dni);
                           Seleccionar(admin);
                  }
         }

        @Override
         public void mouseReleased(MouseEvent e) { 
                  if (e.getSource()==panel.TBLadministradores) {
                           int fila=panel.TBLadministradores.getSelectedRow();
                           String dni = (String) panel.TBLadministradores.getValueAt(fila,0);
                           Administrador admin= adminDAO.ObtenerDatos(dni);
                           Seleccionar(admin);
                  }
         }

        @Override
         public void mouseEntered(MouseEvent e) {

         }

        @Override
         public void mouseExited(MouseEvent e) {

         }
         
}
