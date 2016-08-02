/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lottery.dao;

import com.lottery.model.Page;
import com.lottery.model.User;
import com.lottery.utils.ConnectionPool;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author TuanAnh
 */
public class PageDaoImpl extends BaseDAOImpl implements PageDao {

    public PageDaoImpl(ConnectionPool cp) {
        super(cp);
    }

    @Override
    public boolean addPage(Page page) {
        try {

            String sql = "Insert into pages(Page_Id, Page_Name, Page_Content, Page_Slug, User_Id, Publish_Date, Last_Edit, Status)  "
                    + "values (?,?,?,?,?,?,?,?)";
            PreparedStatement pre = this.connection.prepareStatement(sql);
            pre.setInt(1, page.getPageId());
            pre.setString(2, page.getPageName());
            pre.setString(3, page.getPageContent());
            pre.setString(4, page.getPageSlug());
            pre.setInt(5, page.getUser().getUserId());
            pre.setDate(6, new java.sql.Date(page.getPublishDate().getTime()));
            pre.setDate(7, new java.sql.Date(page.getLastEdit().getTime()));
            pre.setInt(8, page.getStatus());

            return this.add(pre);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editPage(Page page) {
        try {
            String sql = "Update pages Set Page_Name=?, "
                    + "Page_Content=?, Page_Slug=?, "
                    + "User_Id=?, Last_Edit=?, Status=? "
                    + "Where Page_Id = ?";
            PreparedStatement pre = this.connection.prepareStatement(sql);
            pre.setString(1, page.getPageName());
            pre.setString(2, page.getPageContent());
            pre.setString(3, page.getPageSlug());
            pre.setInt(4, page.getUser().getUserId());
            pre.setDate(5, new java.sql.Date(page.getLastEdit().getTime()));
            pre.setInt(6, page.getStatus());
            pre.setInt(7, page.getPageId());

            return this.edit(pre); //To change body of generated methods, choose Tools | Templates.
        } catch (SQLException e) {
        }
        return false; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deletePage(Page page) {
        try {
            String sql = "DELETE FROM pages WHERE Page_Id = ?";
            PreparedStatement pre = this.connection.prepareStatement(sql);
            pre.setInt(1, page.getPageId());
            this.del(pre);
        } catch (SQLException e) {
        }
        return false; //To change body of generated methods, choose Tools | Templates. //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet findAll() {
        String sql = "SELECT * FROM pages inner join users using(User_ID);";
        return this.get(sql); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet find(int start, int limit) {
        try {
            String sql = "SELECT * FROM pages inner join users using(User_ID)"
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
            String sql = "SELECT * FROM pages inner join users using(User_ID) WHERE Page_Id = ?";
            PreparedStatement pre = this.connection.prepareStatement(sql);
            pre.setInt(1, id);
            return this.get(pre);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet findByUser(User user) {
        try {
            String sql = "SELECT * FROM pages inner join users using(User_ID) WHERE User_id = ?";
            PreparedStatement pre = this.connection.prepareStatement(sql);
            pre.setInt(1, user.getUserId());
            return this.get(pre);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null; //To change body of generated methods, choose Tools | Templates.
    }

}
