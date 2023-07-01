
package CONTROLADOR;
import DAO.ViajesDAO;
import DAO.AsientosDAO;
import DAO.VentasDAO;
import DAO.AcompañantesDAO;
import DAO.PasajerosPrincipalesDAO;
import DAO.SociosDAO;
import MODELO.*;
import VISTA.*;
import UTILIDADES.*;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDayChooser;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import java.sql.*;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;



public class CTRL_InterfazPrincipal implements ActionListener,MouseListener,MouseMotionListener,KeyListener,FocusListener,WindowListener{
         private Interfaz_Principal vista;
         private Socios SesionSocio;
         private Date fechafiltroAUX;
         private int cant_ViajesDisponibles;
         private Viajes viajeSeleccionado=new Viajes();
         private int x;
         private int y;
         
         private Conexion cone=new Conexion();
         private SociosDAO socioDAO=new SociosDAO();
         private PasajerosPrincipalesDAO pasajeroDAO=new PasajerosPrincipalesDAO();
         private AcompañantesDAO acompañanteDAO=new AcompañantesDAO();
         private VentasDAO ventaDAO=new VentasDAO();
         private AsientosDAO asientoDAO=new AsientosDAO();
         private ViajesDAO viajeDAO=new ViajesDAO();
         
         //componentes de los paneles de Viaje
         private ArrayList<PanelPersonalizado>ArrayPaneles;
         private ArrayList<JLabel>ArrayFechas;
         private ArrayList<JLabel>ArrayHoras;
         private ArrayList<JLabel>ArrayDestinos;
         private ArrayList<JLabel>ArrayImgs;
         private ArrayList<JLabel>ArrayAsientosDisp;
         private ArrayList<JLabel>ArrayPrecios;
         private ArrayList<JLabel>ArrayDistancias;
         
         //asientos del Bus
         private ArrayList<JLabel>ArrayBusAsientos;
         
         //componentes para los formularios de los Acompañantes
         private ArrayList<JPanel>ArrayAcompañantesPaneles;
         private ArrayList<JLabel>ArrayAcompañantesAsientos;
         private ArrayList<JTextField>ArrayAcompañantesNombres;
         private ArrayList<JTextField>ArrayAcompañantesApellidosPat;
         private ArrayList<JTextField>ArrayAcompañantesApellidosMat;
         private ArrayList<JSpinner>ArrayAcompañantesEdad;
         private ArrayList<JFormattedTextField>ArrayAcompañantesDNI;

         public CTRL_InterfazPrincipal(Interfaz_Principal vistaPrincipal,int cantidad)   {
             
                 this.vista=vistaPrincipal;
                 this.vista.addWindowListener(this);
                 
                 this.cant_ViajesDisponibles=cantidad;
                 
                 this.vista.BarraSuperior.addMouseMotionListener(this);
                 this.vista.BarraSuperior.addMouseListener(this);
                 
                 this.vista.BTN_cerrarSesion.addActionListener(this);
                 this.vista.BTN_cerrarSesion.addMouseListener(this);
                 
                 this.vista.BTN_cancelarAsientos.addActionListener(this);
                 this.vista.BTN_cancelarAsientos.addMouseListener(this);
                 
                 this.vista.BTN_confirmarAsientos.addActionListener(this);
                 this.vista.BTN_confirmarAsientos.addMouseListener(this);
                 
                 this.vista.BTN_cancelarPasajeros.addActionListener(this);
                 this.vista.BTN_cancelarPasajeros.addMouseListener(this);
                 
                 this.vista.BTN_confirmarCompra.addActionListener(this);
                 this.vista.BTN_confirmarCompra.addMouseListener(this);
                 
                 this.vista.BTN_IzquiAcompañantes.addActionListener(this);
                 this.vista.BTN_derechaAcompañantes.addActionListener(this);
                 
                 this.vista.BTN_infoSocio.addActionListener(this);
                 this.vista.BTN_infoSocio.addMouseListener(this);

                 this.vista.BTN_editarNombreSocio.addActionListener(this);
                 this.vista.BTN_editarPaternoSocio.addActionListener(this);
                 this.vista.BTN_editarMaternoSocio.addActionListener(this);
                 this.vista.BTN_editarFnacSocio.addActionListener(this);
                 this.vista.BTN_editarNumeroSocio.addActionListener(this);
                 this.vista.BTN_editarCorreoSocio.addActionListener(this);
                 this.vista.BTN_editarContraSocio.addActionListener(this);
                 
                 this.vista.BTN_eliminarCuenta.addActionListener(this);
                 
                 this.vista.BTN_aplicarFiltro.addActionListener(this);
                 this.vista.BTN_limpiarFiltro.addActionListener(this);
                 
                  GenerarPaneles(this.cant_ViajesDisponibles);
                 
                  generarAsientos();

                  InicializarReloj();
                 
                  CargarPanelesViajes(viajeDAO.ListarViajes());

                  CargarCBfiltro();
                 
                  InstanciarPropiedadesDateChooser();
                 
                  vista.BTN_confirmarAsientos.setVisible(false);
                 
                 
                  ((JSpinner.DefaultEditor) vista.SPNEdadPasajero.getEditor()).getTextField().setEditable(false);
                  ((JTextField) vista.DCfechaFiltros.getDateEditor().getUiComponent()).setForeground(Color.WHITE);
         } 
         
