<%-- 
    Document   : ListPages
    Created on : Aug 2, 2016, 11:20:05 AM
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
                        <i class="fa fa-users"></i> Pages Management
                    </li>
                </ol>
            </div>
        </div>
        <!-- /.row -->

        <div class="row">
            <div class="col-md-12">
                <div class="card">
                    <div class="header">
                        <h4 class="title">List of Pages</h4>
                        <div class="category pull-right">
                            <a class="btn btn-success" href="PageController?action=insert">Add new</a>
                        </div>
                    </div>
                    <div class="content table-responsive table-full-width   ">


                        <table class="table table-hover table-striped">
                            <thead>
                                <tr>
                                    <th>ID</th>
                                    <th>Page Name</th>
                                    <th>Page Slug</th>
                                    <th>Publish Date</th>
                                    <th>Last Edit</th>
                                    <th>Status</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${pages}" var="page">
                                    <tr>
                                        <td><c:out value="${page.pageId}" /></td>
                                        <td><c:out value="${page.pageName}" /></td>
                                        <td><c:out value="${page.pageSlug}" /></td>
                                        <td><c:out value="${page.publishDate}" /></td>
                                        <td><c:out value="${page.lastEdit}" /></td>

                                        <td><c:choose>
                                                <c:when test="${page.status == 0}">
                                                    Active
                                                </c:when>
                                                <c:otherwise>
                                                    InActive
                                                </c:otherwise>
                                            </c:choose>
                                        </td>
                                        <td>
                                            <a class="btn btn-default" href="PageController?action=edit&page_id=<c:out value="${page.pageId}"/>"> Edit</a>  
                                            <a class="btn btn-danger" href="PageController?action=delete&page_id=<c:out value="${page.pageId}"/>"> Delete</a>
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