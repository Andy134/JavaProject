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
public interface ConnectionPool {
    // Return connection
    public Connection getConnection() throws SQLException;
    // Connection
    public void releaseConnection(Connection conn) throws SQLException;
    // Renew Pool
    public void refreshConnectionPool();
}
