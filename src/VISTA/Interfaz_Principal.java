
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
        LBLinfoCuenta = new javax.swing.JLabel();
        PanelTiempo = new javax.swing.JPanel();
        LBLhora = new javax.swing.JLabel();
        LBLfecha = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ScrollPanelDinamico = new javax.swing.JScrollPane();
        PanelDinamico = new javax.swing.JPanel();
        ScrollPaneBuses = new javax.swing.JScrollPane();
        PanelBuses = new javax.swing.JPanel();
        PanelAsientos = new javax.swing.JPanel();
        Buss = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
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
        CONT = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BTN_cancelarAsientos = new javax.swing.JButton();
        BTN_ConfirmarAsientos = new javax.swing.JButton();
        PanelPasajeros = new javax.swing.JPanel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarraSuperior.setBackground(new java.awt.Color(0, 0, 0));
        BarraSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(BarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 50));

        PanelLayer.setMaximumSize(new java.awt.Dimension(1280, 670));
        PanelLayer.setPreferredSize(new java.awt.Dimension(1280, 670));
        PanelLayer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarraLateral.setBackground(new java.awt.Color(0, 0, 0));
        BarraLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTN_cerrarSesion.setBackground(new java.awt.Color(12, 12, 12));
        BTN_cerrarSesion.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        BTN_cerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        BTN_cerrarSesion.setText("Cerrar Sesión");
        BTN_cerrarSesion.setAlignmentX(0.5F);
        BTN_cerrarSesion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(123, 216, 80), 1, true));
        BTN_cerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_cerrarSesion.setFocusPainted(false);
        BTN_cerrarSesion.setFocusable(false);
        BarraLateral.add(BTN_cerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 140, 30));

        UsuarioLBL.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        UsuarioLBL.setForeground(new java.awt.Color(51, 204, 0));
        UsuarioLBL.setText("Usuario");
        BarraLateral.add(UsuarioLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, 30));

        Logo.setBackground(new java.awt.Color(255, 255, 255));
        Logo.setFont(new java.awt.Font("SansSerif", 1, 40)); // NOI18N
        Logo.setForeground(new java.awt.Color(255, 255, 255));
        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setText(" Z-Buss");
        Logo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(123, 216, 80)));
        BarraLateral.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, -1));

        LBLinfoCuenta.setBackground(new java.awt.Color(0, 0, 0));
        LBLinfoCuenta.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        LBLinfoCuenta.setForeground(new java.awt.Color(255, 255, 255));
        LBLinfoCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLinfoCuenta.setText("Mi cuenta");
        LBLinfoCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LBLinfoCuenta.setOpaque(true);
        BarraLateral.add(LBLinfoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 180, 80));

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

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Usuario:");
        BarraLateral.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

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

        PanelBuses.setBackground(new java.awt.Color(6, 6, 6));
        PanelBuses.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        PanelBuses.setPreferredSize(new java.awt.Dimension(1100, 670));

        javax.swing.GroupLayout PanelBusesLayout = new javax.swing.GroupLayout(PanelBuses);
        PanelBuses.setLayout(PanelBusesLayout);
        PanelBusesLayout.setHorizontalGroup(
            PanelBusesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1098, Short.MAX_VALUE)
        );
        PanelBusesLayout.setVerticalGroup(
            PanelBusesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
        );

        ScrollPaneBuses.setViewportView(PanelBuses);

        PanelDinamico.add(ScrollPaneBuses, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 670));

        PanelAsientos.setBackground(new java.awt.Color(6, 6, 6));
        PanelAsientos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        PanelAsientos.setPreferredSize(new java.awt.Dimension(1100, 650));
        PanelAsientos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Buss.setBackground(new java.awt.Color(6, 6, 6));
        Buss.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(123, 216, 80), 1, true));

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
                .addContainerGap(114, Short.MAX_VALUE))
        );
        BussLayout.setVerticalGroup(
            BussLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BussLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(580, Short.MAX_VALUE))
        );

        PanelAsientos.add(Buss, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, 310, 610));

        jPanel1.setBackground(new java.awt.Color(12, 12, 12));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LBLasientosSeleccionados.setBackground(new java.awt.Color(6, 6, 6));
        LBLasientosSeleccionados.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        LBLasientosSeleccionados.setForeground(new java.awt.Color(255, 255, 255));
        LBLasientosSeleccionados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLasientosSeleccionados.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(123, 216, 80)));
        jPanel1.add(LBLasientosSeleccionados, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, 30));

        jLabel6.setBackground(new java.awt.Color(0, 255, 0));
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 20, 20));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Disponible");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 100, 20));

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ocupado");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 80, 20));

        jLabel10.setBackground(new java.awt.Color(255, 0, 0));
        jLabel10.setOpaque(true);
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 20, 20));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Terminales de Salida/Llegada:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 330, -1));

        LBLtermSalida.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        LBLtermSalida.setForeground(new java.awt.Color(255, 255, 255));
        LBLtermSalida.setText("SALIDA");
        jPanel1.add(LBLtermSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        LBLtermLlegada.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        LBLtermLlegada.setForeground(new java.awt.Color(255, 255, 255));
        LBLtermLlegada.setText("LLEGADA");
        jPanel1.add(LBLtermLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Asientos Seleccionados:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 170, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Precio:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, 30));

        LBLprecio.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        LBLprecio.setForeground(new java.awt.Color(255, 255, 255));
        LBLprecio.setText("S/0000");
        jPanel1.add(LBLprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, -1, 30));

        jLabel20.setBackground(new java.awt.Color(0, 0, 255));
        jLabel20.setOpaque(true);
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 20, 20));

        jLabel21.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Seleccionado");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 120, 20));

        LBLhoraLlegada.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        LBLhoraLlegada.setForeground(new java.awt.Color(255, 255, 255));
        LBLhoraLlegada.setText("HORARIO/LLEGADA");
        jPanel1.add(LBLhoraLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 150, -1));

        LBLhoraSalida.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        LBLhoraSalida.setForeground(new java.awt.Color(255, 255, 255));
        LBLhoraSalida.setText("HORARIO/SALIDA");
        jPanel1.add(LBLhoraSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 140, -1));

        CONT.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        CONT.setForeground(new java.awt.Color(255, 255, 255));
        CONT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CONT.setText("0");
        jPanel1.add(CONT, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 40, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Seleccione sus asientos");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 270, -1));

        PanelAsientos.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 430, 550));

        BTN_cancelarAsientos.setBackground(new java.awt.Color(6, 6, 6));
        BTN_cancelarAsientos.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        BTN_cancelarAsientos.setForeground(new java.awt.Color(255, 255, 255));
        BTN_cancelarAsientos.setText("Anterior");
        BTN_cancelarAsientos.setAlignmentX(0.5F);
        BTN_cancelarAsientos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(123, 216, 80)));
        BTN_cancelarAsientos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_cancelarAsientos.setFocusable(false);
        BTN_cancelarAsientos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelAsientos.add(BTN_cancelarAsientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 600, 140, 30));

        BTN_ConfirmarAsientos.setBackground(new java.awt.Color(6, 6, 6));
        BTN_ConfirmarAsientos.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        BTN_ConfirmarAsientos.setForeground(new java.awt.Color(255, 255, 255));
        BTN_ConfirmarAsientos.setText("Siguiente");
        BTN_ConfirmarAsientos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(123, 216, 80)));
        BTN_ConfirmarAsientos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_ConfirmarAsientos.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        BTN_ConfirmarAsientos.setDefaultCapable(false);
        BTN_ConfirmarAsientos.setFocusPainted(false);
        BTN_ConfirmarAsientos.setFocusable(false);
        BTN_ConfirmarAsientos.setRequestFocusEnabled(false);
        BTN_ConfirmarAsientos.setRolloverEnabled(false);
        BTN_ConfirmarAsientos.setVerifyInputWhenFocusTarget(false);
        PanelAsientos.add(BTN_ConfirmarAsientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 600, 140, 30));

        PanelDinamico.add(PanelAsientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 0, 1100, 670));

        PanelPasajeros.setBackground(new java.awt.Color(6, 6, 6));
        PanelPasajeros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        PanelPasajeros.setPreferredSize(new java.awt.Dimension(1100, 670));
        PanelPasajeros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ScrollPanelPasajeros.setBackground(new java.awt.Color(51, 255, 0));
        ScrollPanelPasajeros.setBorder(null);
        ScrollPanelPasajeros.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollPanelPasajeros.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        ScrollPanelPasajeros.setWheelScrollingEnabled(false);

        PanelFormPasajeros.setBackground(new java.awt.Color(6, 6, 6));
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
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Precio a Pagar:");
        PanelPasajeros.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, 150, 40));

        LBLPrecioTotal.setFont(new java.awt.Font("Consolas", 1, 22)); // NOI18N
        LBLPrecioTotal.setForeground(new java.awt.Color(255, 255, 255));
        LBLPrecioTotal.setText("s/0000");
        PanelPasajeros.add(LBLPrecioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 620, 80, 30));

        BTN_confirmarCompra.setBackground(new java.awt.Color(6, 6, 6));
        BTN_confirmarCompra.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        BTN_confirmarCompra.setForeground(new java.awt.Color(255, 255, 255));
        BTN_confirmarCompra.setText("Confirmar");
        BTN_confirmarCompra.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(123, 216, 80)));
        BTN_confirmarCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_confirmarCompra.setFocusable(false);
        PanelPasajeros.add(BTN_confirmarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 610, 140, 40));

        BTN_cancelarPasajeros.setBackground(new java.awt.Color(6, 6, 6));
        BTN_cancelarPasajeros.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        BTN_cancelarPasajeros.setForeground(new java.awt.Color(255, 255, 255));
        BTN_cancelarPasajeros.setText("Anterior");
        BTN_cancelarPasajeros.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(123, 216, 80)));
        BTN_cancelarPasajeros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_cancelarPasajeros.setFocusable(false);
        PanelPasajeros.add(BTN_cancelarPasajeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 610, 140, 40));

        PanelPasajeroPrincipal.setBackground(new java.awt.Color(10, 10, 10));
        PanelPasajeroPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(123, 216, 80)), "Pasajero Principal", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Consolas", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        PanelPasajeroPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtApellidoMatePasajero.setBackground(new java.awt.Color(10, 10, 10));
        TxtApellidoMatePasajero.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        TxtApellidoMatePasajero.setForeground(new java.awt.Color(255, 255, 255));
        TxtApellidoMatePasajero.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        TxtApellidoMatePasajero.setCaretColor(new java.awt.Color(255, 255, 255));
        PanelPasajeroPrincipal.add(TxtApellidoMatePasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 280, 30));

        TxtApellidoPatePasajero.setBackground(new java.awt.Color(10, 10, 10));
        TxtApellidoPatePasajero.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        TxtApellidoPatePasajero.setForeground(new java.awt.Color(255, 255, 255));
        TxtApellidoPatePasajero.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        TxtApellidoPatePasajero.setCaretColor(new java.awt.Color(255, 255, 255));
        PanelPasajeroPrincipal.add(TxtApellidoPatePasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 280, 30));

        TxtNombrePasajero.setBackground(new java.awt.Color(10, 10, 10));
        TxtNombrePasajero.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
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
        PanelPasajeroPrincipal.add(TxtDNIpasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 150, 30));

        PanelPasajeros.add(PanelPasajeroPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 850, 200));

        BTN_derechaAcompañantes.setBackground(new java.awt.Color(0, 0, 0));
        BTN_derechaAcompañantes.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        BTN_derechaAcompañantes.setForeground(new java.awt.Color(255, 255, 255));
        BTN_derechaAcompañantes.setText(">>>>");
        BTN_derechaAcompañantes.setBorderPainted(false);
        BTN_derechaAcompañantes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_derechaAcompañantes.setFocusable(false);
        PanelPasajeros.add(BTN_derechaAcompañantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 540, 80, 30));

        BTN_IzquiAcompañantes.setBackground(new java.awt.Color(0, 0, 0));
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
    public javax.swing.JButton BTN_ConfirmarAsientos;
    public javax.swing.JButton BTN_IzquiAcompañantes;
    public javax.swing.JButton BTN_cancelarAsientos;
    public javax.swing.JButton BTN_cancelarPasajeros;
    public javax.swing.JButton BTN_cerrarSesion;
    public javax.swing.JButton BTN_confirmarCompra;
    public javax.swing.JButton BTN_derechaAcompañantes;
    public javax.swing.JPanel BarraLateral;
    public javax.swing.JPanel BarraSuperior;
    public javax.swing.JPanel Buss;
    public javax.swing.JLabel CONT;
    public javax.swing.JLabel LBLPrecioTotal;
    public javax.swing.JLabel LBLasientoPasajero;
    public javax.swing.JLabel LBLasientosSeleccionados;
    public javax.swing.JLabel LBLfecha;
    public javax.swing.JLabel LBLhora;
    public javax.swing.JLabel LBLhoraLlegada;
    public javax.swing.JLabel LBLhoraSalida;
    public javax.swing.JLabel LBLinfoCuenta;
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
    public javax.swing.JPanel PanelTiempo;
    public javax.swing.JSpinner SPNEdadPasajero;
    public javax.swing.JScrollPane ScrollPaneBuses;
    public javax.swing.JScrollPane ScrollPanelDinamico;
    public javax.swing.JScrollPane ScrollPanelPasajeros;
    public javax.swing.JTextField TxtApellidoMatePasajero;
    public javax.swing.JTextField TxtApellidoPatePasajero;
    public javax.swing.JFormattedTextField TxtDNIpasajero;
    public javax.swing.JTextField TxtNombrePasajero;
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
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
