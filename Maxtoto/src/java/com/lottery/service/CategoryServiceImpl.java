/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lottery.service;

import com.lottery.model.Category;
import com.lottery.transfer.CategoryTransfer;
import com.lottery.utils.ConnectionPool;
import java.util.List;

/**
 *
 * @author TuanAnh
 */
public class CategoryServiceImpl implements CategoryService{
    private CategoryTransfer categoryTransfer;
    
      public CategoryServiceImpl(ConnectionPool cp) {
        this.categoryTransfer = new CategoryTransfer(cp);
    }
    @Override
    public boolean addCategory(Category category) {
        return this.categoryTransfer.addCategory(category);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editCategory(Category category) {
        return this.categoryTransfer.editCategory(category); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delCategory(Category category) {
        return this.categoryTransfer.delCategory(category); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Category> findAll() {
        return this.categoryTransfer.findAll();//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Category> find(int start, int limit) {
        return this.categoryTransfer.find(start, limit);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Category findById(int id) {
        return this.categoryTransfer.findById(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ConnectionPool getConnectionPool() {
        return this.categoryTransfer.getConnectionPool(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void releaseConnection() {
        this.categoryTransfer.refreshConnectionPool();//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void refreshConnectionPool() {
        this.categoryTransfer.refreshConnectionPool(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
