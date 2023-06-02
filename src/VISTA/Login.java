
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
        PanelLayer = new javax.swing.JLayeredPane();
        ScrollPanelDinamico = new javax.swing.JScrollPane();
        PanelDinamico = new javax.swing.JPanel();
        PanelInicioSesion = new javax.swing.JPanel();
        BTN_Visibilidad = new javax.swing.JToggleButton();
        Txt_contraseña = new javax.swing.JPasswordField();
        Txt_correoElectronico = new javax.swing.JTextField();
        BTN_IniciarSesion = new javax.swing.JButton();
        PanelIntemediario = new javax.swing.JPanel();
        BTN_clienteInvitado = new javax.swing.JButton();
        ScrollPanelInfo = new javax.swing.JScrollPane();
        PanelDinamicoInfo = new javax.swing.JPanel();
        RegistrarPanelAux = new javax.swing.JPanel();
        LBL_infoRegistrarse = new javax.swing.JLabel();
        Lbl_tituloRegistrar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LBL_mostrarLogin = new javax.swing.JLabel();
        IniciarSesionPanelAux = new javax.swing.JPanel();
        LBL_infoInicioSesion = new javax.swing.JLabel();
        Lbl_tituloIniciarSesion = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LBL_mostrarRegistro = new javax.swing.JLabel();
        PanelRegistro = new javax.swing.JPanel();
        BTN_ConfirmarRegistro = new javax.swing.JButton();
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
        jLabel12 = new javax.swing.JLabel();
        Txt_NumRegistro = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Barra.setBackground(new java.awt.Color(6, 6, 6));
        Barra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 40));

        BTN_cerrar.setBackground(new java.awt.Color(6, 6, 6));
        BTN_cerrar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        BTN_cerrar.setForeground(new java.awt.Color(255, 255, 255));
        BTN_cerrar.setText("X");
        BTN_cerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BTN_cerrar.setBorderPainted(false);
        BTN_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_cerrar.setFocusable(false);
        BTN_cerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(BTN_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 50, 40));

        PanelLayer.setBackground(new java.awt.Color(18, 18, 18));

        ScrollPanelDinamico.setBorder(null);
        ScrollPanelDinamico.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollPanelDinamico.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        ScrollPanelDinamico.setFocusable(false);
        ScrollPanelDinamico.setRequestFocusEnabled(false);
        ScrollPanelDinamico.setWheelScrollingEnabled(false);

        PanelDinamico.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelInicioSesion.setBackground(new java.awt.Color(12, 12, 12));
        PanelInicioSesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTN_Visibilidad.setBackground(new java.awt.Color(18, 18, 18));
        BTN_Visibilidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/No_Visible.png"))); // NOI18N
        BTN_Visibilidad.setBorderPainted(false);
        BTN_Visibilidad.setContentAreaFilled(false);
        BTN_Visibilidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_Visibilidad.setFocusPainted(false);
        BTN_Visibilidad.setFocusable(false);
        BTN_Visibilidad.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/Visible.png"))); // NOI18N
        PanelInicioSesion.add(BTN_Visibilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 40, 40));

        Txt_contraseña.setBackground(new java.awt.Color(12, 12, 12));
        Txt_contraseña.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        Txt_contraseña.setForeground(new java.awt.Color(255, 255, 255));
        Txt_contraseña.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Txt_contraseña.setCaretColor(new java.awt.Color(255, 255, 255));
        Txt_contraseña.setEchoChar('*');
        PanelInicioSesion.add(Txt_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 220, 40));

        Txt_correoElectronico.setBackground(new java.awt.Color(12, 12, 12));
        Txt_correoElectronico.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        Txt_correoElectronico.setForeground(new java.awt.Color(255, 255, 255));
        Txt_correoElectronico.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Txt_correoElectronico.setCaretColor(new java.awt.Color(255, 255, 255));
        PanelInicioSesion.add(Txt_correoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 220, 40));

        BTN_IniciarSesion.setBackground(new java.awt.Color(12, 12, 12));
        BTN_IniciarSesion.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        BTN_IniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        BTN_IniciarSesion.setText("Ingresar");
        BTN_IniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_IniciarSesion.setFocusPainted(false);
        BTN_IniciarSesion.setFocusable(false);
        PanelInicioSesion.add(BTN_IniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 120, 30));

        PanelDinamico.add(PanelInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 320, 520));

        PanelIntemediario.setBackground(new java.awt.Color(6, 6, 6));
        PanelIntemediario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTN_clienteInvitado.setBackground(new java.awt.Color(12, 12, 12));
        BTN_clienteInvitado.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        BTN_clienteInvitado.setForeground(new java.awt.Color(255, 255, 255));
        BTN_clienteInvitado.setText("Continuar como invitado");
        BTN_clienteInvitado.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(123, 216, 80)));
        BTN_clienteInvitado.setContentAreaFilled(false);
        BTN_clienteInvitado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_clienteInvitado.setFocusable(false);
        PanelIntemediario.add(BTN_clienteInvitado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 210, 40));

        ScrollPanelInfo.setBorder(null);
        ScrollPanelInfo.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollPanelInfo.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        ScrollPanelInfo.setFocusable(false);
        ScrollPanelInfo.setPreferredSize(new java.awt.Dimension(720, 400));
        ScrollPanelInfo.setRequestFocusEnabled(false);
        ScrollPanelInfo.setWheelScrollingEnabled(false);

        PanelDinamicoInfo.setBackground(new java.awt.Color(6, 6, 6));
        PanelDinamicoInfo.setMinimumSize(new java.awt.Dimension(560, 400));
        PanelDinamicoInfo.setPreferredSize(new java.awt.Dimension(880, 400));
        PanelDinamicoInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RegistrarPanelAux.setBackground(new java.awt.Color(6, 6, 6));
        RegistrarPanelAux.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LBL_infoRegistrarse.setBackground(new java.awt.Color(12, 12, 12));
        LBL_infoRegistrarse.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        LBL_infoRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        LBL_infoRegistrarse.setText("<html><p align=\"justify\"> Registrate y no dejes pasar la oportunidad de disfrutar de tarifas exclusivas y promociones especiales. </p><html>");
        RegistrarPanelAux.add(LBL_infoRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 180, 150));

        Lbl_tituloRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        Lbl_tituloRegistrar.setFont(new java.awt.Font("SansSerif", 1, 32)); // NOI18N
        Lbl_tituloRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_tituloRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lbl_tituloRegistrar.setText("Registrarse");
        Lbl_tituloRegistrar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 204, 0)));
        RegistrarPanelAux.add(Lbl_tituloRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 180, 60));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Tiene una cuenta?");
        RegistrarPanelAux.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 130, 20));

        LBL_mostrarLogin.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        LBL_mostrarLogin.setForeground(new java.awt.Color(123, 216, 80));
        LBL_mostrarLogin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LBL_mostrarLogin.setText("Inicia Sesión aquí");
        RegistrarPanelAux.add(LBL_mostrarLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 120, 20));

        PanelDinamicoInfo.add(RegistrarPanelAux, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 320, 400));

        IniciarSesionPanelAux.setBackground(new java.awt.Color(6, 6, 6));
        IniciarSesionPanelAux.setPreferredSize(new java.awt.Dimension(320, 400));
        IniciarSesionPanelAux.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LBL_infoInicioSesion.setBackground(new java.awt.Color(0, 0, 0));
        LBL_infoInicioSesion.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        LBL_infoInicioSesion.setForeground(new java.awt.Color(255, 255, 255));
        LBL_infoInicioSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_infoInicioSesion.setText("<html><p align=\"justify\"> Accede a tu cuenta para revisar horarios, acumular puntos de fidelidad y disfrutar de beneficios. </p><html>");
        IniciarSesionPanelAux.add(LBL_infoInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 160, 150));

        Lbl_tituloIniciarSesion.setBackground(new java.awt.Color(255, 255, 255));
        Lbl_tituloIniciarSesion.setFont(new java.awt.Font("SansSerif", 1, 32)); // NOI18N
        Lbl_tituloIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_tituloIniciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lbl_tituloIniciarSesion.setText("Iniciar Sesión");
        Lbl_tituloIniciarSesion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(123, 216, 80)));
        IniciarSesionPanelAux.add(Lbl_tituloIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 210, 60));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("No tiene una cuenta?");
        IniciarSesionPanelAux.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 140, 20));

        LBL_mostrarRegistro.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        LBL_mostrarRegistro.setForeground(new java.awt.Color(123, 216, 80));
        LBL_mostrarRegistro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LBL_mostrarRegistro.setText("Registrate aquí.");
        IniciarSesionPanelAux.add(LBL_mostrarRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 120, 20));

        PanelDinamicoInfo.add(IniciarSesionPanelAux, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 400));

        ScrollPanelInfo.setViewportView(PanelDinamicoInfo);

        PanelIntemediario.add(ScrollPanelInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 320, 400));

        PanelDinamico.add(PanelIntemediario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 320, 520));

        PanelRegistro.setBackground(new java.awt.Color(12, 12, 12));
        PanelRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTN_ConfirmarRegistro.setBackground(new java.awt.Color(12, 12, 12));
        BTN_ConfirmarRegistro.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        BTN_ConfirmarRegistro.setForeground(new java.awt.Color(255, 255, 255));
        BTN_ConfirmarRegistro.setText("Confirmar");
        BTN_ConfirmarRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_ConfirmarRegistro.setFocusPainted(false);
        BTN_ConfirmarRegistro.setFocusable(false);
        BTN_ConfirmarRegistro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_ConfirmarRegistro.setOpaque(true);
        PanelRegistro.add(BTN_ConfirmarRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 130, 30));

        Txt_ApeMatRegistro.setBackground(new java.awt.Color(12, 12, 12));
        Txt_ApeMatRegistro.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        Txt_ApeMatRegistro.setForeground(new java.awt.Color(255, 255, 255));
        Txt_ApeMatRegistro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Txt_ApeMatRegistro.setCaretColor(new java.awt.Color(255, 255, 255));
        PanelRegistro.add(Txt_ApeMatRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 200, 30));

        Txt_ApePatRegistro.setBackground(new java.awt.Color(12, 12, 12));
        Txt_ApePatRegistro.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        Txt_ApePatRegistro.setForeground(new java.awt.Color(255, 255, 255));
        Txt_ApePatRegistro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Txt_ApePatRegistro.setCaretColor(new java.awt.Color(255, 255, 255));
        PanelRegistro.add(Txt_ApePatRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 200, 30));

        Txt_CorreoRegistro.setBackground(new java.awt.Color(12, 12, 12));
        Txt_CorreoRegistro.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        Txt_CorreoRegistro.setForeground(new java.awt.Color(255, 255, 255));
        Txt_CorreoRegistro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Txt_CorreoRegistro.setCaretColor(new java.awt.Color(255, 255, 255));
        PanelRegistro.add(Txt_CorreoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 200, 30));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("F. Nac :");
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        PanelRegistro.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 60, 30));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("DNI: ");
        jLabel11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        PanelRegistro.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 40, 30));

        Txt_NomRegistro.setBackground(new java.awt.Color(12, 12, 12));
        Txt_NomRegistro.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        Txt_NomRegistro.setForeground(new java.awt.Color(255, 255, 255));
        Txt_NomRegistro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Txt_NomRegistro.setCaretColor(new java.awt.Color(255, 255, 255));
        PanelRegistro.add(Txt_NomRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 200, 30));

        BTN_VisibilidadRegistro.setBackground(new java.awt.Color(18, 18, 18));
        BTN_VisibilidadRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/No_Visible.png"))); // NOI18N
        BTN_VisibilidadRegistro.setBorderPainted(false);
        BTN_VisibilidadRegistro.setContentAreaFilled(false);
        BTN_VisibilidadRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_VisibilidadRegistro.setFocusPainted(false);
        BTN_VisibilidadRegistro.setFocusable(false);
        BTN_VisibilidadRegistro.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/Visible.png"))); // NOI18N
        PanelRegistro.add(BTN_VisibilidadRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 30, 30));

        Txt_ConfirmContraRegistro.setBackground(new java.awt.Color(12, 12, 12));
        Txt_ConfirmContraRegistro.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        Txt_ConfirmContraRegistro.setForeground(new java.awt.Color(255, 255, 255));
        Txt_ConfirmContraRegistro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Txt_ConfirmContraRegistro.setCaretColor(new java.awt.Color(255, 255, 255));
        Txt_ConfirmContraRegistro.setEchoChar('*');
        PanelRegistro.add(Txt_ConfirmContraRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 200, 30));

        Txt_ContraRegistro.setBackground(new java.awt.Color(12, 12, 12));
        Txt_ContraRegistro.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        Txt_ContraRegistro.setForeground(new java.awt.Color(255, 255, 255));
        Txt_ContraRegistro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Txt_ContraRegistro.setCaretColor(new java.awt.Color(255, 255, 255));
        Txt_ContraRegistro.setEchoChar('*');
        PanelRegistro.add(Txt_ContraRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 200, 30));

        Txt_FNacRegistro.setBackground(new java.awt.Color(12, 12, 12));
        Txt_FNacRegistro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Txt_FNacRegistro.setForeground(new java.awt.Color(255, 255, 255));
        try {
            Txt_FNacRegistro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Txt_FNacRegistro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt_FNacRegistro.setCaretColor(new java.awt.Color(255, 255, 255));
        Txt_FNacRegistro.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        Txt_FNacRegistro.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        PanelRegistro.add(Txt_FNacRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 140, 30));

        Txt_DniRegistro.setBackground(new java.awt.Color(12, 12, 12));
        Txt_DniRegistro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Txt_DniRegistro.setForeground(new java.awt.Color(255, 255, 255));
        try {
            Txt_DniRegistro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Txt_DniRegistro.setCaretColor(new java.awt.Color(255, 255, 255));
        Txt_DniRegistro.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        Txt_DniRegistro.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        PanelRegistro.add(Txt_DniRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 160, 30));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Num: ");
        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        PanelRegistro.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 40, 30));

        Txt_NumRegistro.setBackground(new java.awt.Color(12, 12, 12));
        Txt_NumRegistro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Txt_NumRegistro.setForeground(new java.awt.Color(255, 255, 255));
        try {
            Txt_NumRegistro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Txt_NumRegistro.setCaretColor(new java.awt.Color(255, 255, 255));
        Txt_NumRegistro.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        Txt_NumRegistro.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        PanelRegistro.add(Txt_NumRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 160, 30));

        PanelDinamico.add(PanelRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 520));

        ScrollPanelDinamico.setViewportView(PanelDinamico);

        PanelLayer.add(ScrollPanelDinamico);
        ScrollPanelDinamico.setBounds(0, 0, 640, 520);

        getContentPane().add(PanelLayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 640, 520));

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
    public javax.swing.JButton BTN_ConfirmarRegistro;
    public javax.swing.JButton BTN_IniciarSesion;
    public javax.swing.JToggleButton BTN_Visibilidad;
    public javax.swing.JToggleButton BTN_VisibilidadRegistro;
    public javax.swing.JButton BTN_cerrar;
    public javax.swing.JButton BTN_clienteInvitado;
    public javax.swing.JPanel Barra;
    public javax.swing.JPanel IniciarSesionPanelAux;
    public javax.swing.JLabel LBL_infoInicioSesion;
    public javax.swing.JLabel LBL_infoRegistrarse;
    public javax.swing.JLabel LBL_mostrarLogin;
    public javax.swing.JLabel LBL_mostrarRegistro;
    public javax.swing.JLabel Lbl_tituloIniciarSesion;
    public javax.swing.JLabel Lbl_tituloRegistrar;
    public javax.swing.JPanel PanelDinamico;
    public javax.swing.JPanel PanelDinamicoInfo;
    public javax.swing.JPanel PanelInicioSesion;
    public javax.swing.JPanel PanelIntemediario;
    public javax.swing.JLayeredPane PanelLayer;
    public javax.swing.JPanel PanelRegistro;
    public javax.swing.JPanel RegistrarPanelAux;
    public javax.swing.JScrollPane ScrollPanelDinamico;
    public javax.swing.JScrollPane ScrollPanelInfo;
    public javax.swing.JTextField Txt_ApeMatRegistro;
    public javax.swing.JTextField Txt_ApePatRegistro;
    public javax.swing.JPasswordField Txt_ConfirmContraRegistro;
    public javax.swing.JPasswordField Txt_ContraRegistro;
    public javax.swing.JTextField Txt_CorreoRegistro;
    public javax.swing.JFormattedTextField Txt_DniRegistro;
    public javax.swing.JFormattedTextField Txt_FNacRegistro;
    public javax.swing.JTextField Txt_NomRegistro;
    public javax.swing.JFormattedTextField Txt_NumRegistro;
    public javax.swing.JPasswordField Txt_contraseña;
    public javax.swing.JTextField Txt_correoElectronico;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
