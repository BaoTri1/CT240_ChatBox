/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLIENT;

import Views.LoginFrom;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author ADMIN
 */
public class Client {
    
    private static String hostname = "MSI";
    private static int port = 9999;
    private static Socket socket;
    private static DataOutputStream out;
    private static DataInputStream in;
    
    
    public static void Connection(){
        
        try {
            if(socket != null){
                socket.close();
            }
            socket = new Socket(hostname, port);
            out = new DataOutputStream(socket.getOutputStream());
            in = new DataInputStream(socket.getInputStream());

        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    public static void main(String []args) throws IOException {
        
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                Connection();
                
                LoginFrom login;
                
                try {
                    login = new LoginFrom(out, in);
                    login.setVisible(true);
                    login.setLocationRelativeTo(null);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        
    }
    
}
