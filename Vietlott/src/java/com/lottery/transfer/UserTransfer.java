/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lottery.transfer;

import com.lottery.dao.UserDao;
import com.lottery.dao.UserDaoImpl;
import com.lottery.model.User;
import com.lottery.utils.ConnectionPool;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tuananh
 */
public class UserTransfer {

    private UserDao userDao;

    public UserTransfer(ConnectionPool cp) {
        this.userDao = new UserDaoImpl(cp);
    }

    /**
     * *****Các phương thức quản lý connection*******
     */
    public ConnectionPool getConnectionPool() {
        return this.userDao.getConnection();
    }

    public void releaseConnection() {
        this.userDao.releaseConnection();
    }

    public void refreshConnectionPool() {
        this.userDao.refreshConnectionPool();
    }

    /**
     * ************
     */
    public boolean addUser(User user) {
        return this.userDao.addUser(user);
    }

    public boolean editUser(User user) {
        return this.userDao.editUser(user);
    }

    public boolean delUser(User user) {
        return this.userDao.deleteUser(user);
    }

    public List<User> find(int start, int limit) {
        List<User> list = null;
        ResultSet rs = this.userDao.find(start, limit);
        // truong hop rs khac null
        if (rs != null) {
            list = new ArrayList<User>();
            User user = null;
            try {
                // lap cho den khi het ban ghi
                while (rs.next()) {
                    user = new User();

                    user.setUserId(rs.getInt(1));
                    user.setFirstName(rs.getString(2));
                    user.setLastName(rs.getString(3));
                    user.setGender(rs.getInt(4));
                    user.setEmail(rs.getString(5));
                    user.setPassword(rs.getString(6));
                    user.setUserRole(rs.getString(7));
                    user.setActiveDate(rs.getDate(8));
                    user.setAvatar(rs.getString(9));

                    list.add(user);
                }

            } catch (SQLException ex) {
                Logger.getLogger(UserTransfer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }

    public List<User> findAll() {
        List<User> list = null;
        ResultSet rs = this.userDao.findAll();
        // truong hop rs khac null
        if (rs != null) {
            list = new ArrayList<User>();
            User user = null;
            try {
                // lap cho den khi het ban ghi
                while (rs.next()) {
                    user = new User();

                    user.setUserId(rs.getInt(1));
                    user.setFirstName(rs.getString(2));
                    user.setLastName(rs.getString(3));
                    user.setGender(rs.getInt(4));
                    user.setEmail(rs.getString(5));
                    user.setPassword(rs.getString(6));
                    user.setUserRole(rs.getString(7));
                    user.setActiveDate(rs.getDate(8));
                    user.setAvatar(rs.getString(9));

                    list.add(user);
                }

            } catch (SQLException ex) {
                Logger.getLogger(UserTransfer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }

    public User findById(int id) {
        User user = null;
        ResultSet rs = this.userDao.findById(id);
        try {
            if (rs != null && rs.next()) {
                user = new User();
                user.setUserId(rs.getInt(1));
                user.setFirstName(rs.getString(2));
                user.setLastName(rs.getString(3));
                user.setGender(rs.getInt(4));
                user.setEmail(rs.getString(5));
                user.setPassword(rs.getString(6));
                user.setUserRole(rs.getString(7));
                user.setActiveDate(rs.getDate(8));
                user.setAvatar(rs.getString(9));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserTransfer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }
    
    public User findByEmail(String email) {
        User user = null;
        ResultSet rs = this.userDao.findByEmail(email);
        try {
            if (rs != null && rs.next()) {
                user = new User();
                user.setUserId(rs.getInt(1));
                user.setFirstName(rs.getString(2));
                user.setLastName(rs.getString(3));
                user.setGender(rs.getInt(4));
                user.setEmail(rs.getString(5));
                user.setPassword(rs.getString(6));
                user.setUserRole(rs.getString(7));
                user.setActiveDate(rs.getDate(8));
                user.setAvatar(rs.getString(9));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserTransfer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }
    
    public User checkUserLogin(String email, String password) {
        User user = null;
        ResultSet rs = this.userDao.checkUserLogin(email, password);
        try {
            if (rs != null && rs.next()) {
                user = new User();
                user.setUserId(rs.getInt(1));
                user.setFirstName(rs.getString(2));
                user.setLastName(rs.getString(3));
                user.setGender(rs.getInt(4));
                user.setEmail(rs.getString(5));
                user.setPassword(rs.getString(6));
                user.setUserRole(rs.getString(7));
                user.setActiveDate(rs.getDate(8));
                user.setAvatar(rs.getString(9));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserTransfer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }
}
