/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lottery.dao;

import com.lottery.model.Category;
import com.lottery.model.Post;
import com.lottery.model.User;
import com.lottery.utils.ConnectionPool;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author TuanAnh
 */
public class PostDaoImpl extends BaseDAOImpl implements PostDao {

    public PostDaoImpl(ConnectionPool cp) {
        super(cp);
    }

    @Override
    public boolean addPost(Post post) {
        try {
            String sql = "Insert into posts(Post_Name, Cat_Id, User_Id, Post_Content, Post_Slug, Publish_Date, Last_Edit, Image, Num_Views, Status)  "
                    + "values (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pre = this.connection.prepareStatement(sql);
            pre.setString(1, post.getPostName());
            pre.setInt(2, post.getCategory().getCatId());
            pre.setInt(3, post.getUser().getUserId());
            pre.setString(4, post.getPostContent());
            pre.setString(5, post.getPostSlug());
            pre.setDate(6, new java.sql.Date(post.getPublishDate().getTime()));
            pre.setDate(7, new java.sql.Date(post.getLastEdit().getTime()));
            pre.setString(8, post.getImage());
            pre.setInt(9, post.getNumView());
            pre.setInt(10, post.getStatus());

            return this.add(pre); //To change body of generated methods, choose Tools | Templates.
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editPost(Post post) {
         try {
            String sql = "Update posts Set Post_Name=?, Cat_Id=?, User_Id=?, Post_Content=?, Post_Slug=?, "
                        + "Publish_Date=?, Last_Edit=?, Image=?, Num_Views=?, Status=?"
                        + "Where Post_Id = ?";
            PreparedStatement pre = this.connection.prepareStatement(sql);
            pre.setString(1, post.getPostName());
            pre.setInt(2, post.getCategory().getCatId());
            pre.setInt(3, post.getUser().getUserId());
            pre.setString(4, post.getPostContent());
            pre.setString(5, post.getPostSlug());
            pre.setDate(6, new java.sql.Date(post.getPublishDate().getTime()));
            pre.setDate(7, new java.sql.Date(post.getLastEdit().getTime()));
            pre.setString(8, post.getImage());
            pre.setInt(9, post.getNumView());
            pre.setInt(10, post.getStatus());
            
            pre.setInt(11, post.getPostId());

            return this.edit(pre); //To change body of generated methods, choose Tools | Templates.
        } catch (SQLException e) {
        }
        return false; //To change body of generated methods, choose Tools | Templates. //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deletePost(Post post) {
        try {
            String sql = "DELETE FROM posts WHERE Post_Id = ?";
            PreparedStatement pre = this.connection.prepareStatement(sql);
            pre.setInt(1, post.getPostId());
            this.del(pre);
        } catch (SQLException e) {
        }
        return false; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet findAll() {
        String sql = "SELECT * FROM posts inner join users using(User_ID) inner join categories using(Category_Id);";
        return this.get(sql); //To change body of generated methods, choose Tools | Templates.
     //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet find(int start, int limit) {
         try {
            String sql = "SELECT * FROM posts inner join users using(User_ID) inner join categories using(Category_Id);"
                    + " LIMIT ?, ?";
            PreparedStatement pre = this.connection.prepareStatement(sql);
            pre.setInt(1, start);
            pre.setInt(2, limit);
            return this.get(pre);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet findById(int id) {
        try {
            String sql = "SELECT * FROM posts inner join users using(User_ID) inner join categories using(Category_Id) WHERE Post_Id = ?";
            PreparedStatement pre = this.connection.prepareStatement(sql);
            pre.setInt(1, id);
            return this.get(pre);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet findByUser(User user) {
         try {
            String sql = "SELECT * FROM posts inner join users using(User_ID) inner join categories using(Category_Id) WHERE User_Id = ?";
            PreparedStatement pre = this.connection.prepareStatement(sql);
            pre.setInt(1, user.getUserId());
            return this.get(pre);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet findByCat(Category category) {
        try {
            String sql = "SELECT * FROM posts inner join users using(User_ID) inner join categories using(Category_Id) WHERE Category_Id = ?";
            PreparedStatement pre = this.connection.prepareStatement(sql);
            pre.setInt(1, category.getCatId());
            return this.get(pre);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null; //To change body of generated methods, choose Tools | Templates.
    }

}
