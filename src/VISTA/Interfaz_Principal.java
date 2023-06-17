
package VISTA;


public class Interfaz_Principal extends javax.swing.JFrame {

    public Interfaz_Principal() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        BarraSuperior = new javax.swing.JPanel();
        ScrollPanelDinamico = new javax.swing.JScrollPane();
        PanelDinamico = new javax.swing.JPanel();
        PanelSeleccionViaje = new javax.swing.JPanel();
        PanelFiltros = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        BTN_aplicarFiltro = new javax.swing.JButton();
        DCfechaFiltro = new com.toedter.calendar.JDateChooser();
        CBterminalLlegadaFiltro = new javax.swing.JComboBox<>();
        CBterminalSalidaFiltro = new javax.swing.JComboBox<>();
        ScrollPanelViajes = new javax.swing.JScrollPane();
        PanelViajes = new javax.swing.JPanel();
        PanelSeleccionAsientos = new javax.swing.JPanel();
        Buss = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        LBLasientoName = new javax.swing.JLabel();
        InformacionViaje = new javax.swing.JPanel();
        LBLasientosSeleccionados = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        LBLtermSalida = new javax.swing.JLabel();
        LBLtermLlegada = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        LBLprecio = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        LBLhoraLlegada = new javax.swing.JLabel();
        LBLhoraSalida = new javax.swing.JLabel();
        LBLasientosCont = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BTN_cancelarAsientos = new javax.swing.JButton();
        BTN_confirmarAsientos = new javax.swing.JButton();
        LBLtermLlegadDireccion = new javax.swing.JLabel();
        LBLtermSalidaDireccion = new javax.swing.JLabel();
        LBLasientosDisponibles = new javax.swing.JLabel();
        LBLprecioAsiento = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        PanelFormularioPasajeros = new javax.swing.JPanel();
        ScrollPanelPasajeros = new javax.swing.JScrollPane();
        PanelFormPasajeros = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LBLPrecioTotal = new javax.swing.JLabel();
        BTN_confirmarCompra = new javax.swing.JButton();
        BTN_cancelarPasajeros = new javax.swing.JButton();
        PanelPasajeroPrincipal = new javax.swing.JPanel();
        TxtApellidoMatePasajero = new javax.swing.JTextField();
        TxtApellidoPatePasajero = new javax.swing.JTextField();
        TxtNombrePasajero = new javax.swing.JTextField();
        LBLasientoPasajero = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SPNEdadPasajero = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        TxtDNIpasajero = new javax.swing.JFormattedTextField();
        BTN_derechaAcompañantes = new javax.swing.JButton();
        BTN_IzquiAcompañantes = new javax.swing.JButton();
        BarraLateral = new javax.swing.JPanel();
        BTN_cerrarSesion = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        PanelTiempo = new javax.swing.JPanel();
        LBLhora = new javax.swing.JLabel();
        LBLfecha = new javax.swing.JLabel();
        LBLusuario = new javax.swing.JLabel();
        PanelUsuario = new javax.swing.JPanel();
        LBLinfoUsuario = new javax.swing.JLabel();
        LBLhistorialUsuario = new javax.swing.JLabel();
        LBLpuntosUsuario = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel12.setText("jLabel12");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarraSuperior.setBackground(new java.awt.Color(0, 0, 0));
        BarraSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(BarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 50));

        ScrollPanelDinamico.setBackground(new java.awt.Color(102, 204, 0));
        ScrollPanelDinamico.setBorder(null);
        ScrollPanelDinamico.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollPanelDinamico.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        ScrollPanelDinamico.setPreferredSize(new java.awt.Dimension(1100, 670));

        PanelDinamico.setBackground(new java.awt.Color(255, 255, 255));
        PanelDinamico.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelSeleccionViaje.setBackground(new java.awt.Color(18, 18, 18));
        PanelSeleccionViaje.setPreferredSize(new java.awt.Dimension(1100, 670));
        PanelSeleccionViaje.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelFiltros.setBackground(new java.awt.Color(12, 12, 12));
        PanelFiltros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        PanelFiltros.setPreferredSize(new java.awt.Dimension(1000, 100));
        PanelFiltros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI Emoji", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Nuestros Viajes:");
        PanelFiltros.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1100, 30));

        BTN_aplicarFiltro.setBackground(new java.awt.Color(6, 6, 6));
        BTN_aplicarFiltro.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        BTN_aplicarFiltro.setForeground(new java.awt.Color(255, 255, 255));
        BTN_aplicarFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/lupa .png"))); // NOI18N
        BTN_aplicarFiltro.setText(" Buscar");
        BTN_aplicarFiltro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(123, 216, 80)));
        BTN_aplicarFiltro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_aplicarFiltro.setFocusable(false);
        PanelFiltros.add(BTN_aplicarFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 60, 100, 30));

        DCfechaFiltro.setBackground(new java.awt.Color(18, 18, 18));
        DCfechaFiltro.setForeground(new java.awt.Color(255, 255, 255));
        DCfechaFiltro.setDateFormatString("dd MM yyyy");
        DCfechaFiltro.setFocusable(false);
        DCfechaFiltro.setOpaque(false);
        PanelFiltros.add(DCfechaFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 180, 30));

        CBterminalLlegadaFiltro.setBackground(new java.awt.Color(10, 10, 10));
        CBterminalLlegadaFiltro.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        CBterminalLlegadaFiltro.setForeground(new java.awt.Color(255, 255, 255));
        CBterminalLlegadaFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        CBterminalLlegadaFiltro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(123, 216, 80)));
        CBterminalLlegadaFiltro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CBterminalLlegadaFiltro.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        CBterminalLlegadaFiltro.setDoubleBuffered(true);
        CBterminalLlegadaFiltro.setFocusable(false);
        CBterminalLlegadaFiltro.setLightWeightPopupEnabled(false);
        PanelFiltros.add(CBterminalLlegadaFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 160, 30));

        CBterminalSalidaFiltro.setBackground(new java.awt.Color(10, 10, 10));
        CBterminalSalidaFiltro.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        CBterminalSalidaFiltro.setForeground(new java.awt.Color(255, 255, 255));
        CBterminalSalidaFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        CBterminalSalidaFiltro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(123, 216, 80)));
        CBterminalSalidaFiltro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CBterminalSalidaFiltro.setFocusable(false);
        CBterminalSalidaFiltro.setLightWeightPopupEnabled(false);
        PanelFiltros.add(CBterminalSalidaFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 160, 30));

        PanelSeleccionViaje.add(PanelFiltros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 140));

        ScrollPanelViajes.setBorder(null);
        ScrollPanelViajes.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollPanelViajes.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        ScrollPanelViajes.setFocusable(false);
        ScrollPanelViajes.setPreferredSize(new java.awt.Dimension(1100, 530));

        PanelViajes.setBackground(new java.awt.Color(12, 12, 12));
        PanelViajes.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        PanelViajes.setPreferredSize(new java.awt.Dimension(1100, 530));

        javax.swing.GroupLayout PanelViajesLayout = new javax.swing.GroupLayout(PanelViajes);
        PanelViajes.setLayout(PanelViajesLayout);
        PanelViajesLayout.setHorizontalGroup(
            PanelViajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1098, Short.MAX_VALUE)
        );
        PanelViajesLayout.setVerticalGroup(
            PanelViajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
        );

        ScrollPanelViajes.setViewportView(PanelViajes);

        PanelSeleccionViaje.add(ScrollPanelViajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1100, 530));

        PanelDinamico.add(PanelSeleccionViaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PanelSeleccionAsientos.setBackground(new java.awt.Color(12, 12, 12));
        PanelSeleccionAsientos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        PanelSeleccionAsientos.setPreferredSize(new java.awt.Dimension(1100, 650));
        PanelSeleccionAsientos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Buss.setBackground(new java.awt.Color(6, 6, 6));
        Buss.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jLabel9.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Conductor");

        LBLasientoName.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        LBLasientoName.setForeground(new java.awt.Color(255, 255, 255));
        LBLasientoName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLasientoName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(123, 216, 80), 1, true));

        javax.swing.GroupLayout BussLayout = new javax.swing.GroupLayout(Buss);
        Buss.setLayout(BussLayout);
        BussLayout.setHorizontalGroup(
            BussLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BussLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LBLasientoName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jLabel9)
                .addContainerGap(107, Short.MAX_VALUE))
        );
        BussLayout.setVerticalGroup(
            BussLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BussLayout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(BussLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LBLasientoName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(562, Short.MAX_VALUE))
        );

        PanelSeleccionAsientos.add(Buss, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 30, 310, 610));

        InformacionViaje.setBackground(new java.awt.Color(6, 6, 6));
        InformacionViaje.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(255, 255, 255)));
        InformacionViaje.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LBLasientosSeleccionados.setBackground(new java.awt.Color(6, 6, 6));
        LBLasientosSeleccionados.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        LBLasientosSeleccionados.setForeground(new java.awt.Color(255, 255, 255));
        LBLasientosSeleccionados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLasientosSeleccionados.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(123, 216, 80)));
        InformacionViaje.add(LBLasientosSeleccionados, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, 30));

        jLabel6.setBackground(new java.awt.Color(0, 255, 0));
        jLabel6.setOpaque(true);
        InformacionViaje.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 20, 20));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Disponible");
        InformacionViaje.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 100, 20));

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ocupado");
        InformacionViaje.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 80, 20));

        jLabel10.setBackground(new java.awt.Color(255, 0, 0));
        jLabel10.setOpaque(true);
        InformacionViaje.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 20, 20));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI Emoji", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Terminales de Salida/Llegada:");
        jLabel11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(123, 216, 80)));
        InformacionViaje.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 360, 30));

        LBLtermSalida.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        LBLtermSalida.setForeground(new java.awt.Color(255, 255, 255));
        LBLtermSalida.setText("SALIDA");
        InformacionViaje.add(LBLtermSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, 30));

        LBLtermLlegada.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        LBLtermLlegada.setForeground(new java.awt.Color(255, 255, 255));
        LBLtermLlegada.setText("LLEGADA");
        InformacionViaje.add(LBLtermLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI Emoji", 1, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Asientos Seleccionados:");
        InformacionViaje.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 230, 30));

        jLabel18.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Precio Total: S/");
        InformacionViaje.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, -1, 30));

        LBLprecio.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        LBLprecio.setForeground(new java.awt.Color(255, 255, 255));
        LBLprecio.setText("00.0");
        InformacionViaje.add(LBLprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 540, -1, 30));

        jLabel20.setBackground(new java.awt.Color(0, 0, 255));
        jLabel20.setOpaque(true);
        InformacionViaje.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 20, 20));

        jLabel21.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Seleccionado");
        InformacionViaje.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 120, 20));

        LBLhoraLlegada.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        LBLhoraLlegada.setForeground(new java.awt.Color(255, 255, 255));
        LBLhoraLlegada.setText("HORARIO/LLEGADA");
        InformacionViaje.add(LBLhoraLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 170, 30));

        LBLhoraSalida.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        LBLhoraSalida.setForeground(new java.awt.Color(255, 255, 255));
        LBLhoraSalida.setText("HORARIO/SALIDA");
        InformacionViaje.add(LBLhoraSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 170, 30));

        LBLasientosCont.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        LBLasientosCont.setForeground(new java.awt.Color(255, 255, 255));
        LBLasientosCont.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLasientosCont.setText("0");
        InformacionViaje.add(LBLasientosCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 30, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Seleccione sus asientos");
        InformacionViaje.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 450, -1));

        BTN_cancelarAsientos.setBackground(new java.awt.Color(6, 6, 6));
        BTN_cancelarAsientos.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        BTN_cancelarAsientos.setForeground(new java.awt.Color(255, 255, 255));
        BTN_cancelarAsientos.setText("Cancelar");
        BTN_cancelarAsientos.setAlignmentX(0.5F);
        BTN_cancelarAsientos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(123, 216, 80), 1, true));
        BTN_cancelarAsientos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_cancelarAsientos.setFocusable(false);
        BTN_cancelarAsientos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        InformacionViaje.add(BTN_cancelarAsientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, 140, 30));

        BTN_confirmarAsientos.setBackground(new java.awt.Color(6, 6, 6));
        BTN_confirmarAsientos.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        BTN_confirmarAsientos.setForeground(new java.awt.Color(255, 255, 255));
        BTN_confirmarAsientos.setText("Confirmar");
        BTN_confirmarAsientos.setAlignmentX(0.5F);
        BTN_confirmarAsientos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(123, 216, 80)));
        BTN_confirmarAsientos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_confirmarAsientos.setFocusable(false);
        BTN_confirmarAsientos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        InformacionViaje.add(BTN_confirmarAsientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 620, 140, 30));

        LBLtermLlegadDireccion.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        LBLtermLlegadDireccion.setForeground(new java.awt.Color(255, 255, 255));
        LBLtermLlegadDireccion.setText("DIRECCION");
        InformacionViaje.add(LBLtermLlegadDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        LBLtermSalidaDireccion.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        LBLtermSalidaDireccion.setForeground(new java.awt.Color(255, 255, 255));
        LBLtermSalidaDireccion.setText("DIRECCION");
        InformacionViaje.add(LBLtermSalidaDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        LBLasientosDisponibles.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        LBLasientosDisponibles.setText("Asientos Disponibles:");
        InformacionViaje.add(LBLasientosDisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, 30));

        LBLprecioAsiento.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        LBLprecioAsiento.setForeground(new java.awt.Color(255, 255, 255));
        InformacionViaje.add(LBLprecioAsiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 40, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Precio x asiento :  S/");
        InformacionViaje.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, 30));

        PanelSeleccionAsientos.add(InformacionViaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 670));

        PanelDinamico.add(PanelSeleccionAsientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 0, 1100, 670));

        PanelFormularioPasajeros.setBackground(new java.awt.Color(12, 12, 12));
        PanelFormularioPasajeros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        PanelFormularioPasajeros.setPreferredSize(new java.awt.Dimension(1100, 670));
        PanelFormularioPasajeros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ScrollPanelPasajeros.setBackground(new java.awt.Color(51, 255, 0));
        ScrollPanelPasajeros.setBorder(null);
        ScrollPanelPasajeros.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollPanelPasajeros.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        ScrollPanelPasajeros.setWheelScrollingEnabled(false);

        PanelFormPasajeros.setBackground(new java.awt.Color(12, 12, 12));
        PanelFormPasajeros.setPreferredSize(new java.awt.Dimension(850, 200));

        javax.swing.GroupLayout PanelFormPasajerosLayout = new javax.swing.GroupLayout(PanelFormPasajeros);
        PanelFormPasajeros.setLayout(PanelFormPasajerosLayout);
        PanelFormPasajerosLayout.setHorizontalGroup(
            PanelFormPasajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        PanelFormPasajerosLayout.setVerticalGroup(
            PanelFormPasajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        ScrollPanelPasajeros.setViewportView(PanelFormPasajeros);

        PanelFormularioPasajeros.add(ScrollPanelPasajeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 850, 200));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Total a pagar:S/");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(123, 216, 80)));
        PanelFormularioPasajeros.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 620, 180, 30));

        LBLPrecioTotal.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        LBLPrecioTotal.setForeground(new java.awt.Color(255, 255, 255));
        LBLPrecioTotal.setText("00.0");
        LBLPrecioTotal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(123, 216, 80)));
        PanelFormularioPasajeros.add(LBLPrecioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 620, -1, 30));

        BTN_confirmarCompra.setBackground(new java.awt.Color(6, 6, 6));
        BTN_confirmarCompra.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        BTN_confirmarCompra.setForeground(new java.awt.Color(255, 255, 255));
        BTN_confirmarCompra.setText("Confirmar");
        BTN_confirmarCompra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(123, 216, 80)));
        BTN_confirmarCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_confirmarCompra.setFocusable(false);
        PanelFormularioPasajeros.add(BTN_confirmarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 620, 120, 30));

        BTN_cancelarPasajeros.setBackground(new java.awt.Color(6, 6, 6));
        BTN_cancelarPasajeros.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        BTN_cancelarPasajeros.setForeground(new java.awt.Color(255, 255, 255));
        BTN_cancelarPasajeros.setText("Cancelar");
        BTN_cancelarPasajeros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(123, 216, 80)));
        BTN_cancelarPasajeros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_cancelarPasajeros.setFocusable(false);
        PanelFormularioPasajeros.add(BTN_cancelarPasajeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 620, 120, 30));

        PanelPasajeroPrincipal.setBackground(new java.awt.Color(10, 10, 10));
        PanelPasajeroPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(123, 216, 80)), "Pasajero Principal", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Consolas", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        PanelPasajeroPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtApellidoMatePasajero.setBackground(new java.awt.Color(10, 10, 10));
        TxtApellidoMatePasajero.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        TxtApellidoMatePasajero.setForeground(new java.awt.Color(255, 255, 255));
        TxtApellidoMatePasajero.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        TxtApellidoMatePasajero.setCaretColor(new java.awt.Color(255, 255, 255));
        PanelPasajeroPrincipal.add(TxtApellidoMatePasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 280, 30));

        TxtApellidoPatePasajero.setBackground(new java.awt.Color(10, 10, 10));
        TxtApellidoPatePasajero.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        TxtApellidoPatePasajero.setForeground(new java.awt.Color(255, 255, 255));
        TxtApellidoPatePasajero.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        TxtApellidoPatePasajero.setCaretColor(new java.awt.Color(255, 255, 255));
        PanelPasajeroPrincipal.add(TxtApellidoPatePasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 280, 30));

        TxtNombrePasajero.setBackground(new java.awt.Color(10, 10, 10));
        TxtNombrePasajero.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        TxtNombrePasajero.setForeground(new java.awt.Color(255, 255, 255));
        TxtNombrePasajero.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        TxtNombrePasajero.setCaretColor(new java.awt.Color(255, 255, 255));
        PanelPasajeroPrincipal.add(TxtNombrePasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 280, 30));

        LBLasientoPasajero.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        LBLasientoPasajero.setForeground(new java.awt.Color(255, 255, 255));
        LBLasientoPasajero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLasientoPasajero.setText("Asiento");
        PanelPasajeroPrincipal.add(LBLasientoPasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, -1, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DNI:");
        PanelPasajeroPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 40, 30));

        SPNEdadPasajero.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        SPNEdadPasajero.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        SPNEdadPasajero.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        SPNEdadPasajero.setFocusable(false);
        PanelPasajeroPrincipal.add(SPNEdadPasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 60, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Edad:");
        PanelPasajeroPrincipal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 50, 30));

        TxtDNIpasajero.setBackground(new java.awt.Color(10, 10, 10));
        TxtDNIpasajero.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        TxtDNIpasajero.setForeground(new java.awt.Color(255, 255, 255));
        try {
            TxtDNIpasajero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TxtDNIpasajero.setCaretColor(new java.awt.Color(255, 255, 255));
        TxtDNIpasajero.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        TxtDNIpasajero.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        PanelPasajeroPrincipal.add(TxtDNIpasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 150, 30));

        PanelFormularioPasajeros.add(PanelPasajeroPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 850, 200));

        BTN_derechaAcompañantes.setBackground(new java.awt.Color(0, 0, 0));
        BTN_derechaAcompañantes.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        BTN_derechaAcompañantes.setForeground(new java.awt.Color(255, 255, 255));
        BTN_derechaAcompañantes.setText(">>>>");
        BTN_derechaAcompañantes.setBorderPainted(false);
        BTN_derechaAcompañantes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_derechaAcompañantes.setFocusable(false);
        PanelFormularioPasajeros.add(BTN_derechaAcompañantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 540, 80, 30));

        BTN_IzquiAcompañantes.setBackground(new java.awt.Color(0, 0, 0));
        BTN_IzquiAcompañantes.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        BTN_IzquiAcompañantes.setForeground(new java.awt.Color(255, 255, 255));
        BTN_IzquiAcompañantes.setText("<<<<");
        BTN_IzquiAcompañantes.setBorderPainted(false);
        BTN_IzquiAcompañantes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_IzquiAcompañantes.setFocusable(false);
        PanelFormularioPasajeros.add(BTN_IzquiAcompañantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 80, 30));

        PanelDinamico.add(PanelFormularioPasajeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(2200, 0, 1100, 670));

        ScrollPanelDinamico.setViewportView(PanelDinamico);

        getContentPane().add(ScrollPanelDinamico, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 1100, 670));

        BarraLateral.setBackground(new java.awt.Color(0, 0, 0));
        BarraLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTN_cerrarSesion.setBackground(new java.awt.Color(6, 6, 6));
        BTN_cerrarSesion.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        BTN_cerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        BTN_cerrarSesion.setText("Cerrar Sesión");
        BTN_cerrarSesion.setAlignmentX(0.5F);
        BTN_cerrarSesion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(123, 216, 80)));
        BTN_cerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_cerrarSesion.setFocusPainted(false);
        BTN_cerrarSesion.setFocusable(false);
        BarraLateral.add(BTN_cerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 140, 30));

        Logo.setBackground(new java.awt.Color(255, 255, 255));
        Logo.setFont(new java.awt.Font("SansSerif", 1, 40)); // NOI18N
        Logo.setForeground(new java.awt.Color(255, 255, 255));
        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setText(" Z-Buss");
        Logo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(123, 216, 80)));
        BarraLateral.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, -1));

        PanelTiempo.setBackground(new java.awt.Color(0, 0, 0));
        PanelTiempo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LBLhora.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        LBLhora.setForeground(new java.awt.Color(255, 255, 255));
        LBLhora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLhora.setText("Hora");
        PanelTiempo.add(LBLhora, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 180, 40));

        LBLfecha.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        LBLfecha.setForeground(new java.awt.Color(255, 255, 255));
        LBLfecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLfecha.setText("Fecha");
        PanelTiempo.add(LBLfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 40));

        BarraLateral.add(PanelTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 180, 80));

        LBLusuario.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        LBLusuario.setForeground(new java.awt.Color(102, 204, 0));
        LBLusuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/usuario.png"))); // NOI18N
        LBLusuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        LBLusuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BarraLateral.add(LBLusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 180, 40));

        PanelUsuario.setBackground(new java.awt.Color(0, 0, 0));
        PanelUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LBLinfoUsuario.setBackground(new java.awt.Color(0, 0, 0));
        LBLinfoUsuario.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        LBLinfoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LBLinfoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLinfoUsuario.setText("Mi cuenta");
        LBLinfoUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LBLinfoUsuario.setOpaque(true);
        PanelUsuario.add(LBLinfoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 180, 70));

        LBLhistorialUsuario.setBackground(new java.awt.Color(0, 0, 0));
        LBLhistorialUsuario.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        LBLhistorialUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LBLhistorialUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLhistorialUsuario.setText("Historial");
        LBLhistorialUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LBLhistorialUsuario.setOpaque(true);
        PanelUsuario.add(LBLhistorialUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 180, 70));

        LBLpuntosUsuario.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        LBLpuntosUsuario.setForeground(new java.awt.Color(51, 204, 0));
        PanelUsuario.add(LBLpuntosUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 70, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Puntos: ");
        PanelUsuario.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 40));

        BarraLateral.add(PanelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 180, 340));

        getContentPane().add(BarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 180, 670));

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
            java.util.logging.Logger.getLogger(Interfaz_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BTN_IzquiAcompañantes;
    public javax.swing.JButton BTN_aplicarFiltro;
    public javax.swing.JButton BTN_cancelarAsientos;
    public javax.swing.JButton BTN_cancelarPasajeros;
    public javax.swing.JButton BTN_cerrarSesion;
    public javax.swing.JButton BTN_confirmarAsientos;
    public javax.swing.JButton BTN_confirmarCompra;
    public javax.swing.JButton BTN_derechaAcompañantes;
    public javax.swing.JPanel BarraLateral;
    public javax.swing.JPanel BarraSuperior;
    public javax.swing.JPanel Buss;
    public javax.swing.JComboBox<String> CBterminalLlegadaFiltro;
    public javax.swing.JComboBox<String> CBterminalSalidaFiltro;
    public com.toedter.calendar.JDateChooser DCfechaFiltro;
    public javax.swing.JPanel InformacionViaje;
    public javax.swing.JLabel LBLPrecioTotal;
    public javax.swing.JLabel LBLasientoName;
    public javax.swing.JLabel LBLasientoPasajero;
    public javax.swing.JLabel LBLasientosCont;
    public javax.swing.JLabel LBLasientosDisponibles;
    public javax.swing.JLabel LBLasientosSeleccionados;
    public javax.swing.JLabel LBLfecha;
    public javax.swing.JLabel LBLhistorialUsuario;
    public javax.swing.JLabel LBLhora;
    public javax.swing.JLabel LBLhoraLlegada;
    public javax.swing.JLabel LBLhoraSalida;
    public javax.swing.JLabel LBLinfoUsuario;
    public javax.swing.JLabel LBLprecio;
    public javax.swing.JLabel LBLprecioAsiento;
    public javax.swing.JLabel LBLpuntosUsuario;
    public javax.swing.JLabel LBLtermLlegadDireccion;
    public javax.swing.JLabel LBLtermLlegada;
    public javax.swing.JLabel LBLtermSalida;
    public javax.swing.JLabel LBLtermSalidaDireccion;
    public javax.swing.JLabel LBLusuario;
    public javax.swing.JLabel Logo;
    public javax.swing.JPanel PanelDinamico;
    public javax.swing.JPanel PanelFiltros;
    public javax.swing.JPanel PanelFormPasajeros;
    public javax.swing.JPanel PanelFormularioPasajeros;
    public javax.swing.JPanel PanelPasajeroPrincipal;
    public javax.swing.JPanel PanelSeleccionAsientos;
    public javax.swing.JPanel PanelSeleccionViaje;
    public javax.swing.JPanel PanelTiempo;
    public javax.swing.JPanel PanelUsuario;
    public javax.swing.JPanel PanelViajes;
    public javax.swing.JSpinner SPNEdadPasajero;
    public javax.swing.JScrollPane ScrollPanelDinamico;
    public javax.swing.JScrollPane ScrollPanelPasajeros;
    public javax.swing.JScrollPane ScrollPanelViajes;
    public javax.swing.JTextField TxtApellidoMatePasajero;
    public javax.swing.JTextField TxtApellidoPatePasajero;
    public javax.swing.JFormattedTextField TxtDNIpasajero;
    public javax.swing.JTextField TxtNombrePasajero;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel16;
    public javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel21;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
