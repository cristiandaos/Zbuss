package UTILIDADES;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;


public class PanelPersonalizado extends JPanel {

   //Esta es una subclase de un Jpanel Personalizable
    private Color colorInicial=Color.white;
    private Color colorfinal=Color.BLACK;
    
     public Color getColorInicial() {
        return colorInicial;
    }

    public void setColorInicial(Color colorInicial) {
        this.colorInicial = colorInicial;
        repaint();
    }

    public Color getColorFinal() {
        return colorfinal;
    }

    public void setColorFinal(Color colorfinal) {
        this.colorfinal = colorfinal;
        repaint();
    }

    public PanelPersonalizado() {
        setOpaque(false);
    }
  

    @Override
    public void paintComponent(Graphics grphcs) {
         super.paintComponent(grphcs);
         int w = getWidth();
         int h = getHeight();
         Graphics2D g2 = (Graphics2D) grphcs.create();
         g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
         g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
         GradientPaint gp = new GradientPaint(0, 0, colorInicial, w, h, colorfinal);
         g2.setPaint(gp);
         g2.fillRect(0, 0, w, h); // Dibuja un rectángulo que ocupa todo el panel con el gradiente
         g2.dispose();
    }
}
