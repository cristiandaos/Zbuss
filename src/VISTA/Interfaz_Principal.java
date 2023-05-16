
package VISTA;

import java.awt.Color;

public class Interfaz_Principal extends javax.swing.JFrame {

    public Interfaz_Principal() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BarraSuperior = new javax.swing.JPanel();
        BTN_cerrar = new javax.swing.JButton();
        PanelDinamico = new javax.swing.JLayeredPane();
        PanelAsientos = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        BTN_volverBuses = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Buss = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        BTN_siguiente = new javax.swing.JButton();
        ScrollPaneBuses = new javax.swing.JScrollPane();
        PanelBuses = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        PanelPasajeros = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        RDBTNfem = new javax.swing.JRadioButton();
        RDBTNmasc = new javax.swing.JRadioButton();
        TxtApellidoMatePasa = new javax.swing.JTextField();
        TxtApellidoPatePasa = new javax.swing.JTextField();
        TxtNombrePasa = new javax.swing.JTextField();
        TxtEdadPasa = new javax.swing.JFormattedTextField();
        TxtDniPasa = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LblPrecioTotal = new javax.swing.JLabel();
        BTN_confirmarCompra = new javax.swing.JButton();
        BTN_volverAsientos = new javax.swing.JButton();
        BarraLateral = new javax.swing.JPanel();
        BTN_cerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarraSuperior.setBackground(new java.awt.Color(18, 18, 18));
        BarraSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(BarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 50));

        BTN_cerrar.setBackground(new java.awt.Color(18, 18, 18));
        BTN_cerrar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        BTN_cerrar.setForeground(new java.awt.Color(255, 255, 255));
        BTN_cerrar.setText("X");
        BTN_cerrar.setBorderPainted(false);
        BTN_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_cerrar.setFocusable(false);
        getContentPane().add(BTN_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 0, 60, 50));

        PanelDinamico.setMaximumSize(new java.awt.Dimension(1280, 670));
        PanelDinamico.setPreferredSize(new java.awt.Dimension(1280, 670));
        PanelDinamico.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelAsientos.setBackground(new java.awt.Color(255, 255, 255));
        PanelAsientos.setPreferredSize(new java.awt.Dimension(1100, 650));
        PanelAsientos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 40)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Z-Buss");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(123, 216, 80)));
        PanelAsientos.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 140, -1));

        BTN_volverBuses.setBackground(new java.awt.Color(204, 204, 204));
        BTN_volverBuses.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        BTN_volverBuses.setForeground(new java.awt.Color(0, 0, 0));
        BTN_volverBuses.setText("Anterior");
        BTN_volverBuses.setAlignmentX(0.5F);
        BTN_volverBuses.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BTN_volverBuses.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_volverBuses.setFocusable(false);
        BTN_volverBuses.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelAsientos.add(BTN_volverBuses, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 130, 30));

        jLabel6.setBackground(new java.awt.Color(0, 255, 0));
        jLabel6.setOpaque(true);
        PanelAsientos.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 30, 30));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Disponible");
        PanelAsientos.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 110, 30));

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Ocupado");
        PanelAsientos.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 90, 30));

        Buss.setBackground(new java.awt.Color(51, 51, 51));

        jLabel9.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Conductor");

        javax.swing.GroupLayout BussLayout = new javax.swing.GroupLayout(Buss);
        Buss.setLayout(BussLayout);
        BussLayout.setHorizontalGroup(
            BussLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BussLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel9)
                .addContainerGap(96, Short.MAX_VALUE))
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
        PanelAsientos.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 30, 30));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("TERMINAL/PARADERO DE SALIDA Y LLEGADA");
        PanelAsientos.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 330, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("SALIDA");
        PanelAsientos.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("LLEGADA");
        PanelAsientos.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("HORARIO/LLEGADA");
        PanelAsientos.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("HORARIO/SALIDA");
        PanelAsientos.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Asientos Seleccionados(max 6):");
        PanelAsientos.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        PanelAsientos.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Precio:");
        PanelAsientos.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, -1, -1));

        jLabel19.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("S/0000");
        PanelAsientos.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, -1, -1));

        jLabel20.setBackground(new java.awt.Color(0, 0, 255));
        jLabel20.setOpaque(true);
        PanelAsientos.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 30, 30));

        jLabel21.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Seleccionado");
        PanelAsientos.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 110, 30));

        BTN_siguiente.setBackground(new java.awt.Color(204, 204, 204));
        BTN_siguiente.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        BTN_siguiente.setForeground(new java.awt.Color(0, 0, 0));
        BTN_siguiente.setText("Siguiente");
        BTN_siguiente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BTN_siguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_siguiente.setFocusable(false);
        PanelAsientos.add(BTN_siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 600, 180, 30));

        PanelDinamico.add(PanelAsientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 0, 1100, 670));

        ScrollPaneBuses.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        PanelBuses.setBackground(new java.awt.Color(255, 255, 255));
        PanelBuses.setPreferredSize(new java.awt.Dimension(1100, 670));

        jLabel22.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Z-Buss");
        jLabel22.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(123, 216, 80)));

        javax.swing.GroupLayout PanelBusesLayout = new javax.swing.GroupLayout(PanelBuses);
        PanelBuses.setLayout(PanelBusesLayout);
        PanelBusesLayout.setHorizontalGroup(
            PanelBusesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBusesLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(776, Short.MAX_VALUE))
        );
        PanelBusesLayout.setVerticalGroup(
            PanelBusesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBusesLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel22)
                .addContainerGap(567, Short.MAX_VALUE))
        );

        ScrollPaneBuses.setViewportView(PanelBuses);

        PanelDinamico.add(ScrollPaneBuses, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 1100, 670));

        PanelPasajeros.setBackground(new java.awt.Color(255, 255, 255));
        PanelPasajeros.setPreferredSize(new java.awt.Dimension(1100, 670));
        PanelPasajeros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 40)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Z-Buss");
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(123, 216, 80)));
        PanelPasajeros.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 38, 140, -1));

        jScrollPane1.setBackground(new java.awt.Color(51, 255, 0));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 400));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Pasajero Principal", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Consolas", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RDBTNfem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        RDBTNfem.setForeground(new java.awt.Color(0, 0, 0));
        RDBTNfem.setText("Femenino");
        RDBTNfem.setFocusable(false);
        jPanel3.add(RDBTNfem, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        RDBTNmasc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        RDBTNmasc.setForeground(new java.awt.Color(0, 0, 0));
        RDBTNmasc.setText("Masculino");
        RDBTNmasc.setFocusable(false);
        jPanel3.add(RDBTNmasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, -1, -1));

        TxtApellidoMatePasa.setBackground(new java.awt.Color(255, 255, 255));
        TxtApellidoMatePasa.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        TxtApellidoMatePasa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        TxtApellidoMatePasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtApellidoMatePasaActionPerformed(evt);
            }
        });
        jPanel3.add(TxtApellidoMatePasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 280, 30));

        TxtApellidoPatePasa.setBackground(new java.awt.Color(255, 255, 255));
        TxtApellidoPatePasa.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        TxtApellidoPatePasa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        TxtApellidoPatePasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtApellidoPatePasaActionPerformed(evt);
            }
        });
        jPanel3.add(TxtApellidoPatePasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 280, 30));

        TxtNombrePasa.setBackground(new java.awt.Color(255, 255, 255));
        TxtNombrePasa.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        TxtNombrePasa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        TxtNombrePasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombrePasaActionPerformed(evt);
            }
        });
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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Asiento");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, 90, -1));

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

        jScrollPane1.setViewportView(jPanel2);

        PanelPasajeros.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 98, 1000, 400));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Precio a Pagar:");
        PanelPasajeros.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 500, 150, 40));

        LblPrecioTotal.setFont(new java.awt.Font("Consolas", 1, 22)); // NOI18N
        LblPrecioTotal.setForeground(new java.awt.Color(0, 0, 0));
        LblPrecioTotal.setText("s/0000");
        PanelPasajeros.add(LblPrecioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 510, 80, 30));

        BTN_confirmarCompra.setBackground(new java.awt.Color(255, 255, 255));
        BTN_confirmarCompra.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        BTN_confirmarCompra.setForeground(new java.awt.Color(0, 0, 0));
        BTN_confirmarCompra.setText("CONFIRMAR");
        BTN_confirmarCompra.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        BTN_confirmarCompra.setFocusable(false);
        PanelPasajeros.add(BTN_confirmarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 570, 140, 40));

        BTN_volverAsientos.setBackground(new java.awt.Color(255, 255, 255));
        BTN_volverAsientos.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        BTN_volverAsientos.setForeground(new java.awt.Color(0, 0, 0));
        BTN_volverAsientos.setText("ANTERIOR");
        BTN_volverAsientos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        BTN_volverAsientos.setFocusable(false);
        PanelPasajeros.add(BTN_volverAsientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 570, 140, 40));

        PanelDinamico.add(PanelPasajeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(2560, 0, -1, -1));

        BarraLateral.setBackground(new java.awt.Color(18, 18, 18));
        BarraLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        BarraLateral.add(BTN_cerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 130, 30));

        PanelDinamico.setLayer(BarraLateral, javax.swing.JLayeredPane.PALETTE_LAYER);
        PanelDinamico.add(BarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 670));

        getContentPane().add(PanelDinamico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TxtApellidoMatePasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtApellidoMatePasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtApellidoMatePasaActionPerformed

    private void TxtApellidoPatePasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtApellidoPatePasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtApellidoPatePasaActionPerformed

    private void TxtNombrePasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombrePasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombrePasaActionPerformed

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
    public javax.swing.JButton BTN_cerrar;
    public javax.swing.JButton BTN_cerrarSesion;
    public javax.swing.JButton BTN_confirmarCompra;
    public javax.swing.JButton BTN_siguiente;
    public javax.swing.JButton BTN_volverAsientos;
    public javax.swing.JButton BTN_volverBuses;
    public javax.swing.JPanel BarraLateral;
    public javax.swing.JPanel BarraSuperior;
    public javax.swing.JPanel Buss;
    public javax.swing.JLabel LblPrecioTotal;
    public javax.swing.JPanel PanelAsientos;
    public javax.swing.JPanel PanelBuses;
    public javax.swing.JLayeredPane PanelDinamico;
    public javax.swing.JPanel PanelPasajeros;
    public javax.swing.JRadioButton RDBTNfem;
    public javax.swing.JRadioButton RDBTNmasc;
    public javax.swing.JScrollPane ScrollPaneBuses;
    public javax.swing.JTextField TxtApellidoMatePasa;
    public javax.swing.JTextField TxtApellidoPatePasa;
    public javax.swing.JFormattedTextField TxtDniPasa;
    public javax.swing.JFormattedTextField TxtEdadPasa;
    public javax.swing.JTextField TxtNombrePasa;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel16;
    public javax.swing.JLabel jLabel17;
    public javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel19;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel21;
    public javax.swing.JLabel jLabel22;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    public javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
