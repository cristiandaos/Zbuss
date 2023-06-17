
package CONTROLADOR;

import MODELO.Conexion;
import VISTA.Panel_GestionSocios;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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


public class CTRL_PanelSocios  implements ActionListener,MouseListener,KeyListener{
    
         private Panel_GestionSocios panel;
         
         private Conexion cone=new Conexion();
         
         public CTRL_PanelSocios(Panel_GestionSocios panel) {
                  
                  this.panel=panel;
                  
                  this.panel.TBLsocios.addMouseListener(this);
                  
                  this.panel.TXT_buscador.addKeyListener(this);
                  
                  ListarSocios();
         }
        
         
        public Panel_GestionSocios getPanel(){
                  return panel;
        }
         
         void ListarSocios(){
                  panel.TBLsocios.getTableHeader().setFont(new Font("Consolas", Font.PLAIN, 14));
                  panel.TBLsocios.getTableHeader().setBorder(new LineBorder(Color.WHITE,1));
                  panel.TBLsocios.getTableHeader().setForeground(Color.GREEN);
                  panel.TBLsocios.getTableHeader().setBackground(new Color(6,6,6));
                  
                  DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                  centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
                  
                  try {
                           DefaultTableModel modelo=new DefaultTableModel(){
                  @Override
                           public boolean isCellEditable(int row, int column) {
                                    if (column==8) {
                                             return true;
                                    }else{
                                             return false;
                                    }
                           }
                           }; 
                  String campo=panel.TXT_buscador.getText();
                  String WHERE="";
                  if (panel.CB_buscador.getSelectedItem()=="DNI") {
                           if (!"".equals(campo)) {
                                    WHERE="WHERE socio_dni LIKE '"+campo+"%'";
                           }
                  }
                  if (panel.CB_buscador.getSelectedItem()=="Nombre") {
                           if (!"".equals(campo)) {
                                    WHERE="WHERE socio_nombre LIKE '"+campo+"%'";
                           }
                  }
                  if (panel.CB_buscador.getSelectedItem()=="Correo") {
                           if (!"".equals(campo)) {
                                    WHERE="WHERE socio_correo LIKE '"+campo+"%'";
                           }
                  }
                  if (panel.CB_buscador.getSelectedItem()=="Número") {
                           if (!"".equals(campo)) {
                                    WHERE="WHERE socio_numero LIKE '"+campo+"%'";
                           }
                  }
                  panel.TBLsocios.setModel(modelo);  
                  PreparedStatement ps=null;
                  ResultSet rs=null;
                  Connection con=cone.getConnection();
                  ps=con.prepareStatement("SELECT socio_dni,socio_nombre,socio_apellido_paterno,socio_apellido_materno,socio_correo,socio_nacimiento,socio_numero,socio_contraseña,socio_puntos FROM Socios "+WHERE);
                  rs=ps.executeQuery();
                  ResultSetMetaData rsMD=(ResultSetMetaData) rs.getMetaData();
                  int cantColumnas=rsMD.getColumnCount();
                  modelo.addColumn("DNI");
                  modelo.addColumn("Nombre");
                  modelo.addColumn("A. Paterno");
                  modelo.addColumn("A. Materno");
                  modelo.addColumn("Correo Electrónico");
                  modelo.addColumn("Nacimiento");
                  modelo.addColumn("Número");
                  modelo.addColumn("Contraseña");
                  modelo.addColumn("Puntos");
                  int espacios[]={80,140,140,140,220,120,110,160,80};
                  for (int j = 0; j < cantColumnas; j++) {
                           panel.TBLsocios.getColumnModel().getColumn(j).setPreferredWidth(espacios[j]);
                           panel.TBLsocios.getColumnModel().getColumn(j).setCellRenderer(centerRenderer);
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
       
    }

    @Override
    public void mouseClicked(MouseEvent e) {
     
    }

    @Override
    public void mousePressed(MouseEvent e) {
      
    }

    @Override
    public void mouseReleased(MouseEvent e) {
      
    }

    @Override
    public void mouseEntered(MouseEvent e) {
      
    }

    @Override
    public void mouseExited(MouseEvent e) {
      
    }

    @Override
    public void keyTyped(KeyEvent e) {
       
    }

    @Override
    public void keyPressed(KeyEvent e) {
       
    }

         @Override
         public void keyReleased(KeyEvent e) {
                  if (e.getSource()==panel.TXT_buscador) {
                           ListarSocios();
                  }
         }
    
}
