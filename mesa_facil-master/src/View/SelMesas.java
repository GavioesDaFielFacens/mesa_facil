
package view;

import Classes.Cliente;
import Classes.Mesa;
import Conexao.MySQL;
import javax.swing.JList;
import javax.swing.JOptionPane;


public class SelMesas extends javax.swing.JFrame {
    Mesa mesa = new Mesa(); 
    MySQL conectar = new MySQL();
    
    public SelMesas() {
        initComponents();
    }

    public void CadastrarMesa(Mesa mesa){
        this.conectar.conectaBanco();
        
        mesa.setQtdLugares((String) list_qtd_lugares.getSelectedItem());
        mesa.setObs(txtObservacoes_Sel.getText());
        mesa.setNumMesa((String) cbxNumMesa.getSelectedItem());
        
        try{
            this.conectar.insertSQL("INSERT INTO Mesas ("
                    + "qtdLugares,"
                    + "numMesa,"
                    + "obs"        
                  +") VALUES ("
                    + "'" + mesa.getQtdLugares()+ "',"
                    + "'" + mesa.getNumMesa()+ "',"
                    + "'" + mesa.getObs() + "'"
                + ");");
        }catch (Exception e){
            System.out.println("Erro ao cadastrar mesa" + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar mesa!");
        }finally{
            this.conectar.fechaBanco();
            JOptionPane.showMessageDialog(null, "Mesa reservada com sucesso!");
        }
            
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnCadastrar_Sel = new javax.swing.JButton();
        btnVoltar_sel = new javax.swing.JButton();
        lbl_voltar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtObservacoes_Sel = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbxNumMesa = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        list_qtd_lugares = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnCadastrar_Sel1 = new javax.swing.JButton();
        btnVoltar_sel1 = new javax.swing.JButton();
        lbl_voltar1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtObservacoes_Sel1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        list_qtd_lugares1 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(116, 2, 2));
        jPanel1.setToolTipText("");
        jPanel1.setName(""); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCadastrar_Sel.setBackground(new java.awt.Color(116, 2, 2));
        btnCadastrar_Sel.setFont(new java.awt.Font("Candara", 0, 36)); // NOI18N
        btnCadastrar_Sel.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar_Sel.setText("Cadastrar");
        btnCadastrar_Sel.setBorderPainted(false);
        btnCadastrar_Sel.setContentAreaFilled(false);
        btnCadastrar_Sel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCadastrar_Sel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastrar_SelMouseClicked(evt);
            }
        });
        btnCadastrar_Sel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrar_SelActionPerformed(evt);
            }
        });
        jPanel2.add(btnCadastrar_Sel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 320, 90));

        btnVoltar_sel.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltar_sel.setFont(new java.awt.Font("Candara", 0, 36)); // NOI18N
        btnVoltar_sel.setForeground(new java.awt.Color(116, 2, 2));
        btnVoltar_sel.setText("Voltar");
        btnVoltar_sel.setBorder(null);
        btnVoltar_sel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVoltar_sel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar_selActionPerformed(evt);
            }
        });
        jPanel2.add(btnVoltar_sel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 320, 60));

        lbl_voltar.setForeground(new java.awt.Color(116, 2, 2));
        lbl_voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/VOLTAR.png"))); // NOI18N
        lbl_voltar.setToolTipText("");
        lbl_voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(lbl_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/PROXIMO.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 930, 130));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo2.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 340));

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("Observações para a mesa");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, -1));

        txtObservacoes_Sel.setBackground(new java.awt.Color(255, 255, 255));
        txtObservacoes_Sel.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        txtObservacoes_Sel.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtObservacoes_Sel.setToolTipText("");
        txtObservacoes_Sel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtObservacoes_Sel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtObservacoes_SelActionPerformed(evt);
            }
        });
        jPanel1.add(txtObservacoes_Sel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 480, 140));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/OBS.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 510, -1));

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Reservante ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, -1, -1));

        cbxNumMesa.setBackground(new java.awt.Color(255, 255, 255));
        cbxNumMesa.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        cbxNumMesa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mesa 01", "Mesa 02", "Mesa 03", "Mesa 04", " " }));
        jPanel1.add(cbxNumMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, 190, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/QTD.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, -1, -1));

        list_qtd_lugares.setBackground(new java.awt.Color(255, 255, 255));
        list_qtd_lugares.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        list_qtd_lugares.setForeground(new java.awt.Color(153, 153, 153));
        list_qtd_lugares.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 lugar\t", "2 lugares", "3 lugares", "4 lugares", "5 lugares", "6 lugares", "7 lugares", "8 lugares", " " }));
        list_qtd_lugares.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        list_qtd_lugares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_qtd_lugaresActionPerformed(evt);
            }
        });
        jPanel1.add(list_qtd_lugares, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 190, 40));

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Quantidade de lugares");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/QTD.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        jPanel3.setBackground(new java.awt.Color(116, 2, 2));
        jPanel3.setToolTipText("");
        jPanel3.setName(""); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCadastrar_Sel1.setBackground(new java.awt.Color(116, 2, 2));
        btnCadastrar_Sel1.setFont(new java.awt.Font("Candara", 0, 36)); // NOI18N
        btnCadastrar_Sel1.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar_Sel1.setText("Cadastrar");
        btnCadastrar_Sel1.setBorderPainted(false);
        btnCadastrar_Sel1.setContentAreaFilled(false);
        btnCadastrar_Sel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCadastrar_Sel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastrar_Sel1MouseClicked(evt);
            }
        });
        btnCadastrar_Sel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrar_Sel1ActionPerformed(evt);
            }
        });
        jPanel4.add(btnCadastrar_Sel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 320, 90));

        btnVoltar_sel1.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltar_sel1.setFont(new java.awt.Font("Candara", 0, 36)); // NOI18N
        btnVoltar_sel1.setForeground(new java.awt.Color(116, 2, 2));
        btnVoltar_sel1.setText("Voltar");
        btnVoltar_sel1.setBorderPainted(false);
        btnVoltar_sel1.setContentAreaFilled(false);
        btnVoltar_sel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVoltar_sel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar_sel1ActionPerformed(evt);
            }
        });
        jPanel4.add(btnVoltar_sel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 320, 90));

        lbl_voltar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/VOLTAR.png"))); // NOI18N
        jPanel4.add(lbl_voltar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/PROXIMO.png"))); // NOI18N
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, -1, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 930, 130));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo2.png"))); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 340));

        jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Especificações da Mesa");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 450, 100));

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("Observações para a mesa");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, -1));

        txtObservacoes_Sel1.setBackground(new java.awt.Color(255, 255, 255));
        txtObservacoes_Sel1.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        txtObservacoes_Sel1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtObservacoes_Sel1.setToolTipText("");
        txtObservacoes_Sel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtObservacoes_Sel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtObservacoes_Sel1ActionPerformed(evt);
            }
        });
        jPanel3.add(txtObservacoes_Sel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 480, 140));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/OBS.png"))); // NOI18N
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 510, -1));

        jLabel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setText("Reservante ");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/QTD.png"))); // NOI18N
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, -1, -1));

        list_qtd_lugares1.setBackground(new java.awt.Color(255, 255, 255));
        list_qtd_lugares1.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        list_qtd_lugares1.setForeground(new java.awt.Color(153, 153, 153));
        list_qtd_lugares1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 lugar\t", "2 lugares", "3 lugares", "4 lugares", "5 lugares", "6 lugares", "7 lugares", "8 lugares", " " }));
        list_qtd_lugares1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        list_qtd_lugares1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_qtd_lugares1ActionPerformed(evt);
            }
        });
        jPanel3.add(list_qtd_lugares1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 160, 40));

        jLabel18.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 153, 153));
        jLabel18.setText("Quantidade de lugares");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/QTD.png"))); // NOI18N
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void list_qtd_lugaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_qtd_lugaresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_list_qtd_lugaresActionPerformed

    private void txtObservacoes_SelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtObservacoes_SelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtObservacoes_SelActionPerformed

    private void btnCadastrar_SelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrar_SelActionPerformed
        CadastrarMesa(mesa);
    }//GEN-LAST:event_btnCadastrar_SelActionPerformed

    private void btnCadastrar_SelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrar_SelMouseClicked
        
    }//GEN-LAST:event_btnCadastrar_SelMouseClicked

    private void btnCadastrar_Sel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrar_Sel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrar_Sel1MouseClicked

    private void btnCadastrar_Sel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrar_Sel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrar_Sel1ActionPerformed

    private void btnVoltar_sel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar_sel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVoltar_sel1ActionPerformed

    private void txtObservacoes_Sel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtObservacoes_Sel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtObservacoes_Sel1ActionPerformed

    private void list_qtd_lugares1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_qtd_lugares1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_list_qtd_lugares1ActionPerformed

    private void btnVoltar_selActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar_selActionPerformed
//                MesasD mesa = new MesasD();
//                mesa.show();
//                dispose();
        
    }//GEN-LAST:event_btnVoltar_selActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(SelMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelMesas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar_Sel;
    private javax.swing.JButton btnCadastrar_Sel1;
    private javax.swing.JButton btnVoltar_sel;
    private javax.swing.JButton btnVoltar_sel1;
    private javax.swing.JComboBox<String> cbxNumMesa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbl_voltar;
    private javax.swing.JLabel lbl_voltar1;
    private javax.swing.JComboBox<String> list_qtd_lugares;
    private javax.swing.JComboBox<String> list_qtd_lugares1;
    private javax.swing.JTextField txtObservacoes_Sel;
    private javax.swing.JTextField txtObservacoes_Sel1;
    // End of variables declaration//GEN-END:variables
}
