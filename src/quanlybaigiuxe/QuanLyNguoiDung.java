
package quanlybaigiuxe;

import connect.GetConnectServer;
import define.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
            user.setDinhDanh(rs.getString(7));
            user.setChucVu(rs.getString(8));
            
            return user;
        } catch(SQLException e){
//            System.out.println("Sai tài khoản mật khẩu");
            return null;
        }
    }
}
