/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lottery.controller;

import com.lottery.model.User;
import com.lottery.service.UserService;
import com.lottery.service.UserServiceImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author TuanAnh
 */
@WebServlet(name = "UserController", urlPatterns = {"/admin/UserController"})
public class UserController extends HttpServlet {

    private static final String list_user = "/admin/ListUsers.jsp";
    private static final String insert_or_edit = "/admin/User.jsp";
    private UserService userService;

    public UserController() {
        super();
        userService = new UserServiceImpl(null);
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String forward = "";
        String action = request.getParameter("action");
        if (action != null) {
            if (action.equalsIgnoreCase("listUser")) {
                forward = list_user;
                request.setAttribute("users", userService.findAll());
            } else if (action.equalsIgnoreCase("insert")) {
                //User user = new User();
                request.setAttribute("user", new User());
                forward = insert_or_edit;
            } else if (action.equalsIgnoreCase("edit")) {
                forward = insert_or_edit;
                String user_id = request.getParameter("user_id");
                int userId = Integer.parseInt(request.getParameter("user_id"));
                request.setAttribute("user", userService.findById(userId));
            } else if (action.equalsIgnoreCase("delete")) {
                forward = list_user;
                int userId = Integer.parseInt(request.getParameter("user_id"));
                userService.delUser(userService.findById(userId));
                request.setAttribute("users", userService.findAll());
            }
        }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        boolean isError = false;
        String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        request.setCharacterEncoding("UTF-8");
        User user = new User();
        String firstName = request.getParameter("first_name").replace("'", "''");
        String lastName = request.getParameter("last_name").replace("'", "''");
        String email = request.getParameter("email");
        String password = request.getParameter("password").replace("'", "''");
        if (firstName.equalsIgnoreCase("") || firstName == null) {
            isError = true;
            request.setAttribute("first_name_error", "Firstname can not be empty");
        }
        if (lastName.equalsIgnoreCase("") || lastName == null) {
            isError = true;
            request.setAttribute("last_name_error", "Lastname can not be empty");
        }
        if (email.equalsIgnoreCase("") || email == null) {
            isError = true;
            request.setAttribute("email_error", "Email can not be empty");
        }
        if (!request.getParameter("email").matches(EMAIL_REGEX)) {
            request.setAttribute("email_error", "Incorrect email format");
            isError = true;
        }
        if (password.equalsIgnoreCase("") || password == null) {
            isError = true;
            request.setAttribute("password_error", "Password can not be empty");
        }
        if (!isError) {

            user.setFirstName(firstName);
            user.setLastName(lastName);
            user.setPassword(password);
            user.setEmail(email);
            user.setPassword(password);
            Date now = new Date();
            user.setActiveDate(now);

            String userId = request.getParameter("user_id");
            if (userId == null || userId.equalsIgnoreCase("")) {
                userService.addUser(user);
            } else if (userService.findById(Integer.parseInt(userId)) != null) {
                userService.editUser(user);
            } else {
                System.out.print("Can not found User");
            }

            response.sendRedirect("users");
        } else {
            request.setAttribute("user", user);
            RequestDispatcher view = request.getRequestDispatcher(insert_or_edit);
            view.forward(request, response);

        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
