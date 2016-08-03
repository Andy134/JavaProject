/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lottery.transfer;

import com.lottery.dao.PostDao;
import com.lottery.dao.PostDaoImpl;
import com.lottery.model.Category;
import com.lottery.model.Post;
import com.lottery.model.User;
import com.lottery.utils.ConnectionPool;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author TuanAnh
 */
public class PostTransfer {
    private PostDao postDao;

    public PostTransfer(ConnectionPool cp) {
        this.postDao = new PostDaoImpl(cp);
    }

    /**
     * *****Các phương thức quản lý connection*******
     */
    public ConnectionPool getConnectionPool() {
        return this.postDao.getConnection();
    }

    public void releaseConnection() {
        this.postDao.releaseConnection();
    }

    public void refreshConnectionPool() {
        this.postDao.refreshConnectionPool();
    }

    public boolean addPost(Post post) {
        return this.postDao.addPost(post);
    }

    public boolean editPost(Post post) {
        return this.postDao.editPost(post);
    }

    public boolean delPost(Post post) {
        return this.postDao.deletePost(post);
    }

    public List<Post> findAll() {
        List<Post> list = null;
        ResultSet rs = this.postDao.findAll();
        // truong hop rs khac null
        if (rs != null) {
            list = new ArrayList<Post>();
            Post post = null;
            User user = null;
            Category category=null;
            try {
                // lap cho den khi het ban ghi
                while (rs.next()) {
                    post = new Post();
                    user = new User();
                    category = new Category();
                    
                    category.setCatId(rs.getInt(1));
                    user.setUserId(rs.getInt(2));
                    post.setPostId(rs.getInt(3));
                    
                    post.setPostName(rs.getString(4));
                    post.setPostContent(rs.getString(5));
                    post.setPostSlug(rs.getString(6));
                    post.setPublishDate(rs.getDate(7));
                    post.setLastEdit(rs.getDate(8));
                    post.setImage(rs.getString(9));
                    post.setNumView(rs.getInt(10));
                    post.setStatus(rs.getInt(11));
                    
                    user.setFirstName(rs.getString(12));
                    user.setLastName(rs.getString(13));
                    user.setGender(rs.getInt(14));
                    user.setEmail(rs.getString(15));
                    user.setPassword(rs.getString(16));
                    user.setUserRole(rs.getString(17));
                    user.setActiveDate(rs.getDate(18));
                    user.setAvatar(rs.getString(19));
                    
                    category.setCatName(rs.getString(20));
                    category.setCatDesc(rs.getString(21));
                    category.setSlug(rs.getString(22));
                    category.setPath(rs.getString(23));
                    
                    post.setCategory(category);
                    post.setUser(user);
                    list.add(post);
                }

            } catch (SQLException ex) {
                Logger.getLogger(UserTransfer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }

    public List<Post> find(int start, int limit) {
        List<Post> list = null;
        ResultSet rs = this.postDao.find(start, limit);
        // truong hop rs khac null
        if (rs != null) {
            list = new ArrayList<Post>();
            Post post = null;
            User user = null;
            Category category=null;
            try {
                // lap cho den khi het ban ghi
                while (rs.next()) {
                    post = new Post();
                    user = new User();
                    category = new Category();
                    
                    category.setCatId(rs.getInt(1));
                    user.setUserId(rs.getInt(2));
                    post.setPostId(rs.getInt(3));
                    
                    post.setPostName(rs.getString(4));
                    post.setPostContent(rs.getString(5));
                    post.setPostSlug(rs.getString(6));
                    post.setPublishDate(rs.getDate(7));
                    post.setLastEdit(rs.getDate(8));
                    post.setImage(rs.getString(9));
                    post.setNumView(rs.getInt(10));
                    post.setStatus(rs.getInt(11));
                    
                    user.setFirstName(rs.getString(12));
                    user.setLastName(rs.getString(13));
                    user.setGender(rs.getInt(14));
                    user.setEmail(rs.getString(15));
                    user.setPassword(rs.getString(16));
                    user.setUserRole(rs.getString(17));
                    user.setActiveDate(rs.getDate(18));
                    user.setAvatar(rs.getString(19));
                    
                    category.setCatName(rs.getString(20));
                    category.setCatDesc(rs.getString(21));
                    category.setSlug(rs.getString(22));
                    category.setPath(rs.getString(23));
                    
                    post.setCategory(category);
                    post.setUser(user);
                    list.add(post);
                }

            } catch (SQLException ex) {
                Logger.getLogger(UserTransfer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }

    public Post findById(int id) {
        Post post = null;
        User user = null;
        Category category = null;
        ResultSet rs = this.postDao.findById(id);
        try {
            if (rs != null && rs.next()) {
                post = new Post();
                    user = new User();
                    category = new Category();
                    
                    category.setCatId(rs.getInt(1));
                    user.setUserId(rs.getInt(2));
                    post.setPostId(rs.getInt(3));
                    
                    post.setPostName(rs.getString(4));
                    post.setPostContent(rs.getString(5));
                    post.setPostSlug(rs.getString(6));
                    post.setPublishDate(rs.getDate(7));
                    post.setLastEdit(rs.getDate(8));
                    post.setImage(rs.getString(9));
                    post.setNumView(rs.getInt(10));
                    post.setStatus(rs.getInt(11));
                    
                    user.setFirstName(rs.getString(12));
                    user.setLastName(rs.getString(13));
                    user.setGender(rs.getInt(14));
                    user.setEmail(rs.getString(15));
                    user.setPassword(rs.getString(16));
                    user.setUserRole(rs.getString(17));
                    user.setActiveDate(rs.getDate(18));
                    user.setAvatar(rs.getString(19));
                    
                    category.setCatName(rs.getString(20));
                    category.setCatDesc(rs.getString(21));
                    category.setSlug(rs.getString(22));
                    category.setPath(rs.getString(23));
                    
                    post.setCategory(category);
                    post.setUser(user);

            }
        } catch (SQLException ex) {
            Logger.getLogger(UserTransfer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return post;
    }

    
    public Post findByUser(User u) {
        Post post = null;
        User user = null;
        Category category = null;
        ResultSet rs = this.postDao.findByUser(u);
        try {
            if (rs != null && rs.next()) {
                post = new Post();
                    user = new User();
                    category = new Category();
                    
                    category.setCatId(rs.getInt(1));
                    user.setUserId(rs.getInt(2));
                    post.setPostId(rs.getInt(3));
                    
                    post.setPostName(rs.getString(4));
                    post.setPostContent(rs.getString(5));
                    post.setPostSlug(rs.getString(6));
                    post.setPublishDate(rs.getDate(7));
                    post.setLastEdit(rs.getDate(8));
                    post.setImage(rs.getString(9));
                    post.setNumView(rs.getInt(10));
                    post.setStatus(rs.getInt(11));
                    
                    user.setFirstName(rs.getString(12));
                    user.setLastName(rs.getString(13));
                    user.setGender(rs.getInt(14));
                    user.setEmail(rs.getString(15));
                    user.setPassword(rs.getString(16));
                    user.setUserRole(rs.getString(17));
                    user.setActiveDate(rs.getDate(18));
                    user.setAvatar(rs.getString(19));
                    
                    category.setCatName(rs.getString(20));
                    category.setCatDesc(rs.getString(21));
                    category.setSlug(rs.getString(22));
                    category.setPath(rs.getString(23));
                    
                    post.setCategory(category);
                    post.setUser(user);

            }
        } catch (SQLException ex) {
            Logger.getLogger(UserTransfer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return post;
    }
    
    public Post findByCat(Category cat) {
        Post post = null;
        User user = null;
        Category category = null;
        ResultSet rs = this.postDao.findByCat(cat);
        try {
            if (rs != null && rs.next()) {
                post = new Post();
                    user = new User();
                    category = new Category();
                    
                    category.setCatId(rs.getInt(1));
                    user.setUserId(rs.getInt(2));
                    post.setPostId(rs.getInt(3));
                    
                    post.setPostName(rs.getString(4));
                    post.setPostContent(rs.getString(5));
                    post.setPostSlug(rs.getString(6));
                    post.setPublishDate(rs.getDate(7));
                    post.setLastEdit(rs.getDate(8));
                    post.setImage(rs.getString(9));
                    post.setNumView(rs.getInt(10));
                    post.setStatus(rs.getInt(11));
                    
                    user.setFirstName(rs.getString(12));
                    user.setLastName(rs.getString(13));
                    user.setGender(rs.getInt(14));
                    user.setEmail(rs.getString(15));
                    user.setPassword(rs.getString(16));
                    user.setUserRole(rs.getString(17));
                    user.setActiveDate(rs.getDate(18));
                    user.setAvatar(rs.getString(19));
                    
                    category.setCatName(rs.getString(20));
                    category.setCatDesc(rs.getString(21));
                    category.setSlug(rs.getString(22));
                    category.setPath(rs.getString(23));
                    
                    post.setCategory(category);
                    post.setUser(user);

            }
        } catch (SQLException ex) {
            Logger.getLogger(UserTransfer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return post;
    }
}
