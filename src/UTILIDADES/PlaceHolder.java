package UTILIDADES;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import javax.swing.text.*;

public class PlaceHolder extends JLabel implements FocusListener, DocumentListener {
                  public enum Visibilidad {
                      ALWAYS, FOCUS_GAINED, FOCUS_LOST;
                   }
	private JTextComponent component;
	private Document document;
	private Visibilidad show;

         public PlaceHolder(String text, JTextComponent component, Visibilidad show) {
	this.component = component;
	setVisibilidad(show);
	document = component.getDocument();
	setText(text);
	setFont(component.getFont());
	setForeground(Color.gray);
	setHorizontalAlignment(JLabel.CENTER);
	component.addFocusListener(this);
	document.addDocumentListener(this);
	component.setLayout(new BorderLayout());
	component.add(this);
	checkForPrompt();
         }
         
         public Visibilidad getVisibilidad() {
	return show;
         }

         public void setVisibilidad(Visibilidad show) {
	this.show = show;
         }

        private void checkForPrompt() {
	if (document.getLength() > 0) {
                            setVisible(false);
                            return;
	}

	if (component.hasFocus()) {
                           if (show == Visibilidad.ALWAYS || show == Visibilidad.FOCUS_GAINED){
		setVisible(true);
                           } else{
		setVisible(false);
                           }
	} else {
                           if (show == Visibilidad.ALWAYS || show == Visibilidad.FOCUS_LOST){
		setVisible(true);
                           }else{
		setVisible(false);
                           }
	}
         }


	public void focusGained(FocusEvent e) {
		checkForPrompt();
	}

	public void focusLost(FocusEvent e) {
		checkForPrompt();
	}

	// Implement DocumentListener

	public void insertUpdate(DocumentEvent e) {
		checkForPrompt();
	}

	public void removeUpdate(DocumentEvent e) {
		checkForPrompt();
	}

	public void changedUpdate(DocumentEvent e) {
	}
}