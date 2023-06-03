/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Controller.Database;
import Model.hangHoa;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class HanghoaDAO {
    Connection conn = null;
    PreparedStatement sttm = null;
    public int add (hangHoa s){
        try{
            String sSQL = "insert HangHoa(MASP,TenSP,Dongia) values (?,?,?) ";
            conn = Database.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1,s.getMASP());
            sttm.setString(2,s.getTenSP());
            sttm.setString(3,s.getDongia());
            if(sttm.executeUpdate()>0){
                System.out.println("Insert thanh cong");
                return 1;
            }
        }catch (Exception e) {
            System.out.println("Lỗi" +e.toString());
        }
        return -1;
    }
    public int update (hangHoa st){
        try{
            String sSQL = "update HangHoa set  TenSP = ?,Dongia= ? where MASP = ?";
            conn = Database.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(3,st.getMASP());
            sttm.setString(1,st.getTenSP());
            sttm.setString(2,st.getDongia());
            if(sttm.executeUpdate()>0){
                System.out.println("Update thanh cong");
                return 1;
            }
        }catch (Exception e) {
            System.out.println("Lỗi" +e.toString());
        }
        return -1;
    }
    public int delete (String MASP){
        try{
            String sSQL = "delete from hanghoa where MASP = ?";
            conn = Database.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1,MASP);
            if(sttm.executeUpdate()>0){
                System.out.println("Delete thanh cong");
                return 1;
            }
        }catch (Exception e) {
            System.out.println("Lỗi" +e.toString());
        }
        return -1;
    }
    public List<hangHoa> getAll(){
        List <hangHoa> ls = new ArrayList <>();
        ResultSet rs = null;
        Statement sttm = null;
        try{
            String sSQL = "select * from hanghoa";
            conn = Database.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()){
                hangHoa st = new hangHoa();
                st.setMASP(rs.getString(1));
                st.setTenSP(rs.getString(2));
                st.setDongia(rs.getString(3));
                ls.add(st);
            }
        }catch (Exception e){
            System.out.println("Loi that bai" +e.toString());
        }
        finally{
        try{
            rs.close(); sttm.close();conn.close();
        }catch(Exception e){
        
        }
      }
        return ls;
    }
    public List<hangHoa> findStudentByID(String MASP){
        ResultSet rs = null;
        Statement sttm = null;
        List<hangHoa> ls = new ArrayList<>();
        try{
            String sSQL = "select * from hanghoa where MASP like '%"+MASP+"%'";
            conn = Database.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()){
                hangHoa st = new hangHoa();
                st.setMASP(rs.getString(1));
                st.setTenSP(rs.getString(2));
                st.setDongia(rs.getString(3));
                ls.add(st);
            }
        }catch (Exception e){
            System.out.println("Lỗiiiiiiiiiii" +e.toString());
        }
        finally{
        try{
            rs.close(); sttm.close();conn.close();
        }catch(Exception e){
        
        }
      }
        return ls;
    }
}
