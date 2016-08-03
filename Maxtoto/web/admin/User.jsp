<%-- 
    Document   : User
    Created on : Jul 29, 2016, 11:18:55 AM
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

<div id="page-wrapper">

    <!-- Page Heading -->
    <div class="row">
        <div class="col-md-12">
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
        <div class="col-md-8">
            <div class="card">
                <div class="header">
                    <h4 class="title">Add/ Edit Profile</h4>
                </div>
                <div class="content">
                    <form action="UserController" method="Post" name="formUser" role="form">
                        <div class="row">
                            <div class="col-md-2">
                                <div class="form-group">
                                    <label>ID (disabled)</label>
                                    <input name="user_id" type="text" class="form-control" disabled value="<c:out value="${user.userId}"/>">
                                </div>
                            </div>

                            <div class="col-md-5">
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Email address</label>
                                    <input type="email" name="email" class="form-control" placeholder="Email" value="<c:out value="${user.email}"/>">
                                </div>
                                <span style="color: red;font-size: small"><c:out value="${email_error}" /></span>  
                            </div>
                            <div class="col-md-3">
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Password</label>
                                    <input type="password" name="password" class="form-control" placeholder="Email" value="<c:out value="${user.password}"/>">
                                </div>
                                <span style="color: red;font-size: small"><c:out value="${password_error}" /></span>  
                            </div> 
                            <div class="col-md-2">
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Gender</label>
                                    <select class="form-control" name="user_gender"/>">
                                    <option ${user.userRole='admin'?'selected':''} value="0">Male</option>
                                    <option ${user.userRole='user'?'selected':''} value="1">Female</option>
                                    </select>
                                </div>

                            </div> 

                        </div>

                        <div class="row">
                            <div class="col-md-5">
                                <div class="form-group">
                                    <label>First Name</label>
                                    <input name="first_name" type="text" class="form-control" value="<c:out value="${user.firstName}"/>">
                                </div>
                                <span style="color: red;font-size: small"><c:out value="${first_name_error}" /></span>  
                            </div>
                            <div class="col-md-5">
                                <div class="form-group">
                                    <label>Last Name</label>
                                    <input name="last_name" type="text" class="form-control" value="<c:out value="${user.lastName}"/>">
                                </div>
                                <span style="color: red;font-size: small"><c:out value="${last_name_error}" /></span>  
                            </div>
                            <div class="col-md-2">
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Role</label>
                                    <select class="form-control" name="user_role"/>
                                    <option ${user.userRole='admin'?'selected':''}>Admin</option>
                                    <option ${user.userRole='user'?'selected':''}>User</option>
                                    </select>
                                </div>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-md-12">
                                <div class="form-group">
                                    <label>Address</label>
                                    <input name="address" type="text" class="form-control" placeholder="Home Address" value="">
                                </div>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-md-4">
                                <div class="form-group">
                                    <label>City</label>
                                    <input name="city" type="text" class="form-control" placeholder="City" value="">
                                </div>
                            </div>
                            <div class="col-md-4">
                                <div class="form-group">
                                    <label>Country</label>
                                    <input name="country" type="text" class="form-control" placeholder="Country" value="">
                                </div>
                            </div>
                            <div class="col-md-4">
                                <div class="form-group">
                                    <label>Postal Code</label>
                                    <input name="potal_code" type="number" class="form-control" placeholder="">
                                </div>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-md-12">
                                <div class="form-group">
                                    <label>About Me</label>
                                    <textarea name="description" rows="5" class="form-control" placeholder="Here can be your description" ></textarea>
                                </div>
                            </div>
                        </div>

                        <button type="submit" class="btn btn-info btn-fill pull-right">Save Profile</button>
                        <div class="clearfix"></div>
                    </form>
                </div>
            </div>
        </div>
        <div class="col-md-4">
            <div class="card card-user">
                <!--div class="image">
                    <img src="https://ununsplash.imgix.net/photo-1431578500526-4d9613015464?fit=crop&fm=jpg&h=300&q=75&w=400" alt="..."/>
                </div-->
                <div class="content">
                    <div class="author">
                        <a href="#">
                            <img class="avatar border-gray" src="assets/img/faces/face-0.jpg" alt="..."/>

                            <h4 class="title"><c:out value="${user.firstName}"/> <c:out value="${user.lastName}"/><br />
                                <small><c:out value="${user.activeDate}"/></small>
                            </h4>
                        </a>
                    </div>
                    <p class="description text-center"> "Lamborghini Mercy <br>
                        Your chick she so thirsty <br>
                        I'm in that two seat Lambo"
                    </p>
                </div>
                <hr>
                <div class="text-center">
                    <button href="#" class="btn btn-simple"><i class="fa fa-facebook-square"></i></button>
                    <button href="#" class="btn btn-simple"><i class="fa fa-twitter"></i></button>
                    <button href="#" class="btn btn-simple"><i class="fa fa-google-plus-square"></i></button>

                </div>
            </div>
        </div>

    </div>


</div>

<%@ include file="footer.jsp" %>
<%}%>

