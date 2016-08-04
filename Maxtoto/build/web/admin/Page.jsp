<%-- 
    Document   : User
    Created on : Jul 29, 2016, 11:18:55 AM
    Author     : TuanAnh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="validation/authorize.jsp" %>
<%@ include file="header.jsp" %>

<div id="content">

    <div class="container-fluid">


        <!-- Page Heading -->
        <div class="row">
            <div class="col-md-12">
                <ol class="breadcrumb">
                    <li>                     
                        <a href="pages.jsp"><i class="fa fa-pagelines"></i> Page Management </a> 
                    </li>
                    <li class="active">                     
                        <i class="fa fa-edit"></i> Insert
                    </li>
                </ol>
            </div>
        </div>


        <div class="row">
            <div class="col-md-8">
                <div class="card">
                    <div class="header">
                        <h4 class="title">Add/ Edit Profile</h4>
                    </div>
                    <div class="content">

                        <form action="PageController" method="Post" name="formPage" role="form">

                            <div class="row">
                                <div class="col-md-2">
                                    <div class="form-group">
                                        <label>ID (disabled)</label>
                                        <input name="pid" type="text" class="form-control" disabled value="<c:out value="${page.pageId}"/>">
                                        <input type="hidden" name="page_id" value="<c:out value="${page.pageId}"/>">
                                    </div>
                                    <span style="color: red;font-size: small"><c:out value="${page_id_error}" /></span>
                                </div>

                                <div class="col-md-5">
                                    <div class="form-group">
                                        <label for="email">Page Name</label>
                                        <input type="text" name="page_name" class="form-control" value="<c:out value="${page.pageName}"/>">
                                    </div>
                                    <span style="color: red;font-size: small"><c:out value="${page_name_error}" /></span>  
                                </div>

                            </div>
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="form-group">
                                        <label>Description</label>
                                        <textarea name="page_content" rows="5" class="form-control" placeholder="Here can be page content" ><c:out value="${page.pageContent}"/></textarea>
                                    </div>
                                    <span style="color: red;font-size: small"><c:out value="${page_content_error}" /></span>
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>Page Slug</label>
                                        <input name="page_slug" type="text" class="form-control" value="<c:out value="${page.pageSlug}"/>">
                                    </div>
                                </div>

                                <div class="col-md-2">
                                    <div class="form-group">
                                        <label for="exampleInputEmail1">Status</label>
                                        <select class="form-control" name="page_status"/>
                                        <option ${page.status=='0'?'selected':''} value="0">Active</option>
                                        <option ${page.status=='1'?'selected':''} value="1">Inactive</option>
                                        </select>
                                    </div>
                                </div>
                            </div>



                            <button type="submit" class="btn btn-info btn-fill pull-right">Save</button>
                            <div class="clearfix"></div>
                        </form>
                    </div>
                </div>
            </div>


        </div>

    </div>
</div>

<%@ include file="footer.jsp" %>
<%}%>

