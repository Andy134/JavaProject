/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lottery.dao;

import com.lottery.model.Category;
import java.sql.ResultSet;

/**
 *
 * @author TuanAnh
 */
public interface CategoryDao extends BaseDAO{
    public boolean addCategory(Category category);
    public boolean editCategory(Category category);
    public boolean deleteCategory(Category category);
    public ResultSet findAll();
    //Lay danh sach post theo phan trang
    public ResultSet find(int start, int limit);
    public ResultSet findById(int id);
    public ResultSet findByParentId(int id);
}
