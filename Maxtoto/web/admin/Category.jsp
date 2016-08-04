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
                        <a href="categories.jsp"><i class="fa fa-pagelines"></i> Category </a> 
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

                        <form action="CategoryController" method="Post" name="formCategory" role="form">

                            <div class="row">
                                <div class="col-md-2">
                                    <div class="form-group">
                                        <label>ID (disabled)</label>
                                        <input name="pid" type="text" class="form-control" disabled value="<c:out value="${category.catId}"/>">
                                        <input type="hidden" name="category_id" value="<c:out value="${category.catId}"/>">
                                    </div>
                                </div>

                                <div class="col-md-5">
                                    <div class="form-group">
                                        <label for="email">Category Name</label>
                                        <input type="text" name="category_name" class="form-control" value="<c:out value="${category.catName}"/>">
                                    </div>
                                    <span style="color: red;font-size: small"><c:out value="${category_name_error}" /></span>  
                                </div>

                            </div>
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="form-group">
                                        <label>Description</label>
                                        <textarea name="category_desc" rows="5" class="form-control" placeholder="Here can be category content" ><c:out value="${category.catDesc}"/></textarea>
                                    </div>
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>Category Slug</label>
                                        <input name="category_slug" type="text" class="form-control" value="<c:out value="${category.slug}"/>">
                                    </div>
                                </div>

                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>Category Path</label>
                                        <input name="category_path" type="text" class="form-control" value="<c:out value="${category.path}"/>">
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

