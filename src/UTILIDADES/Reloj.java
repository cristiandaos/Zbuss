
package UTILIDADES;

import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

public class Reloj extends JTextField implements Runnable{
    private SimpleDateFormat formato = new SimpleDateFormat("HH:mm:ss");
    private Thread thread;

    public Reloj() {
        thread = new Thread(this);
        thread.start();
        setEditable(false);
        setBackground(new Color(18,18,18));
        setForeground(Color.white);
        setFont(new Font("Consolas",Font.BOLD,28));
        setBorder(new MatteBorder(0,0, 2,0, Color.GREEN));
        setHorizontalAlignment(JLabel.CENTER);
        
        
    }
    
    @Override
    public void run() {
        while (true) {
            Date horaActual = new Date();
            String horaFormateada = formato.format(horaActual);
            setText(horaFormateada);
            try {
                Thread.sleep(1000); // Espera 1 segundo
            } catch (InterruptedException e) {
            }
        }
    }
}
