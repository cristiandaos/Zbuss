
package VISTA;

public class Interfaz_Principal extends javax.swing.JFrame {

    public Interfaz_Principal() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelPersonalizado1 = new org.netbeans.modules.form.InvalidComponent();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        panelPersonalizado2 = new org.netbeans.modules.form.InvalidComponent();
        Barra = new javax.swing.JPanel();
        BTN_cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(18, 18, 18));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPersonalizado1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Usuario");
        panelPersonalizado1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 80, 30));

        jLabel2.setOpaque(true);
        panelPersonalizado1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 32, 32));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Rol");
        panelPersonalizado1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 120, 30));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("jLabel4");
        panelPersonalizado1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 180, 50));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("jLabel5");
        panelPersonalizado1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 180, 50));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("jLabel6");
        panelPersonalizado1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 170, 50));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("jLabel4");
        panelPersonalizado1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 180, 50));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("jLabel5");
        jLabel8.setToolTipText("");
        panelPersonalizado1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 180, 50));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("jLabel6");
        panelPersonalizado1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 190, 50));

        jPanel1.add(panelPersonalizado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 680));

        panelPersonalizado2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(panelPersonalizado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 1070, 680));
        panelPersonalizado2.getAccessibleContext().setAccessibleParent(panelPersonalizado1);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1280, 680));

        Barra.setBackground(new java.awt.Color(18, 18, 18));
        getContentPane().add(Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 40));

        BTN_cerrar.setBackground(new java.awt.Color(18, 18, 18));
        BTN_cerrar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        BTN_cerrar.setForeground(new java.awt.Color(255, 255, 255));
        BTN_cerrar.setText("X");
        BTN_cerrar.setBorderPainted(false);
        BTN_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_cerrar.setFocusable(false);
        getContentPane().add(BTN_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 0, 60, 40));

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
    public javax.swing.JButton BTN_cerrar;
    public javax.swing.JPanel Barra;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    public org.netbeans.modules.form.InvalidComponent panelPersonalizado1;
    public org.netbeans.modules.form.InvalidComponent panelPersonalizado2;
    // End of variables declaration//GEN-END:variables
}
