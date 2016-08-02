/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lottery.dao;

import com.lottery.model.Page;
import com.lottery.model.User;
import java.sql.ResultSet;

/**
 *
 * @author TuanAnh
 */
public interface PageDao extends BaseDAO{
    public boolean addPage(Page page);
    public boolean editPage(Page page);
    public boolean deletePage(Page page);
    public ResultSet findAll();
    //Lay danh sach post theo phan trang
    public ResultSet find(int start, int limit);
    public ResultSet findById(int id);
    public ResultSet findByUser(User user);
}