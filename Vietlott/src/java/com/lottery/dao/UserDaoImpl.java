/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lottery.dao;

import com.lottery.model.User;
import com.lottery.utils.ConnectionPool;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author tuananh
 */
public class UserDaoImpl extends BaseDAOImpl implements UserDao {

    public UserDaoImpl(ConnectionPool cp) {
        super(cp);
    }

    @Override
    public boolean addUser(User user) {
        try {
            
            String sql = "INSERT INTO users("
                    + " User_Id, First_Name, Last_Name, Gender, "
                    + " Email, Password, User_Role, "
                    + " Active_Date, Avatar) "
                    + " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pre = this.connection.prepareStatement(sql);
            pre.setInt(1, user.getUserId());
            pre.setString(2, user.getFirstName());
            pre.setString(3, user.getLastName());
            pre.setInt(4, user.getGender());
            pre.setString(5, user.getEmail());
            pre.setString(6, user.getPassword());
            pre.setString(7, user.getUserRole());
            pre.setDate(8, new java.sql.Date(user.getActiveDate().getTime()));
            pre.setString(9, user.getAvatar());
            return this.add(pre);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editUser(User user) {
        try {
            String sql = "UPDATE users SET First_Name=?, Last_Name=?, "
                    + " Gender=?, Email=?, Password=?, User_Role=?, "
                    + " Active_Date=?, Avatar=? WHERE Post_ID = ?";
            PreparedStatement pre = this.connection.prepareStatement(sql);
            pre.setString(1, user.getFirstName());
            pre.setString(2, user.getLastName());
            pre.setInt(3, user.getGender());
            pre.setString(4, user.getEmail());
            pre.setString(5, user.getPassword());
            pre.setString(6, user.getUserRole());
            pre.setDate(7, new java.sql.Date(user.getActiveDate().getTime()));
            pre.setString(8, user.getAvatar());
            pre.setInt(10, user.getUserId());
            return this.edit(pre); //To change body of generated methods, choose Tools | Templates.
        } catch (SQLException e) {
        }
        return false;
    }

    @Override
    public boolean deleteUser(User user) {
        try {
            String sql = "DELETE FROM users WHERE User_ID = ?";
            PreparedStatement pre = this.connection.prepareStatement(sql);
            pre.setInt(1, user.getUserId());
            this.del(pre);
        } catch (SQLException e) {
        }
        return false; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet findAll() {
        String sql = "SELECT * FROM users";
        return this.get(sql); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet find(int start, int limit) {
        try {
            String sql = "SELECT * FROM users LIMIT ?, ?";
            PreparedStatement pre = this.connection.prepareStatement(sql);
            pre.setInt(1, start);
            pre.setInt(2, limit);
            return this.get(pre);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet findById(int id) {
        try {
            String sql = "SELECT * FROM users WHERE User_Id = ?";
            PreparedStatement pre = this.connection.prepareStatement(sql);
            pre.setInt(1, id);
            return this.get(pre);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet findByEmail(String email) {
        try {
            String sql = "SELECT * FROM users WHERE Email = ?";
            PreparedStatement pre = this.connection.prepareStatement(sql);
            pre.setString(1, email);
            return this.get(pre);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null; //To change body of generated methods, choose Tools | Templates.
    }

}
