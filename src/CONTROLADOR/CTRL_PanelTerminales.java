
package CONTROLADOR;

import MODELO.Terminales;
import MODELO.TerminalesDAO;
import UTILIDADES.Emergente;
import VISTA.Panel_GestionTerminales;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CTRL_PanelTerminales implements ActionListener{
         
         private  Panel_GestionTerminales panel;
         
         private TerminalesDAO terminalDAO=new TerminalesDAO();
         
         public CTRL_PanelTerminales(Panel_GestionTerminales panel){
                  this.panel=panel;
                  
                  this.panel.BTN_eliminar_terminal.addActionListener(this);
                  
                  this.panel.BTN_guardar_terminal.addActionListener(this);
                  
                  this.panel.BTN_nuevo_terminal.addActionListener(this);
         }
         
         public Panel_GestionTerminales getPanel(){
                  return panel;
         }
         
         void ReiniciarCampos(){
                  panel.TXT_nombre_Terminal.setText(null);
                  panel.TXT_direccion_Terminal.setText(null);
                  panel.CB_estado_Terminal.setSelectedIndex(0);
             
         }
         
        
         
    @Override
         public void actionPerformed(ActionEvent e) {
                  if (e.getSource()==panel.BTN_guardar_terminal) {
                          Terminales terminal=new Terminales(panel.TXT_nombre_Terminal.getText(), 
                                                                                          panel.TXT_direccion_Terminal.getText(), 
                                                                                          panel.CB_estado_Terminal.getSelectedItem().toString());
                          
                          if (terminal.ConAtributosVacios()) {
                                    Emergente msg=new Emergente(null, "Error en el registro de una Terminal","No debe dejar campos vacios");
                                    return;
                           }
                           
                           terminalDAO.RegistrarTerminal(terminal);
                           ReiniciarCampos();
                  }
                  if (e.getSource()==panel.BTN_nuevo_terminal) {
                           ReiniciarCampos();
                  }
  
         }
}
