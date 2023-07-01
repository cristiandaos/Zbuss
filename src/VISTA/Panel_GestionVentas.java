
package VISTA;


public class Panel_GestionVentas extends javax.swing.JPanel {


    public Panel_GestionVentas() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        TBLventas = new javax.swing.JTable();

        setBackground(new java.awt.Color(12, 12, 12));
        setPreferredSize(new java.awt.Dimension(1060, 670));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane4.setBorder(null);

        TBLventas.setBackground(new java.awt.Color(12, 12, 12));
        TBLventas.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        TBLventas.setForeground(new java.awt.Color(255, 255, 255));
        TBLventas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TBLventas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TBLventas.setFocusable(false);
        TBLventas.setGridColor(new java.awt.Color(255, 255, 255));
        TBLventas.setRequestFocusEnabled(false);
        TBLventas.setRowHeight(25);
        TBLventas.setSelectionBackground(new java.awt.Color(51, 204, 0));
        TBLventas.setSelectionForeground(new java.awt.Color(0, 0, 0));
        TBLventas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TBLventas.setShowGrid(false);
        TBLventas.getTableHeader().setResizingAllowed(false);
        TBLventas.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(TBLventas);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 900, 370));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable TBLventas;
    public javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
