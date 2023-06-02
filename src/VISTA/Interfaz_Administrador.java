
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
        PanelDinamico = new javax.swing.JPanel();

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

        PanelDinamico.setBackground(new java.awt.Color(153, 153, 153));
        PanelDinamico.setPreferredSize(new java.awt.Dimension(1060, 670));

        javax.swing.GroupLayout PanelDinamicoLayout = new javax.swing.GroupLayout(PanelDinamico);
        PanelDinamico.setLayout(PanelDinamicoLayout);
        PanelDinamicoLayout.setHorizontalGroup(
            PanelDinamicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        PanelDinamicoLayout.setVerticalGroup(
            PanelDinamicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        getContentPane().add(PanelDinamico, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

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
    public javax.swing.JLabel BTN_gestionAdmins;
    public javax.swing.JLabel BTN_gestionTerminales;
    public javax.swing.JLabel BTN_gestionViajes;
    public javax.swing.JLabel BTN_infoSocios;
    public javax.swing.JPanel BarraLateral;
    public javax.swing.JPanel BarraSuperior;
    public javax.swing.JLabel LBLadministrador;
    public javax.swing.JLabel LBLfecha;
    public javax.swing.JLabel LBLhora;
    public javax.swing.JLabel Logo;
    public javax.swing.JPanel PanelDinamico;
    public javax.swing.JPanel PanelTiempo;
    public javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
