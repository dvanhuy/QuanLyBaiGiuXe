/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jForm;

import define.User;
import java.awt.CardLayout;
import java.awt.Color;

/**
 *
 * @author ADMIN
 */
public class MainTest extends javax.swing.JFrame {

    User user;
    int luuchon;
    public MainTest() {
        initComponents();
        user= new User();
        user.setChucVu("Admin");
        user.setHoTen("Admin");
        container.setLayout(new CardLayout());
        container.add(new QuanLyXePanel(user));
    }

    public MainTest(User userkh) {
        initComponents();
        user= new User(userkh);
        container.setLayout(new CardLayout());
        container.add(new QuanLyXePanel(user));
        
        if (userkh.getChucVu().equals("User"))
        {
            quanLyNhanVienLabel.setText("Quản lý thông tin");
        }
        luuchon=1;
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        quanLyXePanel = new javax.swing.JPanel();
        quanLyXeLabel = new javax.swing.JLabel();
        quanLyNhanVienPanel = new javax.swing.JPanel();
        quanLyNhanVienLabel = new javax.swing.JLabel();
        thongKePanel = new javax.swing.JPanel();
        thongKeLabel = new javax.swing.JLabel();
        helpPanel = new javax.swing.JPanel();
        helpLabel = new javax.swing.JLabel();
        btnlogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Bãi Đỗ Xe");
        setBackground(new java.awt.Color(102, 102, 102));

        container.setBackground(new java.awt.Color(255, 102, 0));
        container.setPreferredSize(new java.awt.Dimension(1030, 844));

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 947, Short.MAX_VALUE)
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        kGradientPanel1.setkEndColor(new java.awt.Color(102, 102, 102));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 102, 102));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(268, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/caravan logo.png"))); // NOI18N

        quanLyXePanel.setBackground(new java.awt.Color(102, 102, 102));
        quanLyXePanel.setForeground(new java.awt.Color(255, 255, 255));
        quanLyXePanel.setPreferredSize(new java.awt.Dimension(213, 70));
        quanLyXePanel.setRequestFocusEnabled(false);
        quanLyXePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quanLyXePanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                quanLyXePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                quanLyXePanelMouseExited(evt);
            }
        });

        quanLyXeLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        quanLyXeLabel.setForeground(new java.awt.Color(255, 255, 255));
        quanLyXeLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        quanLyXeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/car.png"))); // NOI18N
        quanLyXeLabel.setText("Quản lý xe");

        javax.swing.GroupLayout quanLyXePanelLayout = new javax.swing.GroupLayout(quanLyXePanel);
        quanLyXePanel.setLayout(quanLyXePanelLayout);
        quanLyXePanelLayout.setHorizontalGroup(
            quanLyXePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quanLyXePanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(quanLyXeLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        quanLyXePanelLayout.setVerticalGroup(
            quanLyXePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quanLyXePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(quanLyXeLabel)
                .addContainerGap())
        );

        quanLyNhanVienPanel.setBackground(new java.awt.Color(102, 102, 102));
        quanLyNhanVienPanel.setForeground(new java.awt.Color(0, 204, 0));
        quanLyNhanVienPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quanLyNhanVienPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                quanLyNhanVienPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                quanLyNhanVienPanelMouseExited(evt);
            }
        });

        quanLyNhanVienLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        quanLyNhanVienLabel.setForeground(new java.awt.Color(255, 255, 255));
        quanLyNhanVienLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        quanLyNhanVienLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/users.png"))); // NOI18N
        quanLyNhanVienLabel.setText("Quản lý nhân viên");

        javax.swing.GroupLayout quanLyNhanVienPanelLayout = new javax.swing.GroupLayout(quanLyNhanVienPanel);
        quanLyNhanVienPanel.setLayout(quanLyNhanVienPanelLayout);
        quanLyNhanVienPanelLayout.setHorizontalGroup(
            quanLyNhanVienPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quanLyNhanVienPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(quanLyNhanVienLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        quanLyNhanVienPanelLayout.setVerticalGroup(
            quanLyNhanVienPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quanLyNhanVienPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(quanLyNhanVienLabel)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        thongKePanel.setBackground(new java.awt.Color(102, 102, 102));
        thongKePanel.setForeground(new java.awt.Color(0, 204, 0));
        thongKePanel.setPreferredSize(new java.awt.Dimension(213, 70));
        thongKePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thongKePanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                thongKePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                thongKePanelMouseExited(evt);
            }
        });

        thongKeLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        thongKeLabel.setForeground(new java.awt.Color(255, 255, 255));
        thongKeLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        thongKeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/thongKe.png"))); // NOI18N
        thongKeLabel.setText("Thống kê");

        javax.swing.GroupLayout thongKePanelLayout = new javax.swing.GroupLayout(thongKePanel);
        thongKePanel.setLayout(thongKePanelLayout);
        thongKePanelLayout.setHorizontalGroup(
            thongKePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thongKePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(thongKeLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        thongKePanelLayout.setVerticalGroup(
            thongKePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, thongKePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(thongKeLabel)
                .addContainerGap())
        );

        helpPanel.setBackground(new java.awt.Color(102, 102, 102));
        helpPanel.setPreferredSize(new java.awt.Dimension(213, 70));
        helpPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                helpPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                helpPanelMouseExited(evt);
            }
        });

        helpLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        helpLabel.setForeground(new java.awt.Color(255, 255, 255));
        helpLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        helpLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/help.png"))); // NOI18N
        helpLabel.setText("Trợ giúp");

        javax.swing.GroupLayout helpPanelLayout = new javax.swing.GroupLayout(helpPanel);
        helpPanel.setLayout(helpPanelLayout);
        helpPanelLayout.setHorizontalGroup(
            helpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(helpLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        helpPanelLayout.setVerticalGroup(
            helpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(helpLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnlogout.setBackground(new java.awt.Color(255, 51, 51));
        btnlogout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout.png"))); // NOI18N
        btnlogout.setText("Đăng xuất");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("VEHICLE PARKING");

        jLabel3.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MANAGER");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(quanLyXePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addComponent(quanLyNhanVienPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(thongKePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addComponent(helpPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
                .addGap(0, 2, Short.MAX_VALUE))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnlogout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(15, 15, 15)
                .addComponent(quanLyXePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(quanLyNhanVienPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(thongKePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(helpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(btnlogout)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, 947, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                    .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void quanLyXePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quanLyXePanelMouseClicked
        // TODO add your handling code here:
        container.removeAll();
        container.setLayout(new CardLayout());
        container.add(new QuanLyXePanel(user));
        container.validate();
        container.repaint();
        
        //chuyen mau
        luuchon=1;
        quanLyXePanel.setBackground(new Color(0,204,204));
        quanLyNhanVienPanel.setBackground(new Color(102,102,102));
        helpPanel.setBackground(new Color(102,102,102));
        thongKePanel.setBackground(new Color(102,102,102));

    }//GEN-LAST:event_quanLyXePanelMouseClicked

    private void quanLyXePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quanLyXePanelMouseEntered
        // TODO add your handling code here:
        quanLyXePanel.setBackground(new Color(0,204,204));
    }//GEN-LAST:event_quanLyXePanelMouseEntered

    private void quanLyXePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quanLyXePanelMouseExited
        // TODO add your handling code here:
        if (luuchon != 1)
        {
            quanLyXePanel.setBackground(new Color(102,102,102));
        }
    }//GEN-LAST:event_quanLyXePanelMouseExited

    private void quanLyNhanVienPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quanLyNhanVienPanelMouseClicked
        // TODO add your handling code here:
        container.removeAll();
        container.setLayout(new CardLayout());
        if (user.getChucVu().equals("Admin"))
        {
            container.add(new QuanLyNhanVienPanel());
        }
        else 
        {
            container.add(new QuanLyThongTinPanel());
        }
        container.validate();
        container.repaint();
        //chuyen mau
        
        luuchon=2;
        quanLyXePanel.setBackground(new Color(102,102,102));
        quanLyNhanVienPanel.setBackground(new Color(0,204,204));
        helpPanel.setBackground(new Color(102,102,102));
        thongKePanel.setBackground(new Color(102,102,102));
        
        
    }//GEN-LAST:event_quanLyNhanVienPanelMouseClicked

    private void quanLyNhanVienPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quanLyNhanVienPanelMouseEntered
        // TODO add your handling code here:
        quanLyNhanVienPanel.setBackground(new Color(0,204,204));
    }//GEN-LAST:event_quanLyNhanVienPanelMouseEntered

    private void quanLyNhanVienPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quanLyNhanVienPanelMouseExited
        // TODO add your handling code here:
        if (luuchon != 2)
        {
            quanLyNhanVienPanel.setBackground(new Color(102,102,102));
        }
    }//GEN-LAST:event_quanLyNhanVienPanelMouseExited

    private void thongKePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thongKePanelMouseClicked
        // TODO add your handling code here:
        container.removeAll();
        container.setLayout(new CardLayout());
        container.add(new ThongKePanel());
        container.validate();
        container.repaint();
        
        //chuyen mau
        luuchon=3;
        quanLyXePanel.setBackground(new Color(102,102,102));
        quanLyNhanVienPanel.setBackground(new Color(102,102,102));
        helpPanel.setBackground(new Color(102,102,102));
        thongKePanel.setBackground(new Color(0,204,204));
        
    }//GEN-LAST:event_thongKePanelMouseClicked

    private void thongKePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thongKePanelMouseEntered
        // TODO add your handling code here:
        thongKePanel.setBackground(new Color(0,204,204));
    }//GEN-LAST:event_thongKePanelMouseEntered

    private void thongKePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thongKePanelMouseExited
        // TODO add your handling code here:
        if (luuchon != 3)
        {
            thongKePanel.setBackground(new Color(102,102,102));
        }
    }//GEN-LAST:event_thongKePanelMouseExited

    private void helpPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpPanelMouseClicked
        // TODO add your handling code here:
        container.removeAll();
        container.setLayout(new CardLayout());
        container.add(new HelpPanel());
        container.validate();
        container.repaint();
        
        //chuỵenmau
        luuchon=4;
        quanLyXePanel.setBackground(new Color(102,102,102));
        quanLyNhanVienPanel.setBackground(new Color(102,102,102));
        helpPanel.setBackground(new Color(0,204,204));
        thongKePanel.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_helpPanelMouseClicked

    private void helpPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpPanelMouseEntered
        // TODO add your handling code here:
        helpPanel.setBackground(new Color(0,204,204));
    }//GEN-LAST:event_helpPanelMouseEntered

    private void helpPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpPanelMouseExited
        // TODO add your handling code here:
        if (luuchon != 4)
        {
            helpPanel.setBackground(new Color(102,102,102));
        }
        
    }//GEN-LAST:event_helpPanelMouseExited

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
        new LogInFrameTest().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnlogoutActionPerformed

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
            java.util.logging.Logger.getLogger(MainTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogout;
    private javax.swing.JPanel container;
    private javax.swing.JLabel helpLabel;
    private javax.swing.JPanel helpPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel quanLyNhanVienLabel;
    private javax.swing.JPanel quanLyNhanVienPanel;
    private javax.swing.JLabel quanLyXeLabel;
    private javax.swing.JPanel quanLyXePanel;
    private javax.swing.JLabel thongKeLabel;
    private javax.swing.JPanel thongKePanel;
    // End of variables declaration//GEN-END:variables
}