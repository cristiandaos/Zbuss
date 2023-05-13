
package CONTROLADOR;
import VISTA.Interfaz_Principal;
import VISTA.Login;
import java.awt.Color;
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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class CTRL_InterfazPrincipal implements ActionListener,MouseListener,MouseMotionListener,KeyListener,WindowListener{
    private Interfaz_Principal vista;
    private int x;
    private int y;
    ArrayList<JLabel>CodCombos;
    ArrayList<JPanel>PanelCombos;
    ArrayList<JTextArea>DescripCombos;
    ArrayList<JLabel>IMGCombos;
    ArrayList<JButton> BotonesCombo;
    ArrayList<JButton> QuitarCombo;
    ArrayList<JLabel>NomCombos;
    ArrayList<JLabel>PreciosCombos;
    
    public CTRL_InterfazPrincipal(Interfaz_Principal vista){
        this.vista=vista;
        this.vista.addWindowListener(this);
        this.vista.Barra.addMouseMotionListener(this);
        this.vista.Barra.addMouseListener(this);
        this.vista.BTN_cerrarSesion.addActionListener(this);
        this.vista.BTN_cerrarSesion.addMouseListener(this);
        this.vista.BTN_cerrar.addActionListener(this);
        this.vista.BTN_cerrar.addMouseListener(this);
        CodCombos=new ArrayList<>();
        QuitarCombo=new ArrayList<>();
        BotonesCombo=new ArrayList<>();
        IMGCombos=new ArrayList<>();
        NomCombos=new ArrayList<>();
        PreciosCombos=new ArrayList<>();
        DescripCombos=new ArrayList<>();
        GenerarPaneles(10);
    } 
    
    public Interfaz_Principal getVista(){
        return vista;
    }
    
    void Iniciar(){
         Shape redondeado=new RoundRectangle2D.Double(0,0,vista.getBounds().width,vista.getBounds().getHeight(),30,30);
         vista.setShape(redondeado);
         vista.revalidate();
         vista.setVisible(true);
         vista.BTN_cerrarSesion.setBackground(new Color(18, 18, 18));
    }
    
    void Cerrar(){
        vista.dispose();
    }
    
    void GenerarPaneles(int cant){
        int x=100;
        int y=100;
        int ancho=300;
        int alto=400;
        int incremento=500;
        for (int i = 0; i < cant; i++) {
            JPanel contenido=new JPanel();
            contenido.setBounds(x,y,ancho,alto);
            contenido.setBackground(new Color(1,176,241));
            contenido.setLayout(null);
            vista.PanelBuses.add(contenido);
            x+=incremento;
            if(x+contenido.getWidth()>vista.PanelBuses.getWidth()){
                x=100;
                y+=incremento;
            }
            if (y>vista.PanelBuses.getHeight()) {
                vista.PanelBuses.setPreferredSize(new Dimension( (int)vista.PanelBuses.getPreferredSize().getWidth(), ((int) (vista.PanelBuses.getPreferredSize().getHeight())+130)));
            }
        }   
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==vista.BTN_cerrar) {
            Cerrar();
        }

        if (e.getSource()==vista.BTN_cerrarSesion) {
            Login login=new Login();
            CTRL_Login ctrlLogin=new CTRL_Login(login);
            ctrlLogin.Iniciar();
            Cerrar();
        }        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource()==vista.Barra) {
            x=e.getX();
            y=e.getY(); 
        }
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource()==vista.BTN_cerrar) {
            vista.BTN_cerrar.setBackground(Color.red);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource()==vista.BTN_cerrar) {
            vista.BTN_cerrar.setBackground(new Color(18,18,18));
        }      
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (e.getSource()==vista.Barra) {
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
