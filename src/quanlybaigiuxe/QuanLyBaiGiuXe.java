/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlybaigiuxe;

import define.Xe;
import java.util.List;
import connect.GetConnectServer;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author ADMIN
 */
public class QuanLyBaiGiuXe {

   public List<Xe> getAllXe(){
       List<Xe> listXe = new ArrayList<Xe>();
       Connection con = GetConnectServer.getConnection();
       String sql = "Select * from Xe";
       try {
           PreparedStatement preparedStatement = con.prepareStatement(sql);
           ResultSet rs = preparedStatement.executeQuery();
           while(rs.next())
           {
               Xe newXe = new Xe();
               
               newXe.setIdXe(rs.getString("idXe"));
               newXe.setBienSo(rs.getString("bienSo"));
               newXe.setLoaiXe(rs.getString("loaiXe"));
               newXe.setTimeVao(rs.getString("timeVao"));
               newXe.setTimeRa(rs.getString("timeRa"));
               newXe.setTrangThai(rs.getString("trangThai"));
               newXe.setTienDaThu(rs.getFloat("tienDaThu"));
               newXe.setNvThucHien(rs.getString("nvThucHien"));
               
               listXe.add(newXe);
           }
       } catch (SQLException e) {
           e.printStackTrace();
       }
       return listXe;
   }
   
    public  void AddXe(Xe xe){
       Connection con = GetConnectServer.getConnection();
       String sql = "Insert into Xe (idXe,bienSo,loaiXe,timeVao,timeRa,trangThai,TienDaThu,nvThucHien)"
               + "Values(?,?,?,?,?,?,?,?)";
       try {
           PreparedStatement preparedStatement = con.prepareStatement(sql);
           preparedStatement.setString(1, xe.getIdXe());
           preparedStatement.setString(2, xe.getBienSo());
           preparedStatement.setString(3, xe.getLoaiXe());
           preparedStatement.setString(4, xe.getTimeVao());
           preparedStatement.setString(5, xe.getTimeRa());
           preparedStatement.setString(6, xe.getTrangThai());
           preparedStatement.setFloat(7, xe.getTienDaThu());
           preparedStatement.setString(8, xe.getNvThucHien());
           
           preparedStatement.execute();
           
       } catch (SQLException e) {
           System.out.println("Lỗi Add Xe!");
       }
    }
    
}
