
package VISTA;


public class Panel_Asientos extends javax.swing.JPanel {

    public Panel_Asientos() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        BTN_anterior = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Buss = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        BTN_siguiente = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Z-Buss");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(123, 216, 80)));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 140, -1));

        BTN_anterior.setBackground(new java.awt.Color(204, 204, 204));
        BTN_anterior.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        BTN_anterior.setForeground(new java.awt.Color(0, 0, 0));
        BTN_anterior.setText("Anterior");
        BTN_anterior.setAlignmentX(0.5F);
        BTN_anterior.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BTN_anterior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_anterior.setFocusable(false);
        BTN_anterior.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(BTN_anterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 130, 30));

        jLabel1.setBackground(new java.awt.Color(0, 255, 0));
        jLabel1.setOpaque(true);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 30, 30));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Disponible");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 110, 30));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Ocupado");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 90, 30));

        Buss.setBackground(new java.awt.Color(51, 51, 51));

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Conductor");

        javax.swing.GroupLayout BussLayout = new javax.swing.GroupLayout(Buss);
        Buss.setLayout(BussLayout);
        BussLayout.setHorizontalGroup(
            BussLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BussLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel6)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        BussLayout.setVerticalGroup(
            BussLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BussLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(592, Short.MAX_VALUE))
        );

        add(Buss, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, 300, 620));

        jLabel7.setBackground(new java.awt.Color(255, 0, 0));
        jLabel7.setOpaque(true);
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 30, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("TERMINAL/PARADERO DE SALIDA Y LLEGADA");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 330, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("SALIDA");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("LLEGADA");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("HORARIO/LLEGADA");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("HORARIO/SALIDA");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Asientos Seleccionados(max 6):");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Precio:");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, -1, -1));

        jLabel15.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("S/0000");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, -1, -1));

        jLabel16.setBackground(new java.awt.Color(0, 0, 255));
        jLabel16.setOpaque(true);
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 30, 30));

        jLabel17.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Seleccionado");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 110, 30));

        BTN_siguiente.setBackground(new java.awt.Color(204, 204, 204));
        BTN_siguiente.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        BTN_siguiente.setForeground(new java.awt.Color(0, 0, 0));
        BTN_siguiente.setText("Siguiente");
        BTN_siguiente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BTN_siguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_siguiente.setFocusable(false);
        add(BTN_siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 600, 180, 30));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BTN_anterior;
    public javax.swing.JButton BTN_siguiente;
    public javax.swing.JPanel Buss;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel16;
    public javax.swing.JLabel jLabel17;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
