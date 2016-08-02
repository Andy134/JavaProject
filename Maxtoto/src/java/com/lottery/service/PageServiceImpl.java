/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lottery.service;

import com.lottery.model.Page;
import com.lottery.model.User;
import com.lottery.transfer.PageTransfer;
import com.lottery.utils.ConnectionPool;
import java.util.List;

/**
 *
 * @author TuanAnh
 */
public class PageServiceImpl implements PageService {

    private PageTransfer pageTransfer;

    public PageServiceImpl(ConnectionPool cp) {
        this.pageTransfer = new PageTransfer(cp);
    }

    /**
     * ************
     * @return 
     */
    @Override
    public ConnectionPool getConnectionPool() {
        return this.pageTransfer.getConnectionPool();
    }

    @Override
    public void releaseConnection() {
        this.pageTransfer.releaseConnection();
    }

    @Override
    public void refreshConnectionPool() {
        this.pageTransfer.refreshConnectionPool();
    }

    
    
    
    @Override
    public boolean addPage(Page page) {
        return this.pageTransfer.addPage(page); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editPage(Page page) {
        return this.pageTransfer.editPage(page); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delPage(Page page) {
        return this.pageTransfer.delPage(page); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Page> findAll() {
        return this.pageTransfer.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Page> find(int start, int limit) {
        return this.pageTransfer.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Page findById(int id) {
        return this.pageTransfer.findById(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Page findByUser(User user) {
        return this.pageTransfer.findByUser(user); //To change body of generated methods, choose Tools | Templates.
    }

   

}
