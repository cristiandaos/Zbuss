
package CONTROLADOR;
import MODELO.*;
import VISTA.*;
import UTILIDADES.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.plaf.metal.MetalBorders;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;

public class CTRL_InterfazAdministrador implements ActionListener,MouseListener,MouseMotionListener,WindowListener,KeyListener{
         private Interfaz_Administrador vista;
         private int x;
         private int y;
         
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
                  DiseñoTabla();
                  InicializarReloj();

         
         }
         
         
         void DiseñoTabla(){
   
                 JTableHeader header=vista.TBLviajes.getTableHeader();
                 DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer(){
                   @Override
                   public void paintComponent(Graphics g) {
                           super.paintComponent(g);
                           g.setColor(Color.BLACK);
                           g.drawRect(0, 0, getWidth() - 1, getHeight() - 1); 
                  }
                 
                 
                 };
                 headerRenderer.setBackground(new Color(10,10,10));
                 headerRenderer.setForeground(Color.WHITE);
                 headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
                 header.setDefaultRenderer(headerRenderer);
                  vista.TBLviajes.setBorder(new LineBorder(Color.BLACK));
                  vista.TBLviajes.setBackground(Color.BLACK);
                  vista.TBLviajes.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                
         }
         
         void SliderScroll(JScrollBar scrollBar,int delay, int moverValor,int auxiliar) {
                  Timer Temporizador = new Timer(delay, new ActionListener() {
                  int incremento = (moverValor - scrollBar.getValue()) / auxiliar;
                  int valor = scrollBar.getValue();

                  @Override
                           public void actionPerformed(ActionEvent e) {
                                    if (valor != moverValor) {
                                             valor += incremento;
                                             if ((incremento > 0 && valor > moverValor) || (incremento < 0 && valor < moverValor)) {
                                                       valor = moverValor;
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
