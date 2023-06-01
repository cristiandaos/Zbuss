
package CONTROLADOR;
import MODELO.Conexion;
import MODELO.Terminales;
import MODELO.TerminalesDAO;
import MODELO.Viajes;
import MODELO.ViajesDAO;
import UTILIDADES.Emergente;
import VISTA.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JScrollBar;
import javax.swing.Timer;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

public class CTRL_InterfazAdministrador implements ActionListener,MouseListener,MouseMotionListener,WindowListener,KeyListener{
         private Interfaz_Administrador vista;
         private int x;
         private int y;
         private byte [] binario;
         private File archivo;
         private ViajesDAO viajeDAO=new ViajesDAO();
         private TerminalesDAO terminalDAO=new TerminalesDAO();
         private Conexion cone=new Conexion();
         
         public CTRL_InterfazAdministrador(Interfaz_Administrador vista) {
                  this.vista=vista;
                  this.vista.addWindowListener(this);
                  
                  this.vista.BarraSuperior.addMouseListener(this);
                  this.vista.BarraSuperior.addMouseMotionListener(this);
                  
                  this.vista.BTN_cerrarSesion.addActionListener(this);
                  this.vista.BTN_cerrarSesion.addMouseListener(this);
                  
                  this.vista.BTN_img_referencial.addActionListener(this);
                  
                  this.vista.BTN_guardar_viajes.addActionListener(this);
                  
                  this.vista.BTN_guardar_Terminales.addActionListener(this);
                  
                  this.vista.BTN_eliminar_viajes.addActionListener(this);
                  
                  this.vista.BTN_nuevo_viajes.addActionListener(this);

                  this.vista.BTN_gestionViajes.addMouseListener(this);

                  this.vista.BTN_gestionAdmins.addMouseListener(this);

                  this.vista.BTN_gestionTerminales.addMouseListener(this);

                  this.vista.BTN_infoSocios.addMouseListener(this);
                  
                  DiseñadoTabla();
                  InicializarReloj();
                  
                  vista.BTN_cerrarSesion.putClientProperty("JButton.buttonType", "roundRect");
                  
                  Shape redondeado=new RoundRectangle2D.Double(0,0,this.vista.getBounds().width,this.vista.getBounds().getHeight(),30,30);
                  this.vista.setShape(redondeado);      
         }
         
         
          private void CodigosTerminales(){
                  try {     
                           PreparedStatement ps=null;
                           ResultSet rs=null;
                           Connection con= cone.getConnection();
                           ps=con.prepareStatement("SELECT terminal_id FROM Terminales WHERE terminal_estado='Habilitado'");
                           rs=ps.executeQuery();
                           while (rs.next()) {
                                   vista.CBviaje_terminal_salida.addItem(String.valueOf(rs.getInt("terminal_id")));
                                   vista.CBviaje_terminal_llegada.addItem(String.valueOf(rs.getInt("terminal_id")));
                           }
                  } catch (SQLException e) {
                           System.err.println(e.toString());
                  }    
    
    }
         
         void DiseñadoTabla(){
                  vista.TBLviajes.getTableHeader().setBackground(new Color(10, 10, 10));
                  vista.TBLviajes.getTableHeader().setForeground(Color.WHITE);
                  vista.TBLviajes.getTableHeader().setBorder(new LineBorder(Color.GREEN));
         }
         
         
         void AbrirFileChooser() {
                  JFileChooser FC = new JFileChooser();
                  FC.setFileSelectionMode(JFileChooser.FILES_ONLY);
                  FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de imagen", "jpg", "jpeg", "png");
                  FC.setFileFilter(filtro);
                  int sele = FC.showOpenDialog(null);
                  if (sele == JFileChooser.APPROVE_OPTION) {
                           archivo = FC.getSelectedFile();
                           try {
                                    binario = Files.readAllBytes(archivo.toPath());
                                    ImageIcon imagen = new ImageIcon(binario);
                                    vista.LBL_img_referencial.setIcon(imagen);
                           } catch (IOException ex) {
                           }
                  }
         }
      
         
         void SliderScroll(JScrollBar scrollBar,int delay, int ValorDestino,int auxiliar) {
                  Timer Temporizador = new Timer(delay, new ActionListener() {
                  int incremento = (ValorDestino - scrollBar.getValue()) / auxiliar;
                  int valor = scrollBar.getValue();

                  @Override
                           public void actionPerformed(ActionEvent e) {
                                    if (valor != ValorDestino) {
                                             valor += incremento;
                                             if ((incremento > 0 && valor > ValorDestino) || (incremento < 0 && valor < ValorDestino)) {
                                                       valor = ValorDestino;
                                             }
                                             scrollBar.setValue(valor);
                                    } else {
                                             ((Timer) e.getSource()).stop();
                                    }
                            }
                  }
                  );
                  Temporizador.start();
         } 
    

