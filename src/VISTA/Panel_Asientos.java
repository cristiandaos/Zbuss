
package VISTA;


public class Panel_Asientos extends javax.swing.JPanel {

    public Panel_Asientos() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        BTN_cancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Buss = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Z-Buss");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(123, 216, 80)));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 140, -1));

        BTN_cancelar.setBackground(new java.awt.Color(255, 255, 255));
        BTN_cancelar.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        BTN_cancelar.setForeground(new java.awt.Color(0, 0, 0));
        BTN_cancelar.setText("Cancelar");
        BTN_cancelar.setAlignmentX(0.5F);
        BTN_cancelar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BTN_cancelar.setFocusable(false);
        BTN_cancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(BTN_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 120, -1));

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

        Buss.setBackground(new java.awt.Color(102, 102, 102));

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Conductor");

        javax.swing.GroupLayout BussLayout = new javax.swing.GroupLayout(Buss);
        Buss.setLayout(BussLayout);
        BussLayout.setHorizontalGroup(
            BussLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BussLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel6)
                .addContainerGap(114, Short.MAX_VALUE))
        );
        BussLayout.setVerticalGroup(
            BussLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BussLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(597, Short.MAX_VALUE))
        );

        add(Buss, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, 300, 620));

        jLabel7.setBackground(new java.awt.Color(255, 0, 0));
        jLabel7.setOpaque(true);
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 30, 30));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BTN_cancelar;
    public javax.swing.JPanel Buss;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
