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
        
        String executeStr = "Select * from Users where MaUser = " + "1" + ";";
        ResultSet rs = db.executeQuery(executeStr);
        while(rs.next()){
            System.out.println(rs.getString(1));
        }
        
        db.Close();
        
        
        
    }
    
}
