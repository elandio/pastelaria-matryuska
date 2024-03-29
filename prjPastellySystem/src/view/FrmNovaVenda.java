package view;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acessa
 */
public class FrmNovaVenda extends javax.swing.JFrame {

    private static FrmNovaVenda _instance = null;
    
    public static synchronized FrmNovaVenda getInstance() {
        if(_instance == null) {
            _instance = new FrmNovaVenda();
        }
        return _instance;
    }
    
    /**
     * Creates new form FrmNovaVenda
     */
    private FrmNovaVenda() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jtpNV = new javax.swing.JTabbedPane();
        pnlPrincipal = new javax.swing.JPanel();
        pnlMesaNV = new javax.swing.JPanel();
        lblCatNV = new javax.swing.JLabel();
        lblProdNV = new javax.swing.JLabel();
        lblQtdNV = new javax.swing.JLabel();
        btnAdcNV = new javax.swing.JButton();
        cmbCatNV = new javax.swing.JComboBox();
        cmbProdNV = new javax.swing.JComboBox();
        txtQtdNV = new javax.swing.JTextField();
        scpListaNV = new javax.swing.JScrollPane();
        txtaListaNV = new javax.swing.JTextArea();
        lblMesaNV = new javax.swing.JLabel();
        cmbMesaNV = new javax.swing.JComboBox();
        lblCliNV = new javax.swing.JLabel();
        cmbCliNV = new javax.swing.JComboBox();
        btnFecharMesaNV = new javax.swing.JButton();
        pnlBalcaoNV = new javax.swing.JPanel();
        lblCat2NV = new javax.swing.JLabel();
        lblProd2NV = new javax.swing.JLabel();
        lblQtd2NV = new javax.swing.JLabel();
        btnAdc2NV = new javax.swing.JButton();
        cmbCat2NV = new javax.swing.JComboBox();
        cmbProd2NV = new javax.swing.JComboBox();
        txtQtd2NV = new javax.swing.JTextField();
        scpLista2NV = new javax.swing.JScrollPane();
        txtaLista2NV = new javax.swing.JTextArea();
        btnConcNV = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nova Venda");

        lblCatNV.setText("CATEGORIA:");

        lblProdNV.setText("PRODUTO:");

        lblQtdNV.setText("QUANTIDADE:");

        btnAdcNV.setText("ADICIONAR À LISTAGEM");

        txtaListaNV.setColumns(20);
        txtaListaNV.setRows(5);
        scpListaNV.setViewportView(txtaListaNV);

        lblMesaNV.setText("MESA:");

        lblCliNV.setText("CLIENTE:");

