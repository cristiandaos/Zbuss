
package UTILIDADES;

import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

public class FechaHora extends JLabel implements Runnable{
    private SimpleDateFormat formato = new SimpleDateFormat("HH:mm:ss");
    private Thread thread;

    public FechaHora() {
        thread = new Thread(this);
        thread.start();
        setForeground(Color.white);
        setFont(new Font("Consolas",Font.BOLD,28));
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
