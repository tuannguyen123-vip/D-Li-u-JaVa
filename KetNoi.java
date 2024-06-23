
import java.sql.*;

public class KetNoi {
    public static Connection sConn = null;
    public static void main(String[] args) {
        String strDbUrl = "jdbc:sqlserver://localhost:1433; "
                + "databaseName=QuanLySinhVien;"  //Cấu hình theo tên database muốn kết nối
                + "user=sa;"                
                + "password=123456;"       //Cấu hình theo mật khẩu tài khoản sa
                + "encrypt=true;trustServerCertificate=true";
        if (sConn == null) {
            try {              
                sConn = DriverManager.getConnection(strDbUrl);
                System.out.println("OK");
                String query = "SELECT * FROM NhanVien";
                Statement stm = sConn.createStatement();
                ResultSet resultSet = stm.executeQuery(query);
                while (resultSet.next()) {                    
                    System.out.println(resultSet.getString("MaSV"));
                    System.out.println(resultSet.getString(2));
                }
            } 
            catch (SQLException ex) {
                System.out.println("Khong the ket noi den CSDL \n" + ex);
            }
            } 
    }
}
