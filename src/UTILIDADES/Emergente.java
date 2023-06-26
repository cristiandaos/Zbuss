
package UTILIDADES;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;



public  class Emergente extends JDialog implements ActionListener,MouseMotionListener,MouseListener,WindowListener,WindowFocusListener{
    
    public enum Tipo { ConfirmDialog, MessageDialog; }
    private int Opcion=0;
    private int x;
    private int y;
    private JPanel contenido;
    private JPanel BarraSuperior;
    private JLabel mensaje;
    private JButton btnConfirmar ;
    private JButton btn_Si;
    private JButton btn_No;
    private JButton btnCerrar;
    private JLabel Titulo;
        public Emergente(JFrame frame,String titulo,String msg,Tipo tipo){
         super (frame, true);
                  addWindowListener(this);
                  setUndecorated(true);
                  Dimension dimension=new Dimension(500,200);
                  setSize(dimension);
                  setPreferredSize(dimension);
                  setLayout(null);
                  setLocationRelativeTo(frame);
                  setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                  
                  BarraSuperior=new JPanel(null);
                  BarraSuperior.setBounds(0, 0, getWidth(), 40);
                  BarraSuperior.setBackground(Color.BLACK);
                  BarraSuperior.setBorder(new MatteBorder(0, 0, 2, 0,Color.WHITE));
                  BarraSuperior.addMouseMotionListener(this);
                  BarraSuperior.addMouseListener(this);
                
                
                  btnCerrar =new JButton("X");
                  btnCerrar.setBounds((BarraSuperior.getWidth()-50),0,50,BarraSuperior.getHeight());
                  btnCerrar.setForeground(Color.WHITE);
                  btnCerrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
                  btnCerrar.setFont(new Font("Segou UI",Font.PLAIN,18 ));
                  btnCerrar.setHorizontalAlignment(SwingConstants.CENTER);
                  btnCerrar.setBackground(Color.BLACK);
                  btnCerrar.setBorder(new MatteBorder(0,0,2,0,Color.WHITE));
                  btnCerrar.setFocusable(false);
                  btnCerrar.addMouseListener(this);
                  btnCerrar.addActionListener(this);
                  BarraSuperior.add(btnCerrar);
                
                  Titulo=new JLabel(titulo);
                  Titulo.setBounds(10,0, BarraSuperior.getWidth()-btnCerrar.getWidth(),40);
                  Titulo.setForeground(Color.GREEN);
                  Titulo.setFont(new Font("Consolas",Font.PLAIN,16));
                  BarraSuperior.add(Titulo);
                
                  contenido=new JPanel(null);
                  contenido.setBounds(0, BarraSuperior.getHeight(), getWidth(), getHeight()-BarraSuperior.getHeight());
                  contenido.setBackground(new Color(10,10,10));    
                
                  mensaje=new JLabel(msg);
                  mensaje.setFont(new Font("Segou UI",Font.BOLD,14));
                  mensaje.setForeground(Color.WHITE);
                  mensaje.setBounds((contenido.getWidth() - (int) mensaje.getPreferredSize().getWidth())/2,(contenido.getHeight()-((int)mensaje.getPreferredSize().getHeight())/2)-110, (int) mensaje.getPreferredSize().getWidth(), (int)mensaje.getPreferredSize().getHeight());
                  contenido.add(mensaje);
                  if (tipo.equals(tipo.MessageDialog)) {
                           btnConfirmar =new JButton("OK");
                           EstiloBoton(btnConfirmar);
                           btnConfirmar.setBounds((contenido.getWidth()/2)-30, mensaje.getY()+mensaje.getHeight()+20, 60, 30);
                  
                  }else if (tipo.equals(Tipo.ConfirmDialog)) {
                           btn_Si=new JButton("Si");
                           btn_No=new JButton("No");
                           EstiloBoton(btn_Si);
                           EstiloBoton(btn_No);
                           btn_Si.setBounds((contenido.getWidth()/4), mensaje.getY()+mensaje.getHeight()+20, 60, 30);
                           btn_No.setBounds((contenido.getWidth()*3/4)-60, mensaje.getY()+mensaje.getHeight()+20, 60, 30);
                  }

                add(BarraSuperior);
                add(contenido);
                setVisible(true);
         }
    
         private void EstiloBoton(JButton btn){
                  btn.setForeground(Color.WHITE);
                  btn.setFont(new Font("Consolas",Font.PLAIN,16));
                  btn.setFocusable(false);
                  btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
                  btn.setBorder(new MatteBorder(1,1,1,1,new Color(123,216,80)));
                  btn.setBackground(new Color(10,10,10));
                  btn.addMouseListener(this);
                  btn.addActionListener(this);
                  contenido.add(btn);
         }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btnConfirmar) {
                dispose();
        }
        
        if (e.getSource()==btn_Si) {
                Opcion=1;
                dispose();
        }
        
        if (e.getSource()==btn_No) {
                Opcion=0;
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
            
            if (e.getSource()==btn_No) {
                    btn_No.setFont(new Font("Consolas",Font.BOLD,16));
                    btn_No.setBackground(new Color(21,24, 30));
            }
            
            if (e.getSource()==btn_Si) {
                    btn_Si.setFont(new Font("Consolas",Font.BOLD,16));
                    btn_Si.setBackground(new Color(21,24, 30));
            }
            
            
            if(e.getSource()==btnCerrar){
                    btnCerrar.setBackground(Color.RED);
            }
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
            if (e.getSource()==btnConfirmar) {
                    btnConfirmar.setFont(new Font("Consolas",Font.PLAIN,16));
                    btnConfirmar.setBackground(new Color(10,10,10));
            }
            
            if (e.getSource()==btn_Si) {
                    btn_Si.setFont(new Font("Consolas",Font.PLAIN,16));
                    btn_Si.setBackground(new Color(10,10,10));
            }
            
            if (e.getSource()==btn_No) {
                    btn_No.setFont(new Font("Consolas",Font.PLAIN,16));
                    btn_No.setBackground(new Color(10,10,10));
            }
            
            if(e.getSource()==btnCerrar){
                    btnCerrar.setBackground(Color.BLACK);
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

   

