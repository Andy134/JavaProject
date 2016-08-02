/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lottery.service;

import com.lottery.model.Page;
import com.lottery.model.User;
import java.util.List;

/**
 *
 * @author TuanAnh
 */
public interface PageService extends BaseService{
     public boolean addPage(Page page);
    // Sua post
    public boolean editPage(Page page);
    // Xoa post
    public boolean delPage(Page page);
    // Lay danh sach post
    public List<Page> findAll();
    // Lay danh sach post theo phan trang
    public List<Page> find(int start, int limit);
    // lay post theo id
    public Page findById(int id);
    // lay post theo email
    public Page findByUser(User user);
}
