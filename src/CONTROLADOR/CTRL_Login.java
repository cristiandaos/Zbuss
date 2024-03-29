
package CONTROLADOR;
import DAO.ViajesDAO;
import DAO.SociosDAO;
import DAO.AdministradoresDAO;
import UTILIDADES.*;
import VISTA.*;
import MODELO.*;
import java.awt.Color;
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
import javax.swing.JScrollBar;
import javax.swing.Timer;


public class CTRL_Login implements ActionListener,MouseListener,KeyListener,MouseMotionListener,WindowListener{
    
         private  Login_Registro login;
         private int x;
         private int y;
         private AdministradoresDAO adminDAO=new AdministradoresDAO();
         private SociosDAO sociosDAO=new SociosDAO();
         private ViajesDAO viajesDAO=new ViajesDAO();
    
         public CTRL_Login(Login_Registro login)  {

                 this.login=login;
                 this.login.addWindowListener(this);
                 
                 this.login.Barra.addMouseListener(this);
                 this.login.Barra.addMouseMotionListener(this);
                 
                 this.login.BTN_cerrar.addActionListener(this);
                 this.login.BTN_cerrar.addMouseListener(this);
                 
                 this.login.BTN_Visibilidad.addActionListener(this);
                 
                 this.login.BTN_IniciarSesion.addActionListener(this);
                 this.login.BTN_IniciarSesion.addMouseListener(this);
                 
                 this.login.BTN_ConfirmarRegistro.addActionListener(this);
                 this.login.BTN_ConfirmarRegistro.addMouseListener(this);
                 
                 this.login.LBL_mostrarLogin.addMouseListener(this);
                 
                 this.login.LBL_mostrarRegistro.addMouseListener(this);
                 
                 this.login.BTN_clienteInvitado.addActionListener(this);
                 this.login.BTN_clienteInvitado.addMouseListener(this);
                 
                 this.login.BTN_VisibilidadRegistro.addActionListener(this);
                 
                 this.login.Txt_DniRegistro.addKeyListener(this);
                 this.login.Txt_NomRegistro.addKeyListener(this);
                 this.login.Txt_ApePatRegistro.addKeyListener(this);
                 this.login.Txt_ApeMatRegistro.addKeyListener(this);
                 this.login.Txt_FNacRegistro.addKeyListener(this);
                 this.login.Txt_NumRegistro.addKeyListener(this);
                 this.login.Txt_CorreoRegistro.addKeyListener(this);
                 this.login.Txt_ContraRegistro.addKeyListener(this);
                 this.login.Txt_ConfirmContraRegistro.addKeyListener(this);
                 
                 this.login.Txt_correoElectronico.addKeyListener(this);
                 this.login.Txt_contraseña.addKeyListener(this);
                 
                 PlaceHolder CorreoElectronico=new PlaceHolder("Correo Electronico", this.login.Txt_correoElectronico,PlaceHolder.Visibilidad.ALWAYS);
                 
                 PlaceHolder Contraseña=new PlaceHolder("Contraseña", this.login.Txt_contraseña,PlaceHolder.Visibilidad.ALWAYS);
                 
                 PlaceHolder nomRegistro=new PlaceHolder("Nombre", this.login.Txt_NomRegistro, PlaceHolder.Visibilidad.ALWAYS);
                 
                 PlaceHolder apePatRegistro=new PlaceHolder("Apellido Paterno", this.login.Txt_ApePatRegistro, PlaceHolder.Visibilidad.ALWAYS);
                 
                 PlaceHolder apeMatRegistro=new PlaceHolder("Apellido Materno", this.login.Txt_ApeMatRegistro, PlaceHolder.Visibilidad.ALWAYS);
                 
                 PlaceHolder correoRegistro=new PlaceHolder("Correo Electrónico", this.login.Txt_CorreoRegistro, PlaceHolder.Visibilidad.ALWAYS);
                 
                 PlaceHolder contraRegistro=new PlaceHolder("Contraseña",this.login.Txt_ContraRegistro, PlaceHolder.Visibilidad.ALWAYS);
                 
                 PlaceHolder confirmRegistro=new PlaceHolder("Confirmar Contraseña",this.login.Txt_ConfirmContraRegistro, PlaceHolder.Visibilidad.ALWAYS);     
         }
    
