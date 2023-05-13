
package VISTA;

public class Login extends javax.swing.JFrame {


    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Barra = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BTN_ingresar = new javax.swing.JButton();
        BTN_Visibilidad = new javax.swing.JToggleButton();
        Txt_contraseña = new javax.swing.JPasswordField();
        Txt_usuario = new javax.swing.JTextField();
        Ingresar = new javax.swing.JLabel();
        BTN_cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Barra.setBackground(new java.awt.Color(18, 18, 18));
        Barra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 30));

        jPanel7.setBackground(new java.awt.Color(18, 18, 18));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Usuario");
        jPanel7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 70, 30));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Contraseña");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, 30));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Z-Buss");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(123, 216, 80)));
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 140, -1));

        BTN_ingresar.setBackground(new java.awt.Color(18, 18, 18));
        BTN_ingresar.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        BTN_ingresar.setForeground(new java.awt.Color(255, 255, 255));
        BTN_ingresar.setText("Ingresar");
        BTN_ingresar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(123, 216, 80), 2, true));
        BTN_ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_ingresar.setFocusPainted(false);
        BTN_ingresar.setFocusable(false);
        jPanel7.add(BTN_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 100, 30));

        BTN_Visibilidad.setBackground(new java.awt.Color(18, 18, 18));
        BTN_Visibilidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/No_Visible.png"))); // NOI18N
        BTN_Visibilidad.setBorderPainted(false);
        BTN_Visibilidad.setContentAreaFilled(false);
        BTN_Visibilidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_Visibilidad.setFocusPainted(false);
        BTN_Visibilidad.setFocusable(false);
        BTN_Visibilidad.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/Visible.png"))); // NOI18N
        jPanel7.add(BTN_Visibilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 30, 30));

        Txt_contraseña.setBackground(new java.awt.Color(18, 18, 18));
        Txt_contraseña.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Txt_contraseña.setForeground(new java.awt.Color(255, 255, 255));
        Txt_contraseña.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Txt_contraseña.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel7.add(Txt_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 200, 30));

        Txt_usuario.setBackground(new java.awt.Color(18, 18, 18));
        Txt_usuario.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Txt_usuario.setForeground(new java.awt.Color(255, 255, 255));
        Txt_usuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Txt_usuario.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel7.add(Txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 210, 30));

        Ingresar.setBackground(new java.awt.Color(18, 18, 18));
        Ingresar.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Ingresar.setForeground(new java.awt.Color(255, 255, 255));
        Ingresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ingresar.setText("Ingresar");
        Ingresar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(123, 216, 80), 2, true));
        Ingresar.setOpaque(true);
        jPanel7.add(Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 90, 30));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 300, 370));

        BTN_cerrar.setBackground(new java.awt.Color(18, 18, 18));
        BTN_cerrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BTN_cerrar.setForeground(new java.awt.Color(255, 255, 255));
        BTN_cerrar.setText("X");
        BTN_cerrar.setBorderPainted(false);
        BTN_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_cerrar.setFocusable(false);
        getContentPane().add(BTN_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 50, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JToggleButton BTN_Visibilidad;
    public javax.swing.JButton BTN_cerrar;
    public javax.swing.JButton BTN_ingresar;
    public javax.swing.JPanel Barra;
    public javax.swing.JLabel Ingresar;
    public javax.swing.JPasswordField Txt_contraseña;
    public javax.swing.JTextField Txt_usuario;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