         void Iniciar(){
                  vista.setVisible(true);
         }
         
         
         void Cerrar(){
                  vista.dispose();
         }
         
         
         void InicializarReloj(){
                  java.util.Date horaActual=new java.util.Date();
                  java.util.Date fechaActual=new java.util.Date();

                  SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
                  SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

                  String horaActualTexto = formatoHora.format(horaActual);
                  String FechaActualTexto=formatoFecha.format(fechaActual);

                  vista.LBLhora.setText(horaActualTexto);
                  vista.LBLfecha.setText(FechaActualTexto);
                  Timer timer = new Timer(1000, new ActionListener() {
                  @Override
                           public void actionPerformed(ActionEvent e) {

                                    java.util.Date horaActual=new java.util.Date();
                                    java.util.Date fechaActual=new java.util.Date();

                                    SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
                                    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

                                    String horaActualTexto = formatoHora.format(horaActual);
                                    String FechaActualTexto=formatoFecha.format(fechaActual);

                                    vista.LBLhora.setText(horaActualTexto);
                                    vista.LBLfecha.setText(FechaActualTexto);
                           }
                  });
                  timer.start();
         }

         
    @Override
    public void actionPerformed(ActionEvent e) {
        
                  if (e.getSource()==vista.BTN_cerrarSesion) {
                           Login login=new Login();
                           CTRL_Login ctrlLogin=new CTRL_Login(login);
                           Cerrar();
                           ctrlLogin.Iniciar();
                  }  
                  
                  if (e.getSource()==vista.BTN_img_referencial) {
                           AbrirFileChooser();
                 }
                  
                  if (e.getSource()==vista.BTN_guardar_viajes) {
                           Viajes viaje=new Viajes( vista.CBviaje_terminal_salida.getSelectedItem().toString(),
                                                                    vista.CBviaje_terminal_llegada.getSelectedItem().toString(), 
                                                                    vista.SPNviaje_fecha_salida.toString(), vista.SPNviaje_fecha_llegada.getValue().toString(), 
                                                                    vista.TXTviaje_distancia.getText(), 
                                                                    40, 
                                                                    (double) vista.SPNviaje_precio.getValue(), 
                                                                    binario);
                           if(viaje.ConAtributosVacios()){
                                    Emergente msg=new Emergente(null, "Error en el registro del Viaje", "No debe dejar campos vacios");
                                    
                           }else{
                                    viajeDAO.RegistrarViaje(viaje);
                                    Emergente msg=new Emergente(null,"Registro exitoso","Nuevo Viaje Programado");
                           }
            
                  }
                  if (e.getSource()==vista.BTN_guardar_Terminales) {
                           Terminales terminales=new Terminales(vista.TXTnombreTerminal.getText(), 
                                                                                              vista.TXTdireccionTerminal.getText(), 
                                                                                              vista.CBestadoTerminal.getSelectedItem().toString());
                           
                           if (terminales.ConAtributosVacios()) {
                                    Emergente msg=new Emergente(null, "Error en el registro de la terminal", "No debe dejar campos vacios ");
                           }else{
                                    terminalDAO.RegistrarTerminal(terminales);
                                    Emergente msg=new Emergente(null, "Registro Exitoso", "Nueva terminal agregada");
                                    CodigosTerminales();
                           }
            
                  }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
                 
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
                  if (e.getSource()==vista.BarraSuperior) {
                           x=e.getX();
                           y=e.getY();
                  }
        
                  if (e.getSource()==vista.BTN_gestionViajes) {
                           SliderScroll(vista.Scroll.getVerticalScrollBar(), 10, 0, 5);
                  }
                  
                  if (e.getSource()==vista.BTN_gestionTerminales) {
                           SliderScroll(vista.Scroll.getVerticalScrollBar(), 10, 670, 5);
                  }
                  
                  if (e.getSource()==vista.BTN_gestionAdmins) {
                           SliderScroll(vista.Scroll.getVerticalScrollBar(), 10, 1340, 5);
                  }
                  
                  if (e.getSource()==vista.BTN_infoSocios) {
                           SliderScroll(vista.Scroll.getVerticalScrollBar(), 10, 2010, 5);
                  }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
                  if (e.getSource()==vista.BTN_cerrarSesion) {
                           vista.BTN_cerrarSesion.setBackground(new Color(21,24, 30));
                           vista.BTN_cerrarSesion.setFont(new  Font("Consolas",Font.BOLD,16));
                           vista.BTN_cerrarSesion.setBorder(new MatteBorder(2,2,2,2,Color.GREEN));

                  }
                  
                  if (e.getSource()==vista.BTN_gestionViajes) {
                           vista.BTN_gestionViajes.setBackground(new Color(21,24, 30));
                           vista.BTN_gestionViajes.setFont(new Font("Segoe UI Emoji",Font.BOLD,16)); 
                  }
                  
                  if (e.getSource()==vista.BTN_gestionTerminales) {
                           vista.BTN_gestionTerminales.setBackground(new Color(21,24, 30));
                           vista.BTN_gestionTerminales.setFont(new Font("Segoe UI Emoji",Font.BOLD,16)); 
                  }
                  
                  if (e.getSource()==vista.BTN_gestionAdmins) {
                           vista.BTN_gestionAdmins.setBackground(new Color(21,24, 30));
                           vista.BTN_gestionAdmins.setFont(new Font("Segoe UI Emoji",Font.BOLD,16)); 
                  }
                  
                  if (e.getSource()==vista.BTN_infoSocios) {
                           vista.BTN_infoSocios.setBackground(new Color(21,24, 30));
                           vista.BTN_infoSocios.setFont(new Font("Segoe UI Emoji",Font.BOLD,16)); 
                  }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
                  if (e.getSource()==vista.BTN_cerrarSesion) {
                           vista.BTN_cerrarSesion.setBackground(Color.BLACK);
                           vista.BTN_cerrarSesion.setFont(new  Font("Consolas",Font.PLAIN,16));
                           vista.BTN_cerrarSesion.setBorder(new MatteBorder(1,1,1,1,new Color(123,216,80)));
                  }
                  
                  if (e.getSource()==vista.BTN_gestionViajes) {
                           vista.BTN_gestionViajes.setBackground(Color.BLACK);
                           vista.BTN_gestionViajes.setFont(new Font("Segoe UI Emoji",Font.PLAIN,16)); 
                  }
                  
                  if (e.getSource()==vista.BTN_gestionTerminales) {
                           vista.BTN_gestionTerminales.setBackground(Color.BLACK);
                           vista.BTN_gestionTerminales.setFont(new Font("Segoe UI Emoji",Font.PLAIN,16)); 
                  }
                  
                   if (e.getSource()==vista.BTN_gestionAdmins) {
                           vista.BTN_gestionAdmins.setBackground(Color.BLACK);
                           vista.BTN_gestionAdmins.setFont(new Font("Segoe UI Emoji",Font.PLAIN,16)); 
                  }
                  
                  if (e.getSource()==vista.BTN_infoSocios) {
                           vista.BTN_infoSocios.setBackground(Color.BLACK);
                           vista.BTN_infoSocios.setFont(new Font("Segoe UI Emoji",Font.PLAIN,16)); 
                  }
    }
    
    @Override
    public void mouseDragged(MouseEvent e) {
                  
                  if (e.getSource()==vista.BarraSuperior) {
                           int mouseX=e.getXOnScreen();
                           int mouseY=e.getYOnScreen();
                           vista.setLocation(mouseX-x,mouseY-y);
                  }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
    }

    @Override
    public void windowOpened(WindowEvent e) {
                  if (e.getSource()==vista) {
                           for (double  i = 0.0; i <= 1; i=i+0.1) {
                                    float f=(float) i;
                                    vista.setOpacity(f);
                                    try {
                                             Thread.sleep(20);
                                    } catch (InterruptedException ex) {
                                    }
                           }   
                  }      
    }

    @Override
    public void windowClosing(WindowEvent e) {
      
    }

    @Override
    public void windowClosed(WindowEvent e) {
       
    }

    @Override
    public void windowIconified(WindowEvent e) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
       
    }

    @Override
    public void windowActivated(WindowEvent e) {
       
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
       
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
       
    }
    
    
}
