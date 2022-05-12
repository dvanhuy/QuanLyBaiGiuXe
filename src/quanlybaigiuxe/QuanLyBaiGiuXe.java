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

    public List<Xe> runSQLreturnListXe(String sql)
    {
       List<Xe> listXe = new ArrayList<>();
       Connection con = GetConnectServer.getConnection();
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
           return listXe;
       } catch (SQLException e) {
           System.out.println("Lỗi tại lấy toàn bộ xe");
           return null;
       }
    }
    
   public List<Xe> getAllXe(){
       String sql = "Select * from Xe";
       List<Xe> listXe=runSQLreturnListXe(sql);
       return listXe;
   }
   
   public List<Xe> getAllXe(int trangthai){
       String sql="";
       if (trangthai==0) 
       {
           sql = "Select * from Xe where trangThai=N'Đã rời'";
       }
       else
       {
           sql = "Select * from Xe where trangThai=N'Đang đậu'";
       }
       List<Xe> listXe=runSQLreturnListXe(sql);
       return listXe;
   }
   
   public List<Xe> getAllXeWhereOrder(String where,String order){
       //nếu không có where hoặc order thì truyền vào chuỗi rỗng ""
       String sql="Select * from Xe ";
       if (!where.equals(""))
           sql=sql+" where "+where;
       
       if (!order.equals(""))
           sql=sql+" order by "+order;
       List<Xe> listXe=runSQLreturnListXe(sql);
       return listXe;
   }
   
   public List<Xe> getAllXeid_bien_loai(String tim){
       
       String sql="Select * from Xe where (idXe like '%" + tim + "%') "
               + "or (bienSo like '%" + tim + "%') or (loaiXe like '%" + tim + "%') ";

       List<Xe> listXe=runSQLreturnListXe(sql);
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
    
    public List<String> getTenLoaiXe(){
        List<String> allTenXe = new ArrayList<>();
        Connection con = GetConnectServer.getConnection();
        String sql = "select tenxe from LoaiXe";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            ResultSet rs =  preparedStatement.executeQuery();
            while(rs.next())
            {
                allTenXe.add(rs.getString("tenXe"));
            }
        } catch (SQLException e) {
            System.out.println("Lỗi tại lấy tên loại xe");
        }
        return allTenXe;
    }
}
