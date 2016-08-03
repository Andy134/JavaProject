/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lottery.service;

import com.lottery.model.Category;
import com.lottery.model.Post;
import com.lottery.model.User;
import java.util.List;

/**
 *
 * @author TuanAnh
 */
public interface PostService extends BaseService{
    public boolean addPost(Post post);
    // Sua post
    public boolean editPost(Post post);
    // Xoa post
    public boolean delPost(Post post);
    // Lay danh sach post
    public List<Post> findAll();
    // Lay danh sach post theo phan trang
    public List<Post> find(int start, int limit);
    // lay post theo id
    public Post findById(int id);
    // lay post theo email
    public Post findByUser(User user);
    
    public Post findByCategory(Category cat);
    
    
}
