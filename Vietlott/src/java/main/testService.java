/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import com.lottery.model.User;
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
        UserService us = new UserServiceImpl(null);
        //User user = new User();
        //user.setFirstName("Quoc Viet");
        //user.setLastName("Nguyen");
        //user.setGender(1);
        //user.setEmail("quocviet@gmail.com");
        //user.setPassword("hello");
        //user.setActiveDate(new Date());
        //user.setUserRole("admin");
        //us.addUser(user);
        List<User> listUser = us.findAll();
        for (User user : listUser) {
            System.out.println(user.getFirstName());
        }
        
    }
    public static String getToday() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

}
