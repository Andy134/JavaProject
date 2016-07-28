/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lottery.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tuananh
 */
public class ConnectionPoolImpl implements ConnectionPool {

    // Account infomation access db
    private String username;
    private String userpass;
    // Driver info
    private String driver;
    // Path infomation to CSDL in MYSQL
    private String url;
    // Url path
    private Stack<Connection> pool;

    public ConnectionPoolImpl() {
        //Properties p = new Properties();
        InputStream input = null;
        try {
            
            //p.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("database_info.properties"));
            //p.load(Thread.currentThread().getContextClassLoader().getResourceAsStream(""));
            String pURL = "jdbc:mysql://localhost:3306/lottery_db?useUnicode=true&characterEncoding=utf8&useSSL=false";
            String pUSER = "root";
            String pPASSWORD= "112233445566";
            
            this.username = pUSER;
            this.userpass = pPASSWORD;
            this.url = pURL;
            // Thong tin chinh dieu khien
            this.driver = "com.mysql.jdbc.Driver";
            // Khoi tao Stack lưu cac connection
            this.pool = new Stack<Connection>();
            // load JDBC driver
            Class.forName(this.driver).newInstance();
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
    }

    @Override
    public Connection getConnection() throws SQLException {
        if (this.pool.isEmpty()) {
            return DriverManager.getConnection(this.url, this.username,
                    this.userpass);
        } else {
            return (Connection) this.pool.pop();
        } //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void releaseConnection(Connection conn) throws SQLException {
        this.pool.push(conn); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void refreshConnectionPool() {
         while(!pool.empty()){
            try {
                pool.pop().close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } //To change body of generated methods, choose Tools | Templates.
    }
}
