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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Comic;


/**
 *
 * @author tuananh
 */
public class ComicDao {
    public void addComic(Comic comic)  {
        Connection connection=ConnectionUtil.getMySQLConnection();
        Statement stmt=null;
        try {
            String insertPage = "insert into mtruyentranh8_db.comics(comicsUrl, comicsTitle, comicsLastUpdateTime) "
                              + "values ('"+ comic.getComicUrl()+"', '"+ comic.getComicTitle()+"', '"+ comic.getComicLastUpdateTime()+"')";
            stmt = connection.createStatement();          
            stmt.executeUpdate(insertPage);
        } catch (SQLException e) {
        } finally{
            ConnectionUtil.closeStatement(stmt);
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(ComicDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void updateComic(Comic comic)  {
        Connection connection=ConnectionUtil.getMySQLConnection();
        Statement stmt=null;
        try {
            String updatePage = "UPDATE mtruyentranh8_db.comics "
                    + "SET comicsLastUpdateTime ='"+comic.getComicLastUpdateTime()+"', comicsTitle='"+comic.getComicTitle()+"' "
                    + "WHERE idcomics='"+comic.getComicId()+"';";
            stmt = connection.createStatement();          
            stmt.executeUpdate(updatePage);
        } catch (SQLException e) {
        } finally{
            ConnectionUtil.closeStatement(stmt);
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(ComicDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void removeComic(Comic comic)  {
        Connection connection=ConnectionUtil.getMySQLConnection();
        Statement stmt=null;
        try {
            String removePage = "delete from mtruyentranh8_db.comics where idcomics="+comic.getComicId();
            stmt = connection.createStatement();          
            stmt.executeUpdate(removePage);
        } catch (SQLException e) {
        } finally{
            ConnectionUtil.closeStatement(stmt);
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(ComicDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public ArrayList<String> getAllComicUrl(){
        Connection connection=ConnectionUtil.getMySQLConnection();
        Statement stmt=null;
        ResultSet res =null;
        ArrayList<String> comicURLs = new ArrayList<>();
         try {
            String query = "SELECT comicsUrl FROM mtruyentranh8_db.comics";
            stmt = connection.createStatement();
            res = stmt.executeQuery(query);
            while(res.next()){
                comicURLs.add(res.getString("comicsUrl"));
            }
            return comicURLs;
        } catch (SQLException e) {
        } finally{
            ConnectionUtil.closeStatement(stmt);
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(ComicDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         return null;
    }
    public int findComicByUrl(String comicUrl){
        Connection connection=ConnectionUtil.getMySQLConnection();
        Statement stmt=null;
        ResultSet res =null;
        
         try {
            String findComic = "SELECT idcomics FROM mtruyentranh8_db.comics where comicsUrl='"+comicUrl+"'";
            stmt = connection.createStatement();
            res = stmt.executeQuery(findComic);
            while(res.next()){
                return res.getInt("idcomics");
            }
        } catch (SQLException e) {
        } finally{
            ConnectionUtil.closeStatement(stmt);
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(ComicDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         return -1;
    }
}
