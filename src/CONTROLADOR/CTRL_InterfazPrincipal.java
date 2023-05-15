
package CONTROLADOR;
import VISTA.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.geom.RoundRectangle2D;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JToggleButton;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;



public class CTRL_InterfazPrincipal implements ActionListener,MouseListener,MouseMotionListener,KeyListener,WindowListener{
    private Interfaz_Principal vistaPrincipal;
    private Panel_Asientos panelAsientos;
    private int x;
    private int y;
    private ArrayList<JPanel>ArrayPaneles;
    private ArrayList<JButton>ArrayBtns;
    private ArrayList<JLabel>ArrayHorarios;
    private ArrayList<JLabel>ArrayDestinos;
    private ArrayList<JLabel>ArrayImgs;
    private ArrayList<JLabel>ArrayAsientosDisp;
    private ArrayList<JLabel>ArrayAsientos;
    
    public CTRL_InterfazPrincipal(Interfaz_Principal vistaPrincipal,Panel_Asientos panelAsientos){
        this.vistaPrincipal=vistaPrincipal;
        this.panelAsientos=panelAsientos;
        this.vistaPrincipal.addWindowListener(this);
        this.vistaPrincipal.Barra.addMouseMotionListener(this);
        this.vistaPrincipal.Barra.addMouseListener(this);
        this.vistaPrincipal.BTN_cerrarSesion.addActionListener(this);
        this.vistaPrincipal.BTN_cerrarSesion.addMouseListener(this);
        this.vistaPrincipal.BTN_cerrar.addActionListener(this);
        this.vistaPrincipal.BTN_cerrar.addMouseListener(this);
        
        this.panelAsientos.BTN_cancelar.addActionListener(this);
        this.panelAsientos.BTN_cancelar.addMouseListener(this);
        
        ArrayPaneles=new ArrayList<>();
        ArrayBtns=new ArrayList<>();
        ArrayDestinos=new ArrayList<>();
        ArrayAsientosDisp=new ArrayList<>();
        ArrayHorarios=new ArrayList<>();
        ArrayImgs=new ArrayList<>();
        
        ArrayAsientos=new ArrayList<>();
        
        GenerarPaneles(5);
        
        generarAsientos();
        
        for (JButton btns : ArrayBtns) {
            btns.addActionListener(this);
            btns.addMouseListener(this);
        }
        for (JLabel asientos : ArrayAsientos) {
            asientos.addMouseListener(this);
        }
        
    } 
    
    public Interfaz_Principal getVista(){
        return vistaPrincipal;
    }
    
    void Iniciar(){
         Shape redondeado=new RoundRectangle2D.Double(0,0,vistaPrincipal.getBounds().width,vistaPrincipal.getBounds().getHeight(),30,30);
         vistaPrincipal.setShape(redondeado);
         vistaPrincipal.revalidate();
         vistaPrincipal.setVisible(true);
         vistaPrincipal.BTN_cerrarSesion.setBackground(new Color(18, 18, 18));
    }
    
    void Cerrar(){
        vistaPrincipal.dispose();
    }
    
