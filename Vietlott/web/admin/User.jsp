<%-- 
    Document   : User
    Created on : Jul 29, 2016, 11:18:55 AM
    Author     : TuanAnh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    if (((Integer) session.getAttribute("user_id") <= 0)) {
%>
<p>You are not login </p><a href="index.jsp">Please login</a>
<%
} else if (!session.getAttribute("user_role").equals("admin")) {
%>
<p>You are not authorized to access this page </p>
<a href="javascript:history.back()">go back</a>
<%
} else {
%>
<%@ include file="header.jsp" %>

<div id="page-wrapper">
    <div class="container-fluid">
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">
                    Users <small>Management</small>
                </h1>
                <ol class="breadcrumb">
                    <li>                     
                            <a href="users.jsp"><i class="fa fa-users"></i> User Management </a> 
                    </li>
                    <li class="active">                     
                            <i class="fa fa-edit"></i> Edit
                    </li>
                </ol>
            </div>
        </div>
        
        <div class="row">
            <div class="col-lg-12">
                <div class="panel panel-default">
                    <div class="panel-body">
                        
                    </div>
                </div>
            </div>
        </div>
        
    </div>
</div>

<%@ include file="footer.jsp" %>
<%}%>

