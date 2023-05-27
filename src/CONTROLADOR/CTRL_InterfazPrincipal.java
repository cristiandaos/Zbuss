
package CONTROLADOR;
import MODELO.Socios;
import VISTA.*;
import UTILIDADES.*;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
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
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.ScrollBarUI;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.text.MaskFormatter;



public class CTRL_InterfazPrincipal implements ActionListener,MouseListener,MouseMotionListener,KeyListener,WindowListener{
         private Interfaz_Principal vista;
         private Socios usuario=null;
         private int cant=10;
         private int cantPasajeros;
         private int x;
         private int y;
         
         private ArrayList<PanelPersonalizado>ArrayPaneles;
         private ArrayList<JLabel>ArrayHorarios;
         private ArrayList<JLabel>ArrayDestinos;
         private ArrayList<JLabel>ArrayImgs;
         private ArrayList<JLabel>ArrayAsientosDisp;
  
         private ArrayList<JLabel>ArrayAsientos;
         
         private ArrayList<JPanel>ArrayAcompañantesPaneles;
         private ArrayList<JLabel>ArrayAcompañantesAsientos;
         private ArrayList<JTextField>ArrayAcompañantesNombres;
         private ArrayList<JTextField>ArrayAcompañantesApellidosPat;
         private ArrayList<JTextField>ArrayAcompañantesApellidosMat;
         private ArrayList<JSpinner>ArrayAcompañantesEdad;
         private ArrayList<JFormattedTextField>ArrayAcompañantesDNI;

