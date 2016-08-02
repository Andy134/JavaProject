<%-- 
    Document   : login
    Created on : Jul 28, 2016, 3:46:31 PM
    Author     : TuanAnh
--%>

<%@page import="java.util.List"%>
<%@page import="com.lottery.model.User"%>
<%@page import="com.lottery.service.UserServiceImpl"%>
<%@page import="com.lottery.service.UserService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    UserService us = new UserServiceImpl(null);
    
    User user = us.checkUserLogin(email, password);
    if(user!=null){
        
        session.setAttribute("user_name", user.getFirstName()+" "+user.getLastName());
        session.setAttribute("user_role", user.getUserRole());
        session.setAttribute("user_id", user.getUserId());
        
        response.sendRedirect("users.jsp");
    }
    else{
        out.println("Email or Password not found. Please try again <a href='index.jsp'>Log in</a>");
    }
%>

