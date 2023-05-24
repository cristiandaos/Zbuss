
package UTILIDADES;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowListener;
import java.awt.geom.RoundRectangle2D;
import javax.security.auth.callback.TextOutputCallback;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.UIDefaults;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import org.w3c.dom.events.MouseEvent;



public  class Emergente extends JDialog implements ActionListener,MouseMotionListener,MouseListener,WindowListener,WindowFocusListener{
    
    private int x;
    private int y;
    private JPanel contenido;
    private JPanel BarraSuperior;
    private JLabel mensaje;
    private JButton btnConfirmar ;
    private JButton btnCerrar;
    private JLabel Titulo;
    public Emergente(JFrame frame,String titulo,String msg){
        super(frame, true);
                addWindowListener(this);
                setUndecorated(true);
                Dimension dimension=new Dimension(450,200);
                setSize(dimension);
                setPreferredSize(dimension);
                setLayout(null);
                setLocationRelativeTo(frame);
                setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                Shape redondeado=new RoundRectangle2D.Double(0,0,getBounds().width,getBounds().getHeight(),30,30);
                setShape(redondeado);
                
                BarraSuperior=new JPanel(null);
                BarraSuperior.setBounds(0, 0, getWidth(), 40);
                BarraSuperior.setBackground(new Color(12, 12, 12));
                BarraSuperior.setBorder(new MatteBorder(0, 0, 2, 0, new Color(123,216,80)));
                BarraSuperior.addMouseMotionListener(this);
                BarraSuperior.addMouseListener(this);
                
                
                btnCerrar =new JButton("X");
                btnCerrar.setBounds((BarraSuperior.getWidth()-(int)btnCerrar.getPreferredSize().getWidth()),0,(int)btnCerrar.getPreferredSize().getWidth(),BarraSuperior.getHeight());
                btnCerrar.setForeground(Color.WHITE);
                btnCerrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
                btnCerrar.setFont(new Font("Segou UI",Font.PLAIN,18 ));
                btnCerrar.setHorizontalAlignment(SwingConstants.CENTER);
                btnCerrar.setBackground(new Color(12,12,12));
                btnCerrar.setBorder(new MatteBorder(0,0,2,0,new Color(123,216,80)));
                btnCerrar.setFocusable(false);
                btnCerrar.addMouseListener(this);
                btnCerrar.addActionListener(this);
                BarraSuperior.add(btnCerrar);
                
                Titulo=new JLabel(titulo);
                Titulo.setBounds(10,0, BarraSuperior.getWidth()-btnCerrar.getWidth(),40);
                Titulo.setForeground(Color.WHITE);
                Titulo.setFont(new Font("Segou UI",Font.PLAIN,16));
                BarraSuperior.add(Titulo);
                
                contenido=new JPanel(null);
                contenido.setBounds(0, BarraSuperior.getHeight(), getWidth(), getHeight()-BarraSuperior.getHeight());
                contenido.setBackground(new Color(14,14,14));    
                
                mensaje=new JLabel(msg);
                mensaje.setFont(new Font("Segou UI",Font.BOLD,13));
                mensaje.setForeground(Color.WHITE);
                mensaje.setBounds((contenido.getWidth() - (int) mensaje.getPreferredSize().getWidth())/2,(contenido.getHeight()-((int)mensaje.getPreferredSize().getHeight())/2)-110, (int) mensaje.getPreferredSize().getWidth(), (int)mensaje.getPreferredSize().getHeight());
                contenido.add(mensaje);
                
                btnConfirmar =new JButton("OK");
                btnConfirmar.setForeground(Color.WHITE);
                btnConfirmar.setFont(new Font("Consolas",Font.PLAIN,16));
                btnConfirmar.setFocusable(false);
                btnConfirmar.setCursor(new Cursor(Cursor.HAND_CURSOR));
                btnConfirmar.setBorder(new MatteBorder(0,0,2,0,new Color(123,216,80)));
                btnConfirmar.setBackground(new Color(18,18,18));
                btnConfirmar.setBounds((contenido.getWidth()-50)/2, mensaje.getY()+mensaje.getHeight()+20, 50, 30);
                btnConfirmar.addMouseListener(this);
                btnConfirmar.addActionListener(this);
                contenido.add(btnConfirmar);
                
                add(BarraSuperior);
                add(contenido);
                setVisible(true);
    }
    
 


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btnConfirmar) {
           dispose();
        }
        
        if (e.getSource()==btnCerrar) {
           dispose();
        }
    }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
     
    }
    
    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
            if (e.getSource()==BarraSuperior) {
                x=e.getX();
                y=e.getY();
            }
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
      
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
            if (e.getSource()==btnConfirmar) {
                    btnConfirmar.setFont(new Font("Consolas",Font.BOLD,16));
                    btnConfirmar.setBackground(new Color(21,24, 30));
            }
            
            if(e.getSource()==btnCerrar){
                    btnCerrar.setBackground(Color.RED);
            }
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
            if (e.getSource()==btnConfirmar) {
                    btnConfirmar.setFont(new Font("Consolas",Font.PLAIN,16));
                    btnConfirmar.setBackground(new Color(14,14,14));
            }
            
            if(e.getSource()==btnCerrar){
                    btnCerrar.setBackground(new Color(12,12,12));
            }

    }
    
    @Override
    public void mouseDragged(java.awt.event.MouseEvent e) {
                if (e.getSource()==BarraSuperior) {
                    int  xMouse=e.getXOnScreen();
                    int  YMouse=e.getYOnScreen();
                    setLocation(xMouse-x, YMouse-y);
                }
    }

    @Override
    public void mouseMoved(java.awt.event.MouseEvent e) {
      
    }

    @Override
    public void windowOpened(WindowEvent e) {
            if (e.getSource()==this) {
                  for (double  i = 0.0; i <= 1; i=i+0.1) {
                        float f=(float) i;
                        setOpacity(f);
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

    @Override
    public void windowGainedFocus(WindowEvent e) {
      
    }

    @Override
    public void windowLostFocus(WindowEvent e) {
      
    }
    
}

   

