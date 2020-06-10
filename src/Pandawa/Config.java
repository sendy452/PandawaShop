/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pandawa;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Sendy
 */
public class Config {
    Connection con;
    Statement stm;
    
    public void config() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/pandawa", "root", "");
            stm = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi Gagal");
        }
    }
    
    private static java.sql.Connection mysqlconfig;
    public static java.sql.Connection configDB(){
        try {
            String url = "jdbc:mysql://localhost/pandawa";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.err.println("Pengambilan Data Gagal" + e.getMessage());
        }
        return mysqlconfig;
    }
}
