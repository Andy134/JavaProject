/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Page;

/**
 *
 * @author tuananh
 */
public class PageDao {
    public void addPage(Page page)  {
        Connection connection=ConnectionUtil.getMySQLConnection();
        Statement stmt=null;
        try {
            String insertPage = "insert into mtruyentranh8_db.pages(pagesUrl) values ('"+ page.getPageUrl() +"')";
            stmt = connection.createStatement();          
            stmt.executeUpdate(insertPage);
        } catch (SQLException e) {
        } finally{
            ConnectionUtil.closeStatement(stmt);
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(PageDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void removePage(Page page)  {
        Connection connection=ConnectionUtil.getMySQLConnection();
        Statement stmt=null;
        try {
            String removePage = "delete from mtruyentranh8_db.pages where idpages="+page.getPageId();
            stmt = connection.createStatement();          
            stmt.executeUpdate(removePage);
        } catch (SQLException e) {
        } finally{
            ConnectionUtil.closeStatement(stmt);
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(PageDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public Page callPageUrl(){
        Connection connection=ConnectionUtil.getMySQLConnection();
        Statement stmt=null;
        ResultSet res =null;
        Page page = new Page();
         try {
            String findPage = "select idpages, pagesUrl from mtruyentranh8_db.pages";
            stmt = connection.createStatement();
            res = stmt.executeQuery(findPage);
            while (res.next()) {
                int pId = res.getInt(1);
                String pUrl = res.getString(2);
                page.setPageId(pId);
                page.setPageUrl(pUrl);
            }
             return page;
        } catch (SQLException e) {
        } finally{
            ConnectionUtil.closeStatement(stmt);
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(PageDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         return null;
    }
    public Page findPagebyUrl(String pageUrl){
        Connection connection=ConnectionUtil.getMySQLConnection();
        Statement stmt=null;
        ResultSet res =null;
        Page page = new Page();
         try {
            String findPage = "select idpages, pagesUrl from mtruyentranh8_db.pages where pagesUrl='"+pageUrl+"'";
            stmt = connection.createStatement();
            res = stmt.executeQuery(findPage);
            while (res.next()) {
                page.setPageId(res.getInt("idpages"));
                page.setPageUrl(res.getString("pagesUrl"));
            }
            return page;
        } catch (SQLException e) {
        } finally{
            ConnectionUtil.closeStatement(stmt);
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(PageDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         return null;
    }
}
