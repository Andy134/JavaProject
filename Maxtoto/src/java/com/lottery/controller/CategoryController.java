/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lottery.controller;

import com.lottery.model.Category;
import com.lottery.service.CategoryService;
import com.lottery.service.CategoryServiceImpl;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "CategoryController", urlPatterns = {"/admin/CategoryController"})
public class CategoryController extends HttpServlet {
 private static final String list_category = "/admin/ListCategories.jsp";
    private static final String insert_or_edit = "/admin/Category.jsp";
    private CategoryService categoryService;
   
    public CategoryController() {
        super();
        categoryService = new CategoryServiceImpl(null);
        
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
            if (action.equalsIgnoreCase("listCategory")) {
                forward = list_category;
                request.setAttribute("categories", categoryService.findAll());
            } else if (action.equalsIgnoreCase("insert")) {
                request.setAttribute("categories", categoryService.findAll());
                request.setAttribute("category", new Category());
                forward = insert_or_edit;
            } else if (action.equalsIgnoreCase("edit")) {
                forward = insert_or_edit;
                String cat_id = request.getParameter("category_id");
                int catId = Integer.parseInt(cat_id);
                request.setAttribute("category", categoryService.findById(catId));
                request.setAttribute("categories", categoryService.findAll());
            } else if (action.equalsIgnoreCase("delete")) {
                forward = list_category;
                int catId = Integer.parseInt(request.getParameter("category_id"));
                categoryService.delCategory(categoryService.findById(catId));
                request.setAttribute("categories", categoryService.findAll());
            }
        }
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
        Category cat = new Category();
        String catId = request.getParameter("category_id");
        String catName = request.getParameter("category_name").replace("'", "''");
        String catDesc = request.getParameter("category_desc").replace("'", "''");
        String catSlug = request.getParameter("category_slug").replace("'", "''");
        String catPath = request.getParameter("category_path");

        if (catName.equalsIgnoreCase("") || catName == null) {
            isError = true;
            request.setAttribute("category_name_error", "Page Name can not be empty");
        }
        if (!isError) {
            cat.setCatName(catName);
            cat.setCatDesc(catDesc);
            cat.setSlug(catSlug);
            cat.setPath(catPath);

            if (catId == null || catId.equalsIgnoreCase("") || Integer.parseInt(catId)==0) {
                categoryService.addCategory(cat);
            } else if (categoryService.findById(Integer.parseInt(catId)) != null) {
                cat.setCatId(Integer.parseInt(catId));
                categoryService.editCategory(cat);
            } else {
                System.out.print("Can not found Category");
            }
            categoryService.refreshConnectionPool();
            response.sendRedirect("categories.jsp");
        } else {
            categoryService.refreshConnectionPool();
            request.setAttribute("category", cat);
            RequestDispatcher view = request.getRequestDispatcher(insert_or_edit);
            view.forward(request, response);
        }
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
