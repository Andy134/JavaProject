<%-- 
    Document   : listUsers
    Created on : Jul 28, 2016, 8:23:07 PM
    Author     : TuanAnh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

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
                        <div class="table-responsive">
                            <table class="table table-bordered table-hover table-striped">
                                <thead>
                                    <tr>
                                        <th>Order #</th>
                                        <th>Order Date</th>
                                        <th>Order Time</th>
                                        <th>Amount (USD)</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>3326</td>
                                        <td>10/21/2013</td>
                                        <td>3:29 PM</td>
                                        <td>$321.33</td>
                                    </tr>
                                    <tr>
                                        <td>3325</td>
                                        <td>10/21/2013</td>
                                        <td>3:20 PM</td>
                                        <td>$234.34</td>
                                    </tr>
                                    <tr>
                                        <td>3324</td>
                                        <td>10/21/2013</td>
                                        <td>3:03 PM</td>
                                        <td>$724.17</td>
                                    </tr>
                                    <tr>
                                        <td>3323</td>
                                        <td>10/21/2013</td>
                                        <td>3:00 PM</td>
                                        <td>$23.71</td>
                                    </tr>
                                    <tr>
                                        <td>3322</td>
                                        <td>10/21/2013</td>
                                        <td>2:49 PM</td>
                                        <td>$8345.23</td>
                                    </tr>
                                    <tr>
                                        <td>3321</td>
                                        <td>10/21/2013</td>
                                        <td>2:23 PM</td>
                                        <td>$245.12</td>
                                    </tr>
                                    <tr>
                                        <td>3320</td>
                                        <td>10/21/2013</td>
                                        <td>2:15 PM</td>
                                        <td>$5663.54</td>
                                    </tr>
                                    <tr>
                                        <td>3319</td>
                                        <td>10/21/2013</td>
                                        <td>2:13 PM</td>
                                        <td>$943.45</td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                        
                    </div><!--panel body-->
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