
package CONTROLADOR;

import VISTA.*;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;
public class Main {


    public static void main(String[] args) {
         try {
                  UIManager.setLookAndFeel( new FlatDarkLaf());
                 //Diseño de JComboBox
                  UIManager.put("ComboBox.selectionBackground", new Color(6,6,6));
                  UIManager.put("ComboBox.selectionForeground",  Color.WHITE);
                  UIManager.put("ComboBox.background", new Color(16,16,16));
                  UIManager.put("PopupMenu.borderColor",new Color(123,216,80));
                  UIManager.put("ComboBox.buttonHoverArrowColor",Color.WHITE);
                  UIManager.put("ComboBox.buttonArrowColor",Color.BLACK);
                  UIManager.put("ComboBox.buttonBackground",new Color(50,50,50));
                  UIManager.put("Component.arrowType", "triangle");
                 //Diseño de Jbutton
                  UIManager.put( "Button.arc", 999 );
                  UIManager.put("Button.background", new Color(12,12,12));
                  UIManager.put("Button.borderColor", new Color(123,216,80));
                  UIManager.put("Button.hoverBorderColor",Color.GREEN);
                  //Diseño de Spinner
                  UIManager.put("Spinner.background", new Color(12,12,12));
                  UIManager.put("Spinner.buttonHoverArrowColor", Color.WHITE);
                  UIManager.put("Spinner.buttonPressedArrowColor", Color.GREEN);
                  UIManager.put("Spinner.buttonBackground", new Color(30,30,30));
                  UIManager.put("Spinner.foreground",Color.WHITE);
                  UIManager.put("Spinner.disabledForeground",Color.WHITE);
                 
                 //diseño del JScroll
                  UIManager.put("ScrollBar.thumb", new Color(123,216,80));
                  UIManager.put("ScrollBar.track", Color.BLACK);
                  UIManager.put("ScrollBar.hoverThumbColor", Color.GREEN);
                  UIManager.put("ScrollBar.pressedThumbColor", Color.GREEN);
                  UIManager.put("ScrollBar.hoverTrackColor", Color.BLACK);
                  
                  //diseño de Jtextfield
                  UIManager.put("TextField.inactiveForeground", Color.WHITE);
                  UIManager.put("TextField.inactiveBackground", new Color(10,10,10));
                
        } catch( UnsupportedLookAndFeelException ex ) {
                  System.err.println( "Fallo en la inicialización del L&F" );
        }
        Login login=new Login();
        CTRL_Login ctrl_login=new CTRL_Login(login);
        ctrl_login.Iniciar();
    }
}
