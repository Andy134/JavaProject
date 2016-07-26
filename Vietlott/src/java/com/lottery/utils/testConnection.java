/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lottery.utils;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author tuananh
 */
public class testConnection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConnectionPool cp = new ConnectionPoolImpl();
        try {
            Connection con = cp.getConnection();
            if (con != null) {
                System.out.println(con);
            } else {
                System.out.println("connection is null");
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
