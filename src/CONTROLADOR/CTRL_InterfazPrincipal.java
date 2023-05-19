
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
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.ScrollBarUI;
import javax.swing.plaf.basic.BasicScrollBarUI;



public class CTRL_InterfazPrincipal implements ActionListener,MouseListener,MouseMotionListener,KeyListener,WindowListener{
    private Interfaz_Principal vista;
    private int cant=11;
    private int cantPasajeros=0;
    private int x;
    private int y;
    private ArrayList<PanelPersonalizado>ArrayPaneles;
    private ArrayList<JButton>ArrayBtns;
    private ArrayList<JLabel>ArrayHorarios;
    private ArrayList<JLabel>ArrayDestinos;
    private ArrayList<JLabel>ArrayImgs;
    private ArrayList<JLabel>ArrayAsientosDisp;
    private ArrayList<JLabel>ArrayAsientos;
    private ArrayList<JPanel>ArrayAcompañantesPaneles;
    
    public CTRL_InterfazPrincipal(Interfaz_Principal vistaPrincipal){
        this.vista=vistaPrincipal;
        this.vista.addWindowListener(this);
        this.vista.BarraSuperior.addMouseMotionListener(this);
        this.vista.BarraSuperior.addMouseListener(this);
        this.vista.BTN_cerrarSesion.addActionListener(this);
        this.vista.BTN_cerrarSesion.addMouseListener(this);
        this.vista.BTN_volverBuses.addActionListener(this);
        this.vista.BTN_volverBuses.addMouseListener(this);
        this.vista.BTN_siguiente.addActionListener(this);
        this.vista.BTN_volverAsientos.addActionListener(this);
        this.vista.BTN_volverAsientos.addMouseListener(this);
        this.vista.BTN_confirmarCompra.addActionListener(this);
        this.vista.BTN_confirmarCompra.addMouseListener(this);
        this.vista.BTN_IzquiAcompañantes.addActionListener(this);
        this.vista.BTN_derechaAcompañantes.addActionListener(this);
        
        ArrayPaneles=new ArrayList<>();
        ArrayBtns=new ArrayList<>();
        ArrayDestinos=new ArrayList<>();
        ArrayAsientosDisp=new ArrayList<>();
        ArrayHorarios=new ArrayList<>();
        ArrayImgs=new ArrayList<>();
        
        ArrayAsientos=new ArrayList<>();
        
        ArrayAcompañantesPaneles=new ArrayList<>();
        
         GenerarPaneles(cant);
        
         generarAsientos();
        
        
        for (JButton btns : ArrayBtns) { 
            btns.addActionListener(this);
            btns.addMouseListener(this);
        }
        for (JLabel asientos : ArrayAsientos) {
            asientos.addMouseListener(this);
        }
        
        ((JSpinner.DefaultEditor) vistaPrincipal.SPNEdadPasa.getEditor()).getTextField().setEditable(false);
        
    } 
    
    public Interfaz_Principal getVista(){
        return vista;
    }
    
    void EstadoInicial(){
        Interfaz_Principal reinicio_Interfaz=new Interfaz_Principal();
        CTRL_InterfazPrincipal reinicio_CTRl =new CTRL_InterfazPrincipal(reinicio_Interfaz);
        reinicio_CTRl.Iniciar();
        Cerrar();
    }
    
    void Iniciar(){
            DiseñoScroll(new Color(43,255,0), new Color(18, 18, 18));
            PlaceHolder Nombre=new PlaceHolder("Nombre", vista.TxtNombrePasa, PlaceHolder.Show.ALWAYS);
            PlaceHolder ApePat=new PlaceHolder("Apellido Paterno", vista.TxtApellidoPatePasa, PlaceHolder.Show.ALWAYS);
            PlaceHolder ApeMat=new PlaceHolder("Apellido Materno", vista.TxtApellidoMatePasa, PlaceHolder.Show.ALWAYS);
            Reloj reloj=new Reloj();
            reloj.setBounds(25, 50, 130, 40);
            vista.BarraLateral.add(reloj);
            Shape redondeado=new RoundRectangle2D.Double(0,0,vista.getBounds().width,vista.getBounds().getHeight(),30,30);
            vista.setShape(redondeado);
            vista.revalidate();
            vista.setVisible(true);
    }
    
