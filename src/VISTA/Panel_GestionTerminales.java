
package VISTA;


public class Panel_GestionTerminales extends javax.swing.JPanel {

    public Panel_GestionTerminales() {
        initComponents();
    }


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
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(16, 16, 16));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(123, 216, 80)));
        setPreferredSize(new java.awt.Dimension(1060, 670));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TXT_direccion_Terminal.setBackground(new java.awt.Color(14, 14, 14));
        TXT_direccion_Terminal.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        TXT_direccion_Terminal.setForeground(new java.awt.Color(255, 255, 255));
        TXT_direccion_Terminal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        TXT_direccion_Terminal.setCaretColor(new java.awt.Color(255, 255, 255));
        add(TXT_direccion_Terminal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 340, 30));

        TBLterminales.setBackground(new java.awt.Color(12, 12, 12));
        TBLterminales.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        TBLterminales.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        TBLterminales.setForeground(new java.awt.Color(255, 255, 255));
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
        TBLterminales.setFocusable(false);
        TBLterminales.setGridColor(new java.awt.Color(255, 255, 255));
        TBLterminales.setRequestFocusEnabled(false);
        TBLterminales.setRowHeight(25);
        TBLterminales.setSelectionBackground(new java.awt.Color(51, 204, 0));
        TBLterminales.setSelectionForeground(new java.awt.Color(0, 0, 0));
        TBLterminales.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TBLterminales.setShowGrid(true);
        TBLterminales.getTableHeader().setResizingAllowed(false);
        TBLterminales.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(TBLterminales);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 700, 370));

        TXT_nombre_Terminal.setBackground(new java.awt.Color(14, 14, 14));
        TXT_nombre_Terminal.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        TXT_nombre_Terminal.setForeground(new java.awt.Color(255, 255, 255));
        TXT_nombre_Terminal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        TXT_nombre_Terminal.setCaretColor(new java.awt.Color(255, 255, 255));
        add(TXT_nombre_Terminal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 180, 30));

        CB_estado_Terminal.setBackground(new java.awt.Color(14, 14, 14));
        CB_estado_Terminal.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        CB_estado_Terminal.setForeground(new java.awt.Color(255, 255, 255));
        CB_estado_Terminal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Habilitado", "Deshabilitado" }));
        CB_estado_Terminal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        add(CB_estado_Terminal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 170, 30));

        BTN_eliminar_terminal.setText("Eliminar");
        BTN_eliminar_terminal.setFocusable(false);
        add(BTN_eliminar_terminal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 90, 30));

        BTN_nuevo_terminal.setText("Nuevo");
        BTN_nuevo_terminal.setFocusable(false);
        add(BTN_nuevo_terminal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 90, 30));

        BTN_guardar_terminal.setText("Guardar");
        BTN_guardar_terminal.setFocusable(false);
        add(BTN_guardar_terminal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 90, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Estado:");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 60, 30));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BTN_eliminar_terminal;
    public javax.swing.JButton BTN_guardar_terminal;
    public javax.swing.JButton BTN_nuevo_terminal;
    public javax.swing.JComboBox<String> CB_estado_Terminal;
    public javax.swing.JTable TBLterminales;
    public javax.swing.JTextField TXT_direccion_Terminal;
    public javax.swing.JTextField TXT_nombre_Terminal;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
