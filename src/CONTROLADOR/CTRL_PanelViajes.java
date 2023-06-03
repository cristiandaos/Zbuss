
package CONTROLADOR;

import MODELO.Conexion;
import MODELO.Viajes;
import MODELO.ViajesDAO;
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
import java.awt.image.BufferedImage;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.Timer;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class CTRL_PanelViajes implements ActionListener,MouseListener,ChangeListener{
    
         private Panel_GestionViajes panel;
         private byte [] bytes;
         private File archivo;
         private ViajesDAO viajeDAO=new ViajesDAO();
         private Date fechaSalidaAux=null;
         private Conexion cone=new Conexion();
         private int ID=11;
         
         public  CTRL_PanelViajes(Panel_GestionViajes panel){
                  this.panel=panel;
                  this.panel.BTN_guardar_viajes.addActionListener(this);
                  
                  this.panel.BTN_eliminar_viajes.addActionListener(this);
                  
                  this.panel.BTN_nuevo_viajes.addActionListener(this);
                  
                  this.panel.BTN_img_referencial.addActionListener(this);
                  
                  this.panel.TBLviajes.addMouseListener(this);
                  
                  InstanciarModeloSpinner(this.panel.SPNviaje_horaSalida);
                  InstanciarModeloSpinner(this.panel.SPNviaje_duracion);
                  InstanciarPropiedadesDateChooser();
                  
                  this.panel.SPNviaje_horaSalida.addChangeListener(this);
                  this.panel.SPNviaje_duracion.addChangeListener(this);
                  
                  CargarIDsTerminales();
                  ListarViajes();
         }
         
         
         public Panel_GestionViajes getPanel(){
                  return  panel;
         }
         
         void ActivarAsientos(int id){
                  PreparedStatement ps=null;
                  Connection con =cone.getConnection();
                  try{
                           ps=con.prepareStatement("INSERT INTO Asientos VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                           ps.setInt(1,id);
                           for (int i = 2; i <= 41; i++) {
                                    ps.setString(i,"Disponible");
                           }
                           ps.execute();
                  }catch(SQLException ex){
                  } 
         }
         
         void CargarIDsTerminales(){
                  try {     
                           PreparedStatement ps=null;
                           ResultSet rs=null;
                           Connection con= cone.getConnection();
                           ps=con.prepareStatement("SELECT terminal_id, terminal_nombre FROM Terminales WHERE terminal_estado='Habilitado'");
                           rs=ps.executeQuery();
                           while (rs.next()) {
                                   panel.CBviaje_terminal_Llegada.addItem(rs.getString("terminal_id")+"-"+rs.getString("terminal_nombre"));
                                   panel.CBviaje_terminal_Salida.addItem(rs.getString("terminal_id")+"-"+rs.getString("terminal_nombre"));
                                   
                           }
                  } catch (SQLException e) {
                           System.err.println(e.toString());
                  }    
    
    }   
         
         void ListarViajes(){
                  panel.TBLviajes.getTableHeader().setFont(new Font("Consolas", Font.PLAIN, 10));
                  panel.TBLviajes.getTableHeader().setBorder(new LineBorder(Color.WHITE,1));
                  panel.TBLviajes.getTableHeader().setForeground(Color.GREEN);
                  panel.TBLviajes.getTableHeader().setBackground(new Color(6,6,6));
                  
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
                  panel.TBLviajes.setModel(modelo);  
                  PreparedStatement ps=null;
                  ResultSet rs=null;
                  Connection con=cone.getConnection();
                  ps=con.prepareStatement("SELECT viaje_id,viaje_terminal_salida,viaje_terminal_llegada,viaje_fecha_salida,viaje_hora_salida,viaje_fecha_llegada,viaje_hora_llegada,viaje_distancia,viaje_asientos_Dispo,viaje_precio FROM Viajes ");
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
                           panel.TBLviajes.getColumnModel().getColumn(j).setPreferredWidth(espacios[j]);
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
                  }
    }
         
         void  Seleccionar(Viajes viaje) {

             try {
                 Seleccion_ID_CB(panel.CBviaje_terminal_Llegada,viaje.getTerminalLlegada());
                 Seleccion_ID_CB(panel.CBviaje_terminal_Salida, viaje.getTerminalSalida());
                 DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                 Date fecha = dateFormat.parse(viaje.getFechaSalida());
                 panel.DCviaje_fechaSalida.setDate(fecha);
                 ReinciarSpinners(panel.SPNviaje_horaSalida, viaje.getHoraSalida());
                 ReinciarSpinners(panel.SPNviaje_duracion, viaje.getDuracion());
                 panel.LBLviaje_fechaLlegada.setText(viaje.getFechaLlegada());
                 panel.LBLviaje_horaLlegada.setText(viaje.getHoraLlegada());
                 panel.TXTviaje_distancia.setText(viaje.getDistancia());
                 panel.SPNviaje_precio.setValue(viaje.getPrecio());
                 ImageIcon imagen = new ImageIcon(viaje.getImg());
                 panel.LBL_img_referencial.setIcon(imagen);
             } catch (ParseException ex) {
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
                  panel.DCviaje_fechaSalida.addPropertyChangeListener(new PropertyChangeListener() {
         @Override
                  public void propertyChange(PropertyChangeEvent evt) {
                           if (evt.getPropertyName().equals("date")) {
                                    Date selectedDate = (Date) evt.getNewValue();
                                    fechaSalidaAux=selectedDate;
                                    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
                                    String fechaSeleccionada = formatoFecha.format(fechaSalidaAux);
                                    panel.LBLviaje_fechaLlegada.setText(fechaSeleccionada);
                                    InstanciarModeloSpinner(panel.SPNviaje_horaSalida);
                                    InstanciarModeloSpinner(panel.SPNviaje_duracion);
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
                           Date selectedDate = (Date)  spn.getValue();
                           Calendar calendar = Calendar.getInstance();
                           calendar.setTime(selectedDate);
                  }
                  });
                  ReinciarSpinners(spn,"00:00");
         }
               
         void ReinciarSpinners(JSpinner spn,String hora){
                  SimpleDateFormat formato = new SimpleDateFormat("HH:mm");
                  Date horaInicial;
                  try {
                           horaInicial = formato.parse(hora);
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
                  int sele = FC.showOpenDialog(null);
                  if (sele == JFileChooser.APPROVE_OPTION) {
                           archivo = FC.getSelectedFile();
                           try {
                                    bytes = Files.readAllBytes(archivo.toPath());
                                    ImageIcon imagen = new ImageIcon(bytes);
                                    panel.LBL_img_referencial.setIcon(imagen);
                           } catch (IOException ex) {
                           }
                  }
         }
         
         void ReiniciarCampos(){
                  bytes=null;
                  panel.CBviaje_terminal_Llegada.setSelectedIndex(0);
                  panel.CBviaje_terminal_Salida.setSelectedIndex(0);
                  panel.TXTviaje_distancia.setText(null);
                  ReinciarSpinners(panel.SPNviaje_duracion,"00:00");
                  ReinciarSpinners(panel.SPNviaje_horaSalida,"00:00");
                  panel.SPNviaje_precio.setValue(0);
                  panel.LBL_img_referencial.setIcon(null);
                  panel.LBLviaje_fechaLlegada.setText(null);
                  panel.LBLviaje_horaLlegada.setText(null);
                  fechaSalidaAux=null;
                  ((JTextField) panel.DCviaje_fechaSalida.getDateEditor().getUiComponent()).setText("");

         }
         
         void SliderScroll(JScrollBar scrollBar,int delay, int ValorDestino,int auxiliar) {
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
         
         void CalcularLlegada(Date horaSalida, Date duracion){
                  SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
                  SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");
                  if (this.fechaSalidaAux!=null  &&  horaSalida!=null && duracion!=null) {
                      
                           Calendar fechaSalidaCalendar = Calendar.getInstance();
                           fechaSalidaCalendar.setTime(this.fechaSalidaAux);

                           Calendar horaSalidaCalendar = Calendar.getInstance();
                           horaSalidaCalendar.setTime(horaSalida);

                           Calendar duracionCalendar = Calendar.getInstance();
                           duracionCalendar.setTime(duracion);
                           
                           Calendar LlegadaCalendar=Calendar.getInstance();
                           LlegadaCalendar.setTime(fechaSalidaAux);
                           
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
         
         
         public int generarID(){
                  int id = this.ID; 
                  id++; 
                  return id;
         }
         
         @Override
         public void actionPerformed(ActionEvent e) {
                  if (e.getSource()==panel.BTN_img_referencial) {
                           AbrirFileChooser();
                  }
                  
                  if (e.getSource()==panel.BTN_guardar_viajes) {
                           SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
                           SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");
                           
                           Date fechaSalida=fechaSalidaAux;
                           Date horaSalida=(Date) panel.SPNviaje_horaSalida.getValue();
                           Date duracion=(Date) panel.SPNviaje_duracion.getValue();
                           
                           String fecha_salida=formatoFecha.format(fechaSalida);
                           String hora_salida=formatoHora.format(horaSalida);
                           String duracionViaje=formatoHora.format(duracion);
                           
                           int IDterminalSalida=Integer.parseInt(panel.CBviaje_terminal_Salida.getSelectedItem().toString().replaceAll("[^0-9]", ""));
                           int IDterminalLlegada=Integer.parseInt(panel.CBviaje_terminal_Llegada.getSelectedItem().toString().replaceAll("[^0-9]", ""));
     
                           if (panel.TBLviajes.getSelectedRow()>-1) {
                                    int fila=panel.TBLviajes.getSelectedRow();
                                    int id=(int) panel.TBLviajes.getValueAt(fila,0);
                                    Viajes viajeModificado= viajeDAO.ObtenerDatos(id);
                                    bytes=viajeModificado.getImg();
                                    
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
                                    
                                    viajeDAO.ModificarViaje(viajeModificado,id);
                                    ReiniciarCampos();
                                    ListarViajes();
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
                                                                              (double) panel.SPNviaje_precio.getValue(), 
                                                                              bytes);
                                    if (viaje.ConAtributosVacios()) {
                                             Emergente msg=new Emergente(null, "Error en la programacion de un viaje","No debe dejar campos vacios");
                                             return;
                                    }
                                    
                                    viajeDAO.RegistrarViaje(viaje);
                                    ActivarAsientos(viajeDAO.ObtenerUltimoID());
                                    ReiniciarCampos();
                                    ListarViajes();
                           
                           }
                  }
                  
                  if (e.getSource()==panel.BTN_nuevo_viajes) {
                           ReiniciarCampos();
                           ListarViajes();
                  }
                  
                  if (e.getSource()==panel.BTN_eliminar_viajes) {
                           int fila=panel.TBLviajes.getSelectedRow();
                           int id=(int) panel.TBLviajes.getValueAt(fila,0);
                           viajeDAO.EliminarViaje(id);
                           ReiniciarCampos();
                           ListarViajes();
                  }
         }

        @Override
        public void stateChanged(ChangeEvent e) {
                  if (e.getSource()==panel.SPNviaje_horaSalida) {
                           Date horaSalida=(Date) panel.SPNviaje_horaSalida.getValue();
                           Date duracion=(Date) panel.SPNviaje_duracion.getValue();
                           CalcularLlegada( horaSalida, duracion);
                  }
                  
                  if (e.getSource()==panel.SPNviaje_duracion) {
                           Date horaSalida=(Date) panel.SPNviaje_horaSalida.getValue();
                           Date duracion=(Date) panel.SPNviaje_duracion.getValue();
                           CalcularLlegada( horaSalida, duracion);
                  }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
      
    }

    @Override
    public void mousePressed(MouseEvent e) {
                  if (e.getSource()==panel.TBLviajes) {
                           int fila=panel.TBLviajes.getSelectedRow();
                           int id=(int) panel.TBLviajes.getValueAt(fila,0);
                           Viajes viaje= viajeDAO.ObtenerDatos(id);
                           Seleccionar(viaje);
                  }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
                 if (e.getSource()==panel.TBLviajes) {
                           int fila=panel.TBLviajes.getSelectedRow();
                           int id=(int) panel.TBLviajes.getValueAt(fila,0);
                           Viajes viaje= viajeDAO.ObtenerDatos(id);
                           Seleccionar(viaje);
                  }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       
    }

    @Override
    public void mouseExited(MouseEvent e) {
      
    }
}
