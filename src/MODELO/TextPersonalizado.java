
package MODELO;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class TextPersonalizado extends JTextField{
    private int arc=30;

    public int getArc() {
        return arc;
    }
    
    public void setArc(int arc) {
        this.arc = arc;
    }
    
    public TextPersonalizado() {
        setOpaque(false);
        setBorder(new EmptyBorder(0,5,0,2));
        setPreferredSize(new Dimension(100,20));
    }
    
    
@Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Paint oldPaint = g2.getPaint();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        RoundRectangle2D r2d = new RoundRectangle2D.Double(0,0,getWidth(),getHeight(),arc,arc);
        g2.clip(r2d);
        g2.setPaint(new GradientPaint(0,0,getBackground(),0, getHeight(), getBackground()));
        g2.fillRect(0,0,getWidth(),getHeight());
        g2.setPaint(new GradientPaint(0, 0, Color.BLACK,0, getHeight(), Color.BLACK));
        g2.drawRoundRect(0, 0, getWidth(), getHeight(), arc, arc);
        g2.setPaint(oldPaint);
        super.paintComponent(g);
    }
}