         void Iniciar(){
                  login.Txt_correoElectronico.requestFocus();
                  JScrollBar scroll=login.ScrollPanelDinamico.getHorizontalScrollBar();
                  scroll.setValue(320);
                  Shape redondeado=new RoundRectangle2D.Double(0,0,login.getBounds().width,login.getBounds().getHeight(),30,30);
                  login.setShape(redondeado);
                  login.revalidate();
                  login.setVisible(true);  
         }
     
     
         void Cerrar(){
                  login.dispose();
         }
      
         
        void Slider(JScrollBar scrollBar,int delay, int moverValor,int auxiliar) {
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
        
     
         void InhabilitarRegistro(){
                  for (int i = 0; i < login.PanelRegistro.getComponentCount(); i++) {
                           login.PanelRegistro.getComponent(i).setEnabled(false);
                  }
      
                  login.Txt_NomRegistro.setText(null);
                  login.Txt_ApePatRegistro.setText(null);
                  login.Txt_ApeMatRegistro.setText(null);
                  login.Txt_CorreoRegistro.setText(null);
                  login.Txt_DniRegistro.setText("");
                  login.Txt_FNacRegistro.setText("");
                  login.Txt_NumRegistro.setText("");
                  login.Txt_ContraRegistro.setText(null);
                  login.Txt_ConfirmContraRegistro.setText(null);
         }
    
    
         void HabilitarRegistro(){
                  for (int i = 0; i < login.PanelRegistro.getComponentCount(); i++) {
                           login.PanelRegistro.getComponent(i).setEnabled(true);
                  }
                  login.Txt_NomRegistro.requestFocus();
         }
    
    
         void HabilitarInicioSesion(){
                  for (int i = 0; i < login.PanelInicioSesion.getComponentCount(); i++) {
                           login.PanelInicioSesion.getComponent(i).setEnabled(true);

                  }
                  login.Txt_correoElectronico.requestFocus();
         }
    
    
         void InhabilitarInicioSesion(){
                  for (int i = 0; i < login.PanelInicioSesion.getComponentCount(); i++) {
                          login.PanelInicioSesion.getComponent(i).setEnabled(false);
                  }
                  login.Txt_correoElectronico.setText(null);
                  login.Txt_contraseña.setText(null);
         }
     
     
     
     
    @Override
        public void actionPerformed(ActionEvent e) {
            
                  if (e.getSource()==login.BTN_cerrar) {
                           System.exit(0);
                  }
                  
                  if (e.getSource()==login.BTN_clienteInvitado) {
                           int cantViajes=viajesDAO.CantidadTotalViajes();
                           Interfaz_Principal principal=new Interfaz_Principal();
                           CTRL_InterfazPrincipal ctrl_principal=new CTRL_InterfazPrincipal(principal,cantViajes);
                           ctrl_principal.Iniciar();
                           Cerrar();
                  }
                  
        
                  if (e.getSource()==login.BTN_IniciarSesion) {
                      
                           String correo=login.Txt_correoElectronico.getText();
                           String contraseña=login.Txt_contraseña.getText();
                           
                           if ( (correo.isBlank() && contraseña.isBlank()) || (!correo.isBlank() && contraseña.isBlank()) || (!contraseña.isBlank() && correo.isBlank()) ) {
                                    Emergente msg=new Emergente(null,"Error en el ingreso","No se debe dejar ningún campo vacio",Emergente.Tipo.MessageDialog);
                                    msg.MostrarMSG();
                                    return;
                           }
                           
                          if (sociosDAO.Validar(correo, contraseña)) {
                                    Socios sesionSocio= sociosDAO.ObtenerDatos(correo, contraseña);
                                    int cantViajes=viajesDAO.CantidadTotalViajes();
                                    Interfaz_Principal principal=new Interfaz_Principal();
                                    CTRL_InterfazPrincipal ctrl_principal=new CTRL_InterfazPrincipal(principal,cantViajes);                                          
                                    ctrl_principal.Iniciar(sesionSocio);
                                    Cerrar();
                                    return;
                           }
                          
                          if (adminDAO.Validar(correo, contraseña)) {
                                    Administrador sesionAdmin=adminDAO.ObtenerDatos(correo, contraseña);
                                    Interfaz_Administrador interfazAdmin=new Interfaz_Administrador();
                                    CTRL_InterfazAdministrador ctrlAdministrador=new CTRL_InterfazAdministrador(interfazAdmin);
                                    ctrlAdministrador.Iniciar(sesionAdmin);
                                    Cerrar();    
                                    return;
                           }
                          
                           Emergente msg=new Emergente(null, "Error en el ingreso","El correo y/o contraseña ingresados son incorrectos",Emergente.Tipo.MessageDialog);
                           msg.MostrarMSG();
                  }
        
                  
                  if(e.getSource()==login.BTN_Visibilidad){
                      
                           if (login.BTN_Visibilidad.isSelected()) {
                                    login.Txt_contraseña.setEchoChar((char)0);
                           }else{
                                    login.Txt_contraseña.setEchoChar('*');
                           }
                           
                  }
                  
                  
                  if (e.getSource()==login.BTN_ConfirmarRegistro) {
                           String contraseña=login.Txt_ContraRegistro.getText();
                           String contraseñaConfirmada=login.Txt_ConfirmContraRegistro.getText();
                           
                           Socios socio=new Socios(login.Txt_DniRegistro.getText(), 
                                                                       login.Txt_NomRegistro.getText(), 
                                                                       login.Txt_ApePatRegistro.getText(), 
                                                                       login.Txt_ApeMatRegistro.getText(), 
                                                                       login.Txt_CorreoRegistro.getText(),
                                                                       login.Txt_FNacRegistro.getText(), 
                                                                       login.Txt_NumRegistro.getText(), 
                                                                       login.Txt_ContraRegistro.getText(), 
                                                                       0);
                           
                           if (socio.ConAtributosVacios()) {
                                    Emergente msg=new Emergente(null, "Error en el registro ", "No debe dejar campos vacios",Emergente.Tipo.MessageDialog);
                                    msg.MostrarMSG();
                                    return;
                           }
                           if (!socio.CorreoValido()) {
                                    Emergente msg=new Emergente(null, "Error en el registro ", "Ingrese un correo válido",Emergente.Tipo.MessageDialog);
                                    msg.MostrarMSG();
                                    return;
                           }
                           if (!socio.dniValido()) {
                                    Emergente msg=new Emergente(null, "Error en el registro ", "Ingrese un DNI válido",Emergente.Tipo.MessageDialog);
                                    msg.MostrarMSG();
                                    return;
                           }
                           
                           if (!socio.FNacValido()) {
                                    Emergente msg=new Emergente(null, "Error en el registro ", "Ingrese una fecha de nacimiento válida",Emergente.Tipo.MessageDialog);
                                    msg.MostrarMSG();
                                    return;
                           }
                           if (!socio.NumeroValido()) {
                                    Emergente msg=new Emergente(null, "Error en el registro ", "Ingrese un número válido",Emergente.Tipo.MessageDialog);
                                    msg.MostrarMSG();
                                    return;
                           }
                           
                           if (!contraseña.equals(contraseñaConfirmada)) {
                                    Emergente msg=new Emergente(login, "Error en el registro","La contraseñas no coinciden",Emergente.Tipo.MessageDialog);
                                    msg.MostrarMSG();
                                    return;
                           }
                           Emergente confirmacion=new Emergente(login, "Confirmación", "¿Seguro que desea registrarse?", Emergente.Tipo.ConfirmDialog);
                           int opcion=confirmacion.MostrarConfirm();
                           if (opcion==0) {
                                    return;
                           }else{
                                    sociosDAO.registrar(socio);
                                    InhabilitarRegistro();
                                    HabilitarRegistro(); 
                                    Emergente msg=new Emergente(login, "Socio registrado correctamente", "Bienvenido a socios Z-buss, "+socio.getNombre(),Emergente.Tipo.MessageDialog);
                                    msg.MostrarMSG();
                           }
                  }
          
                  
                  
                  
                  if(e.getSource()==login.BTN_VisibilidadRegistro){

                          if (login.BTN_VisibilidadRegistro.isSelected()) {
                                    login.Txt_ContraRegistro.setEchoChar((char)0);
                           }else{
                                    login.Txt_ContraRegistro.setEchoChar('*');
                           }
                  }
         }

    @Override
    public void mouseClicked(MouseEvent e) {
      
    }

    @Override
         public void mousePressed(MouseEvent e) {
                  if (e.getSource()==login.Barra) {
                           x=e.getX();
                           y=e.getY();
                  }

                  if (e.getSource()==login.LBL_mostrarRegistro) {
                           Slider(login.ScrollPanelInfo.getHorizontalScrollBar(), 10, 440, 10);
                           Slider(login.ScrollPanelDinamico.getHorizontalScrollBar(), 10, 0, 5);
                           HabilitarRegistro();
                           InhabilitarInicioSesion();
                  }

                  if (e.getSource()==login.LBL_mostrarLogin) {
                           Slider(login.ScrollPanelInfo.getHorizontalScrollBar(), 10, 0, 10);
                           Slider(login.ScrollPanelDinamico.getHorizontalScrollBar(), 10, 320, 5);
                           HabilitarInicioSesion();
                           InhabilitarRegistro();

                  }
                  
                  if (e.getSource()==login.BTN_ConfirmarRegistro) {
                          login.BTN_ConfirmarRegistro.setBackground(new Color(51,54, 80));
                  }
                  
                  if (e.getSource()==login.BTN_IniciarSesion) {
                          login.BTN_IniciarSesion.setBackground(new Color(51,54, 80));
                  }

         }

    @Override
    public void mouseReleased(MouseEvent e) {
      
    }

    @Override
         public void mouseEntered(MouseEvent e) {
        
                  if (e.getSource()==login.BTN_cerrar) {
                           login.BTN_cerrar.setBackground(Color.red);
                  }
         
                  if (e.getSource()==login.BTN_clienteInvitado) {
                           login.BTN_clienteInvitado.setFont(new Font("Consolas",Font.BOLD,16));
                  }
         
                  if (e.getSource()==login.BTN_IniciarSesion) {
                           login.BTN_IniciarSesion.setFont(new Font("Consolas",Font.BOLD,16));
                            login.BTN_IniciarSesion.setBackground(new Color(21,24, 30));
                  }
         
                  if (e.getSource()==login.BTN_ConfirmarRegistro) {
                           login.BTN_ConfirmarRegistro.setFont(new Font("Consolas",Font.BOLD,16));
                           login.BTN_ConfirmarRegistro.setBackground(new Color(21,24, 30));
                  }
                  
                  if (e.getSource()==login.LBL_mostrarLogin) {
                           login.LBL_mostrarLogin.setForeground(Color.GREEN);
                  }
                  
                  if (e.getSource()==login.LBL_mostrarRegistro) {
                          login.LBL_mostrarRegistro.setForeground(Color.GREEN);
                  }
     
         }

    @Override
         public void mouseExited(MouseEvent e) {
                  if (e.getSource()==login.BTN_cerrar) {
                           login.BTN_cerrar.setBackground(new Color(6,6,6));
                  }

                  if (e.getSource()==login.BTN_clienteInvitado) {
                           login.BTN_clienteInvitado.setFont(new Font("Consolas",Font.PLAIN,16));
                  } 

                  if (e.getSource()==login.BTN_IniciarSesion) {
                           login.BTN_IniciarSesion.setFont(new Font("Consolas",Font.PLAIN,16));
                           login.BTN_IniciarSesion.setBackground(new Color(12,12,12));
                  }

                  if (e.getSource()==login.BTN_ConfirmarRegistro) {
                           login.BTN_ConfirmarRegistro.setFont(new Font("Consolas",Font.PLAIN,16));
                           login.BTN_ConfirmarRegistro.setBackground(new Color(12,12,12));
                  }
                  
                  if (e.getSource()==login.LBL_mostrarLogin) {
                           login.LBL_mostrarLogin.setForeground(new Color(123,216,80));
                  }
                  
                  if (e.getSource()==login.LBL_mostrarRegistro) {
                           login.LBL_mostrarRegistro.setForeground(new Color(123,216,80));
                  }

        }
   @Override
        public void mouseDragged(MouseEvent e){
                  if (e.getSource()==login.Barra) {
                           int  xMouse=e.getXOnScreen();
                           int  YMouse=e.getYOnScreen();
                           login.setLocation(xMouse-x, YMouse-y);
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
                  if (e.getKeyCode()==KeyEvent.VK_UP) {
                      //registro
                           if (login.Txt_ApePatRegistro.isFocusOwner()) {
                                    login.Txt_NomRegistro.requestFocus();
                           }
                           if (login.Txt_ApeMatRegistro.isFocusOwner()) {
                                    login.Txt_ApePatRegistro.requestFocus();
                           }
                           if (login.Txt_CorreoRegistro.isFocusOwner()) {
                                    login.Txt_ApeMatRegistro.requestFocus();
                           }
                           if (login.Txt_DniRegistro.isFocusOwner()) {
                                    login.Txt_CorreoRegistro.requestFocus();
                           }
                           if (login.Txt_FNacRegistro.isFocusOwner()) {
                                    login.Txt_DniRegistro.requestFocus();
                           }
                           if (login.Txt_NumRegistro.isFocusOwner()) {
                                    login.Txt_FNacRegistro.requestFocus();
                           }
                           if (login.Txt_ContraRegistro.isFocusOwner()) {
                                    login.Txt_NumRegistro.requestFocus();
                           }
                           if (login.Txt_ConfirmContraRegistro.isFocusOwner()) {
                                    login.Txt_ContraRegistro.requestFocus();
                           }
                           //login
                           if (login.Txt_contraseña.isFocusOwner()) {
                                    login.Txt_correoElectronico.requestFocus();
                           }
                           
                  }
                  if (e.getKeyCode()==KeyEvent.VK_DOWN) {
                            //registro
                           if (login.Txt_NomRegistro.isFocusOwner()) {
                                    login.Txt_ApePatRegistro.requestFocus();
                           }
                           if (login.Txt_ApePatRegistro.isFocusOwner()) {
                                    login.Txt_ApeMatRegistro.requestFocus();
                           }
                           if (login.Txt_ApeMatRegistro.isFocusOwner()) {
                                    login.Txt_CorreoRegistro.requestFocus();
                           }
                           if (login.Txt_CorreoRegistro.isFocusOwner()) {
                                    login.Txt_DniRegistro.requestFocus();
                           }
                           if (login.Txt_DniRegistro.isFocusOwner()) {
                                    login.Txt_FNacRegistro.requestFocus();
                           }
                           if (login.Txt_FNacRegistro.isFocusOwner()) {
                                    login.Txt_NumRegistro.requestFocus();
                           }
                           if (login.Txt_NumRegistro.isFocusOwner()) {
                                    login.Txt_ContraRegistro.requestFocus();
                           }
                           if (login.Txt_ContraRegistro.isFocusOwner()) {
                                    login.Txt_ConfirmContraRegistro.requestFocus();
                           }
                           //login
                           if (login.Txt_correoElectronico.isFocusOwner()) {
                                    login.Txt_contraseña.requestFocus();
                           }
                  }
         }

    @Override
    public void keyReleased(KeyEvent e) {
       
    }

    @Override
        public void windowOpened(WindowEvent e) {
                  if (e.getSource()==login) {
                           for (double  i = 0.0; i <= 1; i=i+0.1) {
                                    float f=(float) i;
                                    login.setOpacity(f);
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

