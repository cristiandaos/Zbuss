
package VISTA;

public class Login extends javax.swing.JFrame {


    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Barra = new javax.swing.JPanel();
        BTN_cerrar = new javax.swing.JButton();
        PanelDinamico = new javax.swing.JLayeredPane();
        PanelInicioSesion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BTN_Visibilidad = new javax.swing.JToggleButton();
        Txt_contraseña = new javax.swing.JPasswordField();
        Txt_usuario = new javax.swing.JTextField();
        BTN_ingresar = new javax.swing.JButton();
        PanelRegistro = new javax.swing.JPanel();
        BTN_registrar = new javax.swing.JButton();
        Txt_ApeMatRegistro = new javax.swing.JTextField();
        Txt_ApePatRegistro = new javax.swing.JTextField();
        Txt_CorreoRegistro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Txt_usuario5 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Txt_NomRegistro = new javax.swing.JTextField();
        Txt_usuario7 = new javax.swing.JTextField();
        BTN_VisibilidadRegistro = new javax.swing.JToggleButton();
        Txt_ConfirmContraRegistro = new javax.swing.JPasswordField();
        Txt_ContraRegistro = new javax.swing.JPasswordField();
        PanelIntemediario = new javax.swing.JPanel();
        Lbl_tituloIniciarSesion = new javax.swing.JLabel();
        BTNinvitado = new javax.swing.JButton();
        BTNpanelRegistrar = new javax.swing.JButton();
        BTNpanelInicio = new javax.swing.JButton();
        LBLRegistrarse = new javax.swing.JLabel();
        LBLIniciarSesion = new javax.swing.JLabel();
        Lbl_tituloRegistrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Barra.setBackground(new java.awt.Color(12, 12, 12));
        Barra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 40));

        BTN_cerrar.setBackground(new java.awt.Color(12, 12, 12));
        BTN_cerrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BTN_cerrar.setForeground(new java.awt.Color(255, 255, 255));
        BTN_cerrar.setText("X");
        BTN_cerrar.setBorderPainted(false);
        BTN_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_cerrar.setFocusable(false);
        BTN_cerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(BTN_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 50, 40));

        PanelDinamico.setBackground(new java.awt.Color(18, 18, 18));

        PanelInicioSesion.setBackground(new java.awt.Color(18, 18, 18));
        PanelInicioSesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Correo Electrónico:");
        PanelInicioSesion.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 210, 30));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Contraseña:");
        PanelInicioSesion.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 130, 30));

        BTN_Visibilidad.setBackground(new java.awt.Color(18, 18, 18));
        BTN_Visibilidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/No_Visible.png"))); // NOI18N
        BTN_Visibilidad.setBorderPainted(false);
        BTN_Visibilidad.setContentAreaFilled(false);
        BTN_Visibilidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_Visibilidad.setFocusPainted(false);
        BTN_Visibilidad.setFocusable(false);
        BTN_Visibilidad.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/Visible.png"))); // NOI18N
        PanelInicioSesion.add(BTN_Visibilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 30, 30));

        Txt_contraseña.setBackground(new java.awt.Color(18, 18, 18));
        Txt_contraseña.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        Txt_contraseña.setForeground(new java.awt.Color(255, 255, 255));
        Txt_contraseña.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Txt_contraseña.setCaretColor(new java.awt.Color(255, 255, 255));
        PanelInicioSesion.add(Txt_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 220, 40));

        Txt_usuario.setBackground(new java.awt.Color(18, 18, 18));
        Txt_usuario.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        Txt_usuario.setForeground(new java.awt.Color(255, 255, 255));
        Txt_usuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Txt_usuario.setCaretColor(new java.awt.Color(255, 255, 255));
        PanelInicioSesion.add(Txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 230, 40));

        BTN_ingresar.setBackground(new java.awt.Color(18, 18, 18));
        BTN_ingresar.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        BTN_ingresar.setForeground(new java.awt.Color(255, 255, 255));
        BTN_ingresar.setText("Ingresar");
        BTN_ingresar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(123, 216, 80), 2, true));
        BTN_ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_ingresar.setFocusPainted(false);
        BTN_ingresar.setFocusable(false);
        PanelInicioSesion.add(BTN_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 120, 30));

        PanelDinamico.add(PanelInicioSesion);
        PanelInicioSesion.setBounds(320, 0, 320, 520);

        PanelRegistro.setBackground(new java.awt.Color(18, 18, 18));
        PanelRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTN_registrar.setBackground(new java.awt.Color(18, 18, 18));
        BTN_registrar.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        BTN_registrar.setForeground(new java.awt.Color(255, 255, 255));
        BTN_registrar.setText("Confirmar");
        BTN_registrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(123, 216, 80), 2, true));
        BTN_registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_registrar.setFocusPainted(false);
        BTN_registrar.setFocusable(false);
        PanelRegistro.add(BTN_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 120, 30));

        Txt_ApeMatRegistro.setBackground(new java.awt.Color(18, 18, 18));
        Txt_ApeMatRegistro.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        Txt_ApeMatRegistro.setForeground(new java.awt.Color(255, 255, 255));
        Txt_ApeMatRegistro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Txt_ApeMatRegistro.setCaretColor(new java.awt.Color(255, 255, 255));
        PanelRegistro.add(Txt_ApeMatRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 170, 30));

        Txt_ApePatRegistro.setBackground(new java.awt.Color(18, 18, 18));
        Txt_ApePatRegistro.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        Txt_ApePatRegistro.setForeground(new java.awt.Color(255, 255, 255));
        Txt_ApePatRegistro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Txt_ApePatRegistro.setCaretColor(new java.awt.Color(255, 255, 255));
        PanelRegistro.add(Txt_ApePatRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 170, 30));

        Txt_CorreoRegistro.setBackground(new java.awt.Color(18, 18, 18));
        Txt_CorreoRegistro.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        Txt_CorreoRegistro.setForeground(new java.awt.Color(255, 255, 255));
        Txt_CorreoRegistro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Txt_CorreoRegistro.setCaretColor(new java.awt.Color(255, 255, 255));
        PanelRegistro.add(Txt_CorreoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 200, 30));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("F. de Nacimiento:");
        PanelRegistro.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 140, 20));

        Txt_usuario5.setBackground(new java.awt.Color(18, 18, 18));
        Txt_usuario5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        Txt_usuario5.setForeground(new java.awt.Color(255, 255, 255));
        Txt_usuario5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Txt_usuario5.setCaretColor(new java.awt.Color(255, 255, 255));
        PanelRegistro.add(Txt_usuario5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 140, 30));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("DNI: ");
        jLabel11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        PanelRegistro.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 40, 20));

        Txt_NomRegistro.setBackground(new java.awt.Color(18, 18, 18));
        Txt_NomRegistro.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        Txt_NomRegistro.setForeground(new java.awt.Color(255, 255, 255));
        Txt_NomRegistro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Txt_NomRegistro.setCaretColor(new java.awt.Color(255, 255, 255));
        PanelRegistro.add(Txt_NomRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 170, 30));

        Txt_usuario7.setBackground(new java.awt.Color(18, 18, 18));
        Txt_usuario7.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        Txt_usuario7.setForeground(new java.awt.Color(255, 255, 255));
        Txt_usuario7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Txt_usuario7.setCaretColor(new java.awt.Color(255, 255, 255));
        PanelRegistro.add(Txt_usuario7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 110, 30));

        BTN_VisibilidadRegistro.setBackground(new java.awt.Color(18, 18, 18));
        BTN_VisibilidadRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/No_Visible.png"))); // NOI18N
        BTN_VisibilidadRegistro.setBorderPainted(false);
        BTN_VisibilidadRegistro.setContentAreaFilled(false);
        BTN_VisibilidadRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_VisibilidadRegistro.setFocusPainted(false);
        BTN_VisibilidadRegistro.setFocusable(false);
        BTN_VisibilidadRegistro.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/Visible.png"))); // NOI18N
        PanelRegistro.add(BTN_VisibilidadRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 30, 30));

        Txt_ConfirmContraRegistro.setBackground(new java.awt.Color(18, 18, 18));
        Txt_ConfirmContraRegistro.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        Txt_ConfirmContraRegistro.setForeground(new java.awt.Color(255, 255, 255));
        Txt_ConfirmContraRegistro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Txt_ConfirmContraRegistro.setCaretColor(new java.awt.Color(255, 255, 255));
        PanelRegistro.add(Txt_ConfirmContraRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 170, 30));

        Txt_ContraRegistro.setBackground(new java.awt.Color(18, 18, 18));
        Txt_ContraRegistro.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        Txt_ContraRegistro.setForeground(new java.awt.Color(255, 255, 255));
        Txt_ContraRegistro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Txt_ContraRegistro.setCaretColor(new java.awt.Color(255, 255, 255));
        PanelRegistro.add(Txt_ContraRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 170, 30));

        PanelDinamico.setLayer(PanelRegistro, javax.swing.JLayeredPane.PALETTE_LAYER);
        PanelDinamico.add(PanelRegistro);
        PanelRegistro.setBounds(0, 0, 320, 520);

        PanelIntemediario.setBackground(new java.awt.Color(12, 12, 12));
        PanelIntemediario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lbl_tituloIniciarSesion.setBackground(new java.awt.Color(255, 255, 255));
        Lbl_tituloIniciarSesion.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Lbl_tituloIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_tituloIniciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lbl_tituloIniciarSesion.setText("Iniciar Sesión");
        Lbl_tituloIniciarSesion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 204, 0)));
        PanelIntemediario.add(Lbl_tituloIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 240, 60));

        BTNinvitado.setBackground(new java.awt.Color(12, 12, 12));
        BTNinvitado.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        BTNinvitado.setForeground(new java.awt.Color(120, 120, 120));
        BTNinvitado.setText("Continuar como invitado");
        BTNinvitado.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 204, 0)));
        BTNinvitado.setContentAreaFilled(false);
        BTNinvitado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNinvitado.setFocusable(false);
        PanelIntemediario.add(BTNinvitado, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 240, 40));

        BTNpanelRegistrar.setBackground(new java.awt.Color(12, 12, 12));
        BTNpanelRegistrar.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        BTNpanelRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        BTNpanelRegistrar.setText("Registrarse");
        BTNpanelRegistrar.setAlignmentX(0.5F);
        BTNpanelRegistrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 204, 0), 2, true));
        BTNpanelRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNpanelRegistrar.setFocusable(false);
        BTNpanelRegistrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelIntemediario.add(BTNpanelRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 120, 30));

        BTNpanelInicio.setBackground(new java.awt.Color(12, 12, 12));
        BTNpanelInicio.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        BTNpanelInicio.setForeground(new java.awt.Color(255, 255, 255));
        BTNpanelInicio.setText("Iniciar Sesión");
        BTNpanelInicio.setAlignmentX(0.5F);
        BTNpanelInicio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        BTNpanelInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNpanelInicio.setFocusable(false);
        BTNpanelInicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelIntemediario.add(BTNpanelInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 160, 30));

        LBLRegistrarse.setBackground(new java.awt.Color(53, 160, 19));
        LBLRegistrarse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LBLRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        PanelIntemediario.add(LBLRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 190, 180));

        LBLIniciarSesion.setBackground(new java.awt.Color(0, 0, 0));
        LBLIniciarSesion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LBLIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        PanelIntemediario.add(LBLIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 190, 160));

        Lbl_tituloRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        Lbl_tituloRegistrar.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Lbl_tituloRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_tituloRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lbl_tituloRegistrar.setText("Registrarse");
        Lbl_tituloRegistrar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 204, 0)));
        PanelIntemediario.add(Lbl_tituloRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 240, 60));

        PanelDinamico.setLayer(PanelIntemediario, javax.swing.JLayeredPane.MODAL_LAYER);
        PanelDinamico.add(PanelIntemediario);
        PanelIntemediario.setBounds(0, 0, 320, 520);

        getContentPane().add(PanelDinamico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 640, 520));

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
    public javax.swing.JToggleButton BTN_VisibilidadRegistro;
    public javax.swing.JButton BTN_cerrar;
    public javax.swing.JButton BTN_ingresar;
    public javax.swing.JButton BTN_registrar;
    public javax.swing.JButton BTNinvitado;
    public javax.swing.JButton BTNpanelInicio;
    public javax.swing.JButton BTNpanelRegistrar;
    public javax.swing.JPanel Barra;
    public javax.swing.JLabel LBLIniciarSesion;
    public javax.swing.JLabel LBLRegistrarse;
    public javax.swing.JLabel Lbl_tituloIniciarSesion;
    public javax.swing.JLabel Lbl_tituloRegistrar;
    public javax.swing.JLayeredPane PanelDinamico;
    public javax.swing.JPanel PanelInicioSesion;
    public javax.swing.JPanel PanelIntemediario;
    public javax.swing.JPanel PanelRegistro;
    public javax.swing.JTextField Txt_ApeMatRegistro;
    public javax.swing.JTextField Txt_ApePatRegistro;
    public javax.swing.JPasswordField Txt_ConfirmContraRegistro;
    public javax.swing.JPasswordField Txt_ContraRegistro;
    public javax.swing.JTextField Txt_CorreoRegistro;
    public javax.swing.JTextField Txt_NomRegistro;
    public javax.swing.JPasswordField Txt_contraseña;
    public javax.swing.JTextField Txt_usuario;
    public javax.swing.JTextField Txt_usuario5;
    public javax.swing.JTextField Txt_usuario7;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
