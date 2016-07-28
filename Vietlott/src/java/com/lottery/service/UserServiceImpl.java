/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lottery.service;

import com.lottery.model.User;
import com.lottery.utils.ConnectionPool;
import java.util.List;
import com.lottery.transfer.UserTransfer;
/**
 *
 * @author tuananh
 */
public class UserServiceImpl implements UserService{
    private UserTransfer userTranfer;

    public UserServiceImpl(ConnectionPool cp) {
        this.userTranfer = new UserTransfer(cp); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addUser(User user) {
        return userTranfer.addUser(user);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editUser(User user) {
        return userTranfer.editUser(user); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delUser(User user) {
        return userTranfer.delUser(user); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> findAll() {
        return this.userTranfer.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> find(int start, int limit) {
        return this.userTranfer.find(start, limit); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User findById(int id) {
        return this.userTranfer.findById(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User findByEmail(String email) {
        return this.userTranfer.findByEmail(email); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * @return *************/
    @Override
    public ConnectionPool getConnectionPool() {
        return this.userTranfer.getConnectionPool(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void releaseConnection() {
        this.userTranfer.releaseConnection(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void refreshConnectionPool() {
        this.userTranfer.refreshConnectionPool(); //To change body of generated methods, choose Tools | Templates.
    }
    /***************/
}
