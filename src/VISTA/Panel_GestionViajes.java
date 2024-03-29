
package VISTA;


public class Panel_GestionViajes extends javax.swing.JPanel {


    public Panel_GestionViajes() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ScrollPanelDinamico = new javax.swing.JScrollPane();
        PanelDinamico = new javax.swing.JPanel();
        PanelProgramacionViaje = new javax.swing.JPanel();
        SPNviaje_precio = new javax.swing.JSpinner();
        BTN_nuevo_viajes = new javax.swing.JButton();
        BTN_eliminar_viajes = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TBL_viajes = new javax.swing.JTable();
        SPNviaje_duracion = new javax.swing.JSpinner();
        TXTviaje_distancia = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        SPNviaje_horaSalida = new javax.swing.JSpinner();
        BTN_infoViaje = new javax.swing.JButton();
        CBviaje_terminal_Llegada = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        DCviaje_fechaSalida = new com.toedter.calendar.JDateChooser();
        CBviaje_terminal_Salida = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        BTN_guardar_viajes = new javax.swing.JButton();
        LBLviaje_fechaLlegada = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        LBLviaje_horaLlegada = new javax.swing.JLabel();
        LBL_img_referencial = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PanelInfoDetalladaViaje = new javax.swing.JPanel();
        Buss = new javax.swing.JPanel();
        PB_viajeProgreso = new javax.swing.JProgressBar();
        jLabel9 = new javax.swing.JLabel();
        LBL_infoTerminalSalida = new javax.swing.JLabel();
        LBL_infoTerminalLlegada = new javax.swing.JLabel();
        ScrollTBLviajesAsientos = new javax.swing.JScrollPane();
        TBL_viajesAsientos = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        LBL_infoFechaLlegada = new javax.swing.JLabel();
        LBL_infoFechaSalida = new javax.swing.JLabel();
        BTN_volver = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        LBL_infoGanancia = new javax.swing.JLabel();
        LBL_infoViajeEstado = new javax.swing.JLabel();
        LBL_infoViajeID = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        LBL_infoTiempoRestante = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1060, 670));

        ScrollPanelDinamico.setBorder(null);
        ScrollPanelDinamico.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollPanelDinamico.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        ScrollPanelDinamico.setPreferredSize(new java.awt.Dimension(1060, 670));

        PanelDinamico.setBackground(new java.awt.Color(20, 20, 20));
        PanelDinamico.setPreferredSize(new java.awt.Dimension(2120, 670));
        PanelDinamico.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelProgramacionViaje.setBackground(new java.awt.Color(12, 12, 12));
        PanelProgramacionViaje.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SPNviaje_precio.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        SPNviaje_precio.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 1.0d));
        SPNviaje_precio.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        SPNviaje_precio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SPNviaje_precio.setFocusable(false);
        PanelProgramacionViaje.add(SPNviaje_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 130, 30));

        BTN_nuevo_viajes.setBackground(new java.awt.Color(6, 6, 6));
        BTN_nuevo_viajes.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        BTN_nuevo_viajes.setForeground(new java.awt.Color(255, 255, 255));
        BTN_nuevo_viajes.setText("Nuevo");
        BTN_nuevo_viajes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(123, 216, 80), 1, true));
        BTN_nuevo_viajes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_nuevo_viajes.setFocusable(false);
        PanelProgramacionViaje.add(BTN_nuevo_viajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 90, 30));

        BTN_eliminar_viajes.setBackground(new java.awt.Color(6, 6, 6));
        BTN_eliminar_viajes.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        BTN_eliminar_viajes.setForeground(new java.awt.Color(255, 255, 255));
        BTN_eliminar_viajes.setText("Eliminar");
        BTN_eliminar_viajes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(123, 216, 80), 1, true));
        BTN_eliminar_viajes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_eliminar_viajes.setFocusable(false);
        BTN_eliminar_viajes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelProgramacionViaje.add(BTN_eliminar_viajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 110, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Duración Aproximada:");
        PanelProgramacionViaje.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Precio:");
        PanelProgramacionViaje.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 60, 30));

        jScrollPane4.setBorder(null);

        TBL_viajes.setBackground(new java.awt.Color(12, 12, 12));
        TBL_viajes.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        TBL_viajes.setForeground(new java.awt.Color(255, 255, 255));
        TBL_viajes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TBL_viajes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TBL_viajes.setFocusable(false);
        TBL_viajes.setGridColor(new java.awt.Color(255, 255, 255));
        TBL_viajes.setRequestFocusEnabled(false);
        TBL_viajes.setRowHeight(25);
        TBL_viajes.setSelectionBackground(new java.awt.Color(51, 204, 0));
        TBL_viajes.setSelectionForeground(new java.awt.Color(0, 0, 0));
        TBL_viajes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TBL_viajes.setShowGrid(false);
        TBL_viajes.getTableHeader().setResizingAllowed(false);
        TBL_viajes.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(TBL_viajes);

        PanelProgramacionViaje.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 1060, 220));

        SPNviaje_duracion.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        SPNviaje_duracion.setModel(new javax.swing.SpinnerDateModel());
        SPNviaje_duracion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        SPNviaje_duracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelProgramacionViaje.add(SPNviaje_duracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 140, 30));

        TXTviaje_distancia.setBackground(new java.awt.Color(10, 10, 10));
        TXTviaje_distancia.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        TXTviaje_distancia.setForeground(new java.awt.Color(255, 255, 255));
        TXTviaje_distancia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXTviaje_distancia.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        PanelProgramacionViaje.add(TXTviaje_distancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 110, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Terminal de Salida");
        PanelProgramacionViaje.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 150, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Hora de Llegada:");
        PanelProgramacionViaje.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 130, 30));

        SPNviaje_horaSalida.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        SPNviaje_horaSalida.setModel(new javax.swing.SpinnerDateModel());
        SPNviaje_horaSalida.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        SPNviaje_horaSalida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelProgramacionViaje.add(SPNviaje_horaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 140, 30));

        BTN_infoViaje.setBackground(new java.awt.Color(6, 6, 6));
        BTN_infoViaje.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        BTN_infoViaje.setText("Ver Informacion Detallada");
        BTN_infoViaje.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(123, 216, 80), 1, true));
        BTN_infoViaje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_infoViaje.setFocusable(false);
        PanelProgramacionViaje.add(BTN_infoViaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 410, 220, 30));

        CBviaje_terminal_Llegada.setBackground(new java.awt.Color(10, 10, 10));
        CBviaje_terminal_Llegada.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        CBviaje_terminal_Llegada.setForeground(new java.awt.Color(255, 255, 255));
        CBviaje_terminal_Llegada.setMaximumRowCount(4);
        CBviaje_terminal_Llegada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        CBviaje_terminal_Llegada.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        CBviaje_terminal_Llegada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CBviaje_terminal_Llegada.setFocusable(false);
        PanelProgramacionViaje.add(CBviaje_terminal_Llegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 200, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Terminal de Llegada");
        PanelProgramacionViaje.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 140, 30));

        DCviaje_fechaSalida.setBackground(new java.awt.Color(0, 0, 0));
        DCviaje_fechaSalida.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(123, 216, 80)));
        DCviaje_fechaSalida.setForeground(new java.awt.Color(255, 255, 255));
        DCviaje_fechaSalida.setDateFormatString("dd/MM/YYYY");
        DCviaje_fechaSalida.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PanelProgramacionViaje.add(DCviaje_fechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 140, 30));

        CBviaje_terminal_Salida.setBackground(new java.awt.Color(10, 10, 10));
        CBviaje_terminal_Salida.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        CBviaje_terminal_Salida.setForeground(new java.awt.Color(255, 255, 255));
        CBviaje_terminal_Salida.setMaximumRowCount(4);
        CBviaje_terminal_Salida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        CBviaje_terminal_Salida.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        CBviaje_terminal_Salida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelProgramacionViaje.add(CBviaje_terminal_Salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 200, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hora de Salida:");
        PanelProgramacionViaje.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, 30));

        BTN_guardar_viajes.setBackground(new java.awt.Color(6, 6, 6));
        BTN_guardar_viajes.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        BTN_guardar_viajes.setForeground(new java.awt.Color(255, 255, 255));
        BTN_guardar_viajes.setText("Guardar");
        BTN_guardar_viajes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(123, 216, 80), 1, true));
        BTN_guardar_viajes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_guardar_viajes.setFocusable(false);
        PanelProgramacionViaje.add(BTN_guardar_viajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 100, 30));

        LBLviaje_fechaLlegada.setBackground(new java.awt.Color(10, 10, 10));
        LBLviaje_fechaLlegada.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        LBLviaje_fechaLlegada.setForeground(new java.awt.Color(255, 255, 255));
        LBLviaje_fechaLlegada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLviaje_fechaLlegada.setOpaque(true);
        PanelProgramacionViaje.add(LBLviaje_fechaLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 130, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Distancia:");
        PanelProgramacionViaje.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 70, 30));

        LBLviaje_horaLlegada.setBackground(new java.awt.Color(10, 10, 10));
        LBLviaje_horaLlegada.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        LBLviaje_horaLlegada.setForeground(new java.awt.Color(255, 255, 255));
        LBLviaje_horaLlegada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLviaje_horaLlegada.setOpaque(true);
        PanelProgramacionViaje.add(LBLviaje_horaLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 130, 30));

        LBL_img_referencial.setBackground(new java.awt.Color(20, 20, 20));
        LBL_img_referencial.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(123, 216, 80)));
        LBL_img_referencial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LBL_img_referencial.setOpaque(true);
        PanelProgramacionViaje.add(LBL_img_referencial, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 360, 250));

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha de Salida:");
        PanelProgramacionViaje.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 130, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Fecha de Llegada:");
        PanelProgramacionViaje.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 130, 30));

        PanelDinamico.add(PanelProgramacionViaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 670));

        PanelInfoDetalladaViaje.setBackground(new java.awt.Color(12, 12, 12));
        PanelInfoDetalladaViaje.setPreferredSize(new java.awt.Dimension(1060, 670));
        PanelInfoDetalladaViaje.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Buss.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout BussLayout = new javax.swing.GroupLayout(Buss);
        Buss.setLayout(BussLayout);
        BussLayout.setHorizontalGroup(
            BussLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        BussLayout.setVerticalGroup(
            BussLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        PanelInfoDetalladaViaje.add(Buss, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, 310, 610));

        PB_viajeProgreso.setBackground(new java.awt.Color(0, 0, 0));
        PB_viajeProgreso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PB_viajeProgreso.setForeground(new java.awt.Color(51, 255, 0));
        PanelInfoDetalladaViaje.add(PB_viajeProgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 530, 320, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ID del viaje:  ");
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(123, 216, 80)));
        PanelInfoDetalladaViaje.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 30));

        LBL_infoTerminalSalida.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        LBL_infoTerminalSalida.setForeground(new java.awt.Color(153, 153, 153));
        LBL_infoTerminalSalida.setText("label");
        PanelInfoDetalladaViaje.add(LBL_infoTerminalSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, 30));

        LBL_infoTerminalLlegada.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        LBL_infoTerminalLlegada.setForeground(new java.awt.Color(153, 153, 153));
        LBL_infoTerminalLlegada.setText("label");
        PanelInfoDetalladaViaje.add(LBL_infoTerminalLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, -1, 30));

        ScrollTBLviajesAsientos.setBorder(null);

        TBL_viajesAsientos.setBackground(new java.awt.Color(6, 6, 6));
        TBL_viajesAsientos.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        TBL_viajesAsientos.setForeground(new java.awt.Color(255, 255, 255));
        TBL_viajesAsientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TBL_viajesAsientos.setFocusable(false);
        TBL_viajesAsientos.setGridColor(new java.awt.Color(255, 255, 255));
        TBL_viajesAsientos.setRequestFocusEnabled(false);
        TBL_viajesAsientos.setRowHeight(30);
        TBL_viajesAsientos.setRowSelectionAllowed(false);
        TBL_viajesAsientos.setSelectionBackground(new java.awt.Color(102, 204, 0));
        TBL_viajesAsientos.setSelectionForeground(new java.awt.Color(0, 0, 0));
        TBL_viajesAsientos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TBL_viajesAsientos.setShowGrid(true);
        TBL_viajesAsientos.getTableHeader().setResizingAllowed(false);
        TBL_viajesAsientos.getTableHeader().setReorderingAllowed(false);
        ScrollTBLviajesAsientos.setViewportView(TBL_viajesAsientos);

        PanelInfoDetalladaViaje.add(ScrollTBLviajesAsientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 330, 620));

        jLabel14.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("-Ganancia Total:");
        PanelInfoDetalladaViaje.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 120, 30));

        LBL_infoFechaLlegada.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        LBL_infoFechaLlegada.setForeground(new java.awt.Color(153, 153, 153));
        LBL_infoFechaLlegada.setText("label");
        LBL_infoFechaLlegada.setToolTipText("");
        PanelInfoDetalladaViaje.add(LBL_infoFechaLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, -1, 30));

        LBL_infoFechaSalida.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        LBL_infoFechaSalida.setForeground(new java.awt.Color(153, 153, 153));
        LBL_infoFechaSalida.setText("label");
        PanelInfoDetalladaViaje.add(LBL_infoFechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, -1, 30));

        BTN_volver.setBackground(new java.awt.Color(6, 6, 6));
        BTN_volver.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        BTN_volver.setText("Volver");
        BTN_volver.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(123, 216, 80), 1, true));
        BTN_volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_volver.setFocusPainted(false);
        BTN_volver.setFocusable(false);
        PanelInfoDetalladaViaje.add(BTN_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 600, 120, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("-Terminal de Salida: ");
        PanelInfoDetalladaViaje.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 150, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("-Tiempo restante para el viaje:");
        PanelInfoDetalladaViaje.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 230, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("-Terminal de Llegada:");
        PanelInfoDetalladaViaje.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 160, 30));

        jLabel21.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("-Fecha de Llegada:");
        PanelInfoDetalladaViaje.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 140, 30));

        LBL_infoGanancia.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        LBL_infoGanancia.setForeground(new java.awt.Color(153, 153, 153));
        LBL_infoGanancia.setText("Label");
        PanelInfoDetalladaViaje.add(LBL_infoGanancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, -1, 30));

        LBL_infoViajeEstado.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        LBL_infoViajeEstado.setForeground(new java.awt.Color(153, 153, 153));
        LBL_infoViajeEstado.setText("Label");
        LBL_infoViajeEstado.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(123, 216, 80)));
        PanelInfoDetalladaViaje.add(LBL_infoViajeEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 500, 260, 30));

        LBL_infoViajeID.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        LBL_infoViajeID.setForeground(new java.awt.Color(255, 255, 255));
        LBL_infoViajeID.setText("label");
        LBL_infoViajeID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(123, 216, 80)));
        PanelInfoDetalladaViaje.add(LBL_infoViajeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 30));

        jLabel22.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("-Fecha de Salida:");
        PanelInfoDetalladaViaje.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 130, 30));

        LBL_infoTiempoRestante.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        LBL_infoTiempoRestante.setForeground(new java.awt.Color(153, 153, 153));
        LBL_infoTiempoRestante.setText("label");
        PanelInfoDetalladaViaje.add(LBL_infoTiempoRestante, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, -1, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Estado:");
        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(123, 216, 80)));
        PanelInfoDetalladaViaje.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, 60, 30));

        PanelDinamico.add(PanelInfoDetalladaViaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 0, 1060, 670));

        ScrollPanelDinamico.setViewportView(PanelDinamico);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollPanelDinamico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollPanelDinamico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BTN_eliminar_viajes;
    public javax.swing.JButton BTN_guardar_viajes;
    public javax.swing.JButton BTN_infoViaje;
    public javax.swing.JButton BTN_nuevo_viajes;
    public javax.swing.JButton BTN_volver;
    public javax.swing.JPanel Buss;
    public javax.swing.JComboBox<String> CBviaje_terminal_Llegada;
    public javax.swing.JComboBox<String> CBviaje_terminal_Salida;
    public com.toedter.calendar.JDateChooser DCviaje_fechaSalida;
    public javax.swing.JLabel LBL_img_referencial;
    public javax.swing.JLabel LBL_infoFechaLlegada;
    public javax.swing.JLabel LBL_infoFechaSalida;
    public javax.swing.JLabel LBL_infoGanancia;
    public javax.swing.JLabel LBL_infoTerminalLlegada;
    public javax.swing.JLabel LBL_infoTerminalSalida;
    public javax.swing.JLabel LBL_infoTiempoRestante;
    public javax.swing.JLabel LBL_infoViajeEstado;
    public javax.swing.JLabel LBL_infoViajeID;
    public javax.swing.JLabel LBLviaje_fechaLlegada;
    public javax.swing.JLabel LBLviaje_horaLlegada;
    public javax.swing.JProgressBar PB_viajeProgreso;
    public javax.swing.JPanel PanelDinamico;
    public javax.swing.JPanel PanelInfoDetalladaViaje;
    public javax.swing.JPanel PanelProgramacionViaje;
    public javax.swing.JSpinner SPNviaje_duracion;
    public javax.swing.JSpinner SPNviaje_horaSalida;
    public javax.swing.JSpinner SPNviaje_precio;
    public javax.swing.JScrollPane ScrollPanelDinamico;
    public javax.swing.JScrollPane ScrollTBLviajesAsientos;
    public javax.swing.JTable TBL_viajes;
    public javax.swing.JTable TBL_viajesAsientos;
    public javax.swing.JTextField TXTviaje_distancia;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel19;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel21;
    public javax.swing.JLabel jLabel22;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
