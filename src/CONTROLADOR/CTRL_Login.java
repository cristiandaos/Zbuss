
package CONTROLADOR;
import UTILIDADES.*;
import VISTA.*;
import java.awt.Color;
import java.awt.Scrollbar;
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
import javax.swing.JComponent;
import javax.swing.JScrollBar;
import javax.swing.Timer;


public class CTRL_Login implements ActionListener,MouseListener,KeyListener,MouseMotionListener,WindowListener{
    
    private  Login login;
    private int x;
    private int y;
    private String usuario="admin";
    private String contraseña="12345";
    private String textoIniciarSesion="Accede a tu cuenta para revisar horarios, acumular puntos de fidelidad y disfrutar de beneficios. ¡Inicia sesión y descubre todo lo que tenemos preparado para ti!";
    private String textoRegistrarse="No dejes pasar la oportunidad de disfrutar de tarifas exclusivas y promociones especiales. Regístrate hoy mismo y mantente al tanto de nuestras ofertas."; 
    
    public CTRL_Login(Login login)  {
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
        
        login.LBL_infoInicioSesion.setText(HTML(textoIniciarSesion)); 
        login.LBL_infoRegistrarse.setText(HTML(textoRegistrarse));
        
       JScrollBar scroll=login.ScrollPanelDinamico.getHorizontalScrollBar();
       scroll.setValue(320);
        
         PlaceHolder CorreoElectronico=new PlaceHolder("Correo Electronico", login.Txt_correoElectronico,PlaceHolder.Show.ALWAYS);
        
         PlaceHolder Contraseña=new PlaceHolder("Contraseña", login.Txt_contraseña,PlaceHolder.Show.ALWAYS);
         
         PlaceHolder nomRegistro=new PlaceHolder("Nombre", login.Txt_NomRegistro, PlaceHolder.Show.ALWAYS);
         
         PlaceHolder apePatRegistro=new PlaceHolder("Apellido Paterno", login.Txt_ApePatRegistro, PlaceHolder.Show.ALWAYS);
         
         PlaceHolder apeMatRegistro=new PlaceHolder("Apellido Materno", login.Txt_ApeMatRegistro, PlaceHolder.Show.ALWAYS);
         
         PlaceHolder correoRegistro=new PlaceHolder("Correo Electrónico", login.Txt_CorreoRegistro, PlaceHolder.Show.ALWAYS);
         
         PlaceHolder contraRegistro=new PlaceHolder("Contraseña",login.Txt_ContraRegistro, PlaceHolder.Show.ALWAYS);
         
         PlaceHolder confirmRegistro=new PlaceHolder("Confirmar Contraseña",login.Txt_ConfirmContraRegistro, PlaceHolder.Show.ALWAYS);
  
    }
    