    void Cerrar(){
        vista.dispose();
    }
 
    void GenerarPaneles(int cant){
        vista.ScrollPaneBuses.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
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
            info.setFont(new Font("Consolas",Font.BOLD,20));
            info.setText("Salida/Llegada ");
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
            
            btn.setBounds(0, 450, 400, 50);
            btn.setFocusable(false);
            btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
            btn.setText("Seleccionar");
            btn.setFont(new Font("Consolas",Font.PLAIN,18));
            btn.setBorder(new EmptyBorder(0,0,0,0));
            btn.setForeground(Color.WHITE);
            btn.setContentAreaFilled(false);
            ArrayBtns.add(btn);
            contenedor.add(btn);
            
            vista.PanelBuses.add(contenedor);
            x+=incrementoX;
            if(x>vista.PanelBuses.getWidth()-contenedor.getWidth()){
                x=100;
                y+=incrementoY;
            }
            
            if (y>vista.PanelBuses.getHeight()-contenedor.getHeight()) {
                  vista.PanelBuses.setPreferredSize(new Dimension((int) vista.PanelBuses.getPreferredSize().getWidth(),ArrayPaneles.get(i).getY()+alto+80));
                  vista.ScrollPaneBuses.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
            }
        }   
    }
    
    private int CargarPaneles(){
        return CargarPaneles() ;
    }
    
    void generarFormsAcompañantes(int cantAcomp){
        int x=0;
        int y=0;
        int ancho=850;
        int alto=200;
        
        if (cantAcomp>2) {
                vista.BTN_derechaAcompañantes.setVisible(true);
                vista.BTN_IzquiAcompañantes.setVisible(true);
        }else{
                vista.BTN_derechaAcompañantes.setVisible(false);
                vista.BTN_IzquiAcompañantes.setVisible(false);
        }
             for (int i = 1; i <cantAcomp; i++) {
                        JPanel contenedor=new JPanel();
                        JLabel LBLasiento=new JLabel();
                        JTextField TXTnombre=new JTextField();
                        JTextField TXTapePat=new JTextField();
                        JTextField TXTapeMat=new JTextField();
                        JLabel LBLedad=new JLabel();
                        JSpinner SPNedad=new JSpinner();
                        JLabel LBLdni=new JLabel();
                        JFormattedTextField FTXTdni=new JFormattedTextField(vista.FTxtDNI.getFormatter());
                        ButtonGroup BGsexos=new ButtonGroup();
                        JRadioButton RBfem=new JRadioButton();
                        JRadioButton RBmasc=new JRadioButton();

                        Border borde = BorderFactory.createLineBorder(Color.BLACK);
                        TitledBorder Bordeado = BorderFactory.createTitledBorder(borde, "Acompañante "+i, TitledBorder.LEFT, TitledBorder.TOP);
                        Bordeado.setTitleFont(new Font("Consolas", Font.BOLD, 18));
                        contenedor.setBorder(Bordeado);
                        contenedor.setBackground(Color.WHITE);
                        contenedor.setBounds(x, y, ancho, alto);
                        contenedor.setLayout(null);

                        LBLasiento.setBounds(720, 20, 200, 40);
                        LBLasiento.setFont(new Font("Consolas", Font.BOLD, 18));
                        LBLasiento.setForeground(Color.BLACK);
                        LBLasiento.setText("Asiento");
                        contenedor.add(LBLasiento);

                        TXTnombre.setBounds(10, 30, 270, 30);
                        TXTnombre.setBorder(new MatteBorder(0,0,2,0,Color.BLACK));
                        TXTnombre.setFont(new Font("Segoe UI",Font.PLAIN,16));
                        PlaceHolder nom=new PlaceHolder("Nombre",TXTnombre,PlaceHolder.Show.ALWAYS);
                        contenedor.add(TXTnombre);

                        TXTapePat.setBounds(10, 80, 270, 30);
                        TXTapePat.setBorder(new MatteBorder(0,0,2,0,Color.BLACK));
                        TXTapePat.setFont(new Font("Segoe UI",Font.PLAIN,16));
                        PlaceHolder apePat=new PlaceHolder("Apellido Paterno",TXTapePat,PlaceHolder.Show.ALWAYS);
                        contenedor.add(TXTapePat);

                        TXTapeMat.setBounds(10, 130, 270, 30);
                        TXTapeMat.setBorder(new MatteBorder(0,0,2,0,Color.BLACK));
                        TXTapeMat.setFont(new Font("Segoe UI",Font.PLAIN,16));
                        PlaceHolder apeMat=new PlaceHolder("Apellido Materno",TXTapeMat,PlaceHolder.Show.ALWAYS);
                        contenedor.add(TXTapeMat);

                        LBLedad.setBounds(390, 30, 50, 30);
                        LBLedad.setText("Edad:");
                        LBLedad.setFont(new Font("Consolas",Font.BOLD,18));
                        LBLedad.setForeground(Color.BLACK);
                        contenedor.add(LBLedad);

                        SpinnerNumberModel spinnerModel = (SpinnerNumberModel) SPNedad.getModel();
                        spinnerModel.setMinimum(0); 
                        SPNedad.setBounds(440,30,60,30);
                        SPNedad.setBorder(new MatteBorder(0,0,2,0,Color.BLACK));
                        ((JSpinner.DefaultEditor) SPNedad.getEditor()).getTextField().setEditable(false);
                        contenedor.add(SPNedad);

                        LBLdni.setBounds(390, 90, 50, 30);
                        LBLdni.setText("DNI:");
                        LBLdni.setFont(new Font("Consolas",Font.BOLD,18));
                        LBLdni.setForeground(Color.BLACK);
                        contenedor.add(LBLdni);

                        FTXTdni.setBounds(440, 90, 150, 30);
                        FTXTdni.setBorder(new MatteBorder(0,0,2,0,Color.BLACK));
                        FTXTdni.setFont(new Font("Segoe UI",Font.PLAIN,16));
                        contenedor.add(FTXTdni);

                        RBfem.setBounds(380, 150, 110, 40);
                        RBfem.setFont(new Font("Segoe UI",Font.PLAIN,18));
                        RBfem.setForeground(Color.BLACK);
                        RBfem.setText("Femenino");
                        RBfem.setFocusable(false);
                        RBmasc.setBounds(500, 150, 110, 40);
                        RBmasc.setFont(new Font("Segoe UI",Font.PLAIN,18));
                        RBmasc.setForeground(Color.BLACK);
                        RBmasc.setText("Masculino");
                        RBmasc.setFocusable(false);
                        BGsexos.add(RBfem);
                        BGsexos.add(RBmasc);
                        contenedor.add(RBfem);
                        contenedor.add(RBmasc);
                        contenedor.setName("AUX");
                        ArrayAcompañantesPaneles.add(contenedor);

                        vista.PanelFormPasajeros.add(contenedor);

                        x+=900;
                        if (x>vista.PanelFormPasajeros.getWidth()-contenedor.getX()) {
                            vista.PanelFormPasajeros.setPreferredSize(new Dimension(contenedor.getX()+ancho, vista.PanelFormPasajeros.getWidth()));
                            vista.ScrollPanelPasajeros.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                        }
                 }
             
    }
    
    void reinciarFormsAcompañantes(){
                     vista.PanelFormPasajeros.removeAll();
                     ArrayAcompañantesPaneles.clear();
                     vista.PanelFormPasajeros.setPreferredSize(new Dimension(850,200));
                     vista.ScrollPanelPasajeros.setPreferredSize(new Dimension(850,200));
                     vista.ScrollPanelPasajeros.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                     vista.ScrollPanelPasajeros.getHorizontalScrollBar().setValue(0);
                     vista.TxtNombrePasa.setText(null);
                     vista.TxtApellidoMatePasa.setText(null);
                     vista.TxtApellidoPatePasa.setText(null);
                     vista.FTxtDNI.setText(null);
                     vista.SPNEdadPasa.setValue(0);
                     vista.BGsexos.clearSelection();
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
        vista.ScrollPaneBuses.getVerticalScrollBar().setUI(customScrollBarUI);
        vista.ScrollPaneBuses.getVerticalScrollBar().setCursor(new Cursor(Cursor.HAND_CURSOR));
        vista.ScrollPaneBuses.getVerticalScrollBar().setUnitIncrement(15);
        }

    
     void smoothSlide(JScrollBar scrollBar, int targetValue) {
        Timer slideTimer = new Timer(10, new ActionListener() {
            private int increment = (targetValue - scrollBar.getValue()) / 5;
            private int currentValue = scrollBar.getValue();

            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentValue != targetValue) {
                    currentValue += increment;
                    if ((increment > 0 && currentValue > targetValue) || (increment < 0 && currentValue < targetValue)) {
                        currentValue = targetValue;
                    }
                    scrollBar.setValue(currentValue);
                } else {
                    ((Timer) e.getSource()).stop();
                }
            }
        });

        slideTimer.start();
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
                vista.Buss.add(asiento);
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

        if (e.getSource()==vista.BTN_cerrarSesion) {
            Login login=new Login();
            CTRL_Login ctrlLogin=new CTRL_Login(login);
            ctrlLogin.Iniciar();
            Cerrar();
        }
        
        for (JButton btns : ArrayBtns) {
            if (e.getSource()==btns) {
                    MoverIzquierda(180, -920, 2, 20, vista.ScrollPaneBuses);
                    MoverIzquierda(1280, 180, 2, 20, vista.PanelAsientos);
                    MoverIzquierda(2560, 1280, 2, 20,vista.PanelPasajeros);
            }
        }
        
        if (e.getSource()==vista.BTN_volverBuses) {
                    MoverDerecha(-920, 180, 2, 20, vista.ScrollPaneBuses);
                    MoverDerecha(180, 1280, 2, 20, vista.PanelAsientos);
                    MoverDerecha(1280, 2560, 2, 20, vista.PanelPasajeros);
        }
        
        if (e.getSource()==vista.BTN_siguiente) {
                    MoverIzquierda(180, -920, 2, 20, vista.PanelAsientos);
                    MoverIzquierda(1280, 180, 2, 20, vista.PanelPasajeros);
                    MoverIzquierda(-920, -2020, 2, 20, vista.ScrollPaneBuses);
                    generarFormsAcompañantes(cantPasajeros);
         }
        
        if (e.getSource()==vista.BTN_volverAsientos) {
                    MoverDerecha(-920, 180, 2, 20, vista.PanelAsientos);
                    MoverDerecha(180, 1280, 2, 20, vista.PanelPasajeros);
                    MoverDerecha(-2020, -920, 2, 20, vista.ScrollPaneBuses);
                    reinciarFormsAcompañantes();
         }
        
        if (e.getSource()==vista.BTN_confirmarCompra) {
                    EstadoInicial();
        }
        if (e.getSource()==vista.BTN_IzquiAcompañantes) {
             JScrollBar scrollBar = vista.ScrollPanelPasajeros.getHorizontalScrollBar();
             int izquierda=scrollBar.getValue()-900;
             smoothSlide(scrollBar, izquierda);
        }
        
        if (e.getSource()==vista.BTN_derechaAcompañantes) {
            JScrollBar scrollBar = vista.ScrollPanelPasajeros.getHorizontalScrollBar();
            int derecha=scrollBar.getValue()+900;
            smoothSlide(scrollBar, derecha);
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
        
        for (JLabel asientos : ArrayAsientos) {
                  URL urlAsientoDisp = getClass().getResource("/IMGS/asientoDisp.png");
                  ImageIcon asientoDisp=new ImageIcon(urlAsientoDisp);
                  URL urlAsientoSele = getClass().getResource("/IMGS/asientoSele.png");
                  ImageIcon asientoSele=new ImageIcon(urlAsientoSele);

                  if (e.getSource()==asientos ) {
                           if (asientos.getName().equals("Disponible")) {
                                    asientos.setIcon(asientoSele);
                                    cantPasajeros++;
                                    vista.CONT.setText(String.valueOf(cantPasajeros));
                                    asientos.setName("Seleccionado");
                                    vista.BTN_siguiente.setEnabled(true);
                                    vista.BTN_siguiente.addMouseListener(this);
                                    
                           }else if (asientos.getName().equals("Seleccionado")) {
                                    vista.BTN_siguiente.removeMouseListener(this);
                                    asientos.setIcon(asientoDisp);
                                    asientos.setName("Disponible");
                                    cantPasajeros--;
                                    vista.CONT.setText(String.valueOf(cantPasajeros));
                                    
                                    if (cantPasajeros==0) {
                                            vista.BTN_siguiente.setEnabled(false);
                                     }
                           }
                 }
         }
}

    @Override
    public void mouseReleased(MouseEvent e) {
       
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
        if (e.getSource()==vista.BTN_cerrarSesion) {
            vista.BTN_cerrarSesion.setBackground(new Color(21,24, 30));

        }
        
        for (JButton btns : ArrayBtns) {
            if (e.getSource()==btns) {
                    btns.setContentAreaFilled(true);
                    btns.setBackground(new Color(21,24, 30));
                    btns.setFont(new Font("Consolas",Font.BOLD,18));
                    btns.setBorder(new MatteBorder(0,0,5,0,new Color(123,216,80)));
            }
        }
            
         if (e.getSource()==vista.BTN_volverBuses) {
                    vista.BTN_volverBuses.setBackground(Color.RED);
                    vista.BTN_volverBuses.setForeground(Color.WHITE);
         }
            
         if (e.getSource()==vista.BTN_siguiente) {
                    vista.BTN_siguiente.setBackground(Color.RED);
                    vista.BTN_siguiente.setForeground(Color.WHITE);
         }
         
         if (e.getSource()==vista.BTN_volverAsientos) {
                    vista.BTN_volverAsientos.setBackground(Color.RED);
                    vista.BTN_volverAsientos.setForeground(Color.WHITE);
         }
         
         if (e.getSource()==vista.BTN_confirmarCompra) {
                    vista.BTN_confirmarCompra.setBackground(Color.RED);
                    vista.BTN_confirmarCompra.setForeground(Color.WHITE);
         }
            
         }
    

    @Override
    public void mouseExited(MouseEvent e) {
        
        if (e.getSource()==vista.BTN_cerrarSesion) {
            vista.BTN_cerrarSesion.setBackground(new Color(18,18,18));
        }
        
        for (JButton btns : ArrayBtns) {
            if (e.getSource()==btns) {
                  btns.setContentAreaFilled(false);
                  btns.setFont(new Font("Consolas",Font.PLAIN,18));
                  btns.setBorder(new EmptyBorder(0, 0, 0, 0));
            }
        }
        
         if (e.getSource()==vista.BTN_volverBuses) {
                    vista.BTN_volverBuses.setBackground(Color.WHITE);
                    vista.BTN_volverBuses.setForeground(Color.BLACK);
         }
         
         if (e.getSource()==vista.BTN_siguiente) {
                    vista.BTN_siguiente.setBackground(Color.WHITE);
                    vista.BTN_siguiente.setForeground(Color.BLACK);
         }
         
         if (e.getSource()==vista.BTN_volverAsientos) {
                    vista.BTN_volverAsientos.setBackground(Color.WHITE);
                    vista.BTN_volverAsientos.setForeground(Color.BLACK);
         }
         
         if (e.getSource()==vista.BTN_confirmarCompra) {
                    vista.BTN_confirmarCompra.setBackground(Color.WHITE);
                    vista.BTN_confirmarCompra.setForeground(Color.BLACK);
         }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (e.getSource()==vista.BarraSuperior) {
            int MouseX=e.getXOnScreen();
            int MouseY=e.getYOnScreen();
            vista.setLocation(MouseX-x,MouseY-y);
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
         if (e.getSource()==vista) {
                  for (double  i = 0.0; i <= 1; i=i+0.1) {
                            float f=(float) i;
                            vista.setOpacity(f);
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