         void Iniciar(Socios socioIngresado){
              
                  SesionSocio=socioIngresado;

                  vista.LBLusuario.setText(SesionSocio.getNombre());
                   vista.LBLpuntosUsuario.setText(String.valueOf(SesionSocio.getPuntos()));
                   
                  vista.TXT_dniSocio.setText(SesionSocio.getDni());
                  vista.TXT_nombreSocio.setText(SesionSocio.getNombre());
                  vista.TXT_paternoSocio.setText(SesionSocio.getApellidoPaterno());
                  vista.TXT_maternoSocio.setText(SesionSocio.getApellidoMaterno());
                  vista.TXT_fnacSocio.setText(SesionSocio.getNacimiento());
                  vista.TXT_NumeroSocio.setText(SesionSocio.getNumero());
                  vista.TXT_correoSocio.setText(SesionSocio.getCorreo());
                  vista.TXT_contraSocio.setText(SesionSocio.getContraseña());
                  
                  vista.TxtNombrePasajero.setText(SesionSocio.getNombre());
                  vista.TxtApellidoPatePasajero.setText(SesionSocio.getApellidoPaterno());
                  vista.TxtApellidoMatePasajero.setText(SesionSocio.getApellidoMaterno());
                  vista.TxtcorreoPasajero.setText(SesionSocio.getCorreo());
                  vista.SPNEdadPasajero.setValue(SesionSocio.calcularEdad());
                  vista.TxtDNIpasajero.setText(SesionSocio.getDni());
                  
                  vista.ScrollPanelDinamico.getHorizontalScrollBar().setValue(1100);
                  
                  vista.setVisible(true);
          }   
         
          
         void Iniciar(){
                  
                  PlaceHolder Nombre=new PlaceHolder("Nombre", vista.TxtNombrePasajero, PlaceHolder.Visibilidad.ALWAYS);
                  PlaceHolder ApePat=new PlaceHolder("Apellido Paterno", vista.TxtApellidoPatePasajero, PlaceHolder.Visibilidad.ALWAYS);
                  PlaceHolder ApeMat=new PlaceHolder("Apellido Materno", vista.TxtApellidoMatePasajero, PlaceHolder.Visibilidad.ALWAYS);
                  PlaceHolder correo=new PlaceHolder("Correo Electrónico", vista.TxtcorreoPasajero, PlaceHolder.Visibilidad.ALWAYS);

                  vista.LBLusuario.setText("No registrado");
                  vista.PanelUsuario.setVisible(false);
                  
                  vista.ScrollPanelDinamico.getHorizontalScrollBar().setValue(1100);
                  
                  vista.setVisible(true); 
          }

          
         void Cerrar(){
                  vista.dispose();
          }
         
         
          private void InicializarReloj(){
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
    
         
          private boolean GenerarPaneles(int cant){
                  ArrayPaneles=new ArrayList<>();
                  ArrayDestinos=new ArrayList<>();
                  ArrayAsientosDisp=new ArrayList<>();
                  ArrayFechas=new ArrayList<>();
                  ArrayHoras=new ArrayList<>();
                  ArrayImgs=new ArrayList<>();
                  ArrayPrecios=new ArrayList<>();
                  ArrayDistancias=new ArrayList<>();
                  int x=100;
                  int y=20;
                  int ancho=400;
                  int alto=450;
                  int incrementoX=500;
                  int incrementoY=500;
                  for (int i = 0; i < cant; i++) {
                           PanelPersonalizado contenedor=new PanelPersonalizado();
                           JLabel precio=new JLabel();
                           JLabel img=new JLabel();
                           JLabel  fechas=new JLabel();
                           JLabel horas=new JLabel();
                           JLabel destino=new JLabel();
                           JLabel  asientosDispo=new JLabel();
                           JLabel distancia=new JLabel();

                           contenedor.setBounds(x, y, ancho, alto);
                           contenedor.setColorInicial(new Color(12,12,12));
                           contenedor.setColorFinal(Color.BLACK);
                           contenedor.setLayout(null);
                           contenedor.setBorder(new LineBorder(new Color(123,216,80),1,true));
                           contenedor.setCursor(new Cursor(Cursor.HAND_CURSOR));
                           ArrayPaneles.add(contenedor);
                           

                           img.setBounds(20, 20, 360, 250);
                           ArrayImgs.add(img);
                           contenedor.add(img);

                           precio.setBounds(0, 280, 400, 30);
                           precio.setFont(new Font("Segoe UI Emoji",Font.BOLD,16));
                           precio.setHorizontalAlignment(SwingConstants.CENTER);
                           precio.setForeground(Color.WHITE);
                           ArrayPrecios.add(precio);
                           contenedor.add(precio);

                           destino.setBounds(0, 310, 400, 30);
                           destino.setHorizontalAlignment(SwingConstants.CENTER);
                           destino.setForeground(Color.WHITE);
                           destino.setFont(new Font("Segoe UI Emoji",Font.BOLD,16));
                           ArrayDestinos.add(destino);
                           contenedor.add(destino);
                           
                           distancia.setBounds(0,330,400,30);
                           distancia.setFont(new Font("Segoe UI Emoji",Font.BOLD,16));
                           distancia.setForeground(Color.WHITE);
                           distancia.setHorizontalAlignment(SwingConstants.CENTER);
                           ArrayDistancias.add(distancia);
                           contenedor.add(distancia);

                           fechas.setBounds(0, 360, 400, 30);
                           fechas.setForeground(Color.WHITE);
                           fechas.setHorizontalAlignment(SwingConstants.CENTER);
                           fechas.setFont(new Font("Segoe UI Emoji",Font.BOLD,16));
                           ArrayFechas.add(fechas);
                           contenedor.add(fechas);
                           
                           horas.setBounds(0, 380, 400, 30);
                           horas.setForeground(Color.WHITE);
                           horas.setHorizontalAlignment(SwingConstants.CENTER);
                           horas.setFont(new Font("Segoe UI Emoji",Font.BOLD,16));
                           ArrayHoras.add(horas);
                           contenedor.add(horas);

                           asientosDispo.setBounds(0, 420, 400, 30);
                           asientosDispo.setForeground(Color.WHITE);
                           asientosDispo.setFont(new Font("Segoe UI Emoji",Font.BOLD,16));
                           asientosDispo.setHorizontalAlignment(SwingConstants.CENTER);
                           ArrayAsientosDisp.add(asientosDispo);
                           contenedor.add(asientosDispo);
                           
                           vista.PanelViajes.add(contenedor);
                           x+=incrementoX;
                           if(x>vista.PanelViajes.getWidth()-contenedor.getWidth()){
                                    x=100;
                                    y+=incrementoY;
                           }

                           if (y>vista.PanelViajes.getHeight()-alto) {
                                    vista.PanelViajes.setPreferredSize(new Dimension((int) vista.PanelViajes.getPreferredSize().getWidth(),ArrayPaneles.get(i).getY()+alto+60));
                                    vista.ScrollPanelViajes.getVerticalScrollBar().setUnitIncrement(15);
                                    vista.ScrollPanelViajes.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                           }
                  }
                  if (!ArrayPaneles.isEmpty()) {
                           for (PanelPersonalizado paneles : ArrayPaneles) {
                                    paneles.addMouseListener(this);
                           }
                           return  true;
                  }
                  return false;
         }
         

          private void CargarPanelesViajes(ArrayList<Viajes> ListViajes){
                  byte[]  binario;
                  for (int i=0;i<ListViajes.size();i++) {
                          try {
                                    ArrayPaneles.get(i).setName(String.valueOf(ListViajes.get(i).getId()));
                                    ArrayDestinos.get(i).setText(ListViajes.get(i).getT_salida()+"-->"+ListViajes.get(i).getT_llegada());
                                    ArrayDistancias.get(i).setText(ListViajes.get(i).getDistancia());
                                    ArrayFechas.get(i).setText(ListViajes.get(i).getFechaSalida()+"--->"+ListViajes.get(i).getFechaLlegada());
                                    ArrayHoras.get(i).setText(ListViajes.get(i).getHoraSalida()+"            "+ListViajes.get(i).getHoraLlegada());
                                    ArrayPrecios.get(i).setText("Precio: S/"+String.valueOf(ListViajes.get(i).getPrecio()));
                                    ArrayAsientosDisp.get(i).setText("Asientos Disponibles: "+String.valueOf(ListViajes.get(i).getAsientosDispo()));
                                    binario=ListViajes.get(i).getImg();
                                    InputStream img=new ByteArrayInputStream(binario);
                                    BufferedImage bfimagen=ImageIO.read(img);
                                    ImageIcon imagen=new ImageIcon(bfimagen);
                                    ArrayImgs.get(i).setIcon(imagen);
                           } catch (IOException ex) {
                                             Logger.getLogger(CTRL_InterfazPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                 }
         }
          
         
         private void CargarAsientos(int ID){
                  URL urlAsientoOcup = getClass().getResource("/IMGS/asientoOcup.png");
                  ImageIcon asientoOcup=new ImageIcon(urlAsientoOcup);
                  URL urlAsientoDisp = getClass().getResource("/IMGS/asientoDisp.png");
                  ImageIcon asientoDisp=new ImageIcon(urlAsientoDisp);
                  
                  PreparedStatement ps=null;
                  ResultSet rs=null;
                  Connection con=cone.getConnection();
                  int i=0;
                  try {
                           ps=con.prepareStatement("SELECT asiento_estado FROM Asientos WHERE asiento_viaje_id=?");
                           ps.setInt(1,ID );
                           rs=ps.executeQuery();
                           while(rs.next()){
                                    if (rs.getString("asiento_estado").equals("Ocupado")) {
                                                      ArrayBusAsientos.get(i).setIcon(asientoOcup);
                                                      ArrayBusAsientos.get(i).setBackground(Color.RED);
                                    }else{
                                                      ArrayBusAsientos.get(i).setIcon(asientoDisp);
                                                      ArrayBusAsientos.get(i).setBackground(Color.GREEN);
                                    }
                                    i++;
                           }
                           
                  } catch (SQLException e) {
                           System.out.println(e);
                  }
         }
         
         
         private void CargarInfoViaje(int ID){
                  PreparedStatement ps=null;
                  ResultSet rs=null;
                  Connection con=cone.getConnection();
                  String sql="SELECT ts.terminal_nombre AS terminal_salida, ts.terminal_dirección AS direccion_salida, tl.terminal_nombre AS terminal_llegada, tl.terminal_dirección AS direccion_llegada, v.viaje_fecha_salida, v.viaje_fecha_llegada, v.viaje_hora_salida, v.viaje_hora_llegada, v.viaje_asientos_Dispo, v.viaje_precio\n" +
                                    "FROM Viajes v\n" +
                                    "JOIN Terminales ts ON v.viaje_terminal_salida = ts.terminal_id\n" +
                                    "JOIN Terminales tl ON v.viaje_terminal_llegada = tl.terminal_id\n"+
                                     "WHERE  v. viaje_id=?";
                  try {
                           ps=con.prepareStatement(sql);
                           ps.setInt(1,ID );
                           rs=ps.executeQuery();
                           if (rs.next()) {
                                    vista.LBLtermSalida.setText(rs.getString("terminal_salida"));
                                    vista.LBLtermSalidaDireccion.setText(rs.getString("direccion_salida"));
                                    vista.LBLtermLlegada.setText(rs.getString("terminal_llegada"));
                                    vista.LBLtermLlegadDireccion.setText(rs.getString("direccion_llegada"));
                                    vista.LBLhoraSalida.setText(rs.getString("viaje_fecha_salida")+" - "+rs.getString("viaje_hora_salida"));
                                    vista.LBLhoraLlegada.setText(rs.getString("viaje_fecha_llegada")+" - "+rs.getString("viaje_hora_llegada"));
                                    vista.LBLasientosDisponibles.setText("Asientos Disponibles: "+String.valueOf(rs.getInt("viaje_asientos_Dispo")));
                                    vista.LBLprecioAsiento.setText(String.valueOf(rs.getDouble("viaje_precio")));
                           }
                           
                  } catch (SQLException e) {
                           System.out.println(e);
                  }finally{
                           try {
                                    con.close();
                           } catch (SQLException e) {
                                    System.out.println(e);
                           }
                  }
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
                  
                  if (cantAcomp>1) {
                           vista.PanelAcompañantes.setVisible(true);
                  }else{
                           vista.PanelAcompañantes.setVisible(false);
                  }
                  
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
                           TXTnombre.setFont(new Font("Segoe UI Emoji",Font.BOLD,16));
                           TXTnombre.setForeground(Color.WHITE);
                           TXTnombre.setCaretColor(Color.WHITE);
                           PlaceHolder nom=new PlaceHolder("Nombre",TXTnombre,PlaceHolder.Visibilidad.ALWAYS);
                           TXTnombre.setName("TXTnombre");
                           contenedor.add(TXTnombre);
                           ArrayAcompañantesNombres.add(TXTnombre);
                           
                           TXTapePat.setBounds(10, 80, 270, 30);
                           TXTapePat.setBorder(new MatteBorder(0,0,2,0,Color.WHITE));
                           TXTapePat.setFont(new Font("Segoe UI Emoji",Font.BOLD,16));
                           TXTapePat.setBackground(new Color(10,10,10));
                           TXTapePat.setForeground(Color.WHITE);
                           TXTapePat.setCaretColor(Color.WHITE);
                           PlaceHolder apePat=new PlaceHolder("Apellido Paterno",TXTapePat,PlaceHolder.Visibilidad.ALWAYS);
                           TXTapePat.setName("TXTapePat");
                           contenedor.add(TXTapePat);
                           ArrayAcompañantesApellidosPat.add(TXTapePat);

                           TXTapeMat.setBounds(10, 130, 270, 30);
                           TXTapeMat.setBorder(new MatteBorder(0,0,2,0,Color.WHITE));
                           TXTapeMat.setFont(new Font("Segoe UI Emoji",Font.BOLD,16));
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
                            ((JSpinner.DefaultEditor) SPNedad.getEditor()).getTextField().setFont(new Font("Segoe UI Emoji",Font.BOLD,14));
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
                                    FTXTdni.setFont(new Font("Segoe UI Emoji",Font.BOLD,16));
                                    FTXTdni.setForeground(Color.WHITE);
                                    FTXTdni.setCaretColor(Color.WHITE);
                                    contenedor.add(FTXTdni);
                                    ArrayAcompañantesDNI.add(FTXTdni);
                           } catch (ParseException ex) {
                                   System.out.println(ex);
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
    
         
         private void ReiniciarFormularioPasajeros(){
                  vista.PanelFormPasajeros.removeAll();
                  ArrayAcompañantesPaneles.clear();
                  vista.PanelFormPasajeros.setPreferredSize(new Dimension(850,200));
                  vista.ScrollPanelPasajeros.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                  vista.ScrollPanelPasajeros.getHorizontalScrollBar().setValue(0);
                  if (SesionSocio==null) {
                           vista.TxtNombrePasajero.setText(null);
                           vista.TxtApellidoMatePasajero.setText(null);
                           vista.TxtApellidoPatePasajero.setText(null);
                           vista.TxtDNIpasajero.setText(null);
                           vista.TxtcorreoPasajero.setText(null);
                           vista.SPNEdadPasajero.setValue(0);
                  }
    }

         
         private void Slider(JScrollBar scrollBar,int delay, int ValorDestino,int auxiliar) {
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
   
         
         private void generarAsientos(){
                  ArrayBusAsientos=new ArrayList<>();
                  int x=15;
                  int y=80;
                  int incremento;
                  for (int i = 1; i <=40; i++) {
                           JLabel asiento=new JLabel();
                           asiento.setBounds(x,y,32,32);
                           asiento.setName("A"+i);
                           asiento.setCursor(new Cursor(Cursor.HAND_CURSOR));
                           ArrayBusAsientos.add(asiento);
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
                  for (JLabel asientos : ArrayBusAsientos) {
                           asientos.addMouseListener(this);
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
                  if (vista.LBLasientosSeleccionados.getText().isBlank() ) {
                           vista.LBLasientosSeleccionados.setText(asiento);
                   }else{
                            vista.LBLasientosSeleccionados.setText(vista.LBLasientosSeleccionados.getText()+","+asiento);
                  }
         }
         
         
         private void asignarAsientos(){
                  int cantidadPasajeros=Integer.parseInt(vista.LBLasientosCont.getText());
                  String texto=vista.LBLasientosSeleccionados.getText();
                  String [] asientos=texto.split(",");
                  vista.LBLasientoPasajero.setText(asientos[0]);
                  for (int i = 0; i < cantidadPasajeros-1; i++) {
                           ArrayAcompañantesAsientos.get(i).setText(asientos[i+1]);
                  }
         }
         
         
         void InstanciarPropiedadesDateChooser(){
                  JCalendar calendarPanel = vista.DCfechaFiltros.getJCalendar();
                  calendarPanel.setDecorationBackgroundVisible(false);
                  calendarPanel.setForeground(Color.GREEN);
                  calendarPanel.getParent().setBackground(new Color(10, 10, 10));
                  
                  JDayChooser jdc=calendarPanel.getDayChooser();
                  jdc.setDayBordersVisible(false);
                  
                  for (int i = 0; i < jdc.getDayPanel().getComponentCount(); i++) {
                           jdc.getDayPanel().getComponent(i).setForeground(Color.WHITE);

                  }
                  JPanel pane=jdc.getDayPanel();
                  pane.setBackground(new Color(10,10,10));
                  
                  vista.DCfechaFiltros.getCalendarButton().setBorder(new LineBorder(Color.GREEN));
                  vista.DCfechaFiltros.setMinSelectableDate(Date.from(Instant.now()));
                  vista.DCfechaFiltros.getDateEditor().setEnabled(false);
                  vista.DCfechaFiltros.getDateEditor().getUiComponent().setFont(new Font("Consolas",Font.BOLD,16));
                 vista.DCfechaFiltros.addPropertyChangeListener(new PropertyChangeListener() {
         @Override
                  public void propertyChange(PropertyChangeEvent evt) {
                           if (evt.getPropertyName().equals("date")) {
                                    Date fechaSele= (Date) evt.getNewValue();
                                    fechafiltroAUX = fechaSele;
                                    
                           }
                  }
                  });
         }
         
         private void CargarCBfiltro(){
                  PreparedStatement ps=null;
                  ResultSet rs=null;
                  Connection con= cone.getConnection();
                  try {     
                           ps=con.prepareStatement("SELECT terminal_id, terminal_nombre FROM Terminales WHERE terminal_estado='Habilitado'");
                           rs=ps.executeQuery();
                           while (rs.next()) {
                                   vista.CBterminalLlegadaFiltro.addItem(rs.getString("terminal_id")+"-"+rs.getString("terminal_nombre"));
                                   vista.CBterminalSalidaFiltro.addItem(rs.getString("terminal_id")+"-"+rs.getString("terminal_nombre"));
                                   
                           }
                  } catch (SQLException e) {
                           System.err.println(e.toString());
                  }finally{
                           try {
                                    con.close();
                           } catch (SQLException ex) {
                                    System.out.println(ex);
                           }
                  }
         
         }
         
         
         private boolean LimpiarPanelesViajes(){
                  vista.PanelViajes.removeAll();
                  vista.PanelViajes.setPreferredSize(new Dimension(1100,560));
                  vista.ScrollPanelViajes.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
                  return true;
         }
         
        @Override
         public void actionPerformed(ActionEvent e) {

                  if (e.getSource()==vista.BTN_cerrarSesion) {
                           Login_Registro login=new Login_Registro();
                           CTRL_Login ctrlLogin=new CTRL_Login(login);
                           ctrlLogin.Iniciar();
                           Cerrar();
                  }
                  
                  if (e.getSource()==vista.BTN_infoSocio) {
                           if (!vista.BTN_infoSocio.isSelected()) {
                                    Slider(vista.ScrollPanelDinamico.getHorizontalScrollBar(), 10, 1100, 10);
                           }else{
                                    Slider(vista.ScrollPanelDinamico.getHorizontalScrollBar(), 10, 0, 10);
                           }    
                  }
                  

                  if (e.getSource()==vista.BTN_editarNombreSocio) {
                           Emergente input=new Emergente(vista,"Editar Nombre","Ingrese el nombre a reemplazar", Emergente.Tipo.InputDialog);
                           String nombre=input.MostrarInput();
                           SesionSocio.setNombre(nombre);
                           if (socioDAO.Actualizar(SesionSocio)) {
                                    vista.TXT_nombreSocio.setText(nombre);
                                    vista.LBLusuario.setText(nombre);
                           }
                           
                  }
                  if (e.getSource()==vista.BTN_editarPaternoSocio) {
                           Emergente input=new Emergente(vista,"Editar Apellido Paterno","Ingrese el apellido paterno a reemplazar", Emergente.Tipo.InputDialog);
                           String pat=input.MostrarInput();
                           SesionSocio.setApellidoPaterno(pat);
                           if (socioDAO.Actualizar(SesionSocio)) {
                                    vista.TXT_paternoSocio.setText(pat);
                           }
                  }
                   if (e.getSource()==vista.BTN_editarMaternoSocio) {
                           Emergente input=new Emergente(vista,"Editar Apellido Materno","Ingrese el apellido materno a reemplazar", Emergente.Tipo.InputDialog);
                           String mat=input.MostrarInput();
                           SesionSocio.setApellidoMaterno(mat);
                           if (socioDAO.Actualizar(SesionSocio)) {
                                    vista.TXT_maternoSocio.setText(mat);
                           }
                  }
                  if (e.getSource()==vista.BTN_editarFnacSocio) {
                           Emergente input=new Emergente(vista,"Editar fecha de nacimiento","Ingrese la nueva fecha de nacimiento", Emergente.Tipo.InputDialog);
                           String fnac=input.MostrarInput();
                           SesionSocio.setNacimiento(fnac);
                           if (socioDAO.Actualizar(SesionSocio)) {
                                    vista.TXT_fnacSocio.setText(fnac);
                           }
                  }
                  if (e.getSource()==vista.BTN_editarNumeroSocio) {
                           Emergente input=new Emergente(vista,"Editar número de contacto","Ingrese el nuevo número", Emergente.Tipo.InputDialog);
                           String num=input.MostrarInput();
                           SesionSocio.setNumero(num);
                           if (socioDAO.Actualizar(SesionSocio)) {
                                    vista.TXT_NumeroSocio.setText(num);
                           }
                  }
                  if (e.getSource()==vista.BTN_editarCorreoSocio) {
                           Emergente input=new Emergente(vista,"Editar correo electrónico","Ingrese el nuevo correo electrónico", Emergente.Tipo.InputDialog);
                           String correo=input.MostrarInput();
                           SesionSocio.setCorreo(correo);
                           if (socioDAO.Actualizar(SesionSocio)) {
                                    vista.TXT_correoSocio.setText(correo);
                           }
                  }
                  if (e.getSource()==vista.BTN_editarContraSocio) {
                           Emergente input=new Emergente(vista,"Editar contraseña","Ingrese la nueva contraseña", Emergente.Tipo.InputDialog);
                           String contra=input.MostrarInput();
                           SesionSocio.setContraseña(contra);
                           if (socioDAO.Actualizar(SesionSocio)) {
                                    vista.TXT_contraSocio.setText(contra);
                           }
                      
                  }
                  if (e.getSource()==vista.BTN_eliminarCuenta) {
                           Emergente confirmacion=new Emergente(vista, "Eliminación de cuenta", "Seguro que desea eliminar la cuenta?", Emergente.Tipo.ConfirmDialog);
                           int Opcion=confirmacion.MostrarConfirm();
                           
                           if (Opcion==1) {
                                    socioDAO.Eliminar(SesionSocio);
                                    Login_Registro login_registro=new Login_Registro();
                                    CTRL_Login login=new CTRL_Login(login_registro);
                                    login.Iniciar();
                                    Cerrar();
                           }
                  }
                  
                  if (e.getSource()==vista.BTN_aplicarFiltro) {
                           String fechafiltro="";
                           int idSalida=0;
                           int idLlegada=0;
                         
                           if (vista.CBterminalSalidaFiltro.getSelectedIndex()!=0) {
                                    String IDsalida=vista.CBterminalSalidaFiltro.getSelectedItem().toString().replaceAll("[^0-9]", "");
                                    idSalida=Integer.parseInt(IDsalida);
                          }
                           if (vista.CBterminalLlegadaFiltro.getSelectedIndex()!=0) {
                                    String IDllegada=vista.CBterminalLlegadaFiltro.getSelectedItem().toString().replaceAll("[^0-9]", "");
                                    idLlegada=Integer.parseInt(IDllegada);
                           }
                           if (fechafiltroAUX!=null) {
                                    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
                                    fechafiltro=formatoFecha.format(fechafiltroAUX);
                           }
                           cant_ViajesDisponibles=viajeDAO.CantidadFiltradaViajes(idSalida, idLlegada, fechafiltro);
                           if (LimpiarPanelesViajes()) {
                                    if (GenerarPaneles(cant_ViajesDisponibles)) {
                                             CargarPanelesViajes(viajeDAO.ListarViajesFiltrados(idSalida, idLlegada, fechafiltro));

                                    }
                           }               
                  }
                  
                  if (e.getSource()==vista.BTN_limpiarFiltro) {
                           fechafiltroAUX=null;
                           vista.CBterminalSalidaFiltro.setSelectedIndex(0);
                           vista.CBterminalLlegadaFiltro.setSelectedIndex(0);
                           ((JTextField) vista.DCfechaFiltros.getDateEditor().getUiComponent()).setText("");
                           cant_ViajesDisponibles=viajeDAO.CantidadTotalViajes();
                           if (LimpiarPanelesViajes()) {
                                    if (GenerarPaneles(cant_ViajesDisponibles)) {
                                             CargarPanelesViajes(viajeDAO.ListarViajes());

                                    }
                           }
                  }

                  
                  if (e.getSource()==vista.BTN_cancelarAsientos) {;
                           vista.LBLasientosSeleccionados.setText("");
                           vista.LBLasientosCont.setText("0");
                           vista.LBLprecio.setText("00.0");
                           vista.LBLPrecioTotal.setText("00.0");
                           Slider(vista.ScrollPanelDinamico.getHorizontalScrollBar(), 10,1100,10);
                  }

                  
                  if (e.getSource()==vista.BTN_confirmarAsientos) {
                            int cantidadPasajeros=Integer.parseInt(vista.LBLasientosCont.getText());
                           Slider(vista.ScrollPanelDinamico.getHorizontalScrollBar(),10, 3300,10);
                           generarFormsAcompañantes(cantidadPasajeros);
                           asignarAsientos();
                           
                  }

                  
                  if (e.getSource()==vista.BTN_cancelarPasajeros) {
              
                           Slider(vista.ScrollPanelDinamico.getHorizontalScrollBar(),10,2200,10);
                           ReiniciarFormularioPasajeros();
                  }
                  
                  if (e.getSource()==vista.BTN_IzquiAcompañantes) {
                      
                           int izquierda=vista.ScrollPanelPasajeros.getHorizontalScrollBar().getValue()-900;
                           Slider(vista.ScrollPanelPasajeros.getHorizontalScrollBar(),10, izquierda,5);
                  }

                  
                  if (e.getSource()==vista.BTN_derechaAcompañantes) {

                           int derecha=vista.ScrollPanelPasajeros.getHorizontalScrollBar().getValue()+900;
                           Slider(vista.ScrollPanelPasajeros.getHorizontalScrollBar(),10, derecha,5);
                           
                  }
                  
                  if (e.getSource()==vista.BTN_confirmarCompra) {
                           int cantidadPasajeros=Integer.parseInt(vista.LBLasientosCont.getText());
                           Acompañantes [] acomp=new Acompañantes[cantidadPasajeros-1];
                           PasajeroPrincipal pasajero=new PasajeroPrincipal(vista.TxtDNIpasajero.getText(), 
                                                                                                                viajeSeleccionado.getId(),
                                                                                                                vista.TxtNombrePasajero.getText(),
                                                                                                                vista.TxtApellidoPatePasajero.getText(), 
                                                                                                                vista.TxtApellidoMatePasajero.getText(), 
                                                                                                                (int) vista.SPNEdadPasajero.getValue(),
                                                                                                                vista.TxtcorreoPasajero.getText(),
                                                                                                                vista.LBLasientoPasajero.getText());
                           if (pasajero.ConAtributosVacios()) {
                                    Emergente msg=new Emergente(null, "Error", "Hay campos vacios en el Pasajero Principal", Emergente.Tipo.MessageDialog);
                                    msg.MostrarMSG();
                                    return;
                           }
                           if (!pasajero.dniValido()) {
                                    Emergente msg=new Emergente(null, "Error", "El pasajero principal debe tener un DNI válido", Emergente.Tipo.MessageDialog);
                                    msg.MostrarMSG();
                                    return;
                           }
                           if (!pasajero.CorreoValido()) {
                                    Emergente msg=new Emergente(null, "Error", "El pasajero principal debe tener un correo válido", Emergente.Tipo.MessageDialog);
                                    msg.MostrarMSG();
                                    return;
                           }
                           if (!pasajero.edadValida()) {
                                    Emergente msg=new Emergente(null, "Error", "El pasajero principal no puede ser menor de edad", Emergente.Tipo.MessageDialog);
                                    msg.MostrarMSG();
                                    return;
                           } 
                           
                           if (pasajeroDAO.ExisteEnPasajeros(pasajero)) {
                                    Emergente msg=new Emergente(null, "Error", "El pasajero principal ya esta registrado en el viaje ", Emergente.Tipo.MessageDialog);
                                    msg.MostrarMSG();
                                    return;
                           }
                           
                           if (pasajeroDAO.ExisteEnAcompañantes(pasajero)) {
                                    Emergente msg=new Emergente(null, "Error", "El pasajero principal ya esta registrado en el viaje ", Emergente.Tipo.MessageDialog);
                                    msg.MostrarMSG();
                                     return;
                           }
                           
                           if (acomp.length>0) {
                                    for (int i = 0; i <acomp.length; i++) {
                                             acomp[i]=new Acompañantes(ArrayAcompañantesDNI.get(i).getText(), 
                                                                                               pasajero,
                                                                                               viajeSeleccionado.getId(),
                                                                                               ArrayAcompañantesNombres.get(i).getText(),
                                                                                               ArrayAcompañantesApellidosPat.get(i).getText() , 
                                                                                               ArrayAcompañantesApellidosMat.get(i).getText(), 
                                                                                               (int) ArrayAcompañantesEdad.get(i).getValue(), 
                                                                                                ArrayAcompañantesAsientos.get(i).getText());
                                             if (i>0) {
                                                      for (int j = 0; j <i; j++) {
                                                               if (acomp[i].getDni().equals(acomp[j].getDni())) {
                                                                        Emergente msg=new Emergente(null,"Error","El DNI del acompañante "+(i+1)+" es el mismo del Acompañante "+(j+1), Emergente.Tipo.MessageDialog);
                                                                        msg.MostrarMSG();
                                                                        return;
                                                               }
                                                      }
                                             }
                                             if (acomp[i].ConAtributosVacios()) {
                                                      Emergente msg=new Emergente(null, "Error", "Hay campos vacios en el Acompañante "+(i+1), Emergente.Tipo.MessageDialog);
                                                      msg.MostrarMSG();
                                                      return;
                                             }
                                             if (!acomp[i].dniValido()) {
                                                      Emergente msg=new Emergente(null, "Error", "El acompañante "+(i+1)+" no tiene un DNI válido", Emergente.Tipo.MessageDialog);
                                                      msg.MostrarMSG();
                                                      return;
                                             }
                                             if (acomp[i].igualDNI()) {
                                                      Emergente msg=new Emergente(null, "Error", "El DNI del acompañante "+(i+1)+" es igual al del Pasajero Principal", Emergente.Tipo.MessageDialog);
                                                      msg.MostrarMSG();
                                                      return;
                                             }
                                             if (acompañanteDAO.ExisteEnPasajeros(acomp[i])) {
                                                      Emergente msg=new Emergente(null, "Error", "El acompañante "+(i+1)+"ya esta registrado en el viaje", Emergente.Tipo.MessageDialog);
                                                      msg.MostrarMSG();
                                                      return;
                                             }
                                             if (acompañanteDAO.ExisteEnAcompañantes(acomp[i])) {
                                                      Emergente msg=new Emergente(null, "Error", "El acompañante "+(i+1)+"ya esta registrado en el viaje", Emergente.Tipo.MessageDialog);
                                                      msg.MostrarMSG();
                                                      return;
                                             }
                                    }
                           }
                           
                           Emergente confirmacion=new Emergente(vista, "Confirmación", "¿Seguro que desea realizar esta compra?", Emergente.Tipo.ConfirmDialog);
                           int Opcion=confirmacion.MostrarConfirm();
                           if (Opcion==1) {
                                    Ventas  venta=new Ventas(vista.LBLfecha.getText(), 
                                                                        vista.LBLhora.getText(),
                                                                        viajeSeleccionado,
                                                                        pasajero,
                                                                        Integer.parseInt(vista.LBLasientosCont.getText()), 
                                                                        vista.LBLasientosSeleccionados.getText(),
                                                                        Double.parseDouble(vista.LBLPrecioTotal.getText()));
                           
                                    if (!pasajeroDAO.registrar(pasajero)) {
                                            return;
                                    }
                           
                                    if (!asientoDAO.DeshabilitarAsiento(pasajero)) {
                                             return;
                                    }
                           
                                    for (int i = 0; i < acomp.length; i++) {
                                             if (!acompañanteDAO.registrar(acomp[i])) {
                                                      return;
                                             }
                                             if (!asientoDAO.DeshabilitarAsiento(acomp[i])) {
                                                      return;
                                             }
                                    }
                           
                                    if (!ventaDAO.registrar(venta)) {
                                             return;
                                    }     
                           
                                    viajeSeleccionado.RestarAsientosDisponibles(venta.getNumAsientos());
                           
                                    if (!viajeDAO.ActualizarAsientosDisponibles(viajeSeleccionado)) {
                                             return;
                                    }
                           
                                    Interfaz_Principal reinicio_Interfaz=new Interfaz_Principal();
                                    CTRL_InterfazPrincipal reinicio_CTRl =new CTRL_InterfazPrincipal(reinicio_Interfaz,cant_ViajesDisponibles);
                           
                                    if (SesionSocio == null) {
                                             reinicio_CTRl.Iniciar();
                                             Cerrar();
                           
                                    }else{
                                             SesionSocio.AcumularPuntos(venta.getGanancia());
                                    
                                             if (socioDAO.ActualizarPuntos(SesionSocio)) {
                                                      reinicio_CTRl.Iniciar(SesionSocio);
                                                      Cerrar();
                                             }

                                    }
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
                  
                     if (e.getSource()==vista.BTN_cerrarSesion) {
                           vista.BTN_cerrarSesion.setBackground(new Color(51,54, 80));
                     }
                     
                      
                     if (e.getSource()==vista.BTN_cancelarAsientos) {
                           vista.BTN_cancelarAsientos.setBackground(new Color(51,54, 80));
                     }
                     
                     if (e.getSource()==vista.BTN_confirmarAsientos) {
                         vista.BTN_confirmarAsientos.setBackground(new Color(51,54, 80));
                     }
                     
                      if (e.getSource()==vista.BTN_cancelarPasajeros) {
                           vista.BTN_cancelarPasajeros.setBackground(new Color(51,54, 80));
                     }
                     
                     if (e.getSource()==vista.BTN_confirmarCompra) {
                           vista.BTN_confirmarCompra.setBackground(new Color(51,54, 80));
                     }
                     
                     

                     for (JLabel asiento : ArrayBusAsientos) {
                                 URL urlAsientoDisp = getClass().getResource("/IMGS/asientoDisp.png");
                                 ImageIcon asientoDisp=new ImageIcon(urlAsientoDisp);
                                 URL urlAsientoSele = getClass().getResource("/IMGS/asientoSele.png");
                                 ImageIcon asientoSele=new ImageIcon(urlAsientoSele);
              
                                 if (e.getSource()==asiento ) {
                                          int cantidadPasajeros=Integer.parseInt(vista.LBLasientosCont.getText());
                                          double precioAcumulado=Double.parseDouble(vista.LBLprecio.getText());
                                           if (asiento.getBackground().equals(Color.GREEN)) {
                                                      asiento.setBackground(Color.BLUE);
                                                      asiento.setIcon(asientoSele);
                                                      cantidadPasajeros++;
                                                      precioAcumulado=precioAcumulado+viajeSeleccionado.getPrecio();
                                                      vista.LBLprecio.setText(precioAcumulado+"");
                                                      vista.LBLPrecioTotal.setText(precioAcumulado+"");
                                                      vista.LBLasientosCont.setText(String.valueOf(cantidadPasajeros));
                                                      vista.BTN_confirmarAsientos.setVisible(true);
                                                      seleccionarAsiento(asiento.getName()); 
                                                      return;
                                           }
                                           if (asiento.getBackground().equals(Color.BLUE)) {
                                                     asiento.setBackground(Color.GREEN);
                                                     asiento.setIcon(asientoDisp);
                                                     cantidadPasajeros--;
                                                     precioAcumulado=precioAcumulado-viajeSeleccionado.getPrecio();
                                                     vista.LBLprecio.setText(precioAcumulado+"");
                                                     vista.LBLPrecioTotal.setText(precioAcumulado+"");
                                                     vista.LBLasientosCont.setText(String.valueOf(cantidadPasajeros));
                                                     deseleccionarAsiento(asiento.getName());
                                           }

                                           if (cantidadPasajeros==0) {
                                                     vista.BTN_confirmarAsientos.setVisible(false);
                                           }

                                }
                      }
                  
                  
                     for (PanelPersonalizado paneles : ArrayPaneles) {
                         
                                if (e.getSource()==paneles) {
                                             int id=Integer.parseInt(paneles.getName());
                                             CargarInfoViaje(id);
                                             CargarAsientos(id);
                                             viajeSeleccionado=viajeDAO.ObtenerDatoViaje(id);
                                             viajeSeleccionado.setId(id);
                                             Slider(vista.ScrollPanelDinamico.getHorizontalScrollBar(),10,2200,10);
                                }
                     }
                  
         }

    @Override
         public void mouseReleased(MouseEvent e) {
       
    }

    @Override
         public void mouseEntered(MouseEvent e) {
        
                  if (e.getSource()==vista.BTN_cerrarSesion) {
                           vista.BTN_cerrarSesion.setFont(new  Font("Consolas",Font.BOLD,16));
                           vista.BTN_cerrarSesion.setBorder(new LineBorder(Color.GREEN));
                           vista.BTN_cerrarSesion.setBackground(new Color(21,24, 30));
                  }
                  
                  if (e.getSource()==vista.BTN_infoSocio) {
                           vista.BTN_infoSocio.setFont(new  Font("Segoe UI Emoji",Font.BOLD,20));
                  }
                  
                  for (PanelPersonalizado paneles : ArrayPaneles) {
                          if (e.getSource()==paneles) {
                                    paneles.setColorInicial(new Color(26,30, 36));
                                    paneles.setColorFinal(Color.BLACK);
                                    paneles.setBorder(new LineBorder(Color.GREEN,1,true));
                           }
                  }
                  
                  for (JLabel asiento : ArrayBusAsientos) {
                           if (e.getSource()==asiento) {
                                    vista.LBLasientoName.setText(asiento.getName());
                           }
                  }

                  
                  if (e.getSource()==vista.BTN_cancelarAsientos) {
                           vista.BTN_cancelarAsientos.setFont(new Font("Consolas",Font.BOLD,18));
                           vista.BTN_cancelarAsientos.setBorder(new LineBorder(Color.GREEN));
                           vista.BTN_cancelarAsientos.setBackground(new Color(21,24, 30));
                  }

                  
                    if (e.getSource()==vista.BTN_confirmarAsientos) {
                           vista.BTN_confirmarAsientos.setFont(new Font("Consolas",Font.BOLD,18));
                           vista.BTN_confirmarAsientos.setBorder(new LineBorder(Color.GREEN));
                           vista.BTN_confirmarAsientos.setBackground(new Color(21,24, 30));
                  }

                  
                  if (e.getSource()==vista.BTN_cancelarPasajeros) {
                           vista.BTN_cancelarPasajeros.setFont(new Font("Consolas",Font.BOLD,18));
                           vista.BTN_cancelarPasajeros.setBorder(new LineBorder(Color.GREEN));
                           vista.BTN_cancelarPasajeros.setBackground(new Color(21,24, 30));
                  }

                  
                  if (e.getSource()==vista.BTN_confirmarCompra) {
                           vista.BTN_confirmarCompra.setFont(new Font("Consolas",Font.BOLD,18));
                           vista.BTN_confirmarCompra.setBorder(new LineBorder(Color.GREEN));
                           vista.BTN_confirmarCompra.setBackground(new Color(21,24, 30));
                  }
                  
         }
    
    @Override
         public void mouseExited(MouseEvent e) {
                    
                  if (e.getSource()==vista.BTN_cerrarSesion) {
                           vista.BTN_cerrarSesion.setFont(new  Font("Consolas",Font.PLAIN,16));
                           vista.BTN_cerrarSesion.setBorder(new LineBorder(new Color(123,216,80)));
                           vista.BTN_cerrarSesion.setBackground(new Color(6,6,6));
                  }
                  
                  if (e.getSource()==vista.BTN_infoSocio) {
                           vista.BTN_infoSocio.setFont(new  Font("Segoe UI Emoji",Font.PLAIN,20));
                           if (vista.BTN_infoSocio.isSelected()) {
                                    vista.BTN_infoSocio.setFont(new  Font("Segoe UI Emoji",Font.BOLD,20)); 
                           }
                  }
        
                  for (PanelPersonalizado paneles : ArrayPaneles) {
                          if (e.getSource()==paneles) {
                                    paneles.setColorInicial(new Color(12,12,12));
                                    paneles.setColorFinal(Color.BLACK);
                                    paneles.setBorder(new LineBorder(new Color(123,216,80),1,true));
                           }
                  }
                  
                  for (JLabel asiento : ArrayBusAsientos) {
                           if (e.getSource()==asiento) {
                                    vista.LBLasientoName.setText("");
                           }
                  }
        
                  if (e.getSource()==vista.BTN_cancelarAsientos) {
                           vista.BTN_cancelarAsientos.setFont(new Font("Consolas",Font.PLAIN,18));
                           vista.BTN_cancelarAsientos.setBorder(new LineBorder(new Color(123,216,80)));
                           vista.BTN_cancelarAsientos.setBackground(new Color(6,6,6));
                  }
         
                  if (e.getSource()==vista.BTN_confirmarAsientos) {
                           vista.BTN_confirmarAsientos.setFont(new Font("Consolas",Font.PLAIN,18));
                           vista.BTN_confirmarAsientos.setBorder(new LineBorder(new Color(123,216,80)));
                           vista.BTN_confirmarAsientos.setBackground(new Color(6,6,6));
                  }
         
                  if (e.getSource()==vista.BTN_cancelarPasajeros) {
                           vista.BTN_cancelarPasajeros.setFont(new  Font("Consolas",Font.PLAIN,18));
                           vista.BTN_cancelarPasajeros.setBorder(new LineBorder(new Color(123,216,80)));
                           vista.BTN_cancelarPasajeros.setBackground(new Color(6,6,6));
                  }
         
                  if (e.getSource()==vista.BTN_confirmarCompra) {
                           vista.BTN_confirmarCompra.setFont(new  Font("Consolas",Font.PLAIN,18));
                           vista.BTN_confirmarCompra.setBorder(new LineBorder(new Color(123,216,80)));
                           vista.BTN_confirmarCompra.setBackground(new Color(6,6,6));
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
         public void focusGained(FocusEvent e) {
         
         }

    @Override
         public void focusLost(FocusEvent e) {
       
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
