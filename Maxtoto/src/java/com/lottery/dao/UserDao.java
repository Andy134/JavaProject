/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lottery.dao;

import com.lottery.model.User;
import java.sql.ResultSet;

/**
 *
 * @author tuananh
 */
public interface UserDao extends BaseDAO{
    public boolean addUser(User user);
    public boolean editUser(User user);
    public boolean deleteUser(User user);
    public ResultSet findAll();
    //Lay danh sach post theo phan trang
    public ResultSet find(int start, int limit);
    public ResultSet findById(int id);
    public ResultSet findByEmail(String email);
    // Check Email/ Password
    public ResultSet checkUserLogin(String Email, String password);
}
