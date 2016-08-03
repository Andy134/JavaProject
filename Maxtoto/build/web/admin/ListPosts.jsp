<%-- 
    Document   : ListPost
    Created on : Aug 3, 2016, 3:48:09 PM
    Author     : TuanAnh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    if (session.getAttribute("user_id") == null) {
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
<div id="content">
    <div class="container-fluid">

        <!-- Page Heading -->
        <div class="row">
            <div class="col-md-12">
                <ol class="breadcrumb">
                    <li class="active">
                        <i class="fa fa-users"></i> Posts Management
                    </li>
                </ol>
            </div>
        </div>
        <!-- /.row -->

        <div class="row">
            <div class="col-md-12">
                <div class="card">
                    <div class="header">
                        <h4 class="title">List of Posts</h4>
                         <div class="category pull-right">
                            <a class="btn btn-success" href="PostController?action=insert">Add new</a>
                        </div>
                    </div>
                    <div class="content table-responsive table-full-width   ">
                       

                        <table class="table table-hover table-striped">
                            <thead>
                                <tr>
                                    <th>ID</th>
                                    <th>Post Name</th>
                                    <th>Post Slug</th>
                                    <th>Publish Date</th>
                                    <th>Last_Edit</th>
                                    <th>Status</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${posts}" var="post">
                                    <tr>
                                        <td><c:out value="${post.postId}" /></td>
                                        <td><c:out value="${post.postName}" /></td>
                                        <td><c:out value="${post.postSlug}" /></td>
                                        <td><c:out value="${post.publishDate}" /></td>
                                        <td><c:out value="${post.lastEdit}" /></td>
                                        <td><c:out value="${post.status}" /></td>
                                        <td>
                                            <a class="btn btn-default" href="PostController?action=edit&post_id=<c:out value="${post.postId}"/>"> Edit</a>  
                                            <a class="btn btn-danger" href="PostController?action=delete&post_id=<c:out value="${post.postId}"/>"> Delete</a>
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