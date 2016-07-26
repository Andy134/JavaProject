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

/**
 *
 * @author tuananh
 */
public class UserTransfer {
    private UserDao userDao;
    public UserTransfer(ConnectionPool cp){
        this.userDao = new UserDaoImpl(cp);
    }
    /*******Các phương thức quản lý connection********/
    public ConnectionPool getConnectionPool(){
        return this.userDao.getConnection();
    }
    public void releaseConnection(){
        this.userDao.releaseConnection();
    }
    public void refreshConnectionPool(){
        this.userDao.refreshConnectionPool();
    }
    /***************/
    
    public boolean addUser(User user) {
        return this.userDao.addUser(user);
    }
    public boolean editUser(User user) {
        return this.userDao.editUser(user);
    }
    public boolean delUser(User user) {
        return this.userDao.deleteUser(user);
    }
    
}
