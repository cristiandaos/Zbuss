
package CONTROLADOR;
import MODELO.Administrador;
import MODELO.Conexion;
import MODELO.Terminales;
import UTILIDADES.Emergente;
import VISTA.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.geom.RoundRectangle2D;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.MatteBorder;

public class CTRL_InterfazAdministrador implements ActionListener,MouseListener,MouseMotionListener,WindowListener{
         private Interfaz_Administrador vista;
         private Administrador admin;
         private int x;
         private int y;
         private Conexion cone=new Conexion();
         
         public CTRL_InterfazAdministrador(Interfaz_Administrador vista) {
                  this.vista=vista;
                  this.vista.addWindowListener(this);
                  
                  this.vista.BarraSuperior.addMouseListener(this);
                  this.vista.BarraSuperior.addMouseMotionListener(this);
                  
                  this.vista.BTN_cerrarSesion.addActionListener(this);
                  this.vista.BTN_cerrarSesion.addMouseListener(this);

                  this.vista.BTN_gestionViajes.addMouseListener(this);

                  this.vista.BTN_gestionAdmins.addMouseListener(this);

                  this.vista.BTN_gestionTerminales.addMouseListener(this);

                  this.vista.BTN_infoSocios.addMouseListener(this);
                  
                  InicializarReloj();

                  Panel_GestionViajes panel=new Panel_GestionViajes();
                  CTRL_PanelViajes ctrlViajes=new CTRL_PanelViajes(panel);
                  mostrarPanel(vista.PanelDinamico,ctrlViajes.getPanel());
         }
         
  

         void Iniciar(Administrador admin){
                  this.admin=admin;
                  vista.LBLadministrador.setText(this.admin.getNombre());
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
  
         public void mostrarPanel(JPanel panelDinamico,JPanel panel ){
                   panel.setSize(panelDinamico.getSize());
                   panel.setLocation(0, 0);
                   panelDinamico.removeAll();
                   panelDinamico.add(panel,BorderLayout.CENTER);
                   panelDinamico.revalidate();
                   panelDinamico.repaint();
         }
         
    @Override
    public void actionPerformed(ActionEvent e) {
        
                  if (e.getSource()==vista.BTN_cerrarSesion) {
                           Login login=new Login();
                           CTRL_Login ctrlLogin=new CTRL_Login(login);
                           Cerrar();
                           ctrlLogin.Iniciar();
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
                            Panel_GestionViajes panel=new Panel_GestionViajes();
                            CTRL_PanelViajes ctrlViajes=new CTRL_PanelViajes(panel);
                            mostrarPanel(vista.PanelDinamico,ctrlViajes.getPanel());
                  }
                  
                  if (e.getSource()==vista.BTN_gestionTerminales) {
                           Panel_GestionTerminales panel=new Panel_GestionTerminales();
                           CTRL_PanelTerminales ctrlTerminales=new CTRL_PanelTerminales(panel);
                           mostrarPanel(vista.PanelDinamico, ctrlTerminales.getPanel());
                  }
                  
                  if (e.getSource()==vista.BTN_gestionAdmins) {
                           Panel_GestionAdministradores panel=new Panel_GestionAdministradores();
                           CTRL_PanelAdministradores ctrlAdministradores=new CTRL_PanelAdministradores(panel);
                           mostrarPanel(vista.PanelDinamico, ctrlAdministradores.getPanel());
                  }
                  
                  if (e.getSource()==vista.BTN_infoSocios) {
                           Panel_GestionSocios panel=new Panel_GestionSocios();
                           CTRL_PanelSocios ctrlSocios=new CTRL_PanelSocios(panel);
                           mostrarPanel(vista.PanelDinamico, ctrlSocios.getPanel());

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
       
    }

    