     void Iniciar(){
         Shape redondeado=new RoundRectangle2D.Double(0,0,login.getBounds().width,login.getBounds().getHeight(),30,30);
         login.setShape(redondeado);
         login.revalidate();
         login.setVisible(true);  
         login.Txt_correoElectronico.requestFocus();

    }
     
     
     public  String HTML(String str){
         return "<html><p>"+str+"</p><html>";
     }
     
     
    void Cerrar(){
            login.dispose();
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
                            }  
                        }
                    }
                    componente.setLocation(posFinal, componente.getY());
                }
            } 
            .start();
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
                            }  
                        }
                    }
                    componente.setLocation(posFinal,componente.getY());
                }
            } 
            .start();
        }
    }
     void SliderScroll(JScrollBar scrollBar,int delay, int moverValor,int auxiliar) {
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
        });
        Timer.start();
    }   
    
    void InhabilitarRegistro(){
        for (int i = 0; i < login.PanelRegistro.getComponentCount(); i++) {
                    login.PanelRegistro.getComponent(i).setEnabled(false);
        }
        login.Txt_NomRegistro.setText(null);
        login.Txt_ApePatRegistro.setText(null);
        login.Txt_ApeMatRegistro.setText(null);
        login.Txt_CorreoRegistro.setText(null);
        login.Txt_ContraRegistro.setText(null);
        login.Txt_ConfirmContraRegistro.setText(null);
    }
    
    
    void HabilitarRegistro(){
         for (int i = 0; i < login.PanelRegistro.getComponentCount(); i++) {
                    login.PanelRegistro.getComponent(i).setEnabled(true);
         }
    }
    
    
    void HabilitarInicioSesion(){
         for (int i = 0; i < login.PanelInicioSesion.getComponentCount(); i++) {
                    login.PanelInicioSesion.getComponent(i).setEnabled(true);

         }
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
                  Cerrar();
                 Interfaz_Principal principal=new Interfaz_Principal();
                 CTRL_InterfazPrincipal ctrl_principal=new CTRL_InterfazPrincipal(principal);
                 ctrl_principal.Iniciar();
                  
        }
        
        if (e.getSource()==login.BTN_IniciarSesion) {
                  if (!login.Txt_correoElectronico.getText().equals("") && !login.Txt_contraseña.getText().equals("") || !login.Txt_correoElectronico.getText().equals("") || !login.Txt_contraseña.getText().equals("")) {     
                           if (!login.Txt_correoElectronico.getText().equals(usuario) &&  !login.Txt_contraseña.getText().equals(contraseña) || !login.Txt_correoElectronico.getText().equals(usuario) || !login.Txt_contraseña.getText().equals(contraseña)) {
                               
                                    Emergente emergente=new Emergente(null,"Error en el Ingreso","El usuario y/o contraseña ingresados no estan registrados");
                           }else{
                                     Interfaz_Principal principal=new Interfaz_Principal();
                                     CTRL_InterfazPrincipal ctrl_principal=new CTRL_InterfazPrincipal(principal);
                                     ctrl_principal.Iniciar();
                                     Cerrar();
                           }
                  }else{
                          Emergente emergente=new Emergente(null,"Error en el ingreso","No se debe dejar ningún campo vacio");
                  }          
         }
        if(e.getSource()==login.BTN_Visibilidad){
            
                if (login.BTN_Visibilidad.isSelected()) {
                            login.Txt_contraseña.setEchoChar((char)0);
                }else{
                            login.Txt_contraseña.setEchoChar('*');
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
                JScrollBar scrollPaneles=login.ScrollPanelDinamico.getHorizontalScrollBar();
                JScrollBar scrollInfo=login.ScrollPanelInfo.getHorizontalScrollBar();
                int izquierdaPaneles=scrollPaneles.getValue()-320;
                int izquierdaInfo=scrollInfo.getValue()+320;
                SliderScroll(scrollInfo, 10, izquierdaInfo, 10);
                SliderScroll(scrollPaneles, 5, izquierdaPaneles, 5);
                HabilitarRegistro();
                InhabilitarInicioSesion();
        }
        
        if (e.getSource()==login.LBL_mostrarLogin) {
                JScrollBar scrollPaneles=login.ScrollPanelDinamico.getHorizontalScrollBar();
                JScrollBar scrollInfo=login.ScrollPanelInfo.getHorizontalScrollBar();
                int izquierdaPaneles=scrollPaneles.getValue()+320;
                int DerechaInfo=scrollInfo.getValue()-320;
                SliderScroll(scrollInfo, 10, DerechaInfo, 10);
                SliderScroll(scrollPaneles, 5, izquierdaPaneles, 5);
                HabilitarInicioSesion();
                InhabilitarRegistro();

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
                  login.BTN_clienteInvitado.setForeground(Color.WHITE);
        }
         
         if (e.getSource()==login.BTN_IniciarSesion) {
                login.BTN_IniciarSesion.setBackground(new Color(21,24, 30));
         }
         
         if (e.getSource()==login.BTN_ConfirmarRegistro) {
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
                login.BTN_cerrar.setBackground(new Color(12,12,12));
         }
         
         if (e.getSource()==login.BTN_clienteInvitado) {
                  login.BTN_clienteInvitado.setForeground(new Color(120,120,120));
        }
         
         if (e.getSource()==login.BTN_IniciarSesion) {
                login.BTN_IniciarSesion.setBackground(new Color(18,18,18));
         }
         
         if (e.getSource()==login.BTN_ConfirmarRegistro) {
                login.BTN_ConfirmarRegistro.setBackground(new Color(18,18,18));
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