    void GenerarPaneles(int cant){
        vistaPrincipal.ScrollBuses.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        int x=140;
        int y=100;
        int ancho=300;
        int alto=400;
        int incremento=500;
        for (int i = 0; i < cant; i++) {
            JPanel contenido=new JPanel();
            JLabel img=new JLabel();
            JLabel  horario=new JLabel();
            JLabel destino=new JLabel();
            JLabel  asientosDispo=new JLabel();
            JButton btn=new JButton();
            
            contenido.setBounds(x,y,ancho,alto);
            contenido.setBackground(new Color(18,18,18));
            contenido.setLayout(null);
            ArrayPaneles.add(contenido);
            
            img.setBounds(20, 20, 260, 200);
            img.setBorder(new LineBorder(Color.WHITE,1,true));
            ArrayImgs.add(img);
            contenido.add(img);
            
            destino.setBounds(20, 230, 120, 30);
            destino.setText("Destino: ");
            destino.setForeground(Color.WHITE);
            destino.setFont(new Font("Consolas",Font.PLAIN,14));
            ArrayDestinos.add(destino);
            contenido.add(destino);
            
            horario.setBounds(20, 270, 120, 30);
            horario.setText("Horario: ");
            horario.setForeground(Color.WHITE);
            horario.setFont(new Font("Consolas",Font.PLAIN,14));
            ArrayHorarios.add(horario);
            contenido.add(horario);
            
            asientosDispo.setBounds(20, 310, 120, 30);
            asientosDispo.setText("Disponibles: ");
            asientosDispo.setForeground(Color.WHITE);
            asientosDispo.setFont(new Font("Consolas",Font.PLAIN,14));
            ArrayAsientosDisp.add(asientosDispo);
            contenido.add(asientosDispo);
            
            btn.setBounds(20, 360,130 , 30);
            btn.setFocusable(false);
            btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
            btn.setText("Seleccionar");
            btn.setFont(new Font("Consolas",Font.PLAIN,14));
            btn.setBorder(new EmptyBorder(0,0,0,0));
            btn.setForeground(Color.WHITE);
            btn.setBackground(new Color(18,18,18));
            ArrayBtns.add(btn);
            contenido.add(btn);
            
            vistaPrincipal.PanelBuses.add(contenido);
            x+=incremento;
            if(x>vistaPrincipal.PanelBuses.getWidth()-contenido.getWidth()){
                x=140;
                y+=incremento;
            }
            
            if (y>vistaPrincipal.PanelBuses.getHeight()-contenido.getHeight()) {
                  vistaPrincipal.PanelBuses.setPreferredSize(new Dimension((int) vistaPrincipal.PanelBuses.getPreferredSize().getWidth(),ArrayPaneles.get(i).getY()+alto+100));
                  vistaPrincipal.ScrollBuses.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
            }
        }   
    }
    
    void CargarPaneles(){
        
    }
    
    
    
    void mostrarPanel(JPanel panelDinamico,JPanel panel,int ancho, int alto ){
        panel.setSize(ancho,alto);
        panel.setLocation(0, 0);
        panelDinamico.removeAll();
        panelDinamico.add(panel,BorderLayout.CENTER);
        panelDinamico.revalidate();
        panelDinamico.repaint();
   }
    
    void mostrarPanel(JPanel panelDinamico,JScrollPane panel,int ancho, int alto ){
        panel.setSize(ancho,alto);
        panel.setLocation(0, 0);
        panelDinamico.removeAll();
        panelDinamico.add(panel,BorderLayout.CENTER);
        panelDinamico.revalidate();
        panelDinamico.repaint();
    }
   
    void Derecha(final int posInicial, final int posFinal,final int delay, final int incremento,final JComponent componente){
        if(componente.getX()==posInicial){
            new Thread(){
                public void run(){
                    while (componente.getX()<posFinal) {              
                        for (int i = posInicial; i<=posFinal; i+=incremento) {
                            try {
                                Thread.sleep(delay);
                                componente.setLocation(i, componente.getY());
                            } catch (InterruptedException e) {
                                System.out.println("Error: Interrupcion "+e);
                            }  
                        }
                    }
                    componente.setLocation(posFinal, componente.getY());
                }
            }
            .start();
        }
    }
    
    void Izquierda(final int posInicial, final int posFinal,final int delay, final int incremento,final JComponent componente){
        if(componente.getX()==posInicial){   
            new Thread(){
                public void run(){
                    while (componente.getX()>posFinal) {              
                        for (int i = posInicial; i>=posFinal; i-=incremento) {
                            try {
                                Thread.sleep(delay);
                                componente.setLocation(i, componente.getY());
                            } catch (InterruptedException e) {
                                System.out.println("Error: Interrupcion "+e);
                            }  
                        }
                    }
                    componente.setLocation(posFinal,componente.getY());
                }
            }
            .start();
        }
    }
    
