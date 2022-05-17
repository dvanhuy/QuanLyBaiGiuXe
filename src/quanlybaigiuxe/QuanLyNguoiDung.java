
package quanlybaigiuxe;

import connect.GetConnectServer;
import define.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class QuanLyNguoiDung {
    
    public List<User> makeSqladdReturnListUser(String sql)
    {
        List<User> listUser = new ArrayList<>();
        Connection connection = GetConnectServer.getConnection();
        try {
           PreparedStatement preparedStatement = connection.prepareStatement(sql);
           ResultSet rs = preparedStatement.executeQuery();
           while(rs.next())
           {
               User newUser = new User();
               
               newUser.setIdUser(rs.getString("idUser"));
               newUser.setHoTen(rs.getString("hoTen"));
               newUser.setTenTK(rs.getString("tenTK"));
               newUser.setMatKhau(rs.getString("matKhau"));
               newUser.setGioiTinh(rs.getString("gioiTinh"));
               newUser.setSdt(rs.getString("soDT"));
               newUser.setDinhDanh(rs.getString("dinhDanh"));
               newUser.setChucVu(rs.getString("chucVu"));
               
               listUser.add(newUser);
           }
           return listUser;
       } catch (SQLException e) {
           System.out.println("Lỗi tại lấy toàn bộ người dùng");
           return null;
       }
        
    }
    
    public User checkUser(String username,String password)
    {
        User user= new User();
        Connection connection = GetConnectServer.getConnection();
        
        String sql = "SELECT * FROM NguoiDung "
                + "WHERE tenTK=? and matKhau=?";
        try {
            
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet rs = preparedStatement.executeQuery();
            
            rs.next();      
            user.setIdUser(rs.getString(1));// tên cột
            user.setHoTen(rs.getString(2));
            user.setTenTK(rs.getString(3));
            user.setMatKhau(rs.getString(4));
            user.setGioiTinh(rs.getString(5));
            user.setQueQuan(rs.getString(6));
            user.setSdt(rs.getString(7));
            user.setDinhDanh(rs.getString(8));
            user.setChucVu(rs.getString(9));
            
            return user;
        } catch(SQLException e){
//            System.out.println("Sai tài khoản mật khẩu");
            return null;
        }
    }
    
    public User checkUserName(String username)
    {
        User user= new User();
        Connection connection = GetConnectServer.getConnection();
        
        String sql = "SELECT * FROM NguoiDung "
                + "WHERE tenTK=? ";
        try {
            
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            ResultSet rs = preparedStatement.executeQuery();
            
            rs.next();      
            user.setIdUser(rs.getString(1));// tên cột
            user.setHoTen(rs.getString(2));
            user.setTenTK(rs.getString(3));
            user.setMatKhau(rs.getString(4));
            user.setGioiTinh(rs.getString(5));
            user.setQueQuan(rs.getString(6));
            user.setSdt(rs.getString(7));
            user.setDinhDanh(rs.getString(8));
            user.setChucVu(rs.getString(9));
            
            return user;
        } catch(SQLException e){
//            System.out.println("Sai tài khoản mật khẩu");
            return null;
        }
    }
    
    public List<User> getAllNguoiDung(){
       String sql = "Select * from NguoiDung";
       List<User> listXe=makeSqladdReturnListUser(sql);
       return listXe;
   }
    
    public User getUserbyId(String id){
        String sql="Select * from NguoiDung where idUser = ?";
        User user= new User();
        Connection connection = GetConnectServer.getConnection();
        try {
            
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            
            rs.next();      
            user.setIdUser(rs.getString(1));// tên cột
            user.setHoTen(rs.getString(2));
            user.setTenTK(rs.getString(3));
            user.setMatKhau(rs.getString(4));
            user.setGioiTinh(rs.getString(5));
            user.setQueQuan(rs.getString(6));
            user.setSdt(rs.getString(7));
            user.setDinhDanh(rs.getString(8));
            user.setChucVu(rs.getString(9));
            
            return user;
        } catch(SQLException e){
            System.out.println("Sai lấy user theo mã ");
            return null;
        }
   }
    
    public List<User> getAllNguoiDungid_name_username(String tim){
       String sql="Select * from NguoiDung where (idUser like '%" + tim + "%') "
               + "or (hoTen like '%" + tim + "%') or (tenTK like '%" + tim + "%') ";
       List<User> listXe=makeSqladdReturnListUser(sql);
       return listXe;
   }
    
    
    
   public void updateUser(User user)
   {
        Connection connection = GetConnectServer.getConnection();
        
        String sql = "UPDATE NguoiDung "
                +"SET hoTen=?,gioiTinh=?,soDT=?,dinhDanh=?,chucVu=? "
                + "WHERE idUser=? ";
        try {
            
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user.getHoTen());
            preparedStatement.setString(2, user.getGioiTinh());
            preparedStatement.setString(3, user.getSdt());
            preparedStatement.setString(4, user.getDinhDanh());
            preparedStatement.setString(5, user.getChucVu());
            preparedStatement.setString(6, user.getIdUser());
            
            preparedStatement.execute();

            
        } catch(SQLException e){
            System.out.println("Sai tại cập nhật dữ liệu");
        }
   }
   
   public void updatePassword(String manv,String matkhau)
   {
        Connection connection = GetConnectServer.getConnection();
        
        String sql = "UPDATE NguoiDung "
                +"SET matKhau=? "
                + "WHERE idUser=? ";
        try {
            
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, matkhau);
            preparedStatement.setString(2, manv);
            
            preparedStatement.execute();
        } catch(SQLException e){
            System.out.println("Sai tại cập nhật mật khẩu");
        }
   }
    
}
