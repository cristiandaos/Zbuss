
package CONTROLADOR;
import VISTA.Interfaz_Principal;
import java.awt.Color;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.RoundRectangle2D;

public class CTRL_InterfazPrincipal implements ActionListener,MouseListener,MouseMotionListener,KeyListener{
    private Interfaz_Principal vista;
    private int x;
    private int y;

    public CTRL_InterfazPrincipal(Interfaz_Principal vista){
        this.vista=vista;
        this.vista.Barra.addMouseMotionListener(this);
        this.vista.Barra.addMouseListener(this);
        this.vista.BTN_cerrar.addActionListener(this);
        this.vista.BTN_cerrar.addMouseListener(this);
        
    } 
    public Interfaz_Principal getVista(){
        return vista;
    }
    public void Iniciar(){
         Shape redondeado=new RoundRectangle2D.Double(0,0,vista.getBounds().width,vista.getBounds().getHeight(),30,30);
         vista.setShape(redondeado);
         vista.revalidate();
         vista.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==vista.BTN_cerrar) {
            vista.dispose();
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
}
