/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frmQLTV;

import java.awt.Color;
import model.Nhanvien;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.NhanvienDao;

/**
 *
 * @author My PC
 */
public class frmDANGNHAP extends javax.swing.JFrame {

    /**
     * Creates new form frmDANGNHAP
     */
    List<Nhanvien> nvien = new ArrayList<>();

    public frmDANGNHAP() throws ClassNotFoundException, SQLException {
        initComponents();
        lblBR.setIcon(new ImageIcon(getClass().getResource("/BR/btdn1.jpg")));
        jpnBR.show(true);
        jPanel2.show(false);
        lblBR.setSize(391, 230);
        this.setSize(391, 230);
        setLocationRelativeTo(null);
        laydulieuNhanvien();
    }

    private void laydulieuNhanvien() throws ClassNotFoundException, SQLException {
        try {
            nvien = NhanvienDao.laydulieuNhanvien("");
        } catch (SQLException e) {
            System.out.println("Dữ liệu trống");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTAIKHOAN = new javax.swing.JTextField();
        txtMATKHAU = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        btnDANGNHAP = new javax.swing.JButton();
        btnDOIMK = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblLoad = new javax.swing.JLabel();
        jpnBR = new javax.swing.JPanel();
        lblBR = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setVerifyInputWhenFocusTarget(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Tài khoản");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Mật khẩu");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("THƯ VIỆN");

        btnDANGNHAP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDANGNHAP.setForeground(new java.awt.Color(255, 0, 51));
        btnDANGNHAP.setText("Đăng nhập");
        btnDANGNHAP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDANGNHAPActionPerformed(evt);
            }
        });

        btnDOIMK.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDOIMK.setForeground(new java.awt.Color(255, 0, 51));
        btnDOIMK.setText("Đổi MK");
        btnDOIMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDOIMKActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BR/logotv1.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnDANGNHAP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDOIMK, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTAIKHOAN)
                                    .addComponent(txtMATKHAU))))
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(65, 65, 65))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtTAIKHOAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMATKHAU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDANGNHAP)
                            .addComponent(btnDOIMK)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, "card2");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);

        lblLoad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLoad.setForeground(new java.awt.Color(0, 204, 204));
        lblLoad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(230, Short.MAX_VALUE)
                .addComponent(lblLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(316, Short.MAX_VALUE)
                .addComponent(lblLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel2, "card4");

        jpnBR.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpnBRLayout = new javax.swing.GroupLayout(jpnBR);
        jpnBR.setLayout(jpnBRLayout);
        jpnBRLayout.setHorizontalGroup(
            jpnBRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBR, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
        );
        jpnBRLayout.setVerticalGroup(
            jpnBRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBR, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
        );

        getContentPane().add(jpnBR, "card3");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDANGNHAPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDANGNHAPActionPerformed
        if (txtTAIKHOAN.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập tài khoản");
            txtTAIKHOAN.setBackground(Color.yellow);
            return;
        } else {
            txtTAIKHOAN.setBackground(Color.white);
        }
        if (txtMATKHAU.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mật khẩu");
            txtMATKHAU.setBackground(Color.yellow);
            return;
        } else {
            txtMATKHAU.setBackground(Color.white);
        }
        for (Nhanvien nv : nvien) {
            if (nv.getEmail().trim().equals(txtTAIKHOAN.getText().trim()) || nv.getSdt().trim().equals(txtTAIKHOAN.getText().trim())) {
                if (nv.getMk().trim().equals(txtMATKHAU.getText().trim())) {
        jPanel1.show(false);
        this.setSize(704, 362);
        lblBR.setSize(704, 362);
        lblBR.setIcon(new ImageIcon(getClass().getResource("/BR/brtv9.jpg")));
        jPanel2.show(true);
        setLocationRelativeTo(null);
        jpnBR.show(true);
        new Thread() {
            @Override
            public void run() {
                int i = 0;
                for (i = 0; i < 101; i++) {
                    try {
                        lblLoad.setText("Loading " + i + "%");
                        Thread.sleep(20);
                        if (i == 100) {
                            frmSACH frmMN;
                            frmMN = new frmSACH();
                                        frmMN.setRole(Integer.parseInt(nv.getVaitro()));
                                        frmMN.setManv(nv.getManv());
                            frmMN.show();
                            dis();
                        }
                    } catch (InterruptedException ex) {
                        break;
                    }
                }
            }

        }.start();
                    return;
                } else {
                    JOptionPane.showMessageDialog(this, "Sai tài khoản hoặc mật khẩu vui lòng kiểm tra lại");
                    return;
                    
                }
            } else if (nvien.indexOf(nv) == nvien.size() - 1 && !nv.getEmail().equals(txtTAIKHOAN.getText()) || nvien.indexOf(nv) == nvien.size() - 1 && !nv.getSdt().equals(txtTAIKHOAN.getText())) {
                JOptionPane.showMessageDialog(this, "Sai tài khoản hoặc mật khẩu vui lòng kiểm tra lại");
                return;
            } else {
            }
        }

    }//GEN-LAST:event_btnDANGNHAPActionPerformed

    private void btnDOIMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDOIMKActionPerformed
        frmDOIMATKHAU frmDMK;
        try {
            frmDMK = new frmDOIMATKHAU();
            frmDMK.show();
            dis();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(frmDANGNHAP.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnDOIMKActionPerformed

    private void dis() {
        this.dispose();
    }

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
            java.util.logging.Logger.getLogger(frmDANGNHAP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDANGNHAP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDANGNHAP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDANGNHAP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new frmDANGNHAP().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(frmDANGNHAP.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(frmDANGNHAP.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDANGNHAP;
    private javax.swing.JButton btnDOIMK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jpnBR;
    private javax.swing.JLabel lblBR;
    private javax.swing.JLabel lblLoad;
    private javax.swing.JPasswordField txtMATKHAU;
    private javax.swing.JTextField txtTAIKHOAN;
    // End of variables declaration//GEN-END:variables
}
