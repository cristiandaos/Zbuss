
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
        jLabel11 = new javax.swing.JLabel();
        Txt_NomRegistro = new javax.swing.JTextField();
        BTN_VisibilidadRegistro = new javax.swing.JToggleButton();
        Txt_ConfirmContraRegistro = new javax.swing.JPasswordField();
        Txt_ContraRegistro = new javax.swing.JPasswordField();
        Txt_FNacRegistro = new javax.swing.JFormattedTextField();
        Txt_DniRegistro = new javax.swing.JFormattedTextField();
        PanelIntemediario = new javax.swing.JPanel();
        BTN_clienteInvitado = new javax.swing.JButton();
        IniciarSesionPanelAux = new javax.swing.JPanel();
        LBL_infoInicioSesion = new javax.swing.JLabel();
        Lbl_tituloIniciarSesion = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LBL_mostrarRegistro = new javax.swing.JLabel();
        RegistrarPanelAux = new javax.swing.JPanel();
        LBL_infoRegistrarse = new javax.swing.JLabel();
        Lbl_tituloRegistrar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LBL_mostrarLogin = new javax.swing.JLabel();

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
        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Correo Electrónico:");
        PanelInicioSesion.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 210, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Contraseña:");
        PanelInicioSesion.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 130, 30));

        BTN_Visibilidad.setBackground(new java.awt.Color(18, 18, 18));
        BTN_Visibilidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/No_Visible.png"))); // NOI18N
        BTN_Visibilidad.setBorderPainted(false);
        BTN_Visibilidad.setContentAreaFilled(false);
        BTN_Visibilidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_Visibilidad.setFocusPainted(false);
        BTN_Visibilidad.setFocusable(false);
        BTN_Visibilidad.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/Visible.png"))); // NOI18N
        PanelInicioSesion.add(BTN_Visibilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 40, 40));

        Txt_contraseña.setBackground(new java.awt.Color(18, 18, 18));
        Txt_contraseña.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        Txt_contraseña.setForeground(new java.awt.Color(255, 255, 255));
        Txt_contraseña.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Txt_contraseña.setCaretColor(new java.awt.Color(255, 255, 255));
        PanelInicioSesion.add(Txt_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 220, 40));

        Txt_usuario.setBackground(new java.awt.Color(18, 18, 18));
        Txt_usuario.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        Txt_usuario.setForeground(new java.awt.Color(255, 255, 255));
        Txt_usuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Txt_usuario.setCaretColor(new java.awt.Color(255, 255, 255));
        PanelInicioSesion.add(Txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 260, 40));

        BTN_ingresar.setBackground(new java.awt.Color(18, 18, 18));
        BTN_ingresar.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        BTN_ingresar.setForeground(new java.awt.Color(255, 255, 255));
        BTN_ingresar.setText("Ingresar");
        BTN_ingresar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(123, 216, 80), 2, true));
        BTN_ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_ingresar.setFocusPainted(false);
        BTN_ingresar.setFocusable(false);
        PanelInicioSesion.add(BTN_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 120, 30));

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
        PanelRegistro.add(BTN_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 120, 30));

        Txt_ApeMatRegistro.setBackground(new java.awt.Color(18, 18, 18));
        Txt_ApeMatRegistro.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        Txt_ApeMatRegistro.setForeground(new java.awt.Color(255, 255, 255));
        Txt_ApeMatRegistro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Txt_ApeMatRegistro.setCaretColor(new java.awt.Color(255, 255, 255));
        Txt_ApeMatRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_ApeMatRegistroActionPerformed(evt);
            }
        });
        PanelRegistro.add(Txt_ApeMatRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 200, 30));

        Txt_ApePatRegistro.setBackground(new java.awt.Color(18, 18, 18));
        Txt_ApePatRegistro.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        Txt_ApePatRegistro.setForeground(new java.awt.Color(255, 255, 255));
        Txt_ApePatRegistro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Txt_ApePatRegistro.setCaretColor(new java.awt.Color(255, 255, 255));
        PanelRegistro.add(Txt_ApePatRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 200, 30));

        Txt_CorreoRegistro.setBackground(new java.awt.Color(18, 18, 18));
        Txt_CorreoRegistro.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        Txt_CorreoRegistro.setForeground(new java.awt.Color(255, 255, 255));
        Txt_CorreoRegistro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Txt_CorreoRegistro.setCaretColor(new java.awt.Color(255, 255, 255));
        PanelRegistro.add(Txt_CorreoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 200, 30));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("F. Nac :");
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        PanelRegistro.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 60, 30));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("DNI: ");
        jLabel11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        PanelRegistro.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 40, 30));

        Txt_NomRegistro.setBackground(new java.awt.Color(18, 18, 18));
        Txt_NomRegistro.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        Txt_NomRegistro.setForeground(new java.awt.Color(255, 255, 255));
        Txt_NomRegistro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Txt_NomRegistro.setCaretColor(new java.awt.Color(255, 255, 255));
        PanelRegistro.add(Txt_NomRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 200, 30));

        BTN_VisibilidadRegistro.setBackground(new java.awt.Color(18, 18, 18));
        BTN_VisibilidadRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/No_Visible.png"))); // NOI18N
        BTN_VisibilidadRegistro.setBorderPainted(false);
        BTN_VisibilidadRegistro.setContentAreaFilled(false);
        BTN_VisibilidadRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_VisibilidadRegistro.setFocusPainted(false);
        BTN_VisibilidadRegistro.setFocusable(false);
        BTN_VisibilidadRegistro.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/Visible.png"))); // NOI18N
        PanelRegistro.add(BTN_VisibilidadRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 30, 30));

        Txt_ConfirmContraRegistro.setBackground(new java.awt.Color(18, 18, 18));
        Txt_ConfirmContraRegistro.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        Txt_ConfirmContraRegistro.setForeground(new java.awt.Color(255, 255, 255));
        Txt_ConfirmContraRegistro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Txt_ConfirmContraRegistro.setCaretColor(new java.awt.Color(255, 255, 255));
        PanelRegistro.add(Txt_ConfirmContraRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 200, 30));

        Txt_ContraRegistro.setBackground(new java.awt.Color(18, 18, 18));
        Txt_ContraRegistro.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        Txt_ContraRegistro.setForeground(new java.awt.Color(255, 255, 255));
        Txt_ContraRegistro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Txt_ContraRegistro.setCaretColor(new java.awt.Color(255, 255, 255));
        PanelRegistro.add(Txt_ContraRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 200, 30));

        Txt_FNacRegistro.setBackground(new java.awt.Color(18, 18, 18));
        Txt_FNacRegistro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Txt_FNacRegistro.setForeground(new java.awt.Color(255, 255, 255));
        try {
            Txt_FNacRegistro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Txt_FNacRegistro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt_FNacRegistro.setCaretColor(new java.awt.Color(255, 255, 255));
        Txt_FNacRegistro.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        PanelRegistro.add(Txt_FNacRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 140, 30));

        Txt_DniRegistro.setBackground(new java.awt.Color(18, 18, 18));
        Txt_DniRegistro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Txt_DniRegistro.setForeground(new java.awt.Color(255, 255, 255));
        try {
            Txt_DniRegistro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Txt_DniRegistro.setCaretColor(new java.awt.Color(255, 255, 255));
        Txt_DniRegistro.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        PanelRegistro.add(Txt_DniRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 160, 30));

        PanelDinamico.setLayer(PanelRegistro, javax.swing.JLayeredPane.PALETTE_LAYER);
        PanelDinamico.add(PanelRegistro);
        PanelRegistro.setBounds(0, 0, 320, 520);

        PanelIntemediario.setBackground(new java.awt.Color(12, 12, 12));
        PanelIntemediario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTN_clienteInvitado.setBackground(new java.awt.Color(12, 12, 12));
        BTN_clienteInvitado.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        BTN_clienteInvitado.setForeground(new java.awt.Color(120, 120, 120));
        BTN_clienteInvitado.setText("Continuar como invitado");
        BTN_clienteInvitado.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 204, 0)));
        BTN_clienteInvitado.setContentAreaFilled(false);
        BTN_clienteInvitado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_clienteInvitado.setFocusable(false);
        PanelIntemediario.add(BTN_clienteInvitado, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 210, 40));

        IniciarSesionPanelAux.setBackground(new java.awt.Color(12, 12, 12));
        IniciarSesionPanelAux.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LBL_infoInicioSesion.setBackground(new java.awt.Color(0, 0, 0));
        LBL_infoInicioSesion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LBL_infoInicioSesion.setForeground(new java.awt.Color(255, 255, 255));
        IniciarSesionPanelAux.add(LBL_infoInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 150, 210));

        Lbl_tituloIniciarSesion.setBackground(new java.awt.Color(255, 255, 255));
        Lbl_tituloIniciarSesion.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Lbl_tituloIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_tituloIniciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lbl_tituloIniciarSesion.setText("Iniciar Sesión");
        Lbl_tituloIniciarSesion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 204, 0)));
        IniciarSesionPanelAux.add(Lbl_tituloIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 60));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("No tiene una cuenta?");
        IniciarSesionPanelAux.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 150, 20));

        LBL_mostrarRegistro.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        LBL_mostrarRegistro.setForeground(new java.awt.Color(123, 216, 80));
        LBL_mostrarRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_mostrarRegistro.setText("Registrate aquí.");
        IniciarSesionPanelAux.add(LBL_mostrarRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 120, 20));

        PanelIntemediario.add(IniciarSesionPanelAux, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 280, 360));

        RegistrarPanelAux.setBackground(new java.awt.Color(12, 12, 12));
        RegistrarPanelAux.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LBL_infoRegistrarse.setBackground(new java.awt.Color(53, 160, 19));
        LBL_infoRegistrarse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LBL_infoRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        RegistrarPanelAux.add(LBL_infoRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 150, 210));

        Lbl_tituloRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        Lbl_tituloRegistrar.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Lbl_tituloRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_tituloRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lbl_tituloRegistrar.setText("Registrarse");
        Lbl_tituloRegistrar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 204, 0)));
        RegistrarPanelAux.add(Lbl_tituloRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 60));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Tiene una cuenta?");
        RegistrarPanelAux.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 130, 20));

        LBL_mostrarLogin.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        LBL_mostrarLogin.setForeground(new java.awt.Color(123, 216, 80));
        LBL_mostrarLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_mostrarLogin.setText("Inicia Sesión aquí");
        RegistrarPanelAux.add(LBL_mostrarLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 120, 20));

        PanelIntemediario.add(RegistrarPanelAux, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 280, 360));

        PanelDinamico.setLayer(PanelIntemediario, javax.swing.JLayeredPane.MODAL_LAYER);
        PanelDinamico.add(PanelIntemediario);
        PanelIntemediario.setBounds(0, 0, 320, 520);

        getContentPane().add(PanelDinamico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 640, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_ApeMatRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_ApeMatRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_ApeMatRegistroActionPerformed


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
    public javax.swing.JButton BTN_clienteInvitado;
    public javax.swing.JButton BTN_ingresar;
    public javax.swing.JButton BTN_registrar;
    public javax.swing.JPanel Barra;
    public javax.swing.JPanel IniciarSesionPanelAux;
    public javax.swing.JLabel LBL_infoInicioSesion;
    public javax.swing.JLabel LBL_infoRegistrarse;
    public javax.swing.JLabel LBL_mostrarLogin;
    public javax.swing.JLabel LBL_mostrarRegistro;
    public javax.swing.JLabel Lbl_tituloIniciarSesion;
    public javax.swing.JLabel Lbl_tituloRegistrar;
    public javax.swing.JLayeredPane PanelDinamico;
    public javax.swing.JPanel PanelInicioSesion;
    public javax.swing.JPanel PanelIntemediario;
    public javax.swing.JPanel PanelRegistro;
    public javax.swing.JPanel RegistrarPanelAux;
    public javax.swing.JTextField Txt_ApeMatRegistro;
    public javax.swing.JTextField Txt_ApePatRegistro;
    public javax.swing.JPasswordField Txt_ConfirmContraRegistro;
    public javax.swing.JPasswordField Txt_ContraRegistro;
    public javax.swing.JTextField Txt_CorreoRegistro;
    public javax.swing.JFormattedTextField Txt_DniRegistro;
    public javax.swing.JFormattedTextField Txt_FNacRegistro;
    public javax.swing.JTextField Txt_NomRegistro;
    public javax.swing.JPasswordField Txt_contraseña;
    public javax.swing.JTextField Txt_usuario;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
