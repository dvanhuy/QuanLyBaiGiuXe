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
       String sql = "insert into Xe(idXe,bienSo, timeVao,timeRa,tienDaThu,trangThai,loaiXe,nvThucHien)"
               + "Values(?,?,GETDATE(),null,?,N'Đang đậu',?,?)";
       try {
           PreparedStatement preparedStatement = con.prepareStatement(sql);
           preparedStatement.setString(1, xe.getIdXe());
           preparedStatement.setString(2, xe.getBienSo());
           preparedStatement.setFloat(3, xe.getTienDaThu());
           preparedStatement.setString(4, xe.getLoaiXe());
           preparedStatement.setString(5, xe.getNvThucHien());
           
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
    
    public void updateXe(Xe xe){
        Connection con = GetConnectServer.getConnection();
        String sql = "update XE set bienSo = ?, loaiXe = ?, tienDaThu = ? where idXe = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, xe.getBienSo());
            preparedStatement.setString(2, xe.getLoaiXe());
            preparedStatement.setFloat(3, xe.getTienDaThu());
            preparedStatement.setString(4, xe.getIdXe());
            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println("Lỗi tại update");
        }
    }
    
    public String getIdXeNext(){
        Connection con = GetConnectServer.getConnection();
        String sql = "select dbo.getIdXeNext()";
        String idNext = "";
        try{
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                idNext = rs.getString("");
            }
            return idNext;
        }
        catch(SQLException e){
            System.out.println("lỗi tại lấy idNext");
        }
        return idNext;
    }
    
    public void delXe(String id)
    {
        Connection con = GetConnectServer.getConnection();
        String sql = "DELETE Xe "
                + "where idXe=?";
        try{
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, id);
            preparedStatement.execute();
        }
        catch(SQLException e){
            System.out.println("lỗi tại xóa theo id");
        }
    }
    
    public Xe getXeById(String id){
        Connection con = GetConnectServer.getConnection();
        Xe newXe = new Xe();
        String sql = "select * from xe where idXe = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            
            rs.next();
            newXe.setIdXe(id);
            newXe.setBienSo(rs.getString("bienSo"));
            newXe.setLoaiXe(rs.getString("loaiXe"));
            newXe.setTimeVao(rs.getString("timeVao"));
            newXe.setTimeRa(rs.getString("timeRa"));
            newXe.setTrangThai(rs.getString("trangThai"));
            newXe.setTienDaThu(rs.getFloat("tienDaThu"));
            newXe.setNvThucHien(rs.getString("nvThucHien"));
            return newXe;
        } catch (SQLException e) {
            System.out.println("Lỗi tại lấy Xe theo ID");
            return null;
        }
    }
    public void updateTimeRa(String id){
        Connection con = GetConnectServer.getConnection();
        String sql = "update Xe set timeRa = getdate() where idXe = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, id);
            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println("Lỗi tại update time ra");
        }
    }
    public float getPaymentById(String id)
    {
        Connection con = GetConnectServer.getConnection();
        String sql = "select dbo.thanhToan(?)";
        float tien = 0;
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, id);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            rs.next();
            tien = Float.valueOf(rs.getString(""));
            return tien;
        } catch (SQLException e) {
            System.out.println("Lỗi tại thanh toán theo id");
            return tien;
        }
    }
    
    public void updateXeDaRoiVaTienThu(String id, float tien){
        Connection con = GetConnectServer.getConnection();
        String sql = "update Xe set trangThai = N'Đã rời', tienDaThu = ? where idXe = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setFloat(1, tien);
            preparedStatement.setString(2, id);
            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println("Lỗi tại update time ra");
        }
    }
}
