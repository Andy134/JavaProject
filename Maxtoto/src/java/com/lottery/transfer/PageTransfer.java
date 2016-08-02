/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lottery.transfer;

import com.lottery.dao.PageDao;
import com.lottery.dao.PageDaoImpl;
import com.lottery.model.Page;
import com.lottery.model.User;
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
public class PageTransfer {

    private PageDao pageDao;

    public PageTransfer(ConnectionPool cp) {
        this.pageDao = new PageDaoImpl(cp);
    }

    /**
     * *****Các phương thức quản lý connection*******
     */
    public ConnectionPool getConnectionPool() {
        return this.pageDao.getConnection();
    }

    public void releaseConnection() {
        this.pageDao.releaseConnection();
    }

    public void refreshConnectionPool() {
        this.pageDao.refreshConnectionPool();
    }

    public boolean addPage(Page page) {
        return this.pageDao.addPage(page);
    }

    public boolean editPage(Page page) {
        return this.pageDao.editPage(page);
    }

    public boolean delPage(Page page) {
        return this.pageDao.deletePage(page);
    }

    public List<Page> findAll() {
        List<Page> list = null;
        ResultSet rs = this.pageDao.findAll();
        // truong hop rs khac null
        if (rs != null) {
            list = new ArrayList<Page>();
            Page page = null;
            User user = null;
            try {
                // lap cho den khi het ban ghi
                while (rs.next()) {
                    page = new Page();
                    user = new User();

                    user.setUserId(rs.getInt(1));
                    page.setPageId(rs.getInt(2));
                    page.setPageName(rs.getString(3));
                    page.setPageContent(rs.getString(4));
                    page.setPageSlug(rs.getString(5));
                    page.setPublishDate(rs.getDate(6));
                    page.setLastEdit(rs.getDate(7));
                    page.setStatus(rs.getInt(8));

                    user.setFirstName(rs.getString(9));
                    user.setLastName(rs.getString(10));
                    user.setGender(rs.getInt(11));
                    user.setEmail(rs.getString(12));
                    user.setPassword(rs.getString(13));
                    user.setUserRole(rs.getString(14));
                    user.setActiveDate(rs.getDate(15));
                    user.setAvatar(rs.getString(16));

                    page.setUser(user);
                    list.add(page);
                }

            } catch (SQLException ex) {
                Logger.getLogger(UserTransfer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }

    public List<Page> find(int start, int limit) {
        List<Page> list = null;
        ResultSet rs = this.pageDao.find(start, limit);
        // truong hop rs khac null
        if (rs != null) {
            list = new ArrayList<Page>();
            Page page = null;
            User user = null;
            try {
                // lap cho den khi het ban ghi
                while (rs.next()) {
                    page = new Page();
                    user = new User();

                    user.setUserId(rs.getInt(1));
                    page.setPageId(rs.getInt(2));
                    page.setPageName(rs.getString(3));
                    page.setPageContent(rs.getString(4));
                    page.setPageSlug(rs.getString(5));
                    page.setPublishDate(rs.getDate(6));
                    page.setLastEdit(rs.getDate(7));
                    page.setStatus(rs.getInt(8));

                    user.setFirstName(rs.getString(9));
                    user.setLastName(rs.getString(10));
                    user.setGender(rs.getInt(11));
                    user.setEmail(rs.getString(12));
                    user.setPassword(rs.getString(13));
                    user.setUserRole(rs.getString(14));
                    user.setActiveDate(rs.getDate(15));
                    user.setAvatar(rs.getString(16));

                    page.setUser(user);
                    list.add(page);
                }

            } catch (SQLException ex) {
                Logger.getLogger(UserTransfer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }

    public Page findById(int id) {
        Page page = null;
        User user = null;
        ResultSet rs = this.pageDao.findById(id);
        try {
            if (rs != null && rs.next()) {
                page = new Page();
                user = new User();

                user.setUserId(rs.getInt(1));
                page.setPageId(rs.getInt(2));
                page.setPageName(rs.getString(3));
                page.setPageContent(rs.getString(4));
                page.setPageSlug(rs.getString(5));
                page.setPublishDate(rs.getDate(6));
                page.setLastEdit(rs.getDate(7));
                page.setStatus(rs.getInt(8));

                user.setFirstName(rs.getString(9));
                user.setLastName(rs.getString(10));
                user.setGender(rs.getInt(11));
                user.setEmail(rs.getString(12));
                user.setPassword(rs.getString(13));
                user.setUserRole(rs.getString(14));
                user.setActiveDate(rs.getDate(15));
                user.setAvatar(rs.getString(16));

                page.setUser(user);

            }
        } catch (SQLException ex) {
            Logger.getLogger(UserTransfer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return page;
    }

    public Page findByUser(User u) {
        Page page = null;
        User user = null;
        ResultSet rs = this.pageDao.findByUser(u);
        try {
            if (rs != null && rs.next()) {
                page = new Page();
                user = new User();

                user.setUserId(rs.getInt(1));
                page.setPageId(rs.getInt(2));
                page.setPageName(rs.getString(3));
                page.setPageContent(rs.getString(4));
                page.setPageSlug(rs.getString(5));
                page.setPublishDate(rs.getDate(6));
                page.setLastEdit(rs.getDate(7));
                page.setStatus(rs.getInt(8));

                user.setFirstName(rs.getString(9));
                user.setLastName(rs.getString(10));
                user.setGender(rs.getInt(11));
                user.setEmail(rs.getString(12));
                user.setPassword(rs.getString(13));
                user.setUserRole(rs.getString(14));
                user.setActiveDate(rs.getDate(15));
                user.setAvatar(rs.getString(16));

                page.setUser(user);

            }
        } catch (SQLException ex) {
            Logger.getLogger(UserTransfer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return page;
    }

}
