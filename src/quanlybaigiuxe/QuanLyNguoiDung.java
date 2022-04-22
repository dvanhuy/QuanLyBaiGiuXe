
package quanlybaigiuxe;

import connect.GetConnectServer;
import define.User;
import define.Xe;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class QuanLyNguoiDung {
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
    
    public List<User> getAllNguoiDung(){
       List<User> listXe = new ArrayList<>();
       Connection con = GetConnectServer.getConnection();
       String sql = "Select * from NguoiDung";
       try {
           PreparedStatement preparedStatement = con.prepareStatement(sql);
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
               
               listXe.add(newUser);
           }
       } catch (SQLException e) {
           System.out.println("Lỗi tại lấy toàn bộ người dùng");
       }
       return listXe;
   }
    
    
    public List<User> getAllNguoiDungid_name_username(String tim){
       List<User> listXe = new ArrayList<>();
       Connection con = GetConnectServer.getConnection();
       String sql="Select * from NguoiDung where (idUser like '%" + tim + "%') "
               + "or (hoTen like '%" + tim + "%') or (tenTK like '%" + tim + "%') ";
       try {
           PreparedStatement preparedStatement = con.prepareStatement(sql);
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
               
               listXe.add(newUser);
           }
       } catch (SQLException e) {
           System.out.println("Lỗi tại lấy toàn bộ người dùng");
       }
       return listXe;
   }

    
}
