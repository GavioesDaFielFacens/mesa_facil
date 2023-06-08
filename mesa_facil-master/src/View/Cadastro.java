
package view;
import Classes.Cliente;
import Conexao.MySQL;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Cadastro extends javax.swing.JFrame {
    MySQL conectar = new MySQL();
    Cliente cliente = new Cliente();

    
    public Cadastro() {
        initComponents();

    }
    
    
     public void cadastraUsuario(Cliente cliente){
        this.conectar.conectaBanco();
        
        cliente.setNome(txtNome_cad.getText());
        cliente.setSenha(txtSenha_cad.getText());
        cliente.setEmail(txtEmail_cad.getText());
        
        
        try{
            this.conectar.insertSQL("INSERT INTO Usuario ("
                    + "nome,"
                    + "senha,"
                    + "email"
                  +") VALUES ("
                    + "'" + cliente.getNome() + "',"
                    + "'" + cliente.getSenha() + "',"
                    + "'" + cliente.getEmail() + "'"
                + ");");
        }catch (Exception e){
            System.out.println("Erro ao cadastrar usuario" + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar usuario!");
        } finally{
            this.conectar.fechaBanco();
            JOptionPane.showMessageDialog(null, "Usuario Cadastrado com sucesso!");
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnEntrar_cad = new javax.swing.JButton();
        labEntrar_cad = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEmail_cad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtSenha_cad = new javax.swing.JPasswordField();
        txtNome_cad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnCadastrar_cad = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(116, 2, 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("de volta!");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 299, -1));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bem-vindo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 299, -1));

        jLabel3.setFont(new java.awt.Font("Candara Light", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Para se manter conectado,");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jLabel4.setFont(new java.awt.Font("Candara Light", 0, 24)); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 680, -1, -1));

        jLabel5.setFont(new java.awt.Font("Candara Light", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("por favor.");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, -1, -1));

        jLabel6.setFont(new java.awt.Font("Candara Light", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("entre com as suas credenciais");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        btnEntrar_cad.setBackground(new java.awt.Color(116, 2, 2));
        btnEntrar_cad.setFont(new java.awt.Font("Candara", 0, 36)); // NOI18N
        btnEntrar_cad.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar_cad.setText("ENTRAR");
        btnEntrar_cad.setBorder(null);
        btnEntrar_cad.setContentAreaFilled(false);
        btnEntrar_cad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEntrar_cad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrar_cadActionPerformed(evt);
            }
        });
        jPanel1.add(btnEntrar_cad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, -1, 50));

        labEntrar_cad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ENTRAR1.png"))); // NOI18N
        jPanel1.add(labEntrar_cad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 280, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 370, 570));

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(116, 2, 2));
        jLabel7.setText("Cadastre-se!");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 322, -1));

        txtEmail_cad.setBackground(new java.awt.Color(227, 203, 203));
        txtEmail_cad.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        txtEmail_cad.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtEmail_cad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmail_cadActionPerformed(evt);
            }
        });
        jPanel2.add(txtEmail_cad, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 230, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/EMAIL.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, -1, -1));

        txtSenha_cad.setBackground(new java.awt.Color(227, 203, 203));
        txtSenha_cad.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        txtSenha_cad.setForeground(new java.awt.Color(0, 0, 0));
        txtSenha_cad.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtSenha_cad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenha_cadActionPerformed(evt);
            }
        });
        jPanel2.add(txtSenha_cad, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, 230, 40));

        txtNome_cad.setBackground(new java.awt.Color(227, 203, 203));
        txtNome_cad.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        txtNome_cad.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNome_cad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNome_cadActionPerformed(evt);
            }
        });
        jPanel2.add(txtNome_cad, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 230, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/NOME.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/SENHA.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, -1, -1));

        btnCadastrar_cad.setFont(new java.awt.Font("Candara", 0, 36)); // NOI18N
        btnCadastrar_cad.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar_cad.setText("CADASTRAR");
        btnCadastrar_cad.setBorder(null);
        btnCadastrar_cad.setBorderPainted(false);
        btnCadastrar_cad.setContentAreaFilled(false);
        btnCadastrar_cad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCadastrar_cad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrar_cadActionPerformed(evt);
            }
        });
        jPanel2.add(btnCadastrar_cad, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 490, 290, -1));

        jLabel11.setFont(new java.awt.Font("Candara", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/CADASTRAR_1.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1028, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmail_cadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmail_cadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmail_cadActionPerformed

    private void txtNome_cadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNome_cadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNome_cadActionPerformed

    private void txtSenha_cadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenha_cadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenha_cadActionPerformed

    private void btnCadastrar_cadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrar_cadActionPerformed
        cadastraUsuario(cliente);
    }//GEN-LAST:event_btnCadastrar_cadActionPerformed

   
 
    private void btnEntrar_cadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrar_cadActionPerformed
        Login log = new Login();
               log.show();
               
               dispose();
    }//GEN-LAST:event_btnEntrar_cadActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar_cad;
    private javax.swing.JButton btnEntrar_cad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labEntrar_cad;
    private javax.swing.JTextField txtEmail_cad;
    private javax.swing.JTextField txtNome_cad;
    private javax.swing.JPasswordField txtSenha_cad;
    // End of variables declaration//GEN-END:variables
}
