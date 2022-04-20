/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MYSQLSERVER;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author ADMIN
 */
public class MySQLServer {
    
    private Connection conn;
    private Statement s;
    private ResultSet rs;
    
    public void Connection() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String dbUrl = "jdbc:sqlserver://MSI\\\\SQLEXPRESS:1433;databaseName=ChatBox;user=sa;password=123456";
        conn = DriverManager.getConnection(dbUrl);
    }
    
    public ResultSet executeQuery(String executeStr) throws SQLException{
        s = conn.createStatement();
        rs = s.executeQuery(executeStr);
        
        return rs;
    }
    
    public void Close() throws SQLException{
        
        conn.close();
        
    }
    
}
