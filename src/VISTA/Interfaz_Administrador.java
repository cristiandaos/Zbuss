
package VISTA;

public class Interfaz_Administrador extends javax.swing.JFrame {

    public Interfaz_Administrador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BarraSuperior = new javax.swing.JPanel();
        BarraLateral = new javax.swing.JPanel();
        PanelTiempo = new javax.swing.JPanel();
        LBLhora = new javax.swing.JLabel();
        LBLfecha = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LBLadministrador = new javax.swing.JLabel();
        BTN_infoSocios = new javax.swing.JLabel();
        BTN_gestionViajes = new javax.swing.JLabel();
        BTN_gestionTerminales = new javax.swing.JLabel();
        BTN_gestionAdmins = new javax.swing.JLabel();
        BTN_cerrarSesion = new javax.swing.JButton();
        Scroll = new javax.swing.JScrollPane();
        PanelDinamico = new javax.swing.JPanel();
        PanelViajes = new javax.swing.JPanel();
        TXTviaje_distancia = new javax.swing.JTextField();
        CBviaje_terminal_llegada = new javax.swing.JComboBox<>();
        SPNviaje_fecha_llegada = new javax.swing.JSpinner();
        SPNviaje_fecha_salida = new javax.swing.JSpinner();
        SPNviaje_precio = new javax.swing.JSpinner();
        TXTviaje_codigo = new javax.swing.JTextField();
        CBviaje_terminal_salida = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        TBLviajes = new javax.swing.JTable();
        BTN_eliminar_viajes = new javax.swing.JButton();
        BTN_nuevo_viajes = new javax.swing.JButton();
        BTN_guardar_viajes = new javax.swing.JButton();
        LBL_img_referencial = new javax.swing.JLabel();
        BTN_img_referencial = new javax.swing.JButton();
        PanelTerminales = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBLterminales = new javax.swing.JTable();
        TXTdireccionTerminal = new javax.swing.JTextField();
        TXTcodigoTerminal = new javax.swing.JTextField();
        TXTnombreTerminal = new javax.swing.JTextField();
        CBestadoTerminal = new javax.swing.JComboBox<>();
        BTN_guardar_Terminales = new javax.swing.JButton();
        PanelAdministradores = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TBLadministradores = new javax.swing.JTable();
        TXTdireccionTerminal1 = new javax.swing.JTextField();
        TXTcodigoTerminal1 = new javax.swing.JTextField();
        TXTnombreTerminal1 = new javax.swing.JTextField();
        TXTdireccionTerminal2 = new javax.swing.JTextField();
        TXTcodigoTerminal2 = new javax.swing.JTextField();
        TXTnombreTerminal2 = new javax.swing.JTextField();
        PanelSocios = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarraSuperior.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout BarraSuperiorLayout = new javax.swing.GroupLayout(BarraSuperior);
        BarraSuperior.setLayout(BarraSuperiorLayout);
        BarraSuperiorLayout.setHorizontalGroup(
            BarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        BarraSuperiorLayout.setVerticalGroup(
            BarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(BarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 50));

        BarraLateral.setBackground(new java.awt.Color(0, 0, 0));
        BarraLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelTiempo.setBackground(new java.awt.Color(0, 0, 0));
        PanelTiempo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LBLhora.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        LBLhora.setForeground(new java.awt.Color(255, 255, 255));
        LBLhora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLhora.setText("Hora");
        PanelTiempo.add(LBLhora, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 220, 40));

