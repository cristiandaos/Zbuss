
package VISTA;


public class Interfaz_Principal extends javax.swing.JFrame {

    public Interfaz_Principal() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGsexos = new javax.swing.ButtonGroup();
        BarraSuperior = new javax.swing.JPanel();
        PanelDinamico = new javax.swing.JLayeredPane();
        PanelAsientos = new javax.swing.JPanel();
        BTN_volverBuses = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Buss = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        LBLtermSalida = new javax.swing.JLabel();
        LBLtermLlegada = new javax.swing.JLabel();
        LBLhoraLlegada = new javax.swing.JLabel();
        LBLhoraSalida = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        LBLasientosSele = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        LBLprecio = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        BTN_siguiente = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        ScrollPaneBuses = new javax.swing.JScrollPane();
        PanelBuses = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        PanelPasajeros = new javax.swing.JPanel();
        ScrollPanelPasajeros = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        RDBTNfem = new javax.swing.JRadioButton();
        RDBTNmasc = new javax.swing.JRadioButton();
        TxtApellidoMatePasa = new javax.swing.JTextField();
        TxtApellidoPatePasa = new javax.swing.JTextField();
        TxtNombrePasa = new javax.swing.JTextField();
        TxtEdadPasa = new javax.swing.JFormattedTextField();
        TxtDniPasa = new javax.swing.JFormattedTextField();
        LBLnumAsiento = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LBLPrecioTotal = new javax.swing.JLabel();
        BTN_confirmarCompra = new javax.swing.JButton();
        BTN_volverAsientos = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        BarraLateral = new javax.swing.JPanel();
        BTN_cerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarraSuperior.setBackground(new java.awt.Color(18, 18, 18));
        BarraSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(BarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 50));

        PanelDinamico.setMaximumSize(new java.awt.Dimension(1280, 670));
        PanelDinamico.setPreferredSize(new java.awt.Dimension(1280, 670));
        PanelDinamico.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelAsientos.setBackground(new java.awt.Color(255, 255, 255));
        PanelAsientos.setPreferredSize(new java.awt.Dimension(1100, 650));
        PanelAsientos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTN_volverBuses.setBackground(new java.awt.Color(204, 204, 204));
        BTN_volverBuses.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        BTN_volverBuses.setForeground(new java.awt.Color(0, 0, 0));
        BTN_volverBuses.setText("Anterior");
        BTN_volverBuses.setAlignmentX(0.5F);
        BTN_volverBuses.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BTN_volverBuses.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_volverBuses.setFocusable(false);
        BTN_volverBuses.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelAsientos.add(BTN_volverBuses, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, 140, 30));

        jLabel6.setBackground(new java.awt.Color(0, 255, 0));
        jLabel6.setOpaque(true);
        PanelAsientos.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 20, 20));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Disponible");
        PanelAsientos.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 100, 20));

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Ocupado");
        PanelAsientos.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 80, 20));

        Buss.setBackground(new java.awt.Color(51, 51, 51));

        jLabel9.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Conductor");

        javax.swing.GroupLayout BussLayout = new javax.swing.GroupLayout(Buss);
        Buss.setLayout(BussLayout);
        BussLayout.setHorizontalGroup(
            BussLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BussLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel9)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        BussLayout.setVerticalGroup(
            BussLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BussLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(592, Short.MAX_VALUE))
        );

        PanelAsientos.add(Buss, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, 300, 620));

        jLabel10.setBackground(new java.awt.Color(255, 0, 0));
        jLabel10.setOpaque(true);
        PanelAsientos.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 20, 20));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("TERMINAL/PARADERO DE SALIDA Y LLEGADA");
        PanelAsientos.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 330, -1));

        LBLtermSalida.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LBLtermSalida.setForeground(new java.awt.Color(0, 0, 0));
        LBLtermSalida.setText("SALIDA");
        PanelAsientos.add(LBLtermSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        LBLtermLlegada.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LBLtermLlegada.setForeground(new java.awt.Color(0, 0, 0));
        LBLtermLlegada.setText("LLEGADA");
        PanelAsientos.add(LBLtermLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        LBLhoraLlegada.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LBLhoraLlegada.setForeground(new java.awt.Color(0, 0, 0));
        LBLhoraLlegada.setText("HORARIO/LLEGADA");
        PanelAsientos.add(LBLhoraLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, -1, -1));

        LBLhoraSalida.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LBLhoraSalida.setForeground(new java.awt.Color(0, 0, 0));
        LBLhoraSalida.setText("HORARIO/SALIDA");
        PanelAsientos.add(LBLhoraSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Asientos Seleccionados(max 6):");
        PanelAsientos.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        LBLasientosSele.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LBLasientosSele.setForeground(new java.awt.Color(0, 0, 0));
        LBLasientosSele.setText("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        PanelAsientos.add(LBLasientosSele, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Precio:");
        PanelAsientos.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, -1, -1));

        LBLprecio.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        LBLprecio.setForeground(new java.awt.Color(0, 0, 0));
        LBLprecio.setText("S/0000");
        PanelAsientos.add(LBLprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, -1, -1));

        jLabel20.setBackground(new java.awt.Color(0, 0, 255));
        jLabel20.setOpaque(true);
        PanelAsientos.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 20, 20));

        jLabel21.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Seleccionado");
        PanelAsientos.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 120, 20));

        BTN_siguiente.setBackground(new java.awt.Color(204, 204, 204));
        BTN_siguiente.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        BTN_siguiente.setForeground(new java.awt.Color(0, 0, 0));
        BTN_siguiente.setText("Siguiente");
        BTN_siguiente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BTN_siguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_siguiente.setFocusable(false);
        PanelAsientos.add(BTN_siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 600, 140, 30));

        jLabel27.setFont(new java.awt.Font("SansSerif", 1, 54)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Z-Buss");
        jLabel27.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(123, 216, 80)));
        PanelAsientos.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, -1));

        PanelDinamico.add(PanelAsientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 0, 1100, 670));

        ScrollPaneBuses.setBorder(null);
        ScrollPaneBuses.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollPaneBuses.setFocusable(false);
        ScrollPaneBuses.setMaximumSize(new java.awt.Dimension(1100, 670));
        ScrollPaneBuses.setPreferredSize(new java.awt.Dimension(1100, 670));

        PanelBuses.setBackground(new java.awt.Color(255, 255, 255));
        PanelBuses.setPreferredSize(new java.awt.Dimension(1100, 670));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("SansSerif", 1, 54)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Z-Buss");
        jLabel26.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(123, 216, 80)));

        javax.swing.GroupLayout PanelBusesLayout = new javax.swing.GroupLayout(PanelBuses);
        PanelBuses.setLayout(PanelBusesLayout);
        PanelBusesLayout.setHorizontalGroup(
            PanelBusesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBusesLayout.createSequentialGroup()
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 860, Short.MAX_VALUE))
        );
        PanelBusesLayout.setVerticalGroup(
            PanelBusesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBusesLayout.createSequentialGroup()
                .addComponent(jLabel26)
                .addGap(0, 597, Short.MAX_VALUE))
        );

        ScrollPaneBuses.setViewportView(PanelBuses);

        PanelDinamico.add(ScrollPaneBuses, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 1100, 670));

        PanelPasajeros.setBackground(new java.awt.Color(255, 255, 255));
        PanelPasajeros.setPreferredSize(new java.awt.Dimension(1100, 670));
        PanelPasajeros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ScrollPanelPasajeros.setBackground(new java.awt.Color(51, 255, 0));
        ScrollPanelPasajeros.setBorder(null);
        ScrollPanelPasajeros.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollPanelPasajeros.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 400));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Pasajero Principal", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Consolas", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BGsexos.add(RDBTNfem);
        RDBTNfem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        RDBTNfem.setForeground(new java.awt.Color(0, 0, 0));
        RDBTNfem.setText("Femenino");
        RDBTNfem.setFocusable(false);
        jPanel3.add(RDBTNfem, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        BGsexos.add(RDBTNmasc);
        RDBTNmasc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        RDBTNmasc.setForeground(new java.awt.Color(0, 0, 0));
        RDBTNmasc.setText("Masculino");
        RDBTNmasc.setFocusable(false);
        jPanel3.add(RDBTNmasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, -1, -1));

        TxtApellidoMatePasa.setBackground(new java.awt.Color(255, 255, 255));
        TxtApellidoMatePasa.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        TxtApellidoMatePasa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel3.add(TxtApellidoMatePasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 280, 30));

        TxtApellidoPatePasa.setBackground(new java.awt.Color(255, 255, 255));
        TxtApellidoPatePasa.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        TxtApellidoPatePasa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel3.add(TxtApellidoPatePasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 280, 30));

        TxtNombrePasa.setBackground(new java.awt.Color(255, 255, 255));
        TxtNombrePasa.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        TxtNombrePasa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel3.add(TxtNombrePasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 270, 30));

        TxtEdadPasa.setBackground(new java.awt.Color(255, 255, 255));
        TxtEdadPasa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        TxtEdadPasa.setForeground(new java.awt.Color(0, 0, 0));
        try {
            TxtEdadPasa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel3.add(TxtEdadPasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 270, 30));

        TxtDniPasa.setBackground(new java.awt.Color(255, 255, 255));
        TxtDniPasa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        TxtDniPasa.setForeground(new java.awt.Color(0, 0, 0));
        try {
            TxtDniPasa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel3.add(TxtDniPasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 270, 30));

        LBLnumAsiento.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LBLnumAsiento.setForeground(new java.awt.Color(0, 0, 0));
        LBLnumAsiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLnumAsiento.setText("Asiento");
        jPanel3.add(LBLnumAsiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, 90, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        ScrollPanelPasajeros.setViewportView(jPanel2);

        PanelPasajeros.add(ScrollPanelPasajeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 98, 1000, 400));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Precio a Pagar:");
        PanelPasajeros.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 500, 150, 40));

        LBLPrecioTotal.setFont(new java.awt.Font("Consolas", 1, 22)); // NOI18N
        LBLPrecioTotal.setForeground(new java.awt.Color(0, 0, 0));
        LBLPrecioTotal.setText("s/0000");
        PanelPasajeros.add(LBLPrecioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 510, 80, 30));

        BTN_confirmarCompra.setBackground(new java.awt.Color(255, 255, 255));
        BTN_confirmarCompra.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        BTN_confirmarCompra.setForeground(new java.awt.Color(0, 0, 0));
        BTN_confirmarCompra.setText("CONFIRMAR");
        BTN_confirmarCompra.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        BTN_confirmarCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_confirmarCompra.setFocusable(false);
        PanelPasajeros.add(BTN_confirmarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 570, 140, 40));

        BTN_volverAsientos.setBackground(new java.awt.Color(204, 204, 204));
        BTN_volverAsientos.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        BTN_volverAsientos.setForeground(new java.awt.Color(0, 0, 0));
        BTN_volverAsientos.setText("ANTERIOR");
        BTN_volverAsientos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        BTN_volverAsientos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_volverAsientos.setFocusable(false);
        PanelPasajeros.add(BTN_volverAsientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 570, 140, 40));

        jLabel25.setFont(new java.awt.Font("SansSerif", 1, 54)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Z-Buss");
        jLabel25.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(123, 216, 80)));
        PanelPasajeros.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, -1));

        PanelDinamico.add(PanelPasajeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(2560, 0, -1, -1));

        BarraLateral.setBackground(new java.awt.Color(18, 18, 18));

        BTN_cerrarSesion.setBackground(new java.awt.Color(18, 18, 18));
        BTN_cerrarSesion.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        BTN_cerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        BTN_cerrarSesion.setText("Cerrar Sesión");
        BTN_cerrarSesion.setAlignmentX(0.5F);
        BTN_cerrarSesion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(123, 216, 80), 2, true));
        BTN_cerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_cerrarSesion.setFocusPainted(false);
        BTN_cerrarSesion.setFocusable(false);
        BTN_cerrarSesion.setMargin(new java.awt.Insets(2, 14, 2, 14));
        BTN_cerrarSesion.setOpaque(true);

        javax.swing.GroupLayout BarraLateralLayout = new javax.swing.GroupLayout(BarraLateral);
        BarraLateral.setLayout(BarraLateralLayout);
        BarraLateralLayout.setHorizontalGroup(
            BarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraLateralLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(BTN_cerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BarraLateralLayout.setVerticalGroup(
            BarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraLateralLayout.createSequentialGroup()
                .addGap(610, 610, 610)
                .addComponent(BTN_cerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PanelDinamico.setLayer(BarraLateral, javax.swing.JLayeredPane.PALETTE_LAYER);
        PanelDinamico.add(BarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 670));

        getContentPane().add(PanelDinamico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.ButtonGroup BGsexos;
    public javax.swing.JButton BTN_cerrarSesion;
    public javax.swing.JButton BTN_confirmarCompra;
    public javax.swing.JButton BTN_siguiente;
    public javax.swing.JButton BTN_volverAsientos;
    public javax.swing.JButton BTN_volverBuses;
    public javax.swing.JPanel BarraLateral;
    public javax.swing.JPanel BarraSuperior;
    public javax.swing.JPanel Buss;
    public javax.swing.JLabel LBLPrecioTotal;
    public javax.swing.JLabel LBLasientosSele;
    public javax.swing.JLabel LBLhoraLlegada;
    public javax.swing.JLabel LBLhoraSalida;
    public javax.swing.JLabel LBLnumAsiento;
    public javax.swing.JLabel LBLprecio;
    public javax.swing.JLabel LBLtermLlegada;
    public javax.swing.JLabel LBLtermSalida;
    public javax.swing.JPanel PanelAsientos;
    public javax.swing.JPanel PanelBuses;
    public javax.swing.JLayeredPane PanelDinamico;
    public javax.swing.JPanel PanelPasajeros;
    public javax.swing.JRadioButton RDBTNfem;
    public javax.swing.JRadioButton RDBTNmasc;
    public javax.swing.JScrollPane ScrollPaneBuses;
    public javax.swing.JScrollPane ScrollPanelPasajeros;
    public javax.swing.JTextField TxtApellidoMatePasa;
    public javax.swing.JTextField TxtApellidoPatePasa;
    public javax.swing.JFormattedTextField TxtDniPasa;
    public javax.swing.JFormattedTextField TxtEdadPasa;
    public javax.swing.JTextField TxtNombrePasa;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel16;
    public javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel21;
    public javax.swing.JLabel jLabel25;
    public javax.swing.JLabel jLabel26;
    public javax.swing.JLabel jLabel27;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
