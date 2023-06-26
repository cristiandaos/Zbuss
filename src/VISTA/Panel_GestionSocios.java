
package VISTA;


public class Panel_GestionSocios extends javax.swing.JPanel {

    public Panel_GestionSocios() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        TBLsocios = new javax.swing.JTable();
        TXT_buscador = new javax.swing.JTextField();
        CB_buscador = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(16, 16, 16));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(123, 216, 80)));
        setPreferredSize(new java.awt.Dimension(1060, 560));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TBLsocios.setBackground(new java.awt.Color(12, 12, 12));
        TBLsocios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        TBLsocios.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        TBLsocios.setForeground(new java.awt.Color(255, 255, 255));
        TBLsocios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TBLsocios.setFocusable(false);
        TBLsocios.setGridColor(new java.awt.Color(255, 255, 255));
        TBLsocios.setRequestFocusEnabled(false);
        TBLsocios.setRowHeight(25);
        TBLsocios.setSelectionBackground(new java.awt.Color(51, 204, 0));
        TBLsocios.setSelectionForeground(new java.awt.Color(0, 0, 0));
        TBLsocios.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TBLsocios.setShowGrid(true);
        TBLsocios.getTableHeader().setResizingAllowed(false);
        TBLsocios.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(TBLsocios);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 900, 370));

        TXT_buscador.setBackground(new java.awt.Color(14, 14, 14));
        TXT_buscador.setForeground(new java.awt.Color(255, 255, 255));
        TXT_buscador.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        add(TXT_buscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 190, 30));

        CB_buscador.setBackground(new java.awt.Color(14, 14, 14));
        CB_buscador.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        CB_buscador.setForeground(new java.awt.Color(255, 255, 255));
        CB_buscador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "DNI", "Nombre", "Correo", "Número" }));
        CB_buscador.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        CB_buscador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CB_buscador.setFocusable(false);
        add(CB_buscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 160, 30));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> CB_buscador;
    public javax.swing.JTable TBLsocios;
    public javax.swing.JTextField TXT_buscador;
    public javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
