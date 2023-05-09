
package CONTROLADOR;
import UTILIDADES.PlaceHolder;
import VISTA.Login;
import java.awt.Color;
import java.awt.Font;
import java.awt.Shape;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.RoundRectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

public class CTRL_Login implements ActionListener,MouseListener,KeyListener,MouseMotionListener{
    
    private  Login login;
    private CTRL_InterfazPrincipal principal;
    private int x;
    private int y;
    private String usuario="admin";
    private String contraseña="12345";
    
    public CTRL_Login(Login login,CTRL_InterfazPrincipal principal){
        this.login=login;
        this.principal=principal;
        this. login.Barra.addMouseListener(this);
        this.login.Barra.addMouseMotionListener(this);
        this.login.BTN_cerrar.addActionListener(this);
        this.login.BTN_cerrar.addMouseListener(this);
        this.login.BTN_Visibilidad.addActionListener(this);
        this.login.BTN_siguiente.addActionListener(this);
        this.login.BTN_siguiente.addMouseListener(this);
         
        PlaceHolder Usuario=new PlaceHolder("Usuario", login.Txt_usuario);
        
        PlaceHolder Contraseña=new PlaceHolder("Contraseña", login.Txt_contraseña);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(CTRL_Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     void Iniciar(){
         Shape redondeado=new RoundRectangle2D.Double(0,0,login.getBounds().width,login.getBounds().getHeight(),30,30);
         login.setShape(redondeado);
         login.revalidate();
         login.setVisible(true);  
         login.Txt_usuario.requestFocus();
    }

      
    @Override
        public void actionPerformed(ActionEvent e) {
        if (e.getSource()==login.BTN_cerrar) {
                  System.exit(0);
        }
        if (e.getSource()==login.BTN_siguiente) {
                  if (!login.Txt_usuario.getText().equals("") && !login.Txt_contraseña.getText().equals("") || !login.Txt_usuario.getText().equals("") || !login.Txt_contraseña.getText().equals("")) {     
                           if (!login.Txt_usuario.getText().equals(usuario) &&  !login.Txt_contraseña.getText().equals(contraseña) || !login.Txt_usuario.getText().equals(usuario) || !login.Txt_contraseña.getText().equals(contraseña)) {
                                    JOptionPane.showMessageDialog(null,"El usuario y/o contraseña ingresados son incorrectos", "Error en el ingreso",JOptionPane.ERROR_MESSAGE);
                           }else{
                                     login.dispose();
                                    principal.Iniciar();
                                    principal.getVista().jLabel1.setText(usuario);
                           }
                  }else{
                          JOptionPane.showMessageDialog(null,"No se debe dejar nigún campo vacio","Error en el ingreso", JOptionPane.ERROR_MESSAGE);
                  }          
         }
        if(e.getSource()==login.BTN_Visibilidad){
            if (login.BTN_Visibilidad.isSelected()) {
                  login.Txt_contraseña.setEchoChar((char)0);
            }else{
                  login.Txt_contraseña.setEchoChar('●');
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
        if (e.getSource()==login.BTN_siguiente) {
            login.BTN_siguiente.setBackground(new Color(41,47, 59));
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
         if (e.getSource()==login.BTN_siguiente) {
            login.BTN_siguiente.setBackground(new Color(21,24, 30));
            login.BTN_siguiente.setFont(new Font("Consolas",Font.BOLD,16));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
         if (e.getSource()==login.BTN_cerrar) {
            login.BTN_cerrar.setBackground(new Color(18,18,18));
        }
         if (e.getSource()==login.BTN_siguiente) {
            login.BTN_siguiente.setBackground(new Color(18,18,18));
            login.BTN_siguiente.setFont(new Font("Consolas",Font.PLAIN,16));
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

}