         public CTRL_InterfazPrincipal(Interfaz_Principal vistaPrincipal){
                  this.vista=vistaPrincipal;
                  this.vista.addWindowListener(this);
                  
                  this.vista.BarraSuperior.addMouseMotionListener(this);
                  this.vista.BarraSuperior.addMouseListener(this);
                  
                  this.vista.BTN_cerrarSesion.addActionListener(this);
                  this.vista.BTN_cerrarSesion.addMouseListener(this);
                  
                  this.vista.BTN_cancelarAsientos.addActionListener(this);
                  this.vista.BTN_cancelarAsientos.addMouseListener(this);
                  
                  this.vista.BTN_ConfirmarAsientos.addActionListener(this);
                  this.vista.BTN_ConfirmarAsientos.addMouseListener(this);
                  
                  this.vista.BTN_cancelarPasajeros.addActionListener(this);
                  this.vista.BTN_cancelarPasajeros.addMouseListener(this);
                  
                  this.vista.BTN_confirmarCompra.addActionListener(this);
                  this.vista.BTN_confirmarCompra.addMouseListener(this);
                  
                  this.vista.BTN_IzquiAcompañantes.addActionListener(this);
                  this.vista.BTN_derechaAcompañantes.addActionListener(this);
                  
                  this.vista.LBLinfoUsuario.addMouseListener(this);
                  
                  this.vista.LBLhistorialUsuario.addMouseListener(this);
                  
                  GenerarPaneles(cant);

                  generarAsientos();
                  
                  for (PanelPersonalizado paneles : ArrayPaneles) {
                           paneles.addMouseListener(this);
                  }
                  
                  for (JLabel asientos : ArrayAsientos) {
                           asientos.addMouseListener(this);
                  }
                  
                  
                  InicializarReloj();
                  
                  DiseñoScroll(Color.GREEN, Color.BLACK);
                  
                  vista.BTN_ConfirmarAsientos.setVisible(false);
                  
                  vista.BTN_confirmarCompra.setVisible(false);
                  
                  ((JSpinner.DefaultEditor) vista.SPNEdadPasajero.getEditor()).getTextField().setEditable(false);
                  ((JSpinner.DefaultEditor) vista.SPNEdadPasajero.getEditor()).getTextField().setBackground(new Color(10,10,10));
                  ((JSpinner.DefaultEditor) vista.SPNEdadPasajero.getEditor()).getTextField().setForeground(Color.WHITE);
                  
                  Shape redondeado=new RoundRectangle2D.Double(0,0,vista.getBounds().width,vista.getBounds().getHeight(),30,30);
                  vista.setShape(redondeado);
                  vista.revalidate();
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
    
         
         void Iniciar(Socios socioIngresado){
                  usuario=socioIngresado;
                  vista.LBLusuario.setText(usuario.getNombre());
                  vista.TxtNombrePasajero.setText(usuario.getNombre());
                  vista.TxtApellidoPatePasajero.setText(usuario.getApellidoPaterno());
                  vista.TxtApellidoMatePasajero.setText(usuario.getApellidoMaterno());
                  vista.SPNEdadPasajero.setValue(usuario.calcularEdad());
                  vista.TxtDNIpasajero.setText(usuario.getDni());
                  vista.LBLpuntosUsuario.setText(String.valueOf(usuario.getPuntos()));
                  vista.setVisible(true);
         }
         
         
         void InicializarReloj(){
                  Date horaActual=new Date();
                  Date fechaActual=new Date();

                  SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
                  SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

                   String horaActualTexto = formatoHora.format(horaActual);
                  String FechaActualTexto=formatoFecha.format(fechaActual);

                  vista.LBLhora.setText(horaActualTexto);
                  vista.LBLfecha.setText(FechaActualTexto);
                  Timer timer = new Timer(1000, new ActionListener() {
                  @Override
                           public void actionPerformed(ActionEvent e) {

                                    Date horaActual=new Date();
                                    Date fechaActual=new Date();

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
         
         
         void Iniciar(){
                  
                  PlaceHolder Nombre=new PlaceHolder("Nombre", vista.TxtNombrePasajero, PlaceHolder.Visibilidad.ALWAYS);
                  PlaceHolder ApePat=new PlaceHolder("Apellido Paterno", vista.TxtApellidoPatePasajero, PlaceHolder.Visibilidad.ALWAYS);
                  PlaceHolder ApeMat=new PlaceHolder("Apellido Materno", vista.TxtApellidoMatePasajero, PlaceHolder.Visibilidad.ALWAYS);
                  
                  vista.LBLusuario.setText("No registrado");
                  vista.PanelUsuario.setVisible(false);
                  
                  vista.setVisible(true); 
         }
   
         
         void Cerrar(){
                  vista.dispose();
         }
 
         
         private void GenerarPaneles(int cant){
                  ArrayPaneles=new ArrayList<>();
                  ArrayDestinos=new ArrayList<>();
                  ArrayAsientosDisp=new ArrayList<>();
                  ArrayHorarios=new ArrayList<>();
                  ArrayImgs=new ArrayList<>();
                  int x=100;
                  int y=200;
                  int ancho=400;
                  int alto=460;
                  int incrementoX=500;
                  int incrementoY=550;
                  for (int i = 0; i < cant; i++) {
                           PanelPersonalizado contenedor=new PanelPersonalizado();
                           JLabel info=new JLabel();
                           JLabel img=new JLabel();
                           JLabel  horario=new JLabel();
                           JLabel destino=new JLabel();
                           JLabel  asientosDispo=new JLabel();

                           contenedor.setBounds(x, y, ancho, alto);
                           contenedor.setColorInicial(new Color(12,12,12));
                           contenedor.setColorFinal(Color.BLACK);
                           contenedor.setLayout(null);
                           contenedor.setBorder(new LineBorder(new Color(123,216,80),1,true));
                           contenedor.setCursor(new Cursor(Cursor.HAND_CURSOR));
                           ArrayPaneles.add(contenedor);

                           img.setBounds(20, 20, 360, 250);
                           img.setBorder(new LineBorder(Color.WHITE,1));
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
                           ArrayAsientosDisp.add(asientosDispo);
                           contenedor.add(asientosDispo);

                           vista.PanelDestinos.add(contenedor);
                           x+=incrementoX;
                           if(x>vista.PanelDestinos.getWidth()-contenedor.getWidth()){
                                    x=100;
                                    y+=incrementoY;
                           }

                           if (y>vista.PanelDestinos.getHeight()) {
                                    vista.PanelDestinos.setPreferredSize(new Dimension((int) vista.PanelDestinos.getPreferredSize().getWidth(),ArrayPaneles.get(i).getY()+alto+50));
                                    vista.ScrollPaneDestinos.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
                           }
                  }   
         }
    
         
         private int CargarPaneles(){
                  return CargarPaneles() ;
         }
    
         
         private void generarFormsAcompañantes(int cantAcomp){
                  ArrayAcompañantesPaneles=new ArrayList<>();
                  ArrayAcompañantesAsientos=new ArrayList<>();
                  ArrayAcompañantesNombres=new ArrayList<>();
                  ArrayAcompañantesApellidosPat=new ArrayList<>();
                  ArrayAcompañantesApellidosMat=new ArrayList<>();
                  ArrayAcompañantesEdad=new ArrayList<>();
                  ArrayAcompañantesDNI=new ArrayList<>();
                  
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

                           Border borde = BorderFactory.createLineBorder(new Color(123,216,80));
                           TitledBorder Bordeado = BorderFactory.createTitledBorder(borde, "Acompañante "+i, TitledBorder.LEFT, TitledBorder.TOP);
                           Bordeado.setTitleFont(new Font("Consolas", Font.BOLD, 18));
                           Bordeado.setTitleColor(Color.WHITE);
                           contenedor.setBorder(Bordeado);
                           contenedor.setBackground(new Color(10,10,10));
                           contenedor.setBounds(x, y, ancho, alto);
                           contenedor.setLayout(null);
                           
                           LBLasiento.setBounds(660, 30, 200, 40);
                           LBLasiento.setFont(new Font("Consolas", Font.BOLD, 18));
                           LBLasiento.setForeground(Color.WHITE);
                           LBLasiento.setText("Asiento");
                           LBLasiento.setName("LBLasiento");
                           contenedor.add(LBLasiento);
                           ArrayAcompañantesAsientos.add(LBLasiento);

                           TXTnombre.setBounds(10, 30, 270, 30);
                           TXTnombre.setBorder(new MatteBorder(0,0,2,0,Color.WHITE));
                           TXTnombre.setBackground(new Color(10,10,10));
                           TXTnombre.setFont(new Font("Segoe UI",Font.PLAIN,16));
                           TXTnombre.setForeground(Color.WHITE);
                           TXTnombre.setCaretColor(Color.WHITE);
                           PlaceHolder nom=new PlaceHolder("Nombre",TXTnombre,PlaceHolder.Visibilidad.ALWAYS);
                           TXTnombre.setName("TXTnombre");
                           contenedor.add(TXTnombre);
                           ArrayAcompañantesNombres.add(TXTnombre);
                           
                           TXTapePat.setBounds(10, 80, 270, 30);
                           TXTapePat.setBorder(new MatteBorder(0,0,2,0,Color.WHITE));
                           TXTapePat.setFont(new Font("Segoe UI",Font.PLAIN,16));
                           TXTapePat.setBackground(new Color(10,10,10));
                           TXTapePat.setForeground(Color.WHITE);
                           TXTapePat.setCaretColor(Color.WHITE);
                           PlaceHolder apePat=new PlaceHolder("Apellido Paterno",TXTapePat,PlaceHolder.Visibilidad.ALWAYS);
                           TXTapePat.setName("TXTapePat");
                           contenedor.add(TXTapePat);
                           ArrayAcompañantesApellidosPat.add(TXTapePat);

                           TXTapeMat.setBounds(10, 130, 270, 30);
                           TXTapeMat.setBorder(new MatteBorder(0,0,2,0,Color.WHITE));
                           TXTapeMat.setFont(new Font("Segoe UI",Font.PLAIN,16));
                           TXTapeMat.setBackground(new Color(10,10,10));
                           TXTapeMat.setForeground(Color.WHITE);
                           TXTapeMat.setCaretColor(Color.WHITE);
                           PlaceHolder apeMat=new PlaceHolder("Apellido Materno",TXTapeMat,PlaceHolder.Visibilidad.ALWAYS);
                           TXTapeMat.setName("TXTapePat");
                           ArrayAcompañantesApellidosMat.add(TXTapeMat);
                           contenedor.add(TXTapeMat);

                           LBLedad.setBounds(390, 30, 50, 30);
                           LBLedad.setText("Edad:");
                           LBLedad.setFont(new Font("Segoe UI",Font.PLAIN,18));
                           LBLedad.setForeground(Color.WHITE);
                           contenedor.add(LBLedad);

                           SpinnerNumberModel spinnerModel = (SpinnerNumberModel) SPNedad.getModel();
                           spinnerModel.setMinimum(0); 
                           SPNedad.setBounds(440,30,60,30);
                           SPNedad.setBorder(new MatteBorder(0,0,2,0,Color.WHITE));
                           ((JSpinner.DefaultEditor) SPNedad.getEditor()).getTextField().setEditable(false);
                           ((JSpinner.DefaultEditor) SPNedad.getEditor()).getTextField().setBackground(new Color(10,10,10));
                           ((JSpinner.DefaultEditor) SPNedad.getEditor()).getTextField().setForeground(Color.WHITE);
                           ArrayAcompañantesEdad.add(SPNedad);
                           contenedor.add(SPNedad);

                           LBLdni.setBounds(390, 90, 50, 30);
                           LBLdni.setText("DNI:");
                           LBLdni.setFont(new Font("Segoe UI",Font.PLAIN,18));
                           LBLdni.setForeground(Color.WHITE);
                           contenedor.add(LBLdni);

                           try {
                                    MaskFormatter formatoDNI = new MaskFormatter("########");
                                    JFormattedTextField FTXTdni=new JFormattedTextField(formatoDNI);
                                    FTXTdni.setBounds(440, 90, 150, 30);
                                    FTXTdni.setBackground(new Color(10,10,10));
                                    FTXTdni.setBorder(new MatteBorder(0,0,2,0,Color.WHITE));
                                    FTXTdni.setFont(new Font("Segoe UI",Font.PLAIN,16));
                                    FTXTdni.setForeground(Color.WHITE);
                                    FTXTdni.setCaretColor(Color.WHITE);
                                    contenedor.add(FTXTdni);
                                    ArrayAcompañantesDNI.add(FTXTdni);
                           } catch (ParseException ex) {
                                    Logger.getLogger(CTRL_InterfazPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                           }


                           ArrayAcompañantesPaneles.add(contenedor);

                           vista.PanelFormPasajeros.add(contenedor);

                           x+=900;
                           if (x>vista.PanelFormPasajeros.getWidth()-contenedor.getX()) {
                                    vista.PanelFormPasajeros.setPreferredSize(new Dimension(contenedor.getX()+ancho, vista.PanelFormPasajeros.getWidth()));
                                    vista.ScrollPanelPasajeros.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                           }
                  }
             
         }
    
         
         private void reiniciarFormsAcompañantes(){
                  vista.PanelFormPasajeros.removeAll();
                  ArrayAcompañantesPaneles.clear();
                  vista.PanelFormPasajeros.setPreferredSize(new Dimension(850,200));
                  vista.ScrollPanelPasajeros.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                  vista.ScrollPanelPasajeros.getHorizontalScrollBar().setValue(0);
                  if (usuario==null) {
                           vista.TxtNombrePasajero.setText(null);
                           vista.TxtApellidoMatePasajero.setText(null);
                           vista.TxtApellidoPatePasajero.setText(null);
                           vista.TxtDNIpasajero.setText(null);
                           vista.SPNEdadPasajero.setValue(0);
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
        vista.ScrollPaneDestinos.getVerticalScrollBar().setUI(customScrollBarUI);
        vista.ScrollPaneDestinos.getVerticalScrollBar().setCursor(new Cursor(Cursor.HAND_CURSOR));
        vista.ScrollPaneDestinos.getVerticalScrollBar().setUnitIncrement(15);
        }

    
         private void SliderScroll(JScrollBar scrollBar,int delay, int moverValor,int auxiliar) {
                  Timer Timer = new Timer(delay, new ActionListener() {
                  private int incremento = (moverValor - scrollBar.getValue()) / auxiliar;
                  private int valor = scrollBar.getValue();

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
                  Timer.start();
         }    
   
    
         private void generarAsientos(){
       
                  ArrayAsientos=new ArrayList<>();
                  int x=15;
                  int y=80;
                  int incremento;
                  for (int i = 1; i <=40; i++) {
                           JLabel asiento=new JLabel();
                           URL urlAsientoDisp = getClass().getResource("/IMGS/asientoDisp.png");
                           ImageIcon asientoDisp=new ImageIcon(urlAsientoDisp);
                           asiento.setIcon(asientoDisp);
                           asiento.setBounds(x,y,32,32);
                           asiento.setBackground(Color.GREEN);
                           asiento.setName("A"+i);
                           asiento.setText("A+i");
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
         
         
         private void deseleccionarAsiento(String asiento){
                  String txt="";
                  String texto=vista.LBLasientosSeleccionados.getText();
                  String[] asientos = texto.split(",");
                  int posicion=0;
                  for (int i = 0; i < asientos.length; i++) {
                           if (asientos[i].equals(asiento)) {
                                    posicion=i;
                           }
                  }
                  
                  for (int j = posicion; j < asientos.length - 1; j++) {
                           asientos[j] = asientos[j + 1];
                  }

                  for (int i = 0; i < asientos.length-1; i++) {
                           if (txt.equals("")) {
                                    txt+=asientos[i];
                           }else{
                                    txt+=","+asientos[i];
                           }  
                  }
                  vista.LBLasientosSeleccionados.setText(txt);
         }
        
         private void seleccionarAsiento(String asiento){
                  if (vista.LBLasientosSeleccionados.getText().isEmpty()) {
                           vista.LBLasientosSeleccionados.setText(asiento);
                   }else{
                            vista.LBLasientosSeleccionados.setText(vista.LBLasientosSeleccionados.getText()+","+asiento);
                  }
         }
         
         void asignarAsientos(){
                  String texto=vista.LBLasientosSeleccionados.getText();
                  String [] asientos=texto.split(",");
                  vista.LBLasientoPasajero.setText("Asiento: "+asientos[0]);
                  for (int i = 0; i < cantPasajeros-1; i++) {
                           ArrayAcompañantesAsientos.get(i).setText("Asiento: "+asientos[i+1]);
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

                  
                  if (e.getSource()==vista.BTN_cancelarAsientos) {
                           JScrollBar scrollBar = vista.ScrollPanelDinamico.getHorizontalScrollBar();
                           int izquierda=scrollBar.getValue()-1100;
                           SliderScroll(scrollBar, 10,izquierda,5);
                  }

                  
                  if (e.getSource()==vista.BTN_ConfirmarAsientos) {
                           JScrollBar scrollBar = vista.ScrollPanelDinamico.getHorizontalScrollBar();
                           int derecha=scrollBar.getValue()+1100;
                           SliderScroll(scrollBar,10, derecha,5);
                           generarFormsAcompañantes(cantPasajeros);
                           asignarAsientos();
                  }

                  
                  if (e.getSource()==vista.BTN_cancelarPasajeros) {
                           JScrollBar scrollBar = vista.ScrollPanelDinamico.getHorizontalScrollBar();
                           int izquierda=scrollBar.getValue()-1100;
                           SliderScroll(scrollBar,10,izquierda,5);
                           reiniciarFormsAcompañantes();
                  }

                  
                  if (e.getSource()==vista.BTN_confirmarCompra) {
                           EstadoInicial();
                  }

                  
                  if (e.getSource()==vista.BTN_IzquiAcompañantes) {
                           JScrollBar scrollBar = vista.ScrollPanelPasajeros.getHorizontalScrollBar();
                           int izquierda=scrollBar.getValue()-900;
                           SliderScroll(scrollBar,10, izquierda,5);
                  }

                  
                  if (e.getSource()==vista.BTN_derechaAcompañantes) {
                           JScrollBar scrollBar = vista.ScrollPanelPasajeros.getHorizontalScrollBar();
                           int derecha=scrollBar.getValue()+900;
                           SliderScroll(scrollBar,10, derecha,5);
                  }
                  
         }

    @Override
         public void mouseClicked(MouseEvent e) {
             
                  for (PanelPersonalizado paneles : ArrayPaneles) {
                           if (e.getSource()==paneles) {
                                    JScrollBar scrollBar = vista.ScrollPanelDinamico.getHorizontalScrollBar();
                                    int derecha=scrollBar.getValue()+1100;
                                    SliderScroll(scrollBar,10,derecha,5);
                           }
                  }
        
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
                                    if (asientos.getBackground().equals(Color.GREEN)) {
                                             asientos.setBackground(Color.BLUE);
                                             asientos.setIcon(asientoSele);
                                             cantPasajeros++;
                                             vista.LBLasientosCont.setText(String.valueOf(cantPasajeros));
                                             vista.BTN_ConfirmarAsientos.setVisible(true);
                                             seleccionarAsiento(asientos.getName()); 

                                    }else if (asientos.getBackground().equals(Color.BLUE)) {
                                             asientos.setBackground(Color.GREEN);
                                             asientos.setIcon(asientoDisp);
                                             cantPasajeros--;
                                             vista.LBLasientosCont.setText(String.valueOf(cantPasajeros));
                                             deseleccionarAsiento(asientos.getName());
                                             
                                            if (cantPasajeros==0) {
                                                      vista.BTN_ConfirmarAsientos.setVisible(false);
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
                        vista.BTN_cerrarSesion.setFont(new  Font("Consolas",Font.BOLD,16));
                        vista.BTN_cerrarSesion.setBorder(new MatteBorder(2,2,2,2,Color.GREEN));

                  }

                  
                  for (PanelPersonalizado paneles : ArrayPaneles) {
                          if (e.getSource()==paneles) {
                                    paneles.setColorInicial(new Color(21,24, 30));
                                    paneles.setColorFinal(Color.BLACK);
                                    paneles.setBorder(new LineBorder(Color.GREEN,2,true));
                           }
                  }
                  
                  for (JLabel asiento : ArrayAsientos) {
                           if (e.getSource()==asiento) {
                                    vista.LBLasientoName.setText(asiento.getName());
                           }
                  }

                  
                  if (e.getSource()==vista.BTN_cancelarAsientos) {
                           vista.BTN_cancelarAsientos.setBackground(new Color(21,24, 30));
                           vista.BTN_cancelarAsientos.setBorder(new MatteBorder(2,2,2,2,Color.GREEN));
                           vista.BTN_cancelarAsientos.setFont(new Font("Consolas",Font.BOLD,18));
                  }

                  
                  if (e.getSource()==vista.BTN_ConfirmarAsientos) {
                           vista.BTN_ConfirmarAsientos.setBackground(new Color(21,24, 30));
                           vista.BTN_ConfirmarAsientos.setBorder(new MatteBorder(2,2,2,2,Color.GREEN));
                           vista.BTN_ConfirmarAsientos.setFont(new Font("Consolas",Font.BOLD,18));
                  }

                  
                  if (e.getSource()==vista.BTN_cancelarPasajeros) {
                           vista.BTN_cancelarPasajeros.setBackground(new Color(21,24, 30));
                           vista.BTN_cancelarPasajeros.setFont(new  Font("Consolas",Font.BOLD,18));
                           vista.BTN_cancelarPasajeros.setBorder(new MatteBorder(2,2,2,2,Color.GREEN));
                  }

                  
                  if (e.getSource()==vista.BTN_confirmarCompra) {
                           vista.BTN_confirmarCompra.setBackground(new Color(21,24, 30));
                           vista.BTN_confirmarCompra.setFont(new  Font("Consolas",Font.BOLD,18));
                           vista.BTN_confirmarCompra.setBorder(new MatteBorder(2,2,2,2,Color.GREEN));
                  }
                  
                  
                  if (e.getSource()==vista.LBLinfoUsuario) {
                           vista.LBLinfoUsuario.setBackground(new Color(21,24, 30));
                           vista.LBLinfoUsuario.setFont(new Font("Consolas",Font.BOLD,18)); 
                  }
                  
                  if (e.getSource()==vista.LBLhistorialUsuario) {
                           vista.LBLhistorialUsuario.setBackground(new Color(21,24, 30));
                           vista.LBLhistorialUsuario.setFont(new Font("Consolas",Font.BOLD,18)); 
                  }
            
         }
    

    @Override
         public void mouseExited(MouseEvent e) {
        
                  if (e.getSource()==vista.BTN_cerrarSesion) {
                           vista.BTN_cerrarSesion.setBackground(Color.BLACK);
                           vista.BTN_cerrarSesion.setFont(new  Font("Consolas",Font.PLAIN,16));
                           vista.BTN_cerrarSesion.setBorder(new MatteBorder(1,1,1,1,new Color(123,216,80)));
                  }
        
                  for (PanelPersonalizado paneles : ArrayPaneles) {
                          if (e.getSource()==paneles) {
                                    paneles.setColorInicial(new Color(12,12,12));
                                    paneles.setColorFinal(Color.BLACK);
                                    paneles.setBorder(new LineBorder(new Color(123,216,80),1,true));
                           }
                  }
                  
                  for (JLabel asiento : ArrayAsientos) {
                           if (e.getSource()==asiento) {
                                    vista.LBLasientoName.setText("");
                           }
                  }
        
                  if (e.getSource()==vista.BTN_cancelarAsientos) {
                           vista.BTN_cancelarAsientos.setBackground(new Color(6,6,6));
                           vista.BTN_cancelarAsientos.setBorder(new MatteBorder(1,1,1,1, new Color(123,216,80)));
                           vista.BTN_cancelarAsientos.setFont(new Font("Consolas",Font.PLAIN,18));
                  }
         
                  if (e.getSource()==vista.BTN_ConfirmarAsientos) {
                           vista.BTN_ConfirmarAsientos.setBackground(new Color(6,6,6));
                           vista.BTN_ConfirmarAsientos.setBorder(new MatteBorder(1,1,1,1, new Color(123,216,80)));
                           vista.BTN_ConfirmarAsientos.setFont(new Font("Consolas",Font.PLAIN,18));
                  }
         
                  if (e.getSource()==vista.BTN_cancelarPasajeros) {
                           vista.BTN_cancelarPasajeros.setBackground(new Color(6,6,6));
                           vista.BTN_cancelarPasajeros.setFont(new  Font("Consolas",Font.PLAIN,18));
                           vista.BTN_cancelarPasajeros.setBorder(new MatteBorder(1,1,1,1, new Color(123,216,80)));
                  }
         
                  if (e.getSource()==vista.BTN_confirmarCompra) {
                           vista.BTN_confirmarCompra.setBackground(new Color(6,6,6));
                           vista.BTN_confirmarCompra.setFont(new  Font("Consolas",Font.PLAIN,18));
                           vista.BTN_confirmarCompra.setBorder(new MatteBorder(1,1,1,1, new Color(123,216,80)));
                  }
                  
                  if (e.getSource()==vista.LBLinfoUsuario) {
                           vista.LBLinfoUsuario.setBackground(Color.BLACK);
                           vista.LBLinfoUsuario.setFont(new Font("Consolas",Font.PLAIN,18)); 
                  }
                  
                  if (e.getSource()==vista.LBLhistorialUsuario) {
                           vista.LBLhistorialUsuario.setBackground(Color.BLACK);
                           vista.LBLhistorialUsuario.setFont(new Font("Consolas",Font.PLAIN,18)); 
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
