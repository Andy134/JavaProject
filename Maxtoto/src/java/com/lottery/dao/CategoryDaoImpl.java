/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lottery.dao;

import com.lottery.model.Category;
import com.lottery.utils.ConnectionPool;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author TuanAnh
 */
public class CategoryDaoImpl extends BaseDAOImpl implements CategoryDao{

    public CategoryDaoImpl(ConnectionPool cp) {
        super(cp);
    }

    @Override
    public boolean addCategory(Category category) {
        try {
            String sql = "Insert into categories(Category_Name, Category_Desc, Slug, Path, Parent_Id)  "
                    + "values (?,?,?,?,?)";
            PreparedStatement pre = this.connection.prepareStatement(sql);
            pre.setString(1, category.getCatName());
            pre.setString(2, category.getCatDesc());
            pre.setString(3, category.getSlug());
            pre.setString(4, category.getPath());
            pre.setInt(5, category.getParentId().getCatId());
            return this.add(pre);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;  //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editCategory(Category category) {
        try {
            String sql = "Update categories Set Category_Name=?, "
                    + "Category_Desc=?, Slug=?, Path=? , Parent_Id=?"
                    + "Where Category_Id = ?";
            PreparedStatement pre = this.connection.prepareStatement(sql);
            pre.setString(1, category.getCatName());
            pre.setString(2, category.getCatDesc());
            pre.setString(3, category.getSlug());
            pre.setString(4, category.getPath());
            pre.setInt(5, category.getParentId().getCatId());
            pre.setInt(6, category.getCatId());
            return this.edit(pre); //To change body of generated methods, choose Tools | Templates.
        } catch (SQLException e) {
        }
        return false; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteCategory(Category category) {
        try {
            String sql = "DELETE FROM categories WHERE Category_Id = ?";
            PreparedStatement pre = this.connection.prepareStatement(sql);
            pre.setInt(1, category.getCatId());
            this.del(pre);
        } catch (SQLException e) {
        }
        return false; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet findAll() {
        String sql = "SELECT * FROM categories";
        return this.get(sql); 
    }

    @Override
    public ResultSet find(int start, int limit) {
        try {
            String sql = "SELECT * FROM categories"
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
            String sql = "SELECT * FROM categories Where Category_Id = ?";
            PreparedStatement pre = this.connection.prepareStatement(sql);
            pre.setInt(1, id);
            return this.get(pre);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet findByParentId(int id) {
         try {
            String sql = "SELECT * FROM categories WHERE Parent_Id = ?";
            PreparedStatement pre = this.connection.prepareStatement(sql);
            pre.setInt(1, id);
            return this.get(pre);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;//To change body of generated methods, choose Tools | Templates.
    }
    
}
