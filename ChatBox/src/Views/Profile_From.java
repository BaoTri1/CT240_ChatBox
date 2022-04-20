/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import javax.swing.ImageIcon;

/**
 *
 * @author ADMIN
 */
public class Profile_From extends javax.swing.JFrame {

    /**
     * Creates new form Profile_From
     */
    public Profile_From() {
        initComponents();
        ImageIcon icon = EditImage.XuLyAnh.Edit_Img("D:\\NetBeans\\ChatBox\\src\\Image\\anh-dai-dien-dep.jpg", lblAvatar);
        lblAvatar.setIcon(icon);
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
        lblAvatar = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lbl_HienThiName = new javax.swing.JLabel();
        lblSinhNhat = new javax.swing.JLabel();
        lbl_HienThiSinhNhat = new javax.swing.JLabel();
        lblGT = new javax.swing.JLabel();
        lbl_HienThiGT = new javax.swing.JLabel();
        btnChinhSua = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thông Tin Cá Nhân");
        setResizable(false);

        Panel_Contain.setBackground(new java.awt.Color(153, 255, 255));

        lblAvatar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblName.setText("Biệt Danh:");

        lbl_HienThiName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        lblSinhNhat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblSinhNhat.setText("Sinh Nhật:");

        lbl_HienThiSinhNhat.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        lblGT.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblGT.setText("Giới Tính:");

        lbl_HienThiGT.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        btnChinhSua.setBackground(new java.awt.Color(255, 255, 255));
        btnChinhSua.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnChinhSua.setText("Chỉnh Sửa");

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnExit.setText("Thoát");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_ContainLayout = new javax.swing.GroupLayout(Panel_Contain);
        Panel_Contain.setLayout(Panel_ContainLayout);
        Panel_ContainLayout.setHorizontalGroup(
            Panel_ContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ContainLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(Panel_ContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Panel_ContainLayout.createSequentialGroup()
                        .addComponent(lblGT)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_HienThiGT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Panel_ContainLayout.createSequentialGroup()
                        .addComponent(lblSinhNhat)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_HienThiSinhNhat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Panel_ContainLayout.createSequentialGroup()
                        .addComponent(lblName)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_HienThiName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(Panel_ContainLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(btnChinhSua, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        Panel_ContainLayout.setVerticalGroup(
            Panel_ContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ContainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Panel_ContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(lbl_HienThiName, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(Panel_ContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSinhNhat)
                    .addComponent(lbl_HienThiSinhNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(Panel_ContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGT)
                    .addComponent(lbl_HienThiGT, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(Panel_ContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChinhSua)
                    .addComponent(btnExit))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Contain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Contain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnExitActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Profile_From.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Profile_From.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Profile_From.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Profile_From.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Profile_From().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Contain;
    private javax.swing.JButton btnChinhSua;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel lblAvatar;
    private javax.swing.JLabel lblGT;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSinhNhat;
    private javax.swing.JLabel lbl_HienThiGT;
    private javax.swing.JLabel lbl_HienThiName;
    private javax.swing.JLabel lbl_HienThiSinhNhat;
    // End of variables declaration//GEN-END:variables
}
