/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jForm;

/**
 *
 * @author ADMIN
 */
public class ForgotPasswordFrame extends javax.swing.JFrame {

    /**
     * Creates new form ForgotPasswordFrame
     */
    public ForgotPasswordFrame() {
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

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        txtusername = new customcp.TextFieldCustom();
        txtpassword = new customcp.PasswordFieldCustom();
        txtpassword1 = new customcp.PasswordFieldCustom();
        btlogiin = new customcp.Buttonshine();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Forgot Password");

        txtusername.setToolTipText("Nhập tên tài khoản");
        txtusername.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtusername.setLabelText("User name");
        txtusername.setName(""); // NOI18N
        txtusername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtusernameKeyTyped(evt);
            }
        });

        txtpassword.setToolTipText("Nhập mật khẩu");
        txtpassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtpassword.setLabelText("New Password");
        txtpassword.setShowAndHide(true);
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        txtpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpasswordKeyTyped(evt);
            }
        });

        txtpassword1.setToolTipText("Nhập mật khẩu");
        txtpassword1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtpassword1.setLabelText("Confirm New Password");
        txtpassword1.setShowAndHide(true);
        txtpassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassword1ActionPerformed(evt);
            }
        });
        txtpassword1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpassword1KeyTyped(evt);
            }
        });

        btlogiin.setBackground(new java.awt.Color(51, 153, 255));
        btlogiin.setForeground(new java.awt.Color(255, 255, 255));
        btlogiin.setText("Back to Login");
        btlogiin.setEffectColor(new java.awt.Color(51, 209, 249));
        btlogiin.setFont(new java.awt.Font("STXinwei", 0, 18)); // NOI18N
        btlogiin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlogiinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(123, 123, 123))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtpassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtusername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtpassword1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btlogiin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtpassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btlogiin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtusernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusernameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameKeyTyped

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
        btlogiinActionPerformed(evt);
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void txtpasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordKeyTyped

    private void txtpassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassword1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassword1ActionPerformed

    private void txtpassword1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassword1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassword1KeyTyped

    private void btlogiinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlogiinActionPerformed
        // TODO add your handling code here:
        new LogInFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btlogiinActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private customcp.Buttonshine btlogiin;
    private javax.swing.JLabel jLabel1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private customcp.PasswordFieldCustom txtpassword;
    private customcp.PasswordFieldCustom txtpassword1;
    private customcp.TextFieldCustom txtusername;
    // End of variables declaration//GEN-END:variables
}
