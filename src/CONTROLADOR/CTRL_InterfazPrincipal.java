
package CONTROLADOR;
import VISTA.*;
import UTILIDADES.*;
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
    private int cant=7;
    private int x;
    private int y;
    private ArrayList<JPanel>ArrayPaneles;
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
        this.vistaPrincipal.BTN_cerrar.addActionListener(this);
        this.vistaPrincipal.BTN_cerrar.addMouseListener(this);
        this.vistaPrincipal.BTN_volverBuses.addActionListener(this);
        this.vistaPrincipal.BTN_volverBuses.addMouseListener(this);
        this.vistaPrincipal.BTN_siguiente.addActionListener(this);
        this.vistaPrincipal.BTN_siguiente.addMouseListener(this);
        this.vistaPrincipal.BTN_volverAsientos.addActionListener(this);
        this.vistaPrincipal.BTN_volverAsientos.addMouseListener(this);
        this.vistaPrincipal.BTN_confirmarCompra.addActionListener(this);
        this.vistaPrincipal.BTN_confirmarCompra.addMouseListener(this);
        
        PlaceHolder Nombre=new PlaceHolder("Nombre", vistaPrincipal.TxtNombrePasa, PlaceHolder.Show.ALWAYS);
        PlaceHolder ApePat=new PlaceHolder("Apellido Paterno", vistaPrincipal.TxtApellidoPatePasa, PlaceHolder.Show.ALWAYS);
        PlaceHolder ApeMat=new PlaceHolder("Apellido Materno", vistaPrincipal.TxtApellidoMatePasa, PlaceHolder.Show.ALWAYS);
        
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
    
    void Iniciar(){
        Shape redondeado=new RoundRectangle2D.Double(0,0,vistaPrincipal.getBounds().width,vistaPrincipal.getBounds().getHeight(),30,30);
        vistaPrincipal.setShape(redondeado);
        vistaPrincipal.revalidate();
         vistaPrincipal.setVisible(true);
         vistaPrincipal.setResizable(false);
         vistaPrincipal.BTN_cerrarSesion.setBackground(new Color(18, 18, 18));
    }
    
    void Cerrar(){
        vistaPrincipal.dispose();
    }
    
    void GenerarPaneles(int cant){
        vistaPrincipal.ScrollPaneBuses.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        int x=140;
        int y=140;
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
                  vistaPrincipal.ScrollPaneBuses.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
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
            }
            .start();
        }
        componente.revalidate();
        componente.repaint();
    }
    
    void MoverIzquierda(final int posInicial, final int posFinal,final int delay, final int incremento,final JComponent componente){
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
        componente.revalidate();
        componente.repaint();
    }
    
    void MoverAbajo(final int posInicial, final int posFinal,final int delay, final int incremento,final JComponent componente){
        if(componente.getY()==posInicial){   
            new Thread(){
                public void run(){
                    while (componente.getY()>posFinal) {              
                        for (int i = posInicial; i>=posFinal; i-=incremento) {
                            try {
                                Thread.sleep(delay);
                                componente.setLocation(i, componente.getX());
                            } catch (InterruptedException e) {
                                System.out.println("Error: Interrupcion "+e);
                            }  
                        }
                    }
                    componente.setLocation(posFinal,componente.getX());
                }
            }
            .start();
        }
    }
    
    void MoverArriba(final int posInicial, final int posFinal,final int delay, final int incremento,final JComponent componente){
        if(componente.getY()==posInicial){   
            new Thread(){
                public void run(){
                    while (componente.getY()>posFinal) {              
                        for (int i = posInicial; i>=posFinal; i-=incremento) {
                            try {
                                Thread.sleep(delay);
                                componente.setLocation(i, componente.getX());
                            } catch (InterruptedException e) {
                                System.out.println("Error: Interrupcion "+e);
                            }  
                        }
                    }
                    componente.setLocation(posFinal,componente.getX());
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

             
        }
        
        for (JButton btns : ArrayBtns) {
            if (e.getSource()==btns) {
                  btns.setBackground(new Color(21,24, 30));
                  btns.setFont(new Font("Consolas",Font.BOLD,14));
                  btns.setBorder(new MatteBorder(0,0,2,0,new Color(123,216,80)));
            }
            
            if (e.getSource()==vistaPrincipal.BTN_volverBuses) {
                 vistaPrincipal.BTN_volverBuses.setBackground(Color.RED);
                  vistaPrincipal.BTN_volverBuses.setForeground(Color.WHITE);
            }
            
            if (e.getSource()==vistaPrincipal.BTN_siguiente) {
                  vistaPrincipal.BTN_siguiente.setBackground(Color.RED);
                  vistaPrincipal.BTN_siguiente.setForeground(Color.WHITE);
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
        }
        
        for (JButton btns : ArrayBtns) {
            if (e.getSource()==btns) {
                  btns.setBackground(new Color(18,18, 18));
                  btns.setFont(new Font("Consolas",Font.PLAIN,14));
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
