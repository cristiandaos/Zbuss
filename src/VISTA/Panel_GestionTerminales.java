/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VISTA;

/**
 *
 * @author eddie
 */
public class Panel_GestionTerminales extends javax.swing.JPanel {

    /**
     * Creates new form Panel_GestionTerminales
     */
    public Panel_GestionTerminales() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TXT_direccion_Terminal = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        TBLterminales = new javax.swing.JTable();
        TXT_nombre_Terminal = new javax.swing.JTextField();
        CB_estado_Terminal = new javax.swing.JComboBox<>();
        BTN_eliminar_terminal = new javax.swing.JButton();
        BTN_nuevo_terminal = new javax.swing.JButton();
        BTN_guardar_terminal = new javax.swing.JButton();

        setBackground(new java.awt.Color(20, 20, 20));
        setPreferredSize(new java.awt.Dimension(1060, 670));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TXT_direccion_Terminal.setBackground(new java.awt.Color(14, 14, 14));
        TXT_direccion_Terminal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 204, 0)));
        add(TXT_direccion_Terminal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 310, 30));

        TBLterminales.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 0)));
        TBLterminales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TBLterminales.setGridColor(new java.awt.Color(255, 255, 255));
        TBLterminales.getTableHeader().setResizingAllowed(false);
        TBLterminales.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(TBLterminales);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 670, 430));

        TXT_nombre_Terminal.setBackground(new java.awt.Color(14, 14, 14));
        TXT_nombre_Terminal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 204, 0)));
        add(TXT_nombre_Terminal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 180, 30));

        CB_estado_Terminal.setForeground(new java.awt.Color(255, 255, 255));
        CB_estado_Terminal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Habilitado", "Deshabilitado" }));
        add(CB_estado_Terminal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 170, -1));

        BTN_eliminar_terminal.setText("Eliminar");
        add(BTN_eliminar_terminal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 90, 30));

        BTN_nuevo_terminal.setText("Nuevo");
        add(BTN_nuevo_terminal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 90, 30));

        BTN_guardar_terminal.setText("Guardar");
        add(BTN_guardar_terminal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 90, 30));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BTN_eliminar_terminal;
    public javax.swing.JButton BTN_guardar_terminal;
    public javax.swing.JButton BTN_nuevo_terminal;
    public javax.swing.JComboBox<String> CB_estado_Terminal;
    public javax.swing.JTable TBLterminales;
    public javax.swing.JTextField TXT_direccion_Terminal;
    public javax.swing.JTextField TXT_nombre_Terminal;
    public javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
