
package CONTROLADOR;

import DAO.AsientosDAO;
import MODELO.Conexion;
import MODELO.Viajes;
import DAO.ViajesDAO;
import UTILIDADES.Emergente;
import VISTA.Panel_GestionViajes;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDayChooser;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class CTRL_PanelViajes implements ActionListener,MouseListener,ChangeListener{
    
         public static  SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
         public static SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");
         
         private Panel_GestionViajes panel;
         
         private byte [] bytes=null;
         private File archivo;
         
         private ViajesDAO viajeDAO=new ViajesDAO();
        private AsientosDAO asientoDAO=new AsientosDAO();
         private Date fechaAuxiliarDC=null;
         private Date fechaSalidaCompleta=null;
         private Date fechaLlegadaCompleta=null;
         
         private Conexion cone=new Conexion();
         
         public  CTRL_PanelViajes(Panel_GestionViajes panel){
             
                  this.panel=panel;
                  
                  this.panel.BTN_guardar_viajes.addActionListener(this);
                  
                  this.panel.BTN_eliminar_viajes.addActionListener(this);
                  
                  this.panel.BTN_nuevo_viajes.addActionListener(this);
                  
                  this.panel.BTN_volver.addActionListener(this);
                  
                  this.panel.BTN_infoViaje.addActionListener(this);
                  
                  this.panel.TBL_viajes.addMouseListener(this);
                  
                  this.panel.LBL_img_referencial.addMouseListener(this);
                  
                  InstanciarModeloSpinner(this.panel.SPNviaje_horaSalida);
                  InstanciarValorSpinner(this.panel.SPNviaje_horaSalida, "00:00");
                  
                  InstanciarModeloSpinner(this.panel.SPNviaje_duracion);
                  InstanciarValorSpinner(this.panel.SPNviaje_duracion, "00:00");
                  
                  InstanciarPropiedadesDateChooser();
                  
                  this.panel.SPNviaje_horaSalida.addChangeListener(this);
                  this.panel.SPNviaje_duracion.addChangeListener(this);
                  
                  ((JSpinner.DefaultEditor) panel.SPNviaje_precio.getEditor()).getTextField().setEditable(false);
                  
                  panel.BTN_infoViaje.setVisible(false);
                  
                  CargarIDsTerminales();
                  ListarViajes();
         }
         
         
         
         public Panel_GestionViajes getPanel(){
                  return  panel;
         }
         
         
         void CargarIDsTerminales(){
                  PreparedStatement ps=null;
                  ResultSet rs=null;
                  Connection con= cone.getConnection();
                  try {     
                           ps=con.prepareStatement("SELECT terminal_id, terminal_nombre FROM Terminales WHERE terminal_estado='Habilitado'");
                           rs=ps.executeQuery();
                           while (rs.next()) {
                                   panel.CBviaje_terminal_Llegada.addItem(rs.getString("terminal_id")+"-"+rs.getString("terminal_nombre"));
                                   panel.CBviaje_terminal_Salida.addItem(rs.getString("terminal_id")+"-"+rs.getString("terminal_nombre"));
                                   
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
         
         void ListarViajes(){
                  panel.TBL_viajes.getTableHeader().setFont(new Font("Consolas", Font.PLAIN, 10));
                  panel.TBL_viajes.getTableHeader().setBorder(new EmptyBorder(1,1,1,1));
                  panel.TBL_viajes.getTableHeader().setForeground(Color.GREEN);
                  panel.TBL_viajes.getTableHeader().setBackground(new Color(6,6,6));
                  
                   DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                   centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
                   
                  PreparedStatement ps=null;
                  ResultSet rs=null;
                  Connection con=cone.getConnection();
                  try {
                           DefaultTableModel modelo=new DefaultTableModel(){
                  @Override
                           public boolean isCellEditable(int row, int column) {
                                    if (column==10) {
                                             return true;
                                    }else{
                                             return false;
                                    }
                           }
                           };   
                           panel.TBL_viajes.setModel(modelo); 
                           String sql="SELECT v.viaje_id, ts.terminal_nombre AS terminal_salida, tl.terminal_nombre AS terminal_llegada, v.viaje_fecha_salida, v.viaje_hora_salida, v.viaje_fecha_llegada, v.viaje_hora_llegada, v.viaje_distancia, v.viaje_asientos_Dispo, v.viaje_precio\n" +
                                              "FROM Viajes v \n" +
                                              "JOIN Terminales ts ON v.viaje_terminal_salida = ts.terminal_id \n" +
                                              "JOIN Terminales tl ON v.viaje_terminal_llegada = tl.terminal_id;";
                           ps=con.prepareStatement(sql);
                           rs=ps.executeQuery();
                           ResultSetMetaData rsMD=(ResultSetMetaData) rs.getMetaData();
                           int cantColumnas=rsMD.getColumnCount();
                           modelo.addColumn("ID");
                           modelo.addColumn("Terminal/Salida");
                           modelo.addColumn("Terminal/ Llegada");
                           modelo.addColumn("Fecha/Salida"); 
                           modelo.addColumn("Hora/Salida");
                           modelo.addColumn("Fecha/Llegada");
                           modelo.addColumn("Hora/LLegada");
                           modelo.addColumn("Distancia");
                           modelo.addColumn("A. Dispo.");
                           modelo.addColumn("Precio");
                           int espacios[]={40,180,180,100,100,90,90,90,100,60};
                           for (int j = 0; j < cantColumnas; j++) {
                                    panel.TBL_viajes.getColumnModel().getColumn(j).setPreferredWidth(espacios[j]);
                                    panel.TBL_viajes.getColumnModel().getColumn(j).setCellRenderer(centerRenderer);
                           }
                           while (rs.next()) {
                                    Object [] filas = new Object[cantColumnas];
                                    for (int i = 0; i < cantColumnas; i++) {
                                             filas[i]= rs.getObject(i+1);
                                    }
                                    modelo.addRow(filas);
                           }
                  } catch (SQLException e) {
                           System.err.println(e);
                  }finally{
                           try {
                                    con.close();
                           } catch (SQLException e) {
                                    System.out.println(e);
                           }
                  }
         }
         
         
         
         void  Seleccionar(Viajes viaje) {
                  try {
                           Seleccion_ID_CB(panel.CBviaje_terminal_Llegada,viaje.getTerminalLlegada());
                           Seleccion_ID_CB(panel.CBviaje_terminal_Salida, viaje.getTerminalSalida());
                           
                           Date fecha = formatoFecha.parse(viaje.getFechaSalida());
                           panel.DCviaje_fechaSalida.setDate(fecha);
                           fechaAuxiliarDC=fecha;
                           
                           InstanciarValorSpinner(panel.SPNviaje_horaSalida, viaje.getHoraSalida());
                           InstanciarValorSpinner(panel.SPNviaje_duracion, viaje.getDuracion());
                           
                           panel.LBLviaje_fechaLlegada.setText(viaje.getFechaLlegada());
                           panel.LBLviaje_horaLlegada.setText(viaje.getHoraLlegada());
                           panel.TXTviaje_distancia.setText(viaje.getDistancia());
                           panel.SPNviaje_precio.setValue(viaje.getPrecio());
                           bytes=viaje.getImg();
                           ImageIcon imagen = new ImageIcon(viaje.getImg());
                           panel.LBL_img_referencial.setIcon(imagen);
                           panel.BTN_infoViaje.setVisible(true);
                  } catch (ParseException ex) {
                           System.out.println(ex);
                  } 
         }
         
         
         void Seleccion_ID_CB(JComboBox comboBox, int id){
                  int indiceSeleccionado = -1;
                  for (int i = 0; i < comboBox.getItemCount(); i++) {
                            String item = (String) comboBox.getItemAt(i);
                           if (item.startsWith(id + "-")) {
                                    indiceSeleccionado = i;
                                    break;
                           }
                  }
                  if (indiceSeleccionado != -1) {
                           comboBox.setSelectedIndex(indiceSeleccionado);
                  }
         }
         
         
         void ReiniciarCampos(){
                  bytes=null;
                  panel.CBviaje_terminal_Llegada.setSelectedIndex(0);
                  panel.CBviaje_terminal_Salida.setSelectedIndex(0);
                  panel.TXTviaje_distancia.setText(null);
                  InstanciarValorSpinner(panel.SPNviaje_duracion,"00:00");
                  InstanciarValorSpinner(panel.SPNviaje_horaSalida,"00:00");
                  panel.SPNviaje_precio.setValue(0);
                  panel.LBL_img_referencial.setIcon(null);
                  panel.LBLviaje_fechaLlegada.setText(null);
                  panel.LBLviaje_horaLlegada.setText(null);
                  fechaAuxiliarDC=null;
                  ((JTextField) panel.DCviaje_fechaSalida.getDateEditor().getUiComponent()).setText("");
                  panel.BTN_infoViaje.setVisible(false);
         }
         
         
         void Slider(JScrollBar scrollBar,int delay, int ValorDestino,int auxiliar) {
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
         
         
         
         void InstanciarPropiedadesDateChooser(){
                  JCalendar calendarPanel = panel.DCviaje_fechaSalida.getJCalendar();
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
                  
                  panel.DCviaje_fechaSalida.getCalendarButton().setBorder(new LineBorder(Color.GREEN));
                  panel.DCviaje_fechaSalida.setMinSelectableDate(Date.from(Instant.now()));
                  panel.DCviaje_fechaSalida.getDateEditor().setEnabled(false);
                  panel.DCviaje_fechaSalida.getDateEditor().getUiComponent().setFont(new Font("Consolas",Font.BOLD,16));
                  panel.DCviaje_fechaSalida.addPropertyChangeListener(new PropertyChangeListener() {
         @Override
                  public void propertyChange(PropertyChangeEvent evt) {
                           if (evt.getPropertyName().equals("date")) {
                                    Date fechaSele= (Date) evt.getNewValue();
                                    fechaAuxiliarDC=fechaSele;
                                    
                                    String fechaSeleccionada = formatoFecha.format(fechaAuxiliarDC);
                                    panel.LBLviaje_fechaLlegada.setText(fechaSeleccionada);
                                    
                                    InstanciarValorSpinner(panel.SPNviaje_horaSalida, "00:00");
                                    
                                    InstanciarValorSpinner(panel.SPNviaje_duracion, "00:00");
                           }
                  }
                  });
         }
         
         void InstanciarModeloSpinner(JSpinner spn){
                  SpinnerDateModel model = new SpinnerDateModel();
                  spn.setModel(model);
                  JSpinner.DateEditor editor = new JSpinner.DateEditor(spn, "HH:mm");
                  spn.setEditor(editor);
                  spn.addChangeListener(new ChangeListener() {
            @Override
                  public void stateChanged(ChangeEvent e) {
                           Date fechaSeleccionada = (Date)  spn.getValue();
                           Calendar calendar = Calendar.getInstance();
                           calendar.setTime(fechaSeleccionada);
                  }
                  });
         }
              
         void InstanciarValorSpinner(JSpinner spn,String hora){
                  Date horaInicial;
                  try {
                           horaInicial = formatoHora.parse(hora);
                           spn.setValue(horaInicial);
                 } catch (ParseException ex) {
                           System.out.println(ex);
                  }
         }
         
         
         void AbrirFileChooser() {
                  JFileChooser FC = new JFileChooser();
                  FC.setFileSelectionMode(JFileChooser.FILES_ONLY);
                  FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de imagen", "jpg", "jpeg", "png");
                  FC.setFileFilter(filtro);
                  int seleccion = FC.showOpenDialog(null);
                  if (seleccion == JFileChooser.APPROVE_OPTION) {
                           archivo = FC.getSelectedFile();
                           try {
                                    bytes = Files.readAllBytes(archivo.toPath());
                                    ImageIcon imagen = new ImageIcon(bytes);
                                    panel.LBL_img_referencial.setIcon(imagen);
                           } catch (IOException ex) {
                                    System.out.println(ex);
                           }
                  }
         }
         
         
         
         void CalcularFechaHoraLlegada(Date horaSalida, Date duracion){
                  if (this.fechaAuxiliarDC!=null  &&  horaSalida!=null && duracion!=null) {
                      
                           Calendar fechaSalidaCalendar = Calendar.getInstance();
                           fechaSalidaCalendar.setTime(this.fechaAuxiliarDC);

                           Calendar horaSalidaCalendar = Calendar.getInstance();
                           horaSalidaCalendar.setTime(horaSalida);

                           Calendar duracionCalendar = Calendar.getInstance();
                           duracionCalendar.setTime(duracion);
                           
                           Calendar LlegadaCalendar=Calendar.getInstance();
                           LlegadaCalendar.setTime(fechaAuxiliarDC);
                           
                           LlegadaCalendar.set(Calendar.HOUR_OF_DAY,horaSalidaCalendar.get(Calendar.HOUR_OF_DAY));
                           LlegadaCalendar.set(Calendar.MINUTE,horaSalidaCalendar.get(Calendar.MINUTE));
                           
                           LlegadaCalendar.add(Calendar.HOUR_OF_DAY,duracionCalendar.get(Calendar.HOUR_OF_DAY));
                           LlegadaCalendar.add(Calendar.MINUTE,duracionCalendar.get(Calendar.MINUTE));
                           
                           Date fechaLlegada=LlegadaCalendar.getTime();
                           
                           String llegadaFecha =formatoFecha.format(fechaLlegada);
                           String llegadaHora=formatoHora.format(fechaLlegada);
                           
                           panel.LBLviaje_fechaLlegada.setText(llegadaFecha);
                           panel.LBLviaje_horaLlegada.setText(llegadaHora);                        
                 }    
         }
         
         
         private void CalcularTiempoRestante(Date fechaSalida,Date fechaLlegada){
                  Date fechaActual=new Date();
                  
                  long longActual=fechaActual.getTime();
                  long longSalida=fechaSalida.getTime();
                  long longLlegada=fechaLlegada.getTime();
                  long longDuracion=longLlegada-longSalida;
                  
                  long tiempoRestante = longSalida - longActual;
                  long dias = TimeUnit.MILLISECONDS.toDays(tiempoRestante);
                  long horas = TimeUnit.MILLISECONDS.toHours(tiempoRestante)%24;
                  long minutos = TimeUnit.MILLISECONDS.toMinutes(tiempoRestante) % 60;
                  long segundos = TimeUnit.MILLISECONDS.toSeconds(tiempoRestante) % 60;
                  
                  String T_restante="";
                  if (dias > 0) {
                           T_restante+=dias+"D ";
                   }
                  if (horas > 0) {
                           T_restante+=horas+"h ";
                  }
                 if (minutos >0) {
                            T_restante+=minutos+"min ";
                  }
                  if (segundos >0 ) {
                            T_restante+=segundos+"seg ";
                  }
                  
                  if (fechaActual.compareTo(fechaSalida)<0) {    
                           panel.LBL_infoViajeEstado.setText("Planificado");
                           panel.PB_viajeProgreso.setValue(0);       
                           panel.LBL_infoTiempoRestante.setText(T_restante);
                           
                  }else if (fechaActual.compareTo(fechaSalida)>0) {  
                            double act=longActual;
                            double sal=longSalida;
                            double dur=longDuracion;
                            double val=((act-sal)/dur)*100;
                            int porcentaje=(int) val;
                            
                           panel.PB_viajeProgreso.setValue(porcentaje);          
                           panel.LBL_infoViajeEstado.setText("En curso");
                           panel.LBL_infoTiempoRestante.setText("El viaje esta en curso");

                           
                           if (fechaActual.compareTo(fechaLlegada)>0) { 
                               
                                    panel.LBL_infoViajeEstado.setText("Finalizado");
                                    panel.LBL_infoTiempoRestante.setText("El viaje esta finalizado");
                                    
                           }
                  }
         }
         
         
         void CargarViajeInfoDetalle(int id){
                  String fechaSalida=null;
                  String fechaLlegada=null;
                  String horaSalida=null;
                  String horaLlegada=null;
                  
                  String sql="SELECT ts.terminal_nombre AS terminal_salida, tl.terminal_nombre AS terminal_llegada, v.viaje_fecha_salida, v.viaje_hora_salida, v.viaje_fecha_llegada, v.viaje_hora_llegada,SUM(vt. venta_ganancia) AS viaje_ganancia\n"+ 
                                    "FROM Viajes v\n "+
                                    "JOIN Terminales ts ON v.viaje_terminal_salida = ts.terminal_id\n"+
                                    "JOIN Terminales tl ON v.viaje_terminal_llegada = tl.terminal_id\n"+
                                    "JOIN Ventas vt ON v.viaje_id = vt.venta_viaje_id\n"+
                                    "WHERE v.viaje_id=?";
                  
                  PreparedStatement ps=null;
                  ResultSet rs=null;
                  Connection con=cone.getConnection();
                  try {
                           ps=con.prepareStatement(sql);
                           ps.setInt(1, id);
                           rs=ps.executeQuery();
                           while(rs.next()){
                                    panel.LBL_infoGanancia.setText("S/ "+rs.getDouble("viaje_ganancia"));
                                    panel.LBL_infoViajeID.setText(id+"");
                                    panel.LBL_infoTerminalLlegada.setText(rs.getString("terminal_llegada"));
                                    panel.LBL_infoTerminalSalida.setText(rs.getString("terminal_salida"));
                                    fechaSalida=rs.getString("viaje_fecha_salida");
                                    horaSalida=rs.getString("viaje_hora_salida");
                                    fechaLlegada=rs.getString("viaje_fecha_llegada");
                                    horaLlegada=rs.getString("viaje_hora_llegada");
                                    panel.LBL_infoFechaSalida.setText(fechaSalida+" - "+horaSalida);
                                    panel.LBL_infoFechaLlegada.setText(fechaLlegada+" - "+horaLlegada); 
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
  
                  try {
                           Date fecha_salida=formatoFecha.parse(fechaSalida);
                           Date hora_salida=formatoHora.parse(horaSalida);
                           
                           Date fecha_llegada=formatoFecha.parse(fechaLlegada);
                           Date hora_llegada=formatoHora.parse(horaLlegada);
                           
                           Calendar calendarFechaSalida=Calendar.getInstance();
                           calendarFechaSalida.setTime(fecha_salida);
                           
                           Calendar calendarHoraSalida=Calendar.getInstance();
                           calendarHoraSalida.setTime(hora_salida);
                           
                           calendarFechaSalida.set(Calendar.HOUR_OF_DAY,calendarHoraSalida.get(Calendar.HOUR_OF_DAY));
                           calendarFechaSalida.set(Calendar.MINUTE,calendarHoraSalida.get(Calendar.MINUTE));
                           calendarFechaSalida.set(Calendar.SECOND,calendarHoraSalida.get(Calendar.SECOND));
                           
                           fechaSalidaCompleta=calendarFechaSalida.getTime();
                           
                           Calendar calendarFechaLlegada=Calendar.getInstance();
                           calendarFechaLlegada.setTime(fecha_llegada);
                           
                           Calendar calendarHoraLlegada=Calendar.getInstance();
                           calendarHoraLlegada.setTime(hora_llegada);
                           
                           calendarFechaLlegada.set(Calendar.HOUR_OF_DAY,calendarHoraLlegada.get(Calendar.HOUR_OF_DAY));
                           calendarFechaLlegada.set(Calendar.MINUTE,calendarHoraLlegada.get(Calendar.MINUTE));
                           calendarFechaLlegada.set(Calendar.SECOND,calendarHoraLlegada.get(Calendar.SECOND));
                           
                           fechaLlegadaCompleta=calendarFechaLlegada.getTime();
                           
                  } catch (ParseException ex) {
                           Logger.getLogger(CTRL_PanelViajes.class.getName()).log(Level.SEVERE, null, ex);
                  }
                  
                 CalcularTiempoRestante(fechaSalidaCompleta, fechaLlegadaCompleta);
                 Timer temporizador = new Timer(1000, new ActionListener() {
                     
                           public void actionPerformed(ActionEvent e) {
                          
                                    CalcularTiempoRestante(fechaSalidaCompleta, fechaLlegadaCompleta);
                                    
                                    if (panel.LBL_infoViajeEstado.getText().equals("Finalizado")) {
                                            ((Timer) e.getSource()).stop();
                                    }
                                    if (!panel.BTN_volver.isOpaque()) {
                                             ((Timer) e.getSource()).stop();
                                    }
                                    if (!panel.BTN_volver.isShowing()) {
                                             ((Timer) e.getSource()).stop();
                                    }

                           }
                 });
                 temporizador.start();              
         }
         
         
         
         void CargarViajeInfoPasajeros(int id){
                  panel.TBL_viajesAsientos.getTableHeader().setFont(new Font("Consolas", Font.PLAIN, 12));
                  panel.TBL_viajesAsientos.getTableHeader().setBorder(new LineBorder(Color.WHITE,1));
                  panel.TBL_viajesAsientos.getTableHeader().setForeground(Color.GREEN);
                  panel.TBL_viajesAsientos.getTableHeader().setBackground(new Color(6,6,6));
                  
                  DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                  centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
                   
                  PreparedStatement ps=null;
                  ResultSet rs=null;
                  Connection con=cone.getConnection();
                  try {
                          DefaultTableModel modelo=new DefaultTableModel(){
                  @Override
                          public boolean isCellEditable(int row, int column) {
                                   if (column==2) {
                                            return true;
                                   }else{
                                            return false;
                                   }
                          }
                          };   
                           panel.TBL_viajesAsientos.setModel(modelo); 
                           String sql="SELECT a.asiento_codigo,COALESCE(p.pasajeroPrincipal_nombreCompleto, c.acompañante_nombreCompleto) AS pasajero\n" +
                                             "FROM asientos a\n" +
                                             "LEFT JOIN (\n" +
                                             "    SELECT pasajeroPrincipal_viaje_id, pasajeroPrincipal_asiento, CONCAT_WS(' ', pasajeroPrincipal_nombre, pasajeroPrincipal_apellido_paterno, pasajeroPrincipal_apellido_materno) AS pasajeroPrincipal_nombreCompleto\n" +
                                             "    FROM PasajerosPrincipales\n" +
                                             ") p ON a.asiento_viaje_id = p.pasajeroPrincipal_viaje_id AND a.asiento_codigo = p.pasajeroPrincipal_asiento\n" +
                                             "LEFT JOIN (\n" +
                                             "    SELECT acompañante_viaje_id, acompañante_asiento, CONCAT_WS(' ', acompañante_nombre, acompañante_apellido_paterno, acompañante_apellido_materno) AS acompañante_nombreCompleto\n" +
                                             "    FROM Acompañantes\n" +
                                             ") c ON a.asiento_viaje_id = c.acompañante_viaje_id AND a.asiento_codigo = c.acompañante_asiento\n" +
                                             "WHERE a.asiento_viaje_id = ?\n" +
                                             "ORDER BY CAST(SUBSTRING(a.asiento_codigo, 2) AS UNSIGNED);";
                           
                           ps=con.prepareStatement(sql);
                           ps.setInt(1, id);
                           rs=ps.executeQuery();
                           ResultSetMetaData rsMD=(ResultSetMetaData) rs.getMetaData();
                           int cantColumnas=rsMD.getColumnCount();
                           modelo.addColumn("Asiento");
                           modelo.addColumn("Pasajero");
                           int espacios[]={30,200};
                           for (int j = 0; j < cantColumnas; j++) {
                                    panel.TBL_viajesAsientos.getColumnModel().getColumn(j).setPreferredWidth(espacios[j]);
                                    panel.TBL_viajesAsientos.getColumnModel().getColumn(j).setCellRenderer(centerRenderer);
                           }
                           while (rs.next()) {
                                    Object [] filas = new Object[cantColumnas];
                                    for (int i = 0; i < cantColumnas; i++) {
                                             filas[i]= rs.getObject(i+1);
                                    }
                                    modelo.addRow(filas);
                           }
                  } catch (SQLException e) {
                           System.err.println(e);
                  }finally{
                           try {
                                    con.close();
                           } catch (SQLException e) {
                                    System.out.println(e);
                           }
                  }
         
         }
         
         
         void CargarViajeInfoBuss(int id){
                  int x=20;
                  int y=80;
                  int incremento;
                  PreparedStatement ps=null;
                  ResultSet rs=null;
                  Connection con=cone.getConnection();
                  int i=0;
                  try {
                           ps=con.prepareStatement("SELECT asiento_estado FROM Asientos WHERE asiento_viaje_id=?");
                           ps.setInt(1,id );
                           rs=ps.executeQuery();
                           while (rs.next()) {                          
                                    JLabel asiento=new JLabel();
                                    asiento.setBounds(x,y,32,32);
                                    asiento.setText("A"+(i+1));
                                    asiento.setFont(new Font("Consolas",Font.BOLD,15));
                                    asiento.setOpaque(true); 
                                    asiento.setHorizontalAlignment(SwingConstants.CENTER);
                                    panel.Buss.add(asiento);
                                    if ((i+1)%2==0) {
                                             incremento=120;
                                             x+=incremento;
                                    }else{
                                             incremento=60;
                                             x+=incremento;
                                    }
                                    if ((i+1)%4==0) {
                                             x=20;
                                             y+=50;
                                    }
                                    if (rs.getString("asiento_estado").equals("Ocupado")) {
                                             asiento.setBackground(Color.RED);
                                             asiento.setForeground(Color.WHITE);
                                    }else{ 
                                             asiento.setBackground(Color.GREEN);
                                             asiento.setForeground(Color.BLACK);
                                    }
                                    i++;
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
         
         
         
@Override
         public void actionPerformed(ActionEvent e) {
                  
                  if (e.getSource()==panel.BTN_guardar_viajes) {
                           
                           Date fechaSalida=fechaAuxiliarDC;
                           Date horaSalida=(Date) panel.SPNviaje_horaSalida.getValue();
                           Date duracion=(Date) panel.SPNviaje_duracion.getValue();
                           
                           if (fechaSalida==null || horaSalida==null || duracion==null) {
                                    Emergente msg=new Emergente(null, "Error","No debe dejar campos vacios en la programación de un viaje",Emergente.Tipo.MessageDialog);
                                    msg.MostrarMSG();
                                    return;
                           }
                           
                           String fecha_salida=formatoFecha.format(fechaSalida);
                           String hora_salida=formatoHora.format(horaSalida);
                           String duracionViaje=formatoHora.format(duracion);
                           
                           String IDsalida=panel.CBviaje_terminal_Salida.getSelectedItem().toString().replaceAll("[^0-9]", "");
                           String IDllegada=panel.CBviaje_terminal_Llegada.getSelectedItem().toString().replaceAll("[^0-9]", "");
                           
                           if (IDllegada.isBlank() || IDsalida.isBlank()) {
                                    Emergente msg=new Emergente(null, "Error","No debe dejar campos vacios en la programación de un viaje",Emergente.Tipo.MessageDialog);
                                    msg.MostrarMSG();
                                    return;
                           }
                           
                           int IDterminalSalida=Integer.parseInt(IDsalida);
                           int IDterminalLlegada=Integer.parseInt(IDllegada);
     
                           if (panel.TBL_viajes.getSelectedRow()>-1) {
                                    int fila=panel.TBL_viajes.getSelectedRow();
                                    int id=(int) panel.TBL_viajes.getValueAt(fila,0);
                                    Viajes viajeModificado= viajeDAO.ObtenerDatoViaje(id);
                                    
                                    viajeModificado.setTerminalSalida(IDterminalSalida);
                                    viajeModificado.setTerminalLlegada(IDterminalLlegada);
                                    viajeModificado.setFechaSalida(fecha_salida);
                                    viajeModificado.setFechaLlegada(panel.LBLviaje_fechaLlegada.getText());
                                    viajeModificado.setHoraSalida(hora_salida);
                                    viajeModificado.setHoraLlegada(panel.LBLviaje_horaLlegada.getText());
                                    viajeModificado.setDuracion(duracionViaje);
                                    viajeModificado.setDistancia(panel.TXTviaje_distancia.getText());
                                    viajeModificado.setPrecio((double) panel.SPNviaje_precio.getValue());
                                    viajeModificado.setImg(bytes);
                                    
                                    if (viajeModificado.ConAtributosVacios()) {
                                             Emergente msg=new Emergente(null, "Error","Hay campos vacios en la Modificación de un viaje",Emergente.Tipo.MessageDialog);
                                             msg.MostrarMSG();
                                             return;
                                    }
                                    if (!viajeModificado.TerminalesValidas()) {
                                             Emergente msg=new Emergente(null, "Error","La terminal de salida es la misma que la terminal de llegada",Emergente.Tipo.MessageDialog);
                                             msg.MostrarMSG();
                                             return;
                                    }
                                    if (viajeDAO.Modificar(viajeModificado,id)){
                                             ReiniciarCampos();
                                             ListarViajes();
                                             Emergente msg=new Emergente(null, "Modificación","Viaje modificado correctamente",Emergente.Tipo.MessageDialog);
                                             msg.MostrarMSG();
                                    }else{
                                             Emergente msg=new Emergente(null, "Error","Error en la modificación del viaje",Emergente.Tipo.MessageDialog);
                                             msg.MostrarMSG();
                                    }
                           }else{    
                               
                                    Viajes viaje=new Viajes(IDterminalSalida, 
                                                                              IDterminalLlegada, 
                                                                              fecha_salida, 
                                                                              panel.LBLviaje_fechaLlegada.getText(), 
                                                                              hora_salida , 
                                                                              panel.LBLviaje_horaLlegada.getText(), 
                                                                              duracionViaje,
                                                                              panel.TXTviaje_distancia.getText(), 
                                                                              40, 
                                                                              Double.parseDouble(panel.SPNviaje_precio.getValue().toString()), 
                                                                              bytes);
                                    
                                    if (viaje.ConAtributosVacios()) {  
                                             Emergente msg=new Emergente(null, "Error","Hay  campos vacios en la programación de un viaje",Emergente.Tipo.MessageDialog);
                                             msg.MostrarMSG();
                                             return;
                                    }
                                    if (!viaje.TerminalesValidas()) {
                                             Emergente msg=new Emergente(null, "Error","La terminal de salida es la misma que la terminal de llegada",Emergente.Tipo.MessageDialog);
                                             msg.MostrarMSG();
                                             return;
                                    }
                                    
                                    if (viajeDAO.Registrar(viaje)) {
                                             if (asientoDAO.ActivarAsientos(viajeDAO.ObtenerIDgenerado())) {
                                                      ReiniciarCampos();
                                                      ListarViajes();
                                                      Emergente msg=new Emergente(null, "Registro","Viaje programado correctamente",Emergente.Tipo.MessageDialog);
                                                      msg.MostrarMSG();
                                             }
                                    }else{
                                             Emergente msg=new Emergente(null, "Error","Error en la programacion de un viaje",Emergente.Tipo.MessageDialog);
                                             msg.MostrarMSG();
                                    }
                           
                           }
                  }
                  
                  if (e.getSource()==panel.BTN_nuevo_viajes) {
                      
                           ReiniciarCampos();
                           ListarViajes();
                           
                  }
                  
                  
                  if (e.getSource()==panel.BTN_eliminar_viajes) {
                      
                           int fila=panel.TBL_viajes.getSelectedRow();
                           
                           if (fila<0) {
                                    Emergente msg=new Emergente(null, "Error","No hay ningún viaje seleccionado",Emergente.Tipo.MessageDialog);
                                    msg.MostrarMSG();
                                    return;
                           }
                           
                           int id=(int) panel.TBL_viajes.getValueAt(fila,0);
                           if (viajeDAO.Eliminar(id)) {
                                    ReiniciarCampos();
                                    ListarViajes();
                                    Emergente msg=new Emergente(null, "Eliminación","Viaje Eliminado correctamente",Emergente.Tipo.MessageDialog);
                                    msg.MostrarMSG();
                           }
                  }
                  
                  if (e.getSource()==panel.BTN_infoViaje) {
                           panel.BTN_volver.setOpaque(true);
                           int fila=panel.TBL_viajes.getSelectedRow();
                           int id=(int) panel.TBL_viajes.getValueAt(fila, 0);
                           CargarViajeInfoDetalle(id);
                           CargarViajeInfoPasajeros(id);
                           CargarViajeInfoBuss(id);
                           Slider(panel.ScrollPanelDinamico.getHorizontalScrollBar(), 10, 1060, 5);
                  }
                  
                  if (e.getSource()==panel.BTN_volver) {
                           panel.BTN_volver.setOpaque(false);
                           panel.Buss.removeAll();
                           Slider(panel.ScrollPanelDinamico.getHorizontalScrollBar(), 10, 0, 5);
                           
                  }
         }

         @Override
         public void stateChanged(ChangeEvent e) {
                  if (e.getSource()==panel.SPNviaje_horaSalida) {
                           Date horaSalida=(Date) panel.SPNviaje_horaSalida.getValue();
                           Date duracion=(Date) panel.SPNviaje_duracion.getValue();
                           CalcularFechaHoraLlegada( horaSalida, duracion);
                  }
                  
                  if (e.getSource()==panel.SPNviaje_duracion) {
                           Date horaSalida=(Date) panel.SPNviaje_horaSalida.getValue();
                           Date duracion=(Date) panel.SPNviaje_duracion.getValue();
                           CalcularFechaHoraLlegada( horaSalida, duracion);
                  }
         }

         @Override
         public void mouseClicked(MouseEvent e) {
      
    }

         @Override
         public void mousePressed(MouseEvent e) {
                  if (e.getSource()==panel.TBL_viajes) {
                           int fila=panel.TBL_viajes.getSelectedRow();
                           int id=(int) panel.TBL_viajes.getValueAt(fila,0);
                           Viajes viaje= viajeDAO.ObtenerDatoViaje(id);
                           Seleccionar(viaje);
                  }

                  if (e.getSource()==panel.LBL_img_referencial) {
                           AbrirFileChooser();
                  }
         }

         @Override
         public void mouseReleased(MouseEvent e) {
                  if (e.getSource()==panel.TBL_viajes) {
                           int fila=panel.TBL_viajes.getSelectedRow();
                           int id=(int) panel.TBL_viajes.getValueAt(fila,0);
                           Viajes viaje= viajeDAO.ObtenerDatoViaje(id);
                           Seleccionar(viaje);
                  }
         }

         
         @Override
         public void mouseEntered(MouseEvent e) {
                  if (e.getSource()==panel.LBL_img_referencial) {
                           panel.LBL_img_referencial.setBackground(new Color(21,24, 30));
                           panel.LBL_img_referencial.setBorder(new LineBorder(Color.GREEN,3,true));
                  }
         }

         @Override
         public void mouseExited(MouseEvent e) {
                  if (e.getSource()==panel.LBL_img_referencial) {
                           panel.LBL_img_referencial.setBackground(new Color(20,20,20));
                           panel.LBL_img_referencial.setBorder(new LineBorder(new Color(123,216,80),2,true));
                  }
    }
}
