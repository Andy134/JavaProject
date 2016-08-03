/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lottery.transfer;

import com.lottery.dao.CategoryDao;
import com.lottery.dao.CategoryDaoImpl;
import com.lottery.model.Category;
import com.lottery.utils.ConnectionPool;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TuanAnh
 */
public class CategoryTransfer {

    private CategoryDao categoryDao;

    public CategoryTransfer(ConnectionPool cp) {
        this.categoryDao = new CategoryDaoImpl(cp);
    }

    /**
     * *****Các phương thức quản lý connection*******
     */
    public ConnectionPool getConnectionPool() {
        return this.categoryDao.getConnection();
    }

    public void releaseConnection() {
        this.categoryDao.releaseConnection();
    }

    public void refreshConnectionPool() {
        this.categoryDao.refreshConnectionPool();
    }

    public boolean addCategory(Category category) {
        return this.categoryDao.addCategory(category);
    }

    public boolean editCategory(Category category) {
        return this.categoryDao.editCategory(category);
    }

    public boolean delCategory(Category category) {
        return this.categoryDao.deleteCategory(category);
    }

    public List<Category> findAll() {
        List<Category> list = null;
        ResultSet rs = this.categoryDao.findAll();
        // truong hop rs khac null
        if (rs != null) {
            list = new ArrayList<Category>();
            Category category = null;
            try {
                // lap cho den khi het ban ghi
                while (rs.next()) {
                    category = new Category();
                    category.setCatId(rs.getInt(1));
                    category.setCatName(rs.getString(2));
                    category.setCatDesc(rs.getString(3));
                    category.setSlug(rs.getString(4));
                    category.setPath(rs.getString(5));

                    list.add(category);
                }

            } catch (SQLException ex) {
                Logger.getLogger(UserTransfer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }

    public List<Category> find(int start, int limit) {
        List<Category> list = null;
        ResultSet rs = this.categoryDao.find(start, limit);
        // truong hop rs khac null
        if (rs != null) {
            list = new ArrayList<Category>();
            Category category = null;

            try {
                // lap cho den khi het ban ghi
                while (rs.next()) {
                    category = new Category();
                    category.setCatId(rs.getInt(1));
                    category.setCatName(rs.getString(2));
                    category.setCatDesc(rs.getString(3));
                    category.setSlug(rs.getString(4));
                    category.setPath(rs.getString(5));
                    list.add(category);
                }

            } catch (SQLException ex) {
                Logger.getLogger(UserTransfer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }

    public Category findById(int id) {
        Category category = null;
        ResultSet rs = this.categoryDao.findById(id);
        try {
            if (rs != null && rs.next()) {
                category = new Category();

                category.setCatId(rs.getInt(1));
                category.setCatName(rs.getString(2));
                category.setCatDesc(rs.getString(3));
                category.setSlug(rs.getString(4));
                category.setPath(rs.getString(5));

            }
        } catch (SQLException ex) {
            Logger.getLogger(UserTransfer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return category;
    }

}
