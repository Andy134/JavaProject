/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lottery.controller;

import com.lottery.model.Page;
import com.lottery.service.PageService;
import com.lottery.service.PageServiceImpl;
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
@WebServlet(name = "PageController", urlPatterns = {"/admin/PageController"})
public class PageController extends HttpServlet {

    private static final String list_page = "/admin/ListPages.jsp";
    private static final String insert_or_edit = "/admin/Page.jsp";
    private PageService pageService;

    public PageController() {
        super();
        pageService = new PageServiceImpl(null);
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
        String forward = "";
        String action = request.getParameter("action");
        if (action != null) {
            if (action.equalsIgnoreCase("listPage")) {
                forward = list_page;
                request.setAttribute("pages", pageService.findAll());
            } else if (action.equalsIgnoreCase("insert")) {

                request.setAttribute("page", new Page());
                forward = insert_or_edit;
            } else if (action.equalsIgnoreCase("edit")) {
                forward = insert_or_edit;
                String page_id = request.getParameter("page_id");
                int pageId = Integer.parseInt(request.getParameter("page_id"));
                request.setAttribute("page", pageService.findById(pageId));
            } else if (action.equalsIgnoreCase("delete")) {
                forward = list_page;
                int pageId = Integer.parseInt(request.getParameter("page_id"));
                pageService.delPage(pageService.findById(pageId));
                request.setAttribute("pages", pageService.findAll());
            }
        }
        pageService.refreshConnectionPool();
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
