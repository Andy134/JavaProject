/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tuananh
 */
public class ConnectionUtil {

    public static Connection conn = null;
    // Connection to Crawler Promotion BD.

    public static Connection getMySQLConnection() {
        String hostName = "localhost";

        String dbName = "mtruyentranh8_db";
        String userName = "root";
        String password = "112233445566";

        return getMySQLConnection(hostName, dbName, userName, password);
    }

    public static Connection getMySQLConnection(String hostName, String dbName,
            String userName, String password) {

        try {
            // Khai báo class Driver cho DB MySQL
            // Việc này cần thiết với Java 5
            // Java6 tự động tìm kiếm Driver thích hợp.
            // Nếu bạn dùng Java6, thì ko cần dòng này cũng được.
            Class.forName("com.mysql.jdbc.Driver");

            // Cấu trúc URL Connection dành cho Oracle
            // Ví dụ: jdbc:mysql://localhost:3306/simplehr
            String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName + "?useSSL=true";

            conn = DriverManager.getConnection(connectionURL, userName,
                    password);

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConnectionUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    
    public static void closeStatement(Statement s)
    {
        try
        {
            if (s != null)
                s.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    public static void closePreparedStatement(Statement ps)
    {
        try
        {
            if (ps != null)
                ps.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    public static void closeResultSet(ResultSet rs)
    {
        try
        {
            if (rs != null)
                rs.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}
