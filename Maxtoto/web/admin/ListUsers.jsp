<%-- 
    Document   : listUsers
    Created on : Jul 28, 2016, 8:23:07 PM
    Author     : TuanAnh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="validation/authorize.jsp" %>
<%@ include file="header.jsp" %>
<!--  #page-wrapper -->
<div id="content">

    <div class="container-fluid">

        <!-- Page Heading -->
        <div class="row">
            <div class="col-md-12">
                <ol class="breadcrumb">
                    <li class="active">
                        <i class="fa fa-users"></i> User Management
                    </li>
                </ol>
            </div>
        </div>
        <!-- /.row -->

        <div class="row">
            <div class="col-md-12">
                <div class="card">
                    <div class="header">
                        <h4 class="title">List of Users</h4>
                         <div class="category pull-right">
                            <a class="btn btn-success" href="UserController?action=insert">Add new</a>
                        </div>
                    </div>
                    <div class="content table-responsive table-full-width   ">
                       

                        <table class="table table-hover table-striped">
                            <thead>
                                <tr>
                                    <th>ID</th>
                                    <th>Firstname</th>
                                    <th>Lastname</th>
                                    <th>Email</th>
                                    <th>Role</th>
                                    <th>Active Date</th>
                                    <th></th>
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
                                            <a class="btn btn-default" href="UserController?action=edit&user_id=<c:out value="${user.userId}"/>"> Edit</a>  
                                            <a class="btn btn-danger" href="UserController?action=delete&user_id=<c:out value="${user.userId}"/>"> Delete</a>
                                        </td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div><!--class content-->
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