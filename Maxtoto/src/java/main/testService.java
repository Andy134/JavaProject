/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import com.lottery.model.Page;
import com.lottery.model.Category;
import com.lottery.model.User;
import com.lottery.service.PageService;
import com.lottery.service.PageServiceImpl;
import com.lottery.service.CategoryService;
import com.lottery.service.CategoryServiceImpl;
import com.lottery.service.UserService;
import com.lottery.service.UserServiceImpl;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author tuananh
 */
public class testService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //UserService us = new UserServiceImpl(null);
        //
        
        //List<User> listUser = us.findAll();
        //for (User item : listUser) {
        //    System.out.println(item.getFirstName());
        //}
        //us.refreshConnectionPool();
        CategoryService categoryService = new CategoryServiceImpl(null);
        List<Category> listCategory = categoryService.findAll();
        for(Category category: listCategory){
            System.out.println(category.getCatName());
        }
        categoryService.refreshConnectionPool();
        
        
        
    }
   

}
