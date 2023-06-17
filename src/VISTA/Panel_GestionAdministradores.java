/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VISTA;

/**
 *
 * @author eddie
 */
public class Panel_GestionAdministradores extends javax.swing.JPanel {

    /**
     * Creates new form Panel_GestionAdministradores
     */
    public Panel_GestionAdministradores() {
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

        TXT_apePat_admin = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        TBLadministradores = new javax.swing.JTable();
        TXT_nombre_admin = new javax.swing.JTextField();
        BTN_eliminar_admin = new javax.swing.JButton();
        BTN_nuevo_admin = new javax.swing.JButton();
        BTN_guardar_admin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TXT_correo_admin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TXT_apeMat_admin = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TXT_contraseña_admin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TXT_dni_admin = new javax.swing.JFormattedTextField();

        setBackground(new java.awt.Color(16, 16, 16));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        setMinimumSize(new java.awt.Dimension(1060, 670));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TXT_apePat_admin.setBackground(new java.awt.Color(14, 14, 14));
        TXT_apePat_admin.setForeground(new java.awt.Color(255, 255, 255));
        TXT_apePat_admin.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(123, 216, 80)));
        add(TXT_apePat_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 170, 30));

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
        TXT_nombre_admin.setForeground(new java.awt.Color(255, 255, 255));
        TXT_nombre_admin.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(123, 216, 80)));
        add(TXT_nombre_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 150, 30));

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
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido Paterno");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, 20));

        TXT_correo_admin.setBackground(new java.awt.Color(14, 14, 14));
        TXT_correo_admin.setForeground(new java.awt.Color(255, 255, 255));
        TXT_correo_admin.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(123, 216, 80)));
        add(TXT_correo_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 200, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Correo Electronico");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, 20));

        TXT_apeMat_admin.setBackground(new java.awt.Color(14, 14, 14));
        TXT_apeMat_admin.setForeground(new java.awt.Color(255, 255, 255));
        TXT_apeMat_admin.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(123, 216, 80)));
        add(TXT_apeMat_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 170, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apellido Materno");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, 20));

        TXT_contraseña_admin.setBackground(new java.awt.Color(14, 14, 14));
        TXT_contraseña_admin.setForeground(new java.awt.Color(255, 255, 255));
        TXT_contraseña_admin.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(123, 216, 80)));
        add(TXT_contraseña_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 200, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Contraseña");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        TXT_dni_admin.setBackground(new java.awt.Color(14, 14, 14));
        TXT_dni_admin.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(123, 216, 80)));
        try {
            TXT_dni_admin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TXT_dni_admin.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        TXT_dni_admin.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        add(TXT_dni_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 150, 30));
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
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
