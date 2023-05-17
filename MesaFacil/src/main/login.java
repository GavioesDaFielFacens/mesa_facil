
package main;


public class login extends javax.swing.JFrame {

    
    public login() {
        initComponents();
          
     
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCadastrar_log = new javax.swing.JButton();
        labEntrar_cad = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNome_log = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtSenha_log = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        btnEntrar_log = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(855, 570));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(116, 2, 2));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bem-vindo");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 299, -1));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("de volta!");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 299, -1));

        jLabel3.setFont(new java.awt.Font("Candara Light", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Para se manter conectado,");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Candara Light", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("sempre atualizado das");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        jLabel5.setFont(new java.awt.Font("Candara Light", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("melhores reservas!");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        btnCadastrar_log.setBackground(new java.awt.Color(116, 2, 2));
        btnCadastrar_log.setFont(new java.awt.Font("Candara", 0, 36)); // NOI18N
        btnCadastrar_log.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar_log.setText("CADASTRAR");
        btnCadastrar_log.setBorder(null);
        btnCadastrar_log.setContentAreaFilled(false);
        btnCadastrar_log.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar_log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrar_logActionPerformed(evt);
            }
        });
        jPanel3.add(btnCadastrar_log, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 250, 50));

        labEntrar_cad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ENTRAR1.png"))); // NOI18N
        jPanel3.add(labEntrar_cad, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 280, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 370, 570));
        jPanel3.getAccessibleContext().setAccessibleName("");

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(116, 2, 2));
        jLabel7.setText("Entrar");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 160, -1));

        txtNome_log.setBackground(new java.awt.Color(227, 203, 203));
        txtNome_log.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        txtNome_log.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNome_log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNome_logActionPerformed(evt);
            }
        });
        jPanel1.add(txtNome_log, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 230, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/NOME.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        txtSenha_log.setBackground(new java.awt.Color(227, 203, 203));
        txtSenha_log.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        txtSenha_log.setForeground(new java.awt.Color(0, 0, 0));
        txtSenha_log.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtSenha_log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenha_logActionPerformed(evt);
            }
        });
        jPanel1.add(txtSenha_log, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 230, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/SENHA.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, -1));

        btnEntrar_log.setFont(new java.awt.Font("Candara", 0, 36)); // NOI18N
        btnEntrar_log.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar_log.setText("ENTRAR");
        btnEntrar_log.setBorder(null);
        btnEntrar_log.setBorderPainted(false);
        btnEntrar_log.setContentAreaFilled(false);
        btnEntrar_log.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar_log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrar_logActionPerformed(evt);
            }
        });
        jPanel1.add(btnEntrar_log, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 280, 60));

        jLabel11.setFont(new java.awt.Font("Candara", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/CADASTRAR_1.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, -1, -1));

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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrar_logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrar_logActionPerformed
               cadastro cad = new cadastro();
               cad.show();
               
               dispose();
               
    }//GEN-LAST:event_btnCadastrar_logActionPerformed

    private void txtNome_logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNome_logActionPerformed
        
    }//GEN-LAST:event_txtNome_logActionPerformed

    private void txtSenha_logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenha_logActionPerformed
        
    }//GEN-LAST:event_txtSenha_logActionPerformed

    private void btnEntrar_logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrar_logActionPerformed
        
    }//GEN-LAST:event_btnEntrar_logActionPerformed

  
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar_log;
    private javax.swing.JButton btnEntrar_log;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labEntrar_cad;
    private javax.swing.JTextField txtNome_log;
    private javax.swing.JPasswordField txtSenha_log;
    // End of variables declaration//GEN-END:variables


}
