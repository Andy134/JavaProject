<%-- 
    Document   : ListPost
    Created on : Aug 3, 2016, 3:48:09 PM
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
                        <i class="fa fa-users"></i> Category Management
                    </li>
                </ol>
            </div>
        </div>
        <!-- /.row -->

        <div class="row">
            <div class="col-md-12">
                <div class="card">
                    <div class="header">
                        <h4 class="title">List of Categories</h4>
                         <div class="category pull-right">
                            <a class="btn btn-success" href="CategoryController?action=insert">Add new</a>
                        </div>
                    </div>
                    <div class="content table-responsive table-full-width   ">
                       

                        <table class="table table-hover table-striped">
                            <thead>
                                <tr>
                                    <th>ID</th>
                                    <th>Name</th>
                                    <th>Description</th>
                                    <th>Slug</th>
                                    <th>Path</th>
                                    <th>Parent Category</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${categories}" var="category">
                                    <tr>
                                        <td><c:out value="${category.catId}" /></td>
                                        <td><c:out value="${category.catName}" /></td>
                                        <td><c:out value="${category.catDesc}" /></td>
                                        <td><c:out value="${category.slug}" /></td>
                                        <td><c:out value="${category.path}" /></td>
                                        <td><c:out value="${category.parentId}" /></td>
                                        <td>
                                            <a class="btn btn-default" href="CategoryController?action=edit&category_id=<c:out value="${category.catId}"/>"> Edit</a>  
                                            <a class="btn btn-danger" href="CategoryController?action=delete&category_id=<c:out value="${category.catId}"/>"> Delete</a>
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