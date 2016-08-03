/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lottery.service;

import com.lottery.model.Category;
import com.lottery.model.Post;
import com.lottery.model.User;
import com.lottery.transfer.PostTransfer;
import com.lottery.utils.ConnectionPool;
import java.util.List;

/**
 *
 * @author TuanAnh
 */
public class PostServiceImpl implements PostService {

    private PostTransfer postTransfer;

    public PostServiceImpl(ConnectionPool cp) {
        this.postTransfer = new PostTransfer(cp);
    }

    @Override
    public boolean addPost(Post post) {
        return postTransfer.addPost(post); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editPost(Post post) {
        return postTransfer.editPost(post); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delPost(Post post) {
        return postTransfer.delPost(post); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Post> findAll() {
        return postTransfer.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Post> find(int start, int limit) {
        return postTransfer.find(start, limit); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Post findById(int id) {
        return postTransfer.findById(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Post findByUser(User user) {
        return postTransfer.findByUser(user);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Post findByCategory(Category cat) {
        return postTransfer.findByCat(cat); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ConnectionPool getConnectionPool() {
        return postTransfer.getConnectionPool(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void releaseConnection() {
        postTransfer.releaseConnection(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void refreshConnectionPool() {
        postTransfer.refreshConnectionPool(); //To change body of generated methods, choose Tools | Templates.
    }

}
