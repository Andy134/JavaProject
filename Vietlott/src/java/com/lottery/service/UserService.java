/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lottery.service;

import com.lottery.model.User;
import java.util.List;

/**
 *
 * @author tuananh
 */
public interface UserService extends BaseService{
    // Them moi post
    public boolean addUser(User user);
    // Sua post
    public boolean editUser(User user);
    // Xoa post
    public boolean delUser(User user);
    // Lay danh sach post
    public List<User> findAll();
    // Lay danh sach post theo phan trang
    public List<User> find(int start, int limit);
    // lay post theo id
    public User findById(int id);
    // lay post theo email
    public User findByEmail(String email);
    // Check ton tai user and password
    public User checkUserLogin(String email, String password);
}
