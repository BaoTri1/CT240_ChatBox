/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SERVER;

import MYSQLSERVER.MySQLServer;
import java.sql.SQLException;
import java.sql.ResultSet;
/**
 *
 * @author ADMIN
 */
public class User {
    
    private String name;
    private String avatar;
    private Boolean gioitinh;
    private String ngaysinh;
    private MySQLServer database;
    
    public User(String name, Boolean gioitinh, String ngaysinh, String avatar) {
        this.name = name;
        this.avatar = avatar;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getAvatar() {
        return this.avatar;
    }
    
    public Boolean getGioiTinh() {
        return this.gioitinh;
    }
    
    public String getNgaySinh() {
        return this.ngaysinh;
    }
    
    public void SaveUser() throws ClassNotFoundException, SQLException{
        
        int mauser = 0;
        try {
            
            database.Connection();
            
            String executeStr1 = "Select count(MaUser) from User;";
            ResultSet rs1 = database.executeQuery(executeStr1);
            while(rs1.next()){
                mauser = rs1.getInt("MaUser");
            }
            
            mauser++;
            
            String executeStr2 = "Insert into User values (" + mauser +
                            ", '" + name + "', " + gioitinh + ", '" +
                    ngaysinh + "', '" + avatar + "');";
            database.executeQuery(executeStr2);
            
        }catch(Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
