/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package chatbox;

/**
 *
 * @author ADMIN
 */
public class LoginFrom extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrom
     */
    public LoginFrom() {
        initComponents();
        lblNhaplaipass.setVisible(false);
        txtnhaplaipass.setVisible(false);
        btnDangKy.setVisible(false);
        lbldangnhap.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Contain = new javax.swing.JPanel();
        lblHeading = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblPwd = new javax.swing.JLabel();
        txtPwd = new javax.swing.JPasswordField();
        btnDangNhap = new javax.swing.JButton();
        lblNhaplaipass = new javax.swing.JLabel();
        txtnhaplaipass = new javax.swing.JPasswordField();
        lblGhiChu = new javax.swing.JLabel();
        lblDangKy = new javax.swing.JLabel();
        btnDangKy = new javax.swing.JButton();
        lbldangnhap = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ChatBox");
        setResizable(false);

        Panel_Contain.setBackground(new java.awt.Color(204, 255, 255));

        lblHeading.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblHeading.setText("CHAT BOX");

        lblUserName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblUserName.setText("Tên Đăng Nhập:");

        txtUserName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblPwd.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPwd.setText("Mật Khẩu:");

        txtPwd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnDangNhap.setBackground(new java.awt.Color(255, 255, 255));
        btnDangNhap.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDangNhap.setText("Đăng Nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        lblNhaplaipass.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblNhaplaipass.setText("Nhập Lại Mật Khẩu:");

        txtnhaplaipass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblGhiChu.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        lblGhiChu.setText("Chưa có tài khoản ?");

        lblDangKy.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lblDangKy.setForeground(new java.awt.Color(255, 51, 51));
        lblDangKy.setText("Đăng Ký Ngay");
        lblDangKy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDangKyMouseClicked(evt);
            }
        });

        btnDangKy.setBackground(new java.awt.Color(255, 255, 255));
        btnDangKy.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDangKy.setText("Đăng Ký");
        btnDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKyActionPerformed(evt);
            }
        });

        lbldangnhap.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lbldangnhap.setForeground(new java.awt.Color(255, 51, 51));
        lbldangnhap.setText("Đăng Nhập");
        lbldangnhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbldangnhapMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel_ContainLayout = new javax.swing.GroupLayout(Panel_Contain);
        Panel_Contain.setLayout(Panel_ContainLayout);
        Panel_ContainLayout.setHorizontalGroup(
            Panel_ContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ContainLayout.createSequentialGroup()
                .addGroup(Panel_ContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_ContainLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_ContainLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(Panel_ContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_ContainLayout.createSequentialGroup()
                                .addComponent(lblPwd)
                                .addGap(62, 62, 62)
                                .addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel_ContainLayout.createSequentialGroup()
                                .addComponent(lblNhaplaipass)
                                .addGap(18, 18, 18)
                                .addComponent(txtnhaplaipass, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel_ContainLayout.createSequentialGroup()
                                .addComponent(lblUserName)
                                .addGap(18, 18, 18)
                                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(Panel_ContainLayout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addGroup(Panel_ContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel_ContainLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(lblGhiChu)
                        .addGap(18, 18, 18)
                        .addComponent(lblDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbldangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        Panel_ContainLayout.setVerticalGroup(
            Panel_ContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ContainLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lblHeading)
                .addGap(45, 45, 45)
                .addGroup(Panel_ContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(Panel_ContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPwd)
                    .addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(Panel_ContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNhaplaipass)
                    .addComponent(txtnhaplaipass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(Panel_ContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(Panel_ContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGhiChu)
                    .addComponent(lblDangKy)
                    .addComponent(lbldangnhap))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Contain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Contain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblDangKyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangKyMouseClicked
        lblNhaplaipass.setVisible(true);
        txtnhaplaipass.setVisible(true);
        btnDangKy.setVisible(true);
        lbldangnhap.setVisible(true);
    }//GEN-LAST:event_lblDangKyMouseClicked

    private void btnDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDangKyActionPerformed

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void lbldangnhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbldangnhapMouseClicked
        lblNhaplaipass.setVisible(false);
        txtnhaplaipass.setVisible(false);
        btnDangKy.setVisible(false);
        
    }//GEN-LAST:event_lbldangnhapMouseClicked

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
            java.util.logging.Logger.getLogger(LoginFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginFrom lg = new LoginFrom();
                lg.setVisible(true);
                lg.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Contain;
    private javax.swing.JButton btnDangKy;
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JLabel lblDangKy;
    private javax.swing.JLabel lblGhiChu;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblNhaplaipass;
    private javax.swing.JLabel lblPwd;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lbldangnhap;
    private javax.swing.JPasswordField txtPwd;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JPasswordField txtnhaplaipass;
    // End of variables declaration//GEN-END:variables
}