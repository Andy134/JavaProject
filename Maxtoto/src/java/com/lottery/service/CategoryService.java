/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lottery.service;

import com.lottery.model.Category;
import java.util.List;

/**
 *
 * @author TuanAnh
 */
public interface CategoryService extends BaseService{
     public boolean addCategory(Category category);
    // Sua post
    public boolean editCategory(Category category);
    // Xoa post
    public boolean delCategory(Category category);
    // Lay danh sach post
    public List<Category> findAll();
    // Lay danh sach post theo phan trang
    public List<Category> find(int start, int limit);
    // lay post theo id
    public Category findById(int id);
}
