/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ConnectSQL;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author pc
 */
public class ConnectSQL {
    
    public static Connection getConnectSQL() {
        String url = "jdbc:sqlserver://DESKTOP-T6COLHJ\\MSSQLSERVER01:1433;databaseName=BanHang";
        String user = "sa";
        String password = "popdaica123";
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(url,user,password);
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println("Kết nối lỗi");
            System.out.println(e);
        }
        return null;
    }
    public static void main(String[] args) {
        getConnectSQL();
    }

    
    
}
