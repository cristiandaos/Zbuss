
package UTILIDADES;

import java.awt.BorderLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;


public class Efectos  {

    public void Derecha(final int posInicial, final int posFinal,final int delay, final int incremento,final JComponent componente){
    if(componente.getX()==posInicial){
        new Thread(){
            public void run(){
                while (componente.getX()<posFinal) {              
                    for (int i = posInicial; i<=posFinal; i+=incremento) {
                        try {
                            Thread.sleep(delay);
                            componente.setLocation(i, componente.getY());
                        } catch (InterruptedException e) {
                            System.out.println("Error: Interrupcion "+e);
                        }  
                    }
                }
                componente.setLocation(posFinal, componente.getY());
            }
        }
        .start();
    }
    }
   
    public void Izquierda(final int posInicial, final int posFinal,final int delay, final int incremento,final JComponent componente){
    if(componente.getX()==posInicial){   
        new Thread(){
            public void run(){
                while (componente.getX()>posFinal) {              
                    for (int i = posInicial; i>=posFinal; i-=incremento) {
                        try {
                            Thread.sleep(delay);
                            componente.setLocation(i, componente.getY());
                        } catch (InterruptedException e) {
                            System.out.println("Error: Interrupcion "+e);
                        }  
                    }
                }
                componente.setLocation(posFinal,componente.getY());
            }
        }
        .start();
    }
    }
   
   public void mostrarPanel(JPanel panelDinamico,JPanel panel,int ancho, int alto ){
        panel.setSize(ancho,alto);
        panel.setLocation(0, 0);
        panelDinamico.removeAll();
        panelDinamico.add(panel,BorderLayout.CENTER);
        panelDinamico.revalidate();
        panelDinamico.repaint();
   }
}
 