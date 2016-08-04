

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
                        <a href="posts.jsp"><i class="fa fa-paperclip"></i> Post Management </a> 
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

                        <form action="PostController" method="Post" name="formPost" role="form">

                            <div class="row">
                                <div class="col-md-2">
                                    <div class="form-group">
                                        <label>ID (disabled)</label>
                                        <input name="pid" type="text" class="form-control" disabled value="<c:out value="${post.postId}"/>">
                                        <input type="hidden" name="post_id" value="<c:out value="${post.postId}"/>">
                                    </div>
                                    <span style="color: red;font-size: small"><c:out value="${post_id_error}" /></span>
                                </div>

                                <div class="col-md-5">
                                    <div class="form-group">
                                        <label for="post_name">Post Name</label>
                                        <input type="text" name="post_name" class="form-control" value="<c:out value="${post.postName}"/>">
                                    </div>
                                    <span style="color: red;font-size: small"><c:out value="${post_name_error}" /></span>  
                                </div>

                                <div class="col-md-5">
                                    <div class="form-group">
                                        <label for="">Category</label>
                                        <select class="form-control" name="post_category">
                                            <c:forEach items="${categories}" var="cat">
                                                <option value="<c:out value="${cat.catId}"/>" ${cat.catId==category.catId?'selected':''}><c:out value="${cat.catName}"/></option>
                                            </c:forEach>
                                        </select>
                                    </div>

                                </div>

                            </div>
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="form-group">
                                        <label>Content</label>
                                        <textarea name="post_content" rows="5" class="form-control" placeholder="Here can be post content" ><c:out value="${post.postContent}"/></textarea>
                                    </div>
                                    <span style="color: red;font-size: small"><c:out value="${post_content_error}" /></span>
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>Post Slug</label>
                                        <input name="post_slug" type="text" class="form-control" value="<c:out value="${post.postSlug}"/>">
                                    </div>
                                </div>

                                <div class="col-md-2">
                                    <div class="form-group">
                                        <label for="exampleInputEmail1">Status</label>
                                        <select class="form-control" name="post_status"/>
                                        <option ${post.status=='0'?'selected':''} value="0">Active</option>
                                        <option ${post.status=='1'?'selected':''} value="1">Inactive</option>
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

            <c:if test="${post.postId > 0}">
                <div class="col-md-4">
                    <div class="card card-user">
                        <div class="image">
                            <img src=""/>
                        </div>
                        <div class="content">
                            <div class="author">
                                <a href="#">
                                    <h4 class="title"><c:out value="${post.postName}"/><br />
                                        <small><c:out value="${post.publishDate}"/> </small>
                                </a>
                                <p class="description text-center">
                                    last updated by: <c:out value="${user.firstName} ${user.lastName} "/> <br/> 
                                    last updated date: <c:out value="${post.lastEdit} "/>
                                </p>
                            </div>

                        </div>
                        <hr>

                    </div>
                </div>
            </c:if>


        </div>

    </div>
</div>

<%@ include file="footer.jsp" %>
<%}%>