        btnFecharMesaNV.setFont(new java.awt.Font("Tahoma", 1, 14));
        btnFecharMesaNV.setText("FECHAR MESA");
        btnFecharMesaNV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlMesaNVLayout = new javax.swing.GroupLayout(pnlMesaNV);
        pnlMesaNV.setLayout(pnlMesaNVLayout);
        pnlMesaNVLayout.setHorizontalGroup(
            pnlMesaNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMesaNVLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMesaNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scpListaNV, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
                    .addGroup(pnlMesaNVLayout.createSequentialGroup()
                        .addGroup(pnlMesaNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlMesaNVLayout.createSequentialGroup()
                                .addComponent(lblProdNV)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbProdNV, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAdcNV)
                            .addGroup(pnlMesaNVLayout.createSequentialGroup()
                                .addComponent(lblCatNV)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbCatNV, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlMesaNVLayout.createSequentialGroup()
                                .addComponent(lblQtdNV)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQtdNV, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblMesaNV)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbMesaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCliNV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlMesaNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbCliNV, 0, 466, Short.MAX_VALUE)
                            .addGroup(pnlMesaNVLayout.createSequentialGroup()
                                .addComponent(btnFecharMesaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 283, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        pnlMesaNVLayout.setVerticalGroup(
            pnlMesaNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMesaNVLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMesaNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCatNV)
                    .addComponent(cmbCatNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCliNV)
                    .addComponent(cmbCliNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMesaNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMesaNVLayout.createSequentialGroup()
                        .addGroup(pnlMesaNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProdNV)
                            .addComponent(cmbProdNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlMesaNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQtdNV)
                            .addComponent(txtQtdNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMesaNV)
                            .addComponent(cmbMesaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAdcNV))
                    .addComponent(btnFecharMesaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scpListaNV, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addComponent(pnlMesaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addComponent(pnlMesaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtpNV.addTab("Mesa", pnlPrincipal);

        lblCat2NV.setText("CATEGORIA:");

        lblProd2NV.setText("PRODUTO:");

        lblQtd2NV.setText("QUANTIDADE:");

        btnAdc2NV.setText("ADICIONAR À LISTAGEM");

        txtaLista2NV.setColumns(20);
        txtaLista2NV.setRows(5);
        scpLista2NV.setViewportView(txtaLista2NV);

        btnConcNV.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConcNV.setText("CONCLUIR");
        btnConcNV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlBalcaoNVLayout = new javax.swing.GroupLayout(pnlBalcaoNV);
        pnlBalcaoNV.setLayout(pnlBalcaoNVLayout);
        pnlBalcaoNVLayout.setHorizontalGroup(
            pnlBalcaoNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBalcaoNVLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBalcaoNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scpLista2NV, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlBalcaoNVLayout.createSequentialGroup()
                        .addGroup(pnlBalcaoNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlBalcaoNVLayout.createSequentialGroup()
                                .addComponent(lblProd2NV)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbProd2NV, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlBalcaoNVLayout.createSequentialGroup()
                                .addComponent(lblQtd2NV)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQtd2NV, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlBalcaoNVLayout.createSequentialGroup()
                                .addComponent(lblCat2NV)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbCat2NV, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnAdc2NV, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConcNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(365, 365, 365))
        );
        pnlBalcaoNVLayout.setVerticalGroup(
            pnlBalcaoNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBalcaoNVLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBalcaoNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBalcaoNVLayout.createSequentialGroup()
                        .addGroup(pnlBalcaoNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCat2NV)
                            .addComponent(cmbCat2NV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBalcaoNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProd2NV)
                            .addComponent(cmbProd2NV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBalcaoNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQtd2NV)
                            .addComponent(txtQtd2NV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAdc2NV))
                    .addComponent(btnConcNV, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scpLista2NV, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtpNV.addTab("Balcão", pnlBalcaoNV);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtpNV, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtpNV, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmNovaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmNovaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmNovaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmNovaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FrmNovaVenda().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdc2NV;
    private javax.swing.JButton btnAdcNV;
    private javax.swing.JButton btnConcNV;
    private javax.swing.JButton btnFecharMesaNV;
    private javax.swing.JComboBox cmbCat2NV;
    private javax.swing.JComboBox cmbCatNV;
    private javax.swing.JComboBox cmbCliNV;
    private javax.swing.JComboBox cmbMesaNV;
    private javax.swing.JComboBox cmbProd2NV;
    private javax.swing.JComboBox cmbProdNV;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JTabbedPane jtpNV;
    private javax.swing.JLabel lblCat2NV;
    private javax.swing.JLabel lblCatNV;
    private javax.swing.JLabel lblCliNV;
    private javax.swing.JLabel lblMesaNV;
    private javax.swing.JLabel lblProd2NV;
    private javax.swing.JLabel lblProdNV;
    private javax.swing.JLabel lblQtd2NV;
    private javax.swing.JLabel lblQtdNV;
    private javax.swing.JPanel pnlBalcaoNV;
    private javax.swing.JPanel pnlMesaNV;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JScrollPane scpLista2NV;
    private javax.swing.JScrollPane scpListaNV;
    private javax.swing.JTextField txtQtd2NV;
    private javax.swing.JTextField txtQtdNV;
    private javax.swing.JTextArea txtaLista2NV;
    private javax.swing.JTextArea txtaListaNV;
    // End of variables declaration//GEN-END:variables
}
