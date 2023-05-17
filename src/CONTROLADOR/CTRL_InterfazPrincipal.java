
package CONTROLADOR;
import VISTA.*;
import UTILIDADES.*;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
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
import java.net.URL;
import java.util.ArrayList;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.plaf.ScrollBarUI;
import javax.swing.plaf.basic.BasicScrollBarUI;



public class CTRL_InterfazPrincipal implements ActionListener,MouseListener,MouseMotionListener,KeyListener,WindowListener{
    private Interfaz_Principal vistaPrincipal;
    private int cant=7;
    private int x;
    private int y;
    private ArrayList<PanelPersonalizado>ArrayPaneles;
    private ArrayList<JButton>ArrayBtns;
    private ArrayList<JLabel>ArrayHorarios;
    private ArrayList<JLabel>ArrayDestinos;
    private ArrayList<JLabel>ArrayImgs;
    private ArrayList<JLabel>ArrayAsientosDisp;
    private ArrayList<JLabel>ArrayAsientos;
    
    public CTRL_InterfazPrincipal(Interfaz_Principal vistaPrincipal){
        this.vistaPrincipal=vistaPrincipal;
        this.vistaPrincipal.addWindowListener(this);
        this.vistaPrincipal.BarraSuperior.addMouseMotionListener(this);
        this.vistaPrincipal.BarraSuperior.addMouseListener(this);
        this.vistaPrincipal.BTN_cerrarSesion.addActionListener(this);
        this.vistaPrincipal.BTN_cerrarSesion.addMouseListener(this);
        this.vistaPrincipal.BTN_volverBuses.addActionListener(this);
        this.vistaPrincipal.BTN_volverBuses.addMouseListener(this);
        this.vistaPrincipal.BTN_siguiente.addActionListener(this);
        this.vistaPrincipal.BTN_siguiente.addMouseListener(this);
        this.vistaPrincipal.BTN_volverAsientos.addActionListener(this);
        this.vistaPrincipal.BTN_volverAsientos.addMouseListener(this);
        this.vistaPrincipal.BTN_confirmarCompra.addActionListener(this);
        this.vistaPrincipal.BTN_confirmarCompra.addMouseListener(this);
        ArrayPaneles=new ArrayList<>();
        ArrayBtns=new ArrayList<>();
        ArrayDestinos=new ArrayList<>();
        ArrayAsientosDisp=new ArrayList<>();
        ArrayHorarios=new ArrayList<>();
        ArrayImgs=new ArrayList<>();
        
        ArrayAsientos=new ArrayList<>();
        
         GenerarPaneles(cant);
        
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
    
    void EstadoInicial(){
        Interfaz_Principal reinicio_Interfaz=new Interfaz_Principal();
        CTRL_InterfazPrincipal reinicio_CTRl =new CTRL_InterfazPrincipal(reinicio_Interfaz);
        reinicio_CTRl.Iniciar();
        Cerrar();
    }
    
    void Iniciar(){
            DiseñoScroll(new Color(43,255,0), new Color(18, 18, 18));
            PlaceHolder Nombre=new PlaceHolder("Nombre", vistaPrincipal.TxtNombrePasa, PlaceHolder.Show.ALWAYS);
            PlaceHolder ApePat=new PlaceHolder("Apellido Paterno", vistaPrincipal.TxtApellidoPatePasa, PlaceHolder.Show.ALWAYS);
            PlaceHolder ApeMat=new PlaceHolder("Apellido Materno", vistaPrincipal.TxtApellidoMatePasa, PlaceHolder.Show.ALWAYS);
            Reloj reloj=new Reloj();
            reloj.setBounds(25, 50, 130, 40);
            vistaPrincipal.BarraLateral.add(reloj);
            Shape redondeado=new RoundRectangle2D.Double(0,0,vistaPrincipal.getBounds().width,vistaPrincipal.getBounds().getHeight(),30,30);
            vistaPrincipal.setShape(redondeado);
            vistaPrincipal.revalidate();
            vistaPrincipal.setVisible(true);
    }
    
    void Cerrar(){
        vistaPrincipal.dispose();
    }
 
    void GenerarPaneles(int cant){
        vistaPrincipal.ScrollPaneBuses.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        int x=100;
        int y=120;
        int ancho=400;
        int alto=500;
        int incrementoX=500;
        int incrementoY=600;
        for (int i = 0; i < cant; i++) {
            PanelPersonalizado contenedor=new PanelPersonalizado();
            JLabel info=new JLabel();
            JLabel img=new JLabel();
            JLabel  horario=new JLabel();
            JLabel destino=new JLabel();
            JLabel  asientosDispo=new JLabel();
            JButton btn=new JButton();
            
            contenedor.setRoundTopRight(40);
            contenedor.setRoundTopLeft(40);
            contenedor.setRoundBottomLeft(10);
            contenedor.setRoundBottomRight(10);
            contenedor.setBounds(x, y, ancho, alto);
            contenedor.setColorInicial(new Color(18, 18, 18));
            contenedor.setColorFinal(Color.BLACK);
            contenedor.setLayout(null);
            ArrayPaneles.add(contenedor);
            
            img.setBounds(20, 20, 360, 250);
            img.setBorder(new LineBorder(Color.WHITE,2,true));
            ArrayImgs.add(img);
            contenedor.add(img);
            
            info.setBounds(0, 280, 400, 30);
            info.setFont(new Font("Consolas",Font.BOLD,16));
            info.setText("Terminal de Salida/Llegada ");
            info.setHorizontalAlignment(SwingConstants.CENTER);
            info.setForeground(Color.WHITE);
            contenedor.add(info);
            
            destino.setBounds(0, 320, 400, 30);
            destino.setText(" Destino: ");
            destino.setForeground(Color.WHITE);
            destino.setFont(new Font("Consolas",Font.PLAIN,16));
            ArrayDestinos.add(destino);
            contenedor.add(destino);
            
            horario.setBounds(0, 360, 400, 30);
            horario.setText(" Horario: ");
            horario.setForeground(Color.WHITE);
            horario.setFont(new Font("Consolas",Font.PLAIN,16));
            ArrayHorarios.add(horario);
            contenedor.add(horario);
            
            asientosDispo.setBounds(0, 400, 250, 30);
            asientosDispo.setText(" Asientos Disponibles: ");
            asientosDispo.setForeground(Color.WHITE);
            asientosDispo.setFont(new Font("consolas",Font.PLAIN,16));
            asientosDispo.setBorder(new MatteBorder(0,0,2,0,new Color(123,216,80)));
            ArrayAsientosDisp.add(asientosDispo);
            contenedor.add(asientosDispo);
            
            btn.setBounds(5, 450, 400, 50);
            btn.setFocusable(false);
            btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
            btn.setText("Seleccionar");
            btn.setFont(new Font("Consolas",Font.PLAIN,18));
            btn.setBorder(new EmptyBorder(0,0,0,0));
            btn.setForeground(Color.WHITE);
            btn.setBackground(new Color(18,18,18));
            ArrayBtns.add(btn);
            contenedor.add(btn);
            
            vistaPrincipal.PanelBuses.add(contenedor);
            x+=incrementoX;
            if(x>vistaPrincipal.PanelBuses.getWidth()-contenedor.getWidth()){
                x=100;
                y+=incrementoY;
            }
            
            if (y>vistaPrincipal.PanelBuses.getHeight()-contenedor.getHeight()) {
                  vistaPrincipal.PanelBuses.setPreferredSize(new Dimension((int) vistaPrincipal.PanelBuses.getPreferredSize().getWidth(),ArrayPaneles.get(i).getY()+alto+80));
                  vistaPrincipal.ScrollPaneBuses.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
            }
        }   
    }
    
    private int CargarPaneles(){
        return CargarPaneles() ;
    }
    
    
    void MoverDerecha(final int posInicial, final int posFinal,final int delay, final int incremento,final JComponent componente){
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
            } .start();
        }
    }
    
    void MoverIzquierda(final int posInicial, final int posFinal,final int delay, final int incremento,final JComponent componente){
        if(componente.getX()==posInicial){   
            new Thread(){
         @Override
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
            } .start();
        }
    }
    
    //Mover a utilidades
    void DiseñoScroll(Color Barra,Color Pista){
         ScrollBarUI customScrollBarUI = new BasicScrollBarUI() {
         @Override
                    protected void configureScrollBarColors() {
                        // Establecer el color de la barra de desplazamiento
                        this.thumbColor =Barra;
                        // Establecer el color de la pista
                        this.trackColor = Pista;
                   }
         @Override
                    protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
                        g.setColor(Barra);
                        g.fillRoundRect(thumbBounds.x, thumbBounds.y, thumbBounds.width, thumbBounds.height, 25, 25);
                    } 
                    
                  private JButton BtnScroll() {
                        JButton btn = new JButton();
                        btn.setPreferredSize(new Dimension(0, 0));
                        btn.setMinimumSize(new Dimension(0, 0));
                        btn.setMaximumSize(new Dimension(0, 0));
                        return btn;
                }  
         @Override
                    protected JButton createDecreaseButton(int orientation) {
                        return BtnScroll();
                    }

        @Override
                    protected JButton createIncreaseButton(int orientation) {
                        return BtnScroll();
                    }
            }; 
        vistaPrincipal.ScrollPaneBuses.getVerticalScrollBar().setUI(customScrollBarUI);
        vistaPrincipal.ScrollPaneBuses.getVerticalScrollBar().setCursor(new Cursor(Cursor.HAND_CURSOR));
        vistaPrincipal.ScrollPaneBuses.getVerticalScrollBar().setUnitIncrement(15);
        }
        
    
   void generarAsientos(){
       int x=15;
       int y=80;
       int incremento;
       for (int i = 1; i <=40; i++) {
                JLabel asiento=new JLabel();
                URL urlAsientoDisp = getClass().getResource("/IMGS/asientoDisp.png");
                ImageIcon asientoDisp=new ImageIcon(urlAsientoDisp);
                asiento.setIcon(asientoDisp);
                asiento.setBounds(x,y,32,32);
                asiento.setName("Disponible");
            
                asiento.setCursor(new Cursor(Cursor.HAND_CURSOR));
                ArrayAsientos.add(asiento);
                vistaPrincipal.Buss.add(asiento);
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

        if (e.getSource()==vistaPrincipal.BTN_cerrarSesion) {
            Login login=new Login();
            CTRL_Login ctrlLogin=new CTRL_Login(login);
            ctrlLogin.Iniciar();
            Cerrar();
        }
        
        for (JButton btns : ArrayBtns) {
            if (e.getSource()==btns) {
                    MoverIzquierda(180, -920, 2, 20, vistaPrincipal.ScrollPaneBuses);
                    MoverIzquierda(1280, 180, 2, 20, vistaPrincipal.PanelAsientos);
                    MoverIzquierda(2560, 1280, 2, 20,vistaPrincipal.PanelPasajeros);
            }
        }
        
        if (e.getSource()==vistaPrincipal.BTN_volverBuses) {
                    MoverDerecha(-920, 180, 2, 20, vistaPrincipal.ScrollPaneBuses);
                    MoverDerecha(180, 1280, 2, 20, vistaPrincipal.PanelAsientos);
                    MoverDerecha(1280, 2560, 2, 20, vistaPrincipal.PanelPasajeros);
        }
        
        if (e.getSource()==vistaPrincipal.BTN_siguiente) {
                    MoverIzquierda(180, -920, 2, 20, vistaPrincipal.PanelAsientos);
                    MoverIzquierda(1280, 180, 2, 20, vistaPrincipal.PanelPasajeros);
                    MoverIzquierda(-920, -2020, 2, 20, vistaPrincipal.ScrollPaneBuses);
         }
        
        if (e.getSource()==vistaPrincipal.BTN_volverAsientos) {
                    MoverDerecha(-920, 180, 2, 20, vistaPrincipal.PanelAsientos);
                    MoverDerecha(180, 1280, 2, 20, vistaPrincipal.PanelPasajeros);
                    MoverDerecha(-2020, -920, 2, 20, vistaPrincipal.ScrollPaneBuses);
         }
        
        if (e.getSource()==vistaPrincipal.BTN_confirmarCompra) {
                    EstadoInicial();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
     
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource()==vistaPrincipal.BarraSuperior) {
            x=e.getX();
            y=e.getY(); 
        }
        for (JLabel asientos : ArrayAsientos) {
                URL urlAsientoDisp = getClass().getResource("/IMGS/asientoDisp.png");
                ImageIcon asientoDisp=new ImageIcon(urlAsientoDisp);
                URL urlAsientoSele = getClass().getResource("/IMGS/asientoSele.png");
                ImageIcon asientoSele=new ImageIcon(urlAsientoSele);
                if (e.getSource()==asientos ) {
                    if (asientos.getName().equals("Disponible")) {
                            asientos.setIcon(asientoSele);
                            asientos.setName("Seleccionado");
                    }else if (asientos.getName().equals("Seleccionado")) {
                            asientos.setIcon(asientoDisp);
                            asientos.setName("Disponible");
                    }
                            
                }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
        if (e.getSource()==vistaPrincipal.BTN_cerrarSesion) {
            vistaPrincipal.BTN_cerrarSesion.setBackground(new Color(21,24, 30));

        }
        
        for (JButton btns : ArrayBtns) {
            if (e.getSource()==btns) {
                    btns.setBackground(new Color(21,24, 30));
                    btns.setFont(new Font("Consolas",Font.BOLD,18));
                    btns.setBorder(new MatteBorder(0,0,5,0,new Color(123,216,80)));
            }
        }
            
         if (e.getSource()==vistaPrincipal.BTN_volverBuses) {
                    vistaPrincipal.BTN_volverBuses.setBackground(Color.RED);
                    vistaPrincipal.BTN_volverBuses.setForeground(Color.WHITE);
         }
            
         if (e.getSource()==vistaPrincipal.BTN_siguiente) {
                    vistaPrincipal.BTN_siguiente.setBackground(Color.RED);
                    vistaPrincipal.BTN_siguiente.setForeground(Color.WHITE);
         }
         
         if (e.getSource()==vistaPrincipal.BTN_volverAsientos) {
                vistaPrincipal.BTN_volverAsientos.setBackground(Color.RED);
                vistaPrincipal.BTN_volverAsientos.setForeground(Color.WHITE);
          }
            
        }
    

    @Override
    public void mouseExited(MouseEvent e) {
        
        if (e.getSource()==vistaPrincipal.BTN_cerrarSesion) {
            vistaPrincipal.BTN_cerrarSesion.setBackground(new Color(18,18,18));
        }
        
        for (JButton btns : ArrayBtns) {
            if (e.getSource()==btns) {
                  btns.setBackground(new Color(18,18, 18));
                  btns.setFont(new Font("Consolas",Font.PLAIN,18));
                  btns.setBorder(new EmptyBorder(0, 0, 0, 0));
            }
        }
        
         if (e.getSource()==vistaPrincipal.BTN_volverBuses) {
                    vistaPrincipal.BTN_volverBuses.setBackground(new Color(204, 204, 204));
                    vistaPrincipal.BTN_volverBuses.setForeground(Color.BLACK);
         }
         
         if (e.getSource()==vistaPrincipal.BTN_siguiente) {
                    vistaPrincipal.BTN_siguiente.setBackground(new Color(204, 204, 204));
                    vistaPrincipal.BTN_siguiente.setForeground(Color.BLACK);
         }
         
         if (e.getSource()==vistaPrincipal.BTN_volverAsientos) {
                    vistaPrincipal.BTN_volverAsientos.setBackground(new Color(204, 204, 204));
                    vistaPrincipal.BTN_volverAsientos.setForeground(Color.BLACK);
            }
         
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (e.getSource()==vistaPrincipal.BarraSuperior) {
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
