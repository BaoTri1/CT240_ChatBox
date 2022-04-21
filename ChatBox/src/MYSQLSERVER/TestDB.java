/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MYSQLSERVER;

import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author ADMIN
 */
public class TestDB {
    
    public static void main(String [] args) throws ClassNotFoundException, SQLException {
        
        MySQLServer db = new MySQLServer();
        
        db.Connection();
        
        
            String executeStr = "Select MaUserFriend from Friend where MaUser = " + 2 + ";";
            ResultSet rs = db.executeQuery(executeStr);
            while(rs.next()){
                String executeStr1 = "Select NameUser, Avatar from Users where MaUser = " + rs.getInt(1) + ";";
                ResultSet rs1 = db.executeQuery(executeStr1);
                while(rs1.next()) {
                    System.out.println(rs1.getString(1));
                    System.out.println(rs1.getString(2));
                }
            }
        
        db.Close();
        
        
        
    }
    
}
