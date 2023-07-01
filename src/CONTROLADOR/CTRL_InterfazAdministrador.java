
package CONTROLADOR;
import MODELO.Administrador;
import VISTA.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

public class CTRL_InterfazAdministrador implements ActionListener,MouseListener,MouseMotionListener,WindowListener{
         private Interfaz_Administrador vista;
         private Administrador admin;
         private int x;
         private int y;
         ArrayList<JToggleButton> botones=new  ArrayList<>();
         
         public CTRL_InterfazAdministrador(Interfaz_Administrador vista) {
                  this.vista=vista;
                  this.vista.addWindowListener(this);
                  
                  this.vista.BarraSuperior.addMouseListener(this);
                  this.vista.BarraSuperior.addMouseMotionListener(this);
                  
                  this.vista.BTN_cerrarSesion.addActionListener(this);
                  this.vista.BTN_cerrarSesion.addMouseListener(this);
                  
                  this.vista.BTN_gestionarViajes.addActionListener(this);
                  
                  this.vista.BTN_gestionarAdministradores.addActionListener(this);
                  
                  this.vista.BTN_gestionarTerminales.addActionListener(this);
                  
                  this.vista.BTN_gestionarSocios.addActionListener(this);
                  
                  this.vista.BTN_gestionarVentas.addActionListener(this);
                  
                  this.vista.BTN_gestionarViajes.addMouseListener(this);
                  
                  this.vista.BTN_gestionarAdministradores.addMouseListener(this);
                  
                  this.vista.BTN_gestionarTerminales.addMouseListener(this);
                  
                  this.vista.BTN_gestionarSocios.addMouseListener(this);
                  
                  this.vista.BTN_gestionarVentas.addMouseListener(this);
                  
                  InicializarReloj();
                  this.vista.BTN_gestionarViajes.setSelected(true);
                  
                  botones.add(this.vista.BTN_gestionarAdministradores);
                  botones.add(this.vista.BTN_gestionarViajes);
                  botones.add(this.vista.BTN_gestionarTerminales);
                  botones.add(this.vista.BTN_gestionarVentas);
                  botones.add(this.vista.BTN_gestionarSocios);
                  
                  Panel_GestionViajes panel=new Panel_GestionViajes();
                  CTRL_PanelViajes ctrlViajes=new CTRL_PanelViajes(panel);
                  mostrarPanel(vista.PanelDinamico,ctrlViajes.getPanel());
                  ReiniciarBTNS();
         }
         
  

         void Iniciar(Administrador admin){
                  this.admin=admin;
                  vista.LBLadministrador.setText(this.admin.getNombre());
                  vista.setVisible(true);
         }
         
         
         void Cerrar(){
                  vista.dispose();
         }
         
         void ReiniciarBTNS(){
                  for (JToggleButton boton : botones) {
                           if (boton.isSelected()) {
                                    for (JToggleButton botones : botones) {
                                             botones.setBackground(Color.BLACK);
                                             botones.setFont(new Font("Segoe UI Emoji",Font.PLAIN,16));
                                             botones.setBorder(new EmptyBorder(0,0,0,0));
                                             boton.setFont(new Font("Segoe UI Emoji",Font.BOLD,16));
                                    }
                           }  
                  }
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
                           Login_Registro login=new Login_Registro();
                           CTRL_Login ctrlLogin=new CTRL_Login(login);
                           Cerrar();
                           ctrlLogin.Iniciar();
                  }
                  
                  if (e.getSource()==vista.BTN_gestionarViajes ) {
                            Panel_GestionViajes panel=new Panel_GestionViajes();
                            CTRL_PanelViajes ctrlViajes=new CTRL_PanelViajes(panel);
                            mostrarPanel(vista.PanelDinamico,ctrlViajes.getPanel());
                            ReiniciarBTNS();
                  }
                  
                  if (e.getSource()==vista.BTN_gestionarTerminales) {
                           Panel_GestionTerminales panel=new Panel_GestionTerminales();
                           CTRL_PanelTerminales ctrlTerminales=new CTRL_PanelTerminales(panel);
                           mostrarPanel(vista.PanelDinamico, ctrlTerminales.getPanel());
                           ReiniciarBTNS();
                  }
                  
                  if (e.getSource()==vista.BTN_gestionarAdministradores) {
                           Panel_GestionAdministradores panel=new Panel_GestionAdministradores();
                           CTRL_PanelAdministradores ctrlAdministradores=new CTRL_PanelAdministradores(panel);
                           mostrarPanel(vista.PanelDinamico, ctrlAdministradores.getPanel());
                           ReiniciarBTNS();
                  }
                  
