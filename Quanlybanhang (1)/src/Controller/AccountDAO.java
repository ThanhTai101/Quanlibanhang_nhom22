/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Account;
import view.AccountVIew;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author THANH TAI
 */
public class AccountDAO {
    private static String DB_URL = "jdbc:mysql://localhost:3306/quanlibanhang";
    private static String USER_NAME = "root";
    private static String PASSWORD = "123456";
//    
   
      private Connection conn = null;

    public AccountDAO() {
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            System.out.println("connect successfully!");
       } catch (Exception e) {
            e.printStackTrace();
           }

    }
    
      public ArrayList<Account> getListAccount(){
         ArrayList<Account> list = new ArrayList<>();
         String sql = "SELECT * FROM account_nv";
         try {
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery();
             while(rs.next()){ // neu con
                 Account s = new Account();
                 s.setUsername(rs.getString("username"));
                 s.setPassword_a(rs.getString("password_a"));
                 s.setMANV(rs.getInt("MANV"));
                 
                 list.add(s);
             }
         } catch (Exception e) {
             e.printStackTrace();
         }
                 
        return list;     
     }
      

         
    public static void main(String [] args){
        new AccountDAO();
    }
      
}