        LBLfecha.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        LBLfecha.setForeground(new java.awt.Color(255, 255, 255));
        LBLfecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLfecha.setText("Fecha");
        PanelTiempo.add(LBLfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 40));

        BarraLateral.add(PanelTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 220, 80));

        Logo.setBackground(new java.awt.Color(255, 255, 255));
        Logo.setFont(new java.awt.Font("SansSerif", 1, 40)); // NOI18N
        Logo.setForeground(new java.awt.Color(255, 255, 255));
        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setText(" Z-Buss");
        Logo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(123, 216, 80)));
        BarraLateral.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Administrador:");
        BarraLateral.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 220, 30));

        LBLadministrador.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        LBLadministrador.setForeground(new java.awt.Color(51, 204, 0));
        LBLadministrador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLadministrador.setText("ADMINISTRADOR");
        BarraLateral.add(LBLadministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 220, 20));

        BTN_infoSocios.setBackground(new java.awt.Color(0, 0, 0));
        BTN_infoSocios.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        BTN_infoSocios.setForeground(new java.awt.Color(255, 255, 255));
        BTN_infoSocios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BTN_infoSocios.setText("Información de Socios");
        BTN_infoSocios.setOpaque(true);
        BarraLateral.add(BTN_infoSocios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 220, 70));

        BTN_gestionViajes.setBackground(new java.awt.Color(0, 0, 0));
        BTN_gestionViajes.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        BTN_gestionViajes.setForeground(new java.awt.Color(255, 255, 255));
        BTN_gestionViajes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BTN_gestionViajes.setText("Gestionar Viajes");
        BTN_gestionViajes.setOpaque(true);
        BarraLateral.add(BTN_gestionViajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 220, 70));

        BTN_gestionTerminales.setBackground(new java.awt.Color(0, 0, 0));
        BTN_gestionTerminales.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        BTN_gestionTerminales.setForeground(new java.awt.Color(255, 255, 255));
        BTN_gestionTerminales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BTN_gestionTerminales.setText("Gestionar Terminales");
        BTN_gestionTerminales.setOpaque(true);
        BarraLateral.add(BTN_gestionTerminales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 220, 70));

        BTN_gestionAdmins.setBackground(new java.awt.Color(0, 0, 0));
        BTN_gestionAdmins.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        BTN_gestionAdmins.setForeground(new java.awt.Color(255, 255, 255));
        BTN_gestionAdmins.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BTN_gestionAdmins.setText("Gestionar Administradores");
        BTN_gestionAdmins.setOpaque(true);
        BarraLateral.add(BTN_gestionAdmins, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 220, 70));

        BTN_cerrarSesion.setBackground(new java.awt.Color(0, 0, 0));
        BTN_cerrarSesion.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        BTN_cerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        BTN_cerrarSesion.setText("Cerrar Sesión");
        BTN_cerrarSesion.setAlignmentX(0.5F);
        BTN_cerrarSesion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(123, 216, 80), 1, true));
        BTN_cerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_cerrarSesion.setFocusPainted(false);
        BTN_cerrarSesion.setFocusable(false);
        BarraLateral.add(BTN_cerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, 140, 30));

        getContentPane().add(BarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 220, 670));

        Scroll.setBorder(null);
        Scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        Scroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        Scroll.setWheelScrollingEnabled(false);

        PanelDinamico.setBackground(new java.awt.Color(153, 153, 153));
        PanelDinamico.setPreferredSize(new java.awt.Dimension(1060, 2680));
        PanelDinamico.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelViajes.setBackground(new java.awt.Color(20, 20, 20));
        PanelViajes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TXTviaje_distancia.setBackground(new java.awt.Color(14, 14, 14));
        TXTviaje_distancia.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        TXTviaje_distancia.setForeground(new java.awt.Color(255, 255, 255));
        TXTviaje_distancia.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 204, 0)));
        PanelViajes.add(TXTviaje_distancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 180, 30));

        CBviaje_terminal_llegada.setBackground(new java.awt.Color(14, 14, 14));
        CBviaje_terminal_llegada.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        CBviaje_terminal_llegada.setForeground(new java.awt.Color(255, 255, 255));
        CBviaje_terminal_llegada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBviaje_terminal_llegada.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(123, 216, 80)));
        CBviaje_terminal_llegada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CBviaje_terminal_llegada.setFocusable(false);
        PanelViajes.add(CBviaje_terminal_llegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 210, 30));

        SPNviaje_fecha_llegada.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1685411712616L), new java.util.Date(1685411712616L), null, java.util.Calendar.HOUR));
        SPNviaje_fecha_llegada.setFocusable(false);
        PanelViajes.add(SPNviaje_fecha_llegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 140, -1));

        SPNviaje_fecha_salida.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), new java.util.Date(), null, java.util.Calendar.HOUR_OF_DAY));
        SPNviaje_fecha_salida.setFocusable(false);
        SPNviaje_fecha_salida.setOpaque(true);
        PanelViajes.add(SPNviaje_fecha_salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 140, -1));

        SPNviaje_precio.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));
        SPNviaje_precio.setFocusable(false);
        PanelViajes.add(SPNviaje_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 80, -1));

        TXTviaje_codigo.setBackground(new java.awt.Color(14, 14, 14));
        TXTviaje_codigo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        TXTviaje_codigo.setForeground(new java.awt.Color(255, 255, 255));
        TXTviaje_codigo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 204, 0)));
        PanelViajes.add(TXTviaje_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 180, 30));

        CBviaje_terminal_salida.setBackground(new java.awt.Color(14, 14, 14));
        CBviaje_terminal_salida.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        CBviaje_terminal_salida.setForeground(new java.awt.Color(255, 255, 255));
        CBviaje_terminal_salida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBviaje_terminal_salida.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(123, 216, 80)));
        CBviaje_terminal_salida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelViajes.add(CBviaje_terminal_salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 142, 210, 30));

        TBLviajes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 0)));
        TBLviajes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TBLviajes.setGridColor(new java.awt.Color(255, 255, 255));
        TBLviajes.getTableHeader().setResizingAllowed(false);
        TBLviajes.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(TBLviajes);

        PanelViajes.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 420, 660, 240));

        BTN_eliminar_viajes.setText("Eliminar");
        PanelViajes.add(BTN_eliminar_viajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 570, 90, 30));

        BTN_nuevo_viajes.setText("Nuevo");
        PanelViajes.add(BTN_nuevo_viajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 90, 30));

        BTN_guardar_viajes.setText("Guardar");
        PanelViajes.add(BTN_guardar_viajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 570, 90, 30));

        LBL_img_referencial.setBackground(new java.awt.Color(0, 0, 0));
        LBL_img_referencial.setOpaque(true);
        PanelViajes.add(LBL_img_referencial, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 360, 250));

        BTN_img_referencial.setForeground(new java.awt.Color(255, 255, 255));
        BTN_img_referencial.setText("Imagen Referencial");
        BTN_img_referencial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 0)));
        BTN_img_referencial.setFocusable(false);
        PanelViajes.add(BTN_img_referencial, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 120, 40));

        PanelDinamico.add(PanelViajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 670));

        PanelTerminales.setBackground(new java.awt.Color(20, 20, 20));
        PanelTerminales.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 204, 0)));
        PanelTerminales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TBLterminales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TBLterminales);

        PanelTerminales.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 510, -1));

        TXTdireccionTerminal.setBackground(new java.awt.Color(18, 18, 18));
        TXTdireccionTerminal.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        TXTdireccionTerminal.setForeground(new java.awt.Color(255, 255, 255));
        TXTdireccionTerminal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 204, 0)));
        PanelTerminales.add(TXTdireccionTerminal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 350, 30));

        TXTcodigoTerminal.setBackground(new java.awt.Color(18, 18, 18));
        TXTcodigoTerminal.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        TXTcodigoTerminal.setForeground(new java.awt.Color(255, 255, 255));
        TXTcodigoTerminal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 204, 0)));
        PanelTerminales.add(TXTcodigoTerminal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 180, 30));

        TXTnombreTerminal.setBackground(new java.awt.Color(18, 18, 18));
        TXTnombreTerminal.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        TXTnombreTerminal.setForeground(new java.awt.Color(255, 255, 255));
        TXTnombreTerminal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 204, 0)));
        PanelTerminales.add(TXTnombreTerminal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 190, 30));

        CBestadoTerminal.setBackground(new java.awt.Color(18, 18, 18));
        CBestadoTerminal.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        CBestadoTerminal.setForeground(new java.awt.Color(255, 255, 255));
        CBestadoTerminal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Habilitado", "Deshabilitado" }));
        CBestadoTerminal.setBorder(null);
        CBestadoTerminal.setFocusable(false);
        PanelTerminales.add(CBestadoTerminal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 140, 30));

        BTN_guardar_Terminales.setText("Guardar");
        PanelTerminales.add(BTN_guardar_Terminales, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, -1, -1));

        PanelDinamico.add(PanelTerminales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 1060, 670));

        PanelAdministradores.setBackground(new java.awt.Color(20, 20, 20));
        PanelAdministradores.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(51, 204, 0)));
        PanelAdministradores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TBLadministradores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(TBLadministradores);

        PanelAdministradores.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 510, -1));

        TXTdireccionTerminal1.setBackground(new java.awt.Color(18, 18, 18));
        TXTdireccionTerminal1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        TXTdireccionTerminal1.setForeground(new java.awt.Color(255, 255, 255));
        TXTdireccionTerminal1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 204, 0)));
        PanelAdministradores.add(TXTdireccionTerminal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 190, 30));

        TXTcodigoTerminal1.setBackground(new java.awt.Color(18, 18, 18));
        TXTcodigoTerminal1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        TXTcodigoTerminal1.setForeground(new java.awt.Color(255, 255, 255));
        TXTcodigoTerminal1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 204, 0)));
        PanelAdministradores.add(TXTcodigoTerminal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 190, 30));

        TXTnombreTerminal1.setBackground(new java.awt.Color(18, 18, 18));
        TXTnombreTerminal1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        TXTnombreTerminal1.setForeground(new java.awt.Color(255, 255, 255));
        TXTnombreTerminal1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 204, 0)));
        PanelAdministradores.add(TXTnombreTerminal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 190, 30));

        TXTdireccionTerminal2.setBackground(new java.awt.Color(18, 18, 18));
        TXTdireccionTerminal2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        TXTdireccionTerminal2.setForeground(new java.awt.Color(255, 255, 255));
        TXTdireccionTerminal2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 204, 0)));
        PanelAdministradores.add(TXTdireccionTerminal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 230, 30));

        TXTcodigoTerminal2.setBackground(new java.awt.Color(18, 18, 18));
        TXTcodigoTerminal2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        TXTcodigoTerminal2.setForeground(new java.awt.Color(255, 255, 255));
        TXTcodigoTerminal2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 204, 0)));
        PanelAdministradores.add(TXTcodigoTerminal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 190, 30));

        TXTnombreTerminal2.setBackground(new java.awt.Color(18, 18, 18));
        TXTnombreTerminal2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        TXTnombreTerminal2.setForeground(new java.awt.Color(255, 255, 255));
        TXTnombreTerminal2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 204, 0)));
        PanelAdministradores.add(TXTnombreTerminal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 230, 30));

        PanelDinamico.add(PanelAdministradores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1340, 1060, 670));

        PanelSocios.setBackground(new java.awt.Color(153, 153, 0));

        javax.swing.GroupLayout PanelSociosLayout = new javax.swing.GroupLayout(PanelSocios);
        PanelSocios.setLayout(PanelSociosLayout);
        PanelSociosLayout.setHorizontalGroup(
            PanelSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        PanelSociosLayout.setVerticalGroup(
            PanelSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        PanelDinamico.add(PanelSocios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2010, 1060, 670));

        Scroll.setViewportView(PanelDinamico);

        getContentPane().add(Scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 1060, 670));

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
            java.util.logging.Logger.getLogger(Interfaz_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BTN_cerrarSesion;
    public javax.swing.JButton BTN_eliminar_viajes;
    public javax.swing.JLabel BTN_gestionAdmins;
    public javax.swing.JLabel BTN_gestionTerminales;
    public javax.swing.JLabel BTN_gestionViajes;
    public javax.swing.JButton BTN_guardar_Terminales;
    public javax.swing.JButton BTN_guardar_viajes;
    public javax.swing.JButton BTN_img_referencial;
    public javax.swing.JLabel BTN_infoSocios;
    public javax.swing.JButton BTN_nuevo_viajes;
    public javax.swing.JPanel BarraLateral;
    public javax.swing.JPanel BarraSuperior;
    public javax.swing.JComboBox<String> CBestadoTerminal;
    public javax.swing.JComboBox<String> CBviaje_terminal_llegada;
    public javax.swing.JComboBox<String> CBviaje_terminal_salida;
    public javax.swing.JLabel LBL_img_referencial;
    public javax.swing.JLabel LBLadministrador;
    public javax.swing.JLabel LBLfecha;
    public javax.swing.JLabel LBLhora;
    public javax.swing.JLabel Logo;
    public javax.swing.JPanel PanelAdministradores;
    public javax.swing.JPanel PanelDinamico;
    public javax.swing.JPanel PanelSocios;
    public javax.swing.JPanel PanelTerminales;
    public javax.swing.JPanel PanelTiempo;
    public javax.swing.JPanel PanelViajes;
    public javax.swing.JSpinner SPNviaje_fecha_llegada;
    public javax.swing.JSpinner SPNviaje_fecha_salida;
    public javax.swing.JSpinner SPNviaje_precio;
    public javax.swing.JScrollPane Scroll;
    public javax.swing.JTable TBLadministradores;
    public javax.swing.JTable TBLterminales;
    public javax.swing.JTable TBLviajes;
    public javax.swing.JTextField TXTcodigoTerminal;
    public javax.swing.JTextField TXTcodigoTerminal1;
    public javax.swing.JTextField TXTcodigoTerminal2;
    public javax.swing.JTextField TXTdireccionTerminal;
    public javax.swing.JTextField TXTdireccionTerminal1;
    public javax.swing.JTextField TXTdireccionTerminal2;
    public javax.swing.JTextField TXTnombreTerminal;
    public javax.swing.JTextField TXTnombreTerminal1;
    public javax.swing.JTextField TXTnombreTerminal2;
    public javax.swing.JTextField TXTviaje_codigo;
    public javax.swing.JTextField TXTviaje_distancia;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}