/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lottery.controller;

import com.lottery.model.Category;
import com.lottery.model.Post;
import com.lottery.service.CategoryService;
import com.lottery.service.CategoryServiceImpl;
import com.lottery.service.PageService;
import com.lottery.service.PageServiceImpl;
import com.lottery.service.PostService;
import com.lottery.service.PostServiceImpl;
import com.lottery.service.UserService;
import com.lottery.service.UserServiceImpl;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "PostController", urlPatterns = {"/admin/PostController"})
public class PostController extends HttpServlet {
  private static final String list_all = "/admin/ListPosts.jsp";
    private static final String insert_or_edit = "/admin/Post.jsp";
    private CategoryService categoryService;
    private UserService userService;
    private PostService postService;
            
    public PostController() {
        super();
        categoryService = new CategoryServiceImpl(null);
        userService = new UserServiceImpl(null);
        postService = new PostServiceImpl(null);
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
        response.setContentType("text/html;charset=UTF-8");

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
        processRequest(request, response);
        String forward = "";
        String action = request.getParameter("action");
        if (action != null) {
            if (action.equalsIgnoreCase("listPost")) {
                forward = list_all;
                request.setAttribute("posts", postService.findAll());
            } else if (action.equalsIgnoreCase("insert")) {
                request.setAttribute("post", new Post());
                forward = insert_or_edit;
            } else if (action.equalsIgnoreCase("edit")) {
                forward = insert_or_edit;
                String post_id = request.getParameter("post_id");
                int postId = Integer.parseInt(post_id);
                request.setAttribute("post", postService.findById(postId));
            } else if (action.equalsIgnoreCase("delete")) {
                forward = list_all;
                int postId = Integer.parseInt(request.getParameter("post_id"));
                postService.delPost(postService.findById(postId));
                request.setAttribute("post", postService.findAll());
            }
        }
        postService.refreshConnectionPool();
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