   void generarAsientos(){
      enum Estado {SELECCIONADO,DISPONIBLE,OCUPADO}
       int x=15;
       int y=80;
       int incremento;
       for (int i = 1; i <=40; i++) {
                JLabel asiento=new JLabel();
                URL urlAsientoDisp = getClass().getResource("/IMGS/asientoDisp.png");
                ImageIcon asientoDisp=new ImageIcon(urlAsientoDisp);
                URL urlAsientoOcup = getClass().getResource("/IMGS/asientoOcup.png");
                ImageIcon asientoOcup=new ImageIcon(urlAsientoOcup);
                URL urlAsientoSele = getClass().getResource("/IMGS/asientoSele.png");
                ImageIcon asientoSele=new ImageIcon(urlAsientoSele);
                asiento.setIcon(asientoDisp);
                asiento.setBounds(x,y,32,32);
            

            asiento.setCursor(new Cursor(Cursor.HAND_CURSOR));
            ArrayAsientos.add(asiento);
            panelAsientos.Buss.add(asiento);
            if (i%2==0) {
                incremento=120;
                x+=incremento;
           }else{
                incremento=60;
                x+=incremento;
            }
            if (i%4==0) {
                    x=15;
                    y+=50;
           }
       }

   }
   
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==vistaPrincipal.BTN_cerrar) {
            Cerrar();
        }

        if (e.getSource()==vistaPrincipal.BTN_cerrarSesion) {
            Login login=new Login();
            CTRL_Login ctrlLogin=new CTRL_Login(login);
            ctrlLogin.Iniciar();
            Cerrar();
        }
        
        for (JButton btns : ArrayBtns) {
            if (e.getSource()==btns) {
                 
                  mostrarPanel(vistaPrincipal.PanelDinamico, panelAsientos, vistaPrincipal.PanelDinamico.getWidth(), vistaPrincipal.PanelDinamico.getHeight());
            }
        }
        
        if (e.getSource()==panelAsientos.BTN_cancelar) {
            mostrarPanel(vistaPrincipal.PanelDinamico, vistaPrincipal.ScrollBuses, vistaPrincipal.PanelDinamico.getWidth(), vistaPrincipal.PanelDinamico.getHeight()); mostrarPanel(vistaPrincipal.PanelDinamico, vistaPrincipal.ScrollBuses, vistaPrincipal.PanelDinamico.getWidth(), vistaPrincipal.PanelDinamico.getHeight());
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource()==vistaPrincipal.Barra) {
            x=e.getX();
            y=e.getY(); 
        }
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource()==vistaPrincipal.BTN_cerrar) {
            vistaPrincipal.BTN_cerrar.setBackground(Color.red);
        }
        
        if (e.getSource()==vistaPrincipal.BTN_cerrarSesion) {
            vistaPrincipal.BTN_cerrarSesion.setBackground(new Color(21,24, 30));
            vistaPrincipal.BTN_cerrarSesion.setFont(new Font("Consolas",Font.BOLD,16));
        }
        
        for (JButton btns : ArrayBtns) {
            if (e.getSource()==btns) {
                  btns.setBackground(new Color(21,24, 30));
                  btns.setFont(new Font("Consolas",Font.BOLD,14));
                  btns.setBorder(new MatteBorder(0,0,2,0,new Color(123,216,80)));
            }
            
            if (e.getSource()==panelAsientos.BTN_cancelar) {
                  panelAsientos.BTN_cancelar.setBackground(Color.RED);
                  panelAsientos.BTN_cancelar.setForeground(Color.WHITE);
                  panelAsientos.BTN_cancelar.setFont(new Font("Consolas",Font.BOLD,18));
            }
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource()==vistaPrincipal.BTN_cerrar) {
            vistaPrincipal.BTN_cerrar.setBackground(new Color(18,18,18));
        }
        
        if (e.getSource()==vistaPrincipal.BTN_cerrarSesion) {
            vistaPrincipal.BTN_cerrarSesion.setBackground(new Color(18,18,18));
            vistaPrincipal.BTN_cerrarSesion.setFont(new Font("Consolas",Font.PLAIN,16));
        }
        
        for (JButton btns : ArrayBtns) {
            if (e.getSource()==btns) {
                  btns.setBackground(new Color(18,18, 18));
                  btns.setFont(new Font("Consolas",Font.PLAIN,14));
                  btns.setBorder(new EmptyBorder(0, 0, 0, 0));
            }
        }
        
         if (e.getSource()==panelAsientos.BTN_cancelar) {
                  panelAsientos.BTN_cancelar.setBackground(Color.WHITE);
                  panelAsientos.BTN_cancelar.setForeground(Color.BLACK);
                  panelAsientos.BTN_cancelar.setFont(new Font("Consolas",Font.PLAIN,18));
         }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (e.getSource()==vistaPrincipal.Barra) {
            int MouseX=e.getXOnScreen();
            int MouseY=e.getYOnScreen();
            vistaPrincipal.setLocation(MouseX-x,MouseY-y);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
       
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

    @Override
    public void windowOpened(WindowEvent e) {
         if (e.getSource()==vistaPrincipal) {
                  for (double  i = 0.0; i <= 1; i=i+0.1) {
                            float f=(float) i;
                            vistaPrincipal.setOpacity(f);
                  try {
                           Thread.sleep(25);
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
