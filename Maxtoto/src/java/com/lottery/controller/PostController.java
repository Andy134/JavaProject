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
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
                request.setAttribute("categories", categoryService.findAll());
                request.setAttribute("post", new Post());
                forward = insert_or_edit;
            } else if (action.equalsIgnoreCase("edit")) {
                forward = insert_or_edit;
                String post_id = request.getParameter("post_id");
                int postId = Integer.parseInt(post_id);
                Post post = postService.findById(postId);
                request.setAttribute("categories", categoryService.findAll());
                request.setAttribute("post", post);
                request.setAttribute("user", post.getUser());
                request.setAttribute("category", post.getCategory());
            } else if (action.equalsIgnoreCase("delete")) {
                forward = list_all;
                int postId = Integer.parseInt(request.getParameter("post_id"));
                postService.delPost(postService.findById(postId));
                request.setAttribute("posts", postService.findAll());
            }
        }
        postService.refreshConnectionPool();
        userService.refreshConnectionPool();
        categoryService.refreshConnectionPool();
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
        request.setCharacterEncoding("UTF-8");
        Post post = new Post();
        String postId = request.getParameter("post_id");
        String postName = request.getParameter("post_name").replace("'", "''");
        String postContent = request.getParameter("post_content").replace("'", "''");
        String postSlug = request.getParameter("post_slug").replace("'", "''");
        String postStatus = request.getParameter("post_status");
        String postCategory = request.getParameter("post_category");
        HttpSession session = request.getSession(true);
        String userId = session.getAttribute("user_id").toString();

        if (postName.equalsIgnoreCase("") || postName == null) {
            isError = true;
            request.setAttribute("post_name_error", "Post Name can not be empty");
        }
        if (postContent.equalsIgnoreCase("") || postContent == null) {
            isError = true;
            request.setAttribute("post_content_error", "Post Content can not be empty");
        }

        if (!isError) {
            Date now = new Date();
            
            post.setPostName(postName);
            post.setPostContent(postContent);
            post.setPostSlug(postSlug);
            post.setStatus(Integer.parseInt(postStatus));
            post.setPublishDate(now);
            post.setLastEdit(now);

            post.setUser(userService.findById(Integer.parseInt(userId)));
            post.setCategory(categoryService.findById(Integer.parseInt(postCategory)));
            post.setStatus(Integer.parseInt(postStatus));

            if (postId == null || postId.equalsIgnoreCase("") || Integer.parseInt(postId)==0) {
                postService.addPost(post);
            } else if (postService.findById(Integer.parseInt(postId)) != null) {
                post.setPostId(Integer.parseInt(postId));
                postService.editPost(post);
            } else {
                System.out.print("Can not found Post");
            }
            postService.refreshConnectionPool();
            response.sendRedirect("posts.jsp");
        } else {
            postService.refreshConnectionPool();
            request.setAttribute("post", post);
            RequestDispatcher view = request.getRequestDispatcher(insert_or_edit);
            view.forward(request, response);
        }
        postService.refreshConnectionPool();
        userService.refreshConnectionPool();
        categoryService.refreshConnectionPool();
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
