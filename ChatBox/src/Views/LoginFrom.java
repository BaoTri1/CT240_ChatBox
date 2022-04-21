/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author ADMIN
 */
public class LoginFrom extends javax.swing.JFrame {
    
    
    private DataOutputStream out;
    private DataInputStream in;
    private static final String hostname = "MSI";
    private static final int port = 9999;
    private static Socket socket;
    
    /**
     * Creates new form LoginFrom
     */
    public LoginFrom(){
        initComponents();

    }
    
    public void conn() {
        try{
            if(socket != null){
                socket.close();
            }
            socket = new Socket(hostname, port);
            out = new DataOutputStream(socket.getOutputStream());
            in = new DataInputStream(socket.getInputStream());
            
        }catch(IOException e) {
            
        }
    }
    
    
//    public LoginFrom(Socket socket) throws IOException {
//        initComponents();
//        out = new DataOutputStream(socket.getOutputStream());
//        in = new DataInputStream(socket.getInputStream());
//    }

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
        lblGhiChu = new javax.swing.JLabel();
        lblDangKy = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ChatBox");
        setResizable(false);

        Panel_Contain.setBackground(new java.awt.Color(204, 255, 255));

        lblHeading.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeading.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-message-64.png"))); // NOI18N
        lblHeading.setText("ChatBox");

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

        lblGhiChu.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        lblGhiChu.setText("Chưa có tài khoản ?");

        lblDangKy.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lblDangKy.setForeground(new java.awt.Color(255, 51, 51));
        lblDangKy.setText("Đăng Ký Ngay ");
        lblDangKy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDangKyMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel_ContainLayout = new javax.swing.GroupLayout(Panel_Contain);
        Panel_Contain.setLayout(Panel_ContainLayout);
        Panel_ContainLayout.setHorizontalGroup(
            Panel_ContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ContainLayout.createSequentialGroup()
                .addGroup(Panel_ContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_ContainLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(Panel_ContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserName)
                            .addComponent(lblPwd))
                        .addGap(18, 18, 18)
                        .addGroup(Panel_ContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel_ContainLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(lblGhiChu)
                        .addGap(18, 18, 18)
                        .addComponent(lblDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_ContainLayout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_ContainLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        Panel_ContainLayout.setVerticalGroup(
            Panel_ContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ContainLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(Panel_ContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(Panel_ContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPwd))
                .addGap(79, 79, 79)
                .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(Panel_ContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGhiChu)
                    .addComponent(lblDangKy))
                .addContainerGap(42, Short.MAX_VALUE))
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
        
        conn();
        
        String username = txtUserName.getText();
        String password = txtPwd.getText();
        
        
        JPasswordField repass = new JPasswordField();
        
        int action = JOptionPane.showConfirmDialog(this, repass, "Xác nhận mật khẩu: ", JOptionPane.DEFAULT_OPTION);
        if(action == JOptionPane.OK_OPTION){
            if(password.equals(repass.getText())){

                try {
                        out.writeUTF("Sign up");
                        out.writeUTF(username);
                        out.writeUTF(password);
                        out.flush();

                        //Nhan thong bao tu server
                        String response = in.readUTF();

                        //Kiem tra response tra ve
                        //Gui thong bao tai khoan da ton tai
                        if(response.equals("acc da ton tai")){
                             JOptionPane.showMessageDialog(this, "Tài khoản đã tồn tại.!!!", "Thông Báo", JOptionPane.ERROR_MESSAGE);  
                        }

                        else if(response.equals("signup thanh cong")){
                            JOptionPane.showMessageDialog(this, "Đăng ký tài khoản thành công. Vui lòng cập nhật thêm thông tin người dùng.!!!", "Thông Báo", JOptionPane.INFORMATION_MESSAGE); 
                            java.awt.EventQueue.invokeLater(new Runnable() {
                                public void run() {
                                    CapNhat_From cn = new CapNhat_From();
                                    cn.setVisible(true);
                                    cn.setLocationRelativeTo(null);
                                }
                            });
                            dispose();
                        }

                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
            }
            else{
                JOptionPane.showMessageDialog(this, "Mật khẩu không khớp", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_lblDangKyMouseClicked

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        
        conn();
        
        String username = txtUserName.getText();
        String password = txtPwd.getText();
        
        if(username.equals("") || password.equals("")){
            JOptionPane.showMessageDialog(this, "Tên đăng nhập hoặc mật khẩu không được bỏ trống!!!", "Thông Báo", JOptionPane.WARNING_MESSAGE);
        }
        else{
            try {
                out.writeUTF("Log in");
                out.writeUTF(username);
                out.writeUTF(password);
                out.flush();
                
                //Nhan thong bao tu server
                String response = in.readUTF();
                
                //Kiem tra response tra ve
                //Gui thong bao tai khoan khong ton tai
                if(response.equals("login that bai")){
                     JOptionPane.showMessageDialog(this, "Tài khoản không tồn tại.!!!", "Thông Báo", JOptionPane.ERROR_MESSAGE);  
                }
                
                //Gui Thong bao tai khoan da duoc dang nhap
                else if(response.equals("ton tai")){
                     JOptionPane.showMessageDialog(this, "Tài khoản đã được đăng nhập bởi người dùng khác.!!!", "Thông Báo", JOptionPane.WARNING_MESSAGE);
                }
                
                //Kiem tra password
                else if(response.equals("pass khong dung")){
                    JOptionPane.showMessageDialog(this, "Mật khẩu không đúng. Vui lòng nhập lại.!!!", "Thông Báo", JOptionPane.ERROR_MESSAGE);
                }
                
                //Goi ClientFrame
                else if(response.equals("login thanh cong")){
                    String mauser = in.readUTF();
                    int ma = Integer.parseInt(mauser);
                    String nameuser = in.readUTF();
                    String gioitinh = in.readUTF();
                    String ngaysinh = in.readUTF();
                    String avatar = in.readUTF();               
                    
                    java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            ClientFrom client = new ClientFrom(out, in, ma, nameuser, gioitinh, ngaysinh, avatar);
                            client.setVisible(true);
                            client.setLocationRelativeTo(null);
                       }
                    });
                    dispose();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        
    }//GEN-LAST:event_btnDangNhapActionPerformed

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
                LoginFrom lg;
                lg = new LoginFrom();
                lg.setVisible(true);
                lg.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Contain;
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JLabel lblDangKy;
    private javax.swing.JLabel lblGhiChu;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblPwd;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPasswordField txtPwd;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
