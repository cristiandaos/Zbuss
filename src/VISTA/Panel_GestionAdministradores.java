
package VISTA;


public class Panel_GestionAdministradores extends javax.swing.JPanel {

 
    public Panel_GestionAdministradores() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TXT_apePat_admin = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        TBLadministradores = new javax.swing.JTable();
        TXT_nombre_admin = new javax.swing.JTextField();
        BTN_eliminar_admin = new javax.swing.JButton();
        BTN_nuevo_admin = new javax.swing.JButton();
        BTN_guardar_admin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TXT_correo_admin = new javax.swing.JTextField();
        TXT_apeMat_admin = new javax.swing.JTextField();
        TXT_contraseña_admin = new javax.swing.JTextField();
        TXT_dni_admin = new javax.swing.JFormattedTextField();

        setBackground(new java.awt.Color(16, 16, 16));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(123, 216, 80)));
        setMinimumSize(new java.awt.Dimension(1060, 670));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TXT_apePat_admin.setBackground(new java.awt.Color(14, 14, 14));
        TXT_apePat_admin.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        TXT_apePat_admin.setForeground(null);
        TXT_apePat_admin.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        TXT_apePat_admin.setCaretColor(new java.awt.Color(255, 255, 255));
        add(TXT_apePat_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 200, 30));

        TBLadministradores.setBackground(new java.awt.Color(12, 12, 12));
        TBLadministradores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        TBLadministradores.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        TBLadministradores.setForeground(new java.awt.Color(255, 255, 255));
        TBLadministradores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TBLadministradores.setFocusable(false);
        TBLadministradores.setGridColor(new java.awt.Color(255, 255, 255));
        TBLadministradores.setRequestFocusEnabled(false);
        TBLadministradores.setRowHeight(25);
        TBLadministradores.setSelectionBackground(new java.awt.Color(51, 204, 0));
        TBLadministradores.setSelectionForeground(new java.awt.Color(0, 0, 0));
        TBLadministradores.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TBLadministradores.setShowGrid(true);
        TBLadministradores.getTableHeader().setResizingAllowed(false);
        TBLadministradores.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(TBLadministradores);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 700, 370));

        TXT_nombre_admin.setBackground(new java.awt.Color(14, 14, 14));
        TXT_nombre_admin.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        TXT_nombre_admin.setForeground(null);
        TXT_nombre_admin.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        TXT_nombre_admin.setCaretColor(new java.awt.Color(255, 255, 255));
        add(TXT_nombre_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 200, 30));

        BTN_eliminar_admin.setText("Eliminar");
        BTN_eliminar_admin.setFocusable(false);
        add(BTN_eliminar_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 580, 90, 30));

        BTN_nuevo_admin.setText("Nuevo");
        BTN_nuevo_admin.setFocusable(false);
        add(BTN_nuevo_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 90, 30));

        BTN_guardar_admin.setText("Guardar");
        BTN_guardar_admin.setFocusable(false);
        add(BTN_guardar_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 580, 90, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DNI:");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 40, 30));

        TXT_correo_admin.setBackground(new java.awt.Color(14, 14, 14));
        TXT_correo_admin.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        TXT_correo_admin.setForeground(null);
        TXT_correo_admin.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        TXT_correo_admin.setCaretColor(new java.awt.Color(255, 255, 255));
        add(TXT_correo_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 200, 30));

        TXT_apeMat_admin.setBackground(new java.awt.Color(14, 14, 14));
        TXT_apeMat_admin.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        TXT_apeMat_admin.setForeground(null);
        TXT_apeMat_admin.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        TXT_apeMat_admin.setCaretColor(new java.awt.Color(255, 255, 255));
        add(TXT_apeMat_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 200, 30));

        TXT_contraseña_admin.setBackground(new java.awt.Color(14, 14, 14));
        TXT_contraseña_admin.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        TXT_contraseña_admin.setForeground(null);
        TXT_contraseña_admin.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        TXT_contraseña_admin.setCaretColor(new java.awt.Color(255, 255, 255));
        add(TXT_contraseña_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 200, 30));

        TXT_dni_admin.setBackground(new java.awt.Color(14, 14, 14));
        TXT_dni_admin.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        TXT_dni_admin.setForeground(java.awt.Color.white);
        try {
            TXT_dni_admin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TXT_dni_admin.setCaretColor(new java.awt.Color(255, 255, 255));
        TXT_dni_admin.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        TXT_dni_admin.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        add(TXT_dni_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 160, 30));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BTN_eliminar_admin;
    public javax.swing.JButton BTN_guardar_admin;
    public javax.swing.JButton BTN_nuevo_admin;
    public javax.swing.JTable TBLadministradores;
    public javax.swing.JTextField TXT_apeMat_admin;
    public javax.swing.JTextField TXT_apePat_admin;
    public javax.swing.JTextField TXT_contraseña_admin;
    public javax.swing.JTextField TXT_correo_admin;
    public javax.swing.JFormattedTextField TXT_dni_admin;
    public javax.swing.JTextField TXT_nombre_admin;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
