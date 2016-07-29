<%-- 
    Document   : listUsers
    Created on : Jul 28, 2016, 8:23:07 PM
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
<!--  #page-wrapper -->
<div id="page-wrapper">

    <div class="container-fluid">

        <!-- Page Heading -->
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">
                    Users <small>Management</small>
                </h1>
                <ol class="breadcrumb">
                    <li class="active">
                        <i class="fa fa-users"></i> User Management
                    </li>
                </ol>
            </div>
        </div>
        <!-- /.row -->

        <div class="row">
            <div class="col-lg-12">
                <div class="panel panel-default">
                    <div class="panel-body">
                        <div class="col-lg-1 col-lg-offset-11">
                            <a class="btn btn-success" href="UserController?action=insert"> <span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Add new</a>
                        </div>
                    </div><!--panel body-->
                    <div class="col-lg-12" style="margin: 5px 0px 5px 0px;"></div>

                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Firstname</th>
                                <th>Lastname</th>
                                <th>Email</th>
                                <th>Role</th>
                                <th>Active Date</th>
                                <th>Actions</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${users}" var="user">
                                <tr>
                                    <td><c:out value="${user.userId}" /></td>
                                    <td><c:out value="${user.firstName}" /></td>
                                    <td><c:out value="${user.lastName}" /></td>
                                    <td><c:out value="${user.email}" /></td>
                                    <td><c:out value="${user.userRole}" /></td>
                                    <td><c:out value="${user.activeDate}" /></td>
                                    <td>
                                        <a class="btn btn-default" href="UserController?action=edit&user_id=<c:out value="${user.userId}"/>"><span class="glyphicon glyphicon-edit"></span> Edit</a>  
                                        <a class="btn btn-default" href="UserController?action=delete&user_id=<c:out value="${user.userId}"/>"><span class="glyphicon glyphicon-remove"></span> Delete</a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        <!-- /.row -->
    </div>
    <!-- /.container-fluid -->
</div>
<!-- /#page-wrapper -->
<%@ include file="footer.jsp" %>

<%}%>