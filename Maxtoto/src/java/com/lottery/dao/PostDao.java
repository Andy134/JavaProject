/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lottery.dao;

import com.lottery.model.Category;
import com.lottery.model.Post;
import com.lottery.model.User;
import java.sql.ResultSet;

/**
 *
 * @author TuanAnh
 */
public interface PostDao extends BaseDAO{
    public boolean addPost(Post post);
    public boolean editPost(Post post);
    public boolean deletePost(Post post);
    public ResultSet findAll();
    //Lay danh sach post theo phan trang
    public ResultSet find(int start, int limit);
    public ResultSet findById(int id);
    public ResultSet findByUser(User user);
    public ResultSet findByCat(Category category);
}