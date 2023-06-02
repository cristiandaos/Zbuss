
package CONTROLADOR;

import MODELO.Conexion;
import MODELO.Viajes;
import MODELO.ViajesDAO;
import UTILIDADES.Emergente;
import VISTA.Panel_GestionViajes;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDayChooser;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
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

public class CTRL_PanelViajes implements ActionListener,ChangeListener{
         private Panel_GestionViajes panel;
         private byte [] bytes;
         private File archivo;
         private ViajesDAO viajeDAO=new ViajesDAO();
         private Date fechaSalidaAux=null;
         private Conexion cone=new Conexion();
         public  CTRL_PanelViajes(Panel_GestionViajes panel){
                  this.panel=panel;
                  this.panel.BTN_guardar_viajes.addActionListener(this);
                  
                  this.panel.BTN_eliminar_viajes.addActionListener(this);
                  
                  this.panel.BTN_nuevo_viajes.addActionListener(this);
                  
                  this.panel.BTN_img_referencial.addActionListener(this);
                  
                  InstanciarModeloSpinner(this.panel.SPNviaje_horaSalida);
                  InstanciarModeloSpinner(this.panel.SPNviaje_duracion);
                  InstanciarPropiedadesDateChooser();
                  
                  this.panel.SPNviaje_horaSalida.addChangeListener(this);
                  this.panel.SPNviaje_duracion.addChangeListener(this);
                  
                  CargarCodigosTerminales();
         }
         
         public Panel_GestionViajes getPanel(){
                  return  panel;
         }
         
         void CargarCodigosTerminales(){
                  try {     
                           PreparedStatement ps=null;
                           ResultSet rs=null;
                           Connection con= cone.getConnection();
                           ps=con.prepareStatement("SELECT terminal_id FROM Terminales WHERE terminal_estado='Habilitado'");
                           rs=ps.executeQuery();
                           while (rs.next()) {
                                   panel.CBviaje_terminal_Llegada.addItem(rs.getString("terminal_id"));
                                   panel.CBviaje_terminal_Salida.addItem(rs.getString("terminal_id"));
                                   
                           }
                  } catch (SQLException e) {
                           System.err.println(e.toString());
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
                  ReinciarSpinners(spn);
         }
         
         void ReinciarSpinners(JSpinner spn){
                  SimpleDateFormat formato = new SimpleDateFormat("HH:mm");
                  Date horaInicial;
                  try {
                           horaInicial = formato.parse("00:00");
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
         
         void ReinciarCampos(){
                  bytes=null;
                  panel.CBviaje_terminal_Llegada.setSelectedIndex(0);
                  panel.CBviaje_terminal_Salida.setSelectedIndex(0);
                  panel.TXTviaje_distancia.setText(null);
                  ReinciarSpinners(panel.SPNviaje_duracion);
                  ReinciarSpinners(panel.SPNviaje_horaSalida);
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
                           
                           String fecha=formatoFecha.format(fechaSalida);
                           String hora=formatoHora.format(horaSalida);
        
                           Viajes viaje=new Viajes(panel.CBviaje_terminal_Salida.getSelectedItem().toString(), 
                                                                     panel.CBviaje_terminal_Llegada.getSelectedItem().toString(), 
                                                                     fecha, 
                                                                     panel.LBLviaje_fechaLlegada.getText(), 
                                                                     hora , 
                                                                     panel.LBLviaje_horaLlegada.getText(), 
                                                                     panel.TXTviaje_distancia.getText(), 
                                                                     40, 
                                                                     (double) panel.SPNviaje_precio.getValue(), 
                                                                     bytes);
                           if (viaje.ConAtributosVacios()) {
                                    Emergente msg=new Emergente(null, "Error en la programacion de un viaje","No debe dejar campos vacios");
                                    return;
                           }
                           viajeDAO.RegistrarViaje(viaje);
                           ReinciarCampos();
            
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
}
