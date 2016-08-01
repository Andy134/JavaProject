/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lottery.dao;

import com.lottery.utils.ConnectionPool;
import com.lottery.utils.ConnectionPoolImpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author tuananh
 */
public class BaseDAOImpl implements BaseDAO {
    private ConnectionPool connectionPool;
    protected Connection connection;
    // Contructor co tham so truyen vao la doi tuong ConnectionPool
    public BaseDAOImpl(ConnectionPool cp) {
        // neu ConnectionPool truyen vao la null thi tao moi
        if (cp == null) {
            this.connectionPool = new ConnectionPoolImpl();
        } else {
            this.connectionPool = cp;
        }
        // Lay ket noi tu ConnectionPool
        try {
            this.connection = connectionPool.getConnection();
            // Set AutoCommit la false de thuc hien commit bang tay
            if (this.connection.getAutoCommit()) {
                this.connection.setAutoCommit(false);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // Method ExecuteUpdate
    public boolean executeUpdate(PreparedStatement pre) {
        if (pre != null) {
            try {
                int numRow = pre.executeUpdate();
                if (numRow == 0) {
                    this.connection.rollback();
                } else {
                    this.connection.commit();
                    return true;
                }
            } catch (SQLException e) {
                try {
                    this.connection.rollback();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                e.printStackTrace();
            }
            return false;
        }
        return false;
    }
    @Override
    public boolean add(PreparedStatement pre) {
        return executeUpdate(pre); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean edit(PreparedStatement pre) {
        return executeUpdate(pre); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean del(PreparedStatement pre) {
        return executeUpdate(pre); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet get(PreparedStatement pre) {
        try {
            return pre.executeQuery();
        } catch (SQLException e) {
            try {
                this.connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }
        return null; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet get(String sql) {
        try {
            PreparedStatement pre = this.connection.prepareStatement(sql);
            return this.get(pre);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ConnectionPool getConnection() {
        return this.connectionPool; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void releaseConnection() {
        try{
            this.connectionPool.releaseConnection(connection);
        } catch(SQLException e){
        }//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void refreshConnectionPool() {
        this.connectionPool.refreshConnectionPool(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
