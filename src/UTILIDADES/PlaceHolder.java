package UTILIDADES;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import javax.swing.text.*;

public class PlaceHolder extends JLabel implements FocusListener, DocumentListener {
                  public enum Show {
                      ALWAYS, FOCUS_GAINED, FOCUS_LOST;
                   }
	private JTextComponent component;
	private Document document;
	private Show show;
	private boolean showPromptOnce;
	private int focusLost;

         public PlaceHolder(String text, JTextComponent component, Show show) {
	this.component = component;
	setShow(show);
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
         
         public Show getShow() {
	return show;
         }

         public void setShow(Show show) {
	this.show = show;
         }

         public boolean getShowPromptOnce() {
                  return showPromptOnce;
         }

         public void setShowPromptOnce(boolean showPromptOnce) {
	this.showPromptOnce = showPromptOnce;
         }

        private void checkForPrompt() {
	if (document.getLength() > 0) {
                            setVisible(false);
                            return;
	}

                   if (showPromptOnce && focusLost > 0) {
                            setVisible(false);
                            return;
	}

	if (component.hasFocus()) {
                            if (show == Show.ALWAYS || show == Show.FOCUS_GAINED){
		setVisible(true);
                            } else{
		setVisible(false);
                            }
	} else {
                            if (show == Show.ALWAYS || show == Show.FOCUS_LOST){
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
		focusLost++;
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