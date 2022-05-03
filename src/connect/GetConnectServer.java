
package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnectServer {
    public static Connection Connectionn(String may,String userName,String password){
        String url="jdbc:sqlserver://"+may+"\\SQLEXPRESS:1433;databaseName=BaiGiuXe";
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            return DriverManager.getConnection(url,userName,password);
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println("Ket noi loi");
            System.out.println(e);
        }
        return null;
    }
    
    public static Connection getConnection()
    {
        return GetConnectServer.Connectionn("LAPTOP-ATNHOQI8","sa","12345");
//        return GetConnectServer.Connectionn("DESKTOP-T6COLHJ","sa","popdaica123");
//        return GetConnectServer.Connectionn("MSI","sa","blackace71202");
    }
//    public static void main(String[] args) throws SQLException {
//        Connection connection = GetConnectServer.getConnection();
//        String sql = "SELECT * FROM Xe";
//        PreparedStatement pstmt = connection.prepareStatement(sql);
//        ResultSet rs = pstmt.executeQuery();
//
//        while( rs.next()) {
//            System.out.println(rs.getString(1));
//       }
//    }
}