                  if (e.getSource()==vista.BTN_gestionarSocios ) {
                           Panel_GestionSocios panel=new Panel_GestionSocios();
                           CTRL_PanelSocios ctrlSocios=new CTRL_PanelSocios(panel);
                           mostrarPanel(vista.PanelDinamico, ctrlSocios.getPanel());
                           ReiniciarBTNS();
                  }
                  
                  if (e.getSource()==vista.BTN_gestionarVentas) {
                           Panel_GestionVentas panel=new Panel_GestionVentas();
                           CTRL_PanelVentas ctrlVentas=new CTRL_PanelVentas(panel);
                           mostrarPanel(vista.PanelDinamico, ctrlVentas.getPanel());
                           ReiniciarBTNS();
            
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
                  
                  if (e.getSource()==vista.BTN_gestionarViajes  &&  !vista.BTN_gestionarViajes.isSelected()) {
                           vista.BTN_gestionarViajes.setBackground(new Color(21,24, 30));
                           vista.BTN_gestionarViajes.setFont(new Font("Segoe UI Emoji",Font.BOLD,16)); 
                  }
                  
                  if (e.getSource()==vista.BTN_gestionarTerminales &&  !vista.BTN_gestionarTerminales.isSelected()) {
                           vista.BTN_gestionarTerminales.setBackground(new Color(21,24, 30));
                           vista.BTN_gestionarTerminales.setFont(new Font("Segoe UI Emoji",Font.BOLD,16)); 
                  }
                  
                  if (e.getSource()==vista.BTN_gestionarAdministradores  &&  !vista.BTN_gestionarAdministradores.isSelected()) {
                           vista.BTN_gestionarAdministradores.setBackground(new Color(21,24, 30));
                           vista.BTN_gestionarAdministradores.setFont(new Font("Segoe UI Emoji",Font.BOLD,16)); 
                  }
                  
                  if (e.getSource()==vista.BTN_gestionarSocios &&  !vista.BTN_gestionarSocios.isSelected() ) {
                           vista.BTN_gestionarSocios.setBackground(new Color(21,24, 30));
                           vista.BTN_gestionarSocios.setFont(new Font("Segoe UI Emoji",Font.BOLD,16)); 
                  }
                  
                  if (e.getSource()==vista.BTN_gestionarVentas  &&  !vista.BTN_gestionarVentas.isSelected()) {
                           vista.BTN_gestionarVentas.setBackground(new Color(21,24, 30));
                           vista.BTN_gestionarVentas.setFont(new Font("Segoe UI Emoji",Font.BOLD,16)); 
                  }
                  
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
                  if (e.getSource()==vista.BTN_cerrarSesion) {
                           vista.BTN_cerrarSesion.setBackground(Color.BLACK);
                           vista.BTN_cerrarSesion.setFont(new  Font("Consolas",Font.PLAIN,16));
                           vista.BTN_cerrarSesion.setBorder(new MatteBorder(1,1,1,1,new Color(123,216,80)));
                  }
                  
                  if (e.getSource()==vista.BTN_gestionarViajes  &&  !vista.BTN_gestionarViajes.isSelected()) {
                           vista.BTN_gestionarViajes.setBackground(Color.BLACK);
                           vista.BTN_gestionarViajes.setFont(new Font("Segoe UI Emoji",Font.PLAIN,16)); 
                  }
                  
                  if (e.getSource()==vista.BTN_gestionarTerminales &&  !vista.BTN_gestionarTerminales.isSelected()) {
                           vista.BTN_gestionarTerminales.setBackground(Color.BLACK);
                           vista.BTN_gestionarTerminales.setFont(new Font("Segoe UI Emoji",Font.PLAIN,16)); 
                  }
                  
                   if (e.getSource()==vista.BTN_gestionarAdministradores &&  !vista.BTN_gestionarAdministradores.isSelected()) {
                           vista.BTN_gestionarAdministradores.setBackground(Color.BLACK);
                           vista.BTN_gestionarAdministradores.setFont(new Font("Segoe UI Emoji",Font.PLAIN,16)); 
                  }
                  
                  if (e.getSource()==vista.BTN_gestionarSocios &&  !vista.BTN_gestionarSocios.isSelected()) {
                           vista.BTN_gestionarSocios.setBackground(Color.BLACK);
                           vista.BTN_gestionarSocios.setFont(new Font("Segoe UI Emoji",Font.PLAIN,16)); 
                  }
                  
                  if (e.getSource()==vista.BTN_gestionarVentas &&  !vista.BTN_gestionarVentas.isSelected()) {
                           vista.BTN_gestionarVentas.setBackground(Color.BLACK);
                           vista.BTN_gestionarVentas.setFont(new Font("Segoe UI Emoji",Font.PLAIN,16)); 
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

    

