
package VISTA;
import UTILIDADES.*;



public class Interfaz_Principal extends javax.swing.JFrame {

    public Interfaz_Principal() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BarraSuperior = new javax.swing.JPanel();
        PanelLayer = new javax.swing.JLayeredPane();
        BarraLateral = new javax.swing.JPanel();
        BTN_cerrarSesion = new javax.swing.JButton();
        UsuarioLBL = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        reloj1 = new UTILIDADES.Reloj();
        jLabel4 = new javax.swing.JLabel();
        ScrollPanelDinamico = new javax.swing.JScrollPane();
        PanelDinamico = new javax.swing.JPanel();
        ScrollPaneBuses = new javax.swing.JScrollPane();
        PanelBuses = new javax.swing.JPanel();
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
        CONT = new javax.swing.JTextField();
        PanelPasajeros = new javax.swing.JPanel();
        ScrollPanelPasajeros = new javax.swing.JScrollPane();
        PanelFormPasajeros = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LBLPrecioTotal = new javax.swing.JLabel();
        BTN_confirmarCompra = new javax.swing.JButton();
        BTN_volverAsientos = new javax.swing.JButton();
        PanelPasajeroPrincipal = new javax.swing.JPanel();
        TxtApellidoMatePasa = new javax.swing.JTextField();
        TxtApellidoPatePasa = new javax.swing.JTextField();
        TxtNombrePasa = new javax.swing.JTextField();
        LBLnumAsiento = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SPNEdadPasa = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        TxtDNIpasa = new javax.swing.JFormattedTextField();
        BTN_derechaAcompañantes = new javax.swing.JButton();
        BTN_IzquiAcompañantes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarraSuperior.setBackground(new java.awt.Color(18, 18, 18));
        BarraSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(BarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 50));

        PanelLayer.setMaximumSize(new java.awt.Dimension(1280, 670));
        PanelLayer.setPreferredSize(new java.awt.Dimension(1280, 670));
        PanelLayer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarraLateral.setBackground(new java.awt.Color(18, 18, 18));
        BarraLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTN_cerrarSesion.setBackground(new java.awt.Color(18, 18, 18));
        BTN_cerrarSesion.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        BTN_cerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        BTN_cerrarSesion.setText("Cerrar Sesión");
        BTN_cerrarSesion.setAlignmentX(0.5F);
        BTN_cerrarSesion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(123, 216, 80), 2, true));
        BTN_cerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_cerrarSesion.setFocusPainted(false);
        BTN_cerrarSesion.setFocusable(false);
        BarraLateral.add(BTN_cerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 140, 30));

        UsuarioLBL.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        UsuarioLBL.setForeground(new java.awt.Color(51, 204, 0));
        UsuarioLBL.setText("Usuario");
        BarraLateral.add(UsuarioLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 90, -1));

        Logo.setBackground(new java.awt.Color(255, 255, 255));
        Logo.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        Logo.setForeground(new java.awt.Color(255, 255, 255));
        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setText("Z-Buss");
        Logo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(123, 216, 80)));
        BarraLateral.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, -1));

        reloj1.setBorder(null);
        BarraLateral.add(reloj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hola otra vez,");
        BarraLateral.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 40));

        PanelLayer.setLayer(BarraLateral, javax.swing.JLayeredPane.PALETTE_LAYER);
        PanelLayer.add(BarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 670));

        ScrollPanelDinamico.setBackground(new java.awt.Color(102, 204, 0));
        ScrollPanelDinamico.setBorder(null);
        ScrollPanelDinamico.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollPanelDinamico.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        ScrollPanelDinamico.setPreferredSize(new java.awt.Dimension(1100, 670));

        PanelDinamico.setBackground(new java.awt.Color(255, 255, 255));
        PanelDinamico.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ScrollPaneBuses.setBorder(null);
        ScrollPaneBuses.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollPaneBuses.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        ScrollPaneBuses.setFocusable(false);
        ScrollPaneBuses.setMaximumSize(new java.awt.Dimension(1100, 670));
        ScrollPaneBuses.setPreferredSize(new java.awt.Dimension(1100, 670));
        ScrollPaneBuses.setRequestFocusEnabled(false);
        ScrollPaneBuses.setVerifyInputWhenFocusTarget(false);

        PanelBuses.setBackground(new java.awt.Color(255, 255, 255));
        PanelBuses.setPreferredSize(new java.awt.Dimension(1100, 670));

        javax.swing.GroupLayout PanelBusesLayout = new javax.swing.GroupLayout(PanelBuses);
        PanelBuses.setLayout(PanelBusesLayout);
        PanelBusesLayout.setHorizontalGroup(
            PanelBusesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );
        PanelBusesLayout.setVerticalGroup(
            PanelBusesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        ScrollPaneBuses.setViewportView(PanelBuses);

        PanelDinamico.add(ScrollPaneBuses, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 670));

        PanelAsientos.setBackground(new java.awt.Color(255, 255, 255));
        PanelAsientos.setPreferredSize(new java.awt.Dimension(1100, 650));
        PanelAsientos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTN_volverBuses.setBackground(new java.awt.Color(255, 255, 255));
        BTN_volverBuses.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        BTN_volverBuses.setForeground(new java.awt.Color(0, 0, 0));
        BTN_volverBuses.setText("Anterior");
        BTN_volverBuses.setAlignmentX(0.5F);
        BTN_volverBuses.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        BTN_volverBuses.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_volverBuses.setFocusable(false);
        BTN_volverBuses.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelAsientos.add(BTN_volverBuses, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 140, 30));

        jLabel6.setBackground(new java.awt.Color(0, 255, 0));
        jLabel6.setOpaque(true);
        PanelAsientos.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 20, 20));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Disponible");
        PanelAsientos.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 100, 20));

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Ocupado");
        PanelAsientos.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 80, 20));

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
        PanelAsientos.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 20, 20));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("TERMINALES DE SALIDA Y LLEGADA");
        PanelAsientos.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 330, -1));

        LBLtermSalida.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        LBLtermSalida.setForeground(new java.awt.Color(0, 0, 0));
        LBLtermSalida.setText("SALIDA");
        PanelAsientos.add(LBLtermSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        LBLtermLlegada.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        LBLtermLlegada.setForeground(new java.awt.Color(0, 0, 0));
        LBLtermLlegada.setText("LLEGADA");
        PanelAsientos.add(LBLtermLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, 20));

        LBLhoraLlegada.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        LBLhoraLlegada.setForeground(new java.awt.Color(0, 0, 0));
        LBLhoraLlegada.setText("HORARIO/LLEGADA");
        PanelAsientos.add(LBLhoraLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, -1));

        LBLhoraSalida.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        LBLhoraSalida.setForeground(new java.awt.Color(0, 0, 0));
        LBLhoraSalida.setText("HORARIO/SALIDA");
        PanelAsientos.add(LBLhoraSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Asientos Seleccionados:");
        PanelAsientos.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 170, -1));

        LBLasientosSele.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        LBLasientosSele.setForeground(new java.awt.Color(0, 0, 0));
        LBLasientosSele.setText("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        PanelAsientos.add(LBLasientosSele, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Precio:");
        PanelAsientos.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, 30));

        LBLprecio.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        LBLprecio.setForeground(new java.awt.Color(0, 0, 0));
        LBLprecio.setText("S/0000");
        PanelAsientos.add(LBLprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 399, -1, 30));

        jLabel20.setBackground(new java.awt.Color(0, 0, 255));
        jLabel20.setOpaque(true);
        PanelAsientos.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 20, 20));

        jLabel21.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Seleccionado");
        PanelAsientos.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 120, 20));

        BTN_siguiente.setBackground(new java.awt.Color(255, 255, 255));
        BTN_siguiente.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        BTN_siguiente.setForeground(new java.awt.Color(0, 0, 0));
        BTN_siguiente.setText("Siguiente");
        BTN_siguiente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        BTN_siguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_siguiente.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        BTN_siguiente.setDefaultCapable(false);
        BTN_siguiente.setEnabled(false);
        BTN_siguiente.setFocusPainted(false);
        BTN_siguiente.setFocusable(false);
        BTN_siguiente.setRequestFocusEnabled(false);
        BTN_siguiente.setRolloverEnabled(false);
        BTN_siguiente.setVerifyInputWhenFocusTarget(false);
        PanelAsientos.add(BTN_siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, 140, 30));

        CONT.setEditable(false);
        CONT.setBackground(new java.awt.Color(255, 255, 255));
        CONT.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        CONT.setForeground(new java.awt.Color(0, 0, 0));
        CONT.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PanelAsientos.add(CONT, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 40, 30));

        PanelDinamico.add(PanelAsientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 0, 1100, 670));

        PanelPasajeros.setBackground(new java.awt.Color(255, 255, 255));
        PanelPasajeros.setPreferredSize(new java.awt.Dimension(1100, 670));
        PanelPasajeros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ScrollPanelPasajeros.setBackground(new java.awt.Color(51, 255, 0));
        ScrollPanelPasajeros.setBorder(null);
        ScrollPanelPasajeros.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollPanelPasajeros.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        ScrollPanelPasajeros.setWheelScrollingEnabled(false);

        PanelFormPasajeros.setBackground(new java.awt.Color(255, 255, 255));
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

        PanelPasajeros.add(ScrollPanelPasajeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 850, 200));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Precio a Pagar:");
        PanelPasajeros.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, 150, 40));

        LBLPrecioTotal.setFont(new java.awt.Font("Consolas", 1, 22)); // NOI18N
        LBLPrecioTotal.setForeground(new java.awt.Color(0, 0, 0));
        LBLPrecioTotal.setText("s/0000");
        PanelPasajeros.add(LBLPrecioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 620, 80, 30));

        BTN_confirmarCompra.setBackground(new java.awt.Color(255, 255, 255));
        BTN_confirmarCompra.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        BTN_confirmarCompra.setForeground(new java.awt.Color(0, 0, 0));
        BTN_confirmarCompra.setText("CONFIRMAR");
        BTN_confirmarCompra.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        BTN_confirmarCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_confirmarCompra.setFocusable(false);
        PanelPasajeros.add(BTN_confirmarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 610, 140, 40));

        BTN_volverAsientos.setBackground(new java.awt.Color(255, 255, 255));
        BTN_volverAsientos.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        BTN_volverAsientos.setForeground(new java.awt.Color(0, 0, 0));
        BTN_volverAsientos.setText("ANTERIOR");
        BTN_volverAsientos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        BTN_volverAsientos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_volverAsientos.setFocusable(false);
        PanelPasajeros.add(BTN_volverAsientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 610, 140, 40));

        PanelPasajeroPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PanelPasajeroPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Pasajero Principal", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Consolas", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        PanelPasajeroPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtApellidoMatePasa.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        TxtApellidoMatePasa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        PanelPasajeroPrincipal.add(TxtApellidoMatePasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 280, 30));

        TxtApellidoPatePasa.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        TxtApellidoPatePasa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        PanelPasajeroPrincipal.add(TxtApellidoPatePasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 280, 30));

        TxtNombrePasa.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        TxtNombrePasa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        PanelPasajeroPrincipal.add(TxtNombrePasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 270, 30));

        LBLnumAsiento.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        LBLnumAsiento.setForeground(new java.awt.Color(0, 0, 0));
        LBLnumAsiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLnumAsiento.setText("Asiento");
        PanelPasajeroPrincipal.add(LBLnumAsiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 90, 20));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("DNI:");
        PanelPasajeroPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 40, 30));

        SPNEdadPasa.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        SPNEdadPasa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        SPNEdadPasa.setFocusable(false);
        PanelPasajeroPrincipal.add(SPNEdadPasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 60, 30));

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Edad:");
        PanelPasajeroPrincipal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 50, 30));

        TxtDNIpasa.setBackground(new java.awt.Color(255, 255, 255));
        TxtDNIpasa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        try {
            TxtDNIpasa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        PanelPasajeroPrincipal.add(TxtDNIpasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 150, 30));

        PanelPasajeros.add(PanelPasajeroPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 850, 200));

        BTN_derechaAcompañantes.setBackground(new java.awt.Color(18, 18, 18));
        BTN_derechaAcompañantes.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        BTN_derechaAcompañantes.setForeground(new java.awt.Color(255, 255, 255));
        BTN_derechaAcompañantes.setText(">>>>");
        BTN_derechaAcompañantes.setBorderPainted(false);
        BTN_derechaAcompañantes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_derechaAcompañantes.setFocusable(false);
        PanelPasajeros.add(BTN_derechaAcompañantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 540, 80, 30));

        BTN_IzquiAcompañantes.setBackground(new java.awt.Color(18, 18, 18));
        BTN_IzquiAcompañantes.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        BTN_IzquiAcompañantes.setForeground(new java.awt.Color(255, 255, 255));
        BTN_IzquiAcompañantes.setText("<<<<");
        BTN_IzquiAcompañantes.setBorderPainted(false);
        BTN_IzquiAcompañantes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_IzquiAcompañantes.setFocusable(false);
        PanelPasajeros.add(BTN_IzquiAcompañantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 80, 30));

        PanelDinamico.add(PanelPasajeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(2200, 0, 1100, 670));

        ScrollPanelDinamico.setViewportView(PanelDinamico);

        PanelLayer.add(ScrollPanelDinamico, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 1100, 670));

        getContentPane().add(PanelLayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

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
    public javax.swing.JButton BTN_cerrarSesion;
    public javax.swing.JButton BTN_confirmarCompra;
    public javax.swing.JButton BTN_derechaAcompañantes;
    public javax.swing.JButton BTN_siguiente;
    public javax.swing.JButton BTN_volverAsientos;
    public javax.swing.JButton BTN_volverBuses;
    public javax.swing.JPanel BarraLateral;
    public javax.swing.JPanel BarraSuperior;
    public javax.swing.JPanel Buss;
    public javax.swing.JTextField CONT;
    public javax.swing.JLabel LBLPrecioTotal;
    public javax.swing.JLabel LBLasientosSele;
    public javax.swing.JLabel LBLhoraLlegada;
    public javax.swing.JLabel LBLhoraSalida;
    public javax.swing.JLabel LBLnumAsiento;
    public javax.swing.JLabel LBLprecio;
    public javax.swing.JLabel LBLtermLlegada;
    public javax.swing.JLabel LBLtermSalida;
    public javax.swing.JLabel Logo;
    public javax.swing.JPanel PanelAsientos;
    public javax.swing.JPanel PanelBuses;
    public javax.swing.JPanel PanelDinamico;
    public javax.swing.JPanel PanelFormPasajeros;
    public javax.swing.JLayeredPane PanelLayer;
    public javax.swing.JPanel PanelPasajeroPrincipal;
    public javax.swing.JPanel PanelPasajeros;
    public javax.swing.JSpinner SPNEdadPasa;
    public javax.swing.JScrollPane ScrollPaneBuses;
    public javax.swing.JScrollPane ScrollPanelDinamico;
    public javax.swing.JScrollPane ScrollPanelPasajeros;
    public javax.swing.JTextField TxtApellidoMatePasa;
    public javax.swing.JTextField TxtApellidoPatePasa;
    public javax.swing.JFormattedTextField TxtDNIpasa;
    public javax.swing.JTextField TxtNombrePasa;
    public javax.swing.JLabel UsuarioLBL;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel16;
    public javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel21;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public UTILIDADES.Reloj reloj1;
    // End of variables declaration//GEN-END:variables
}
