<%-- 
    Document   : index
    Created on : Jul 26, 2016, 2:10:11 PM
    Author     : tuananh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link type="text/css" rel="stylesheet" href="../Content/css/bootstrap.min.css">
        <link type="text/css" rel="stylesheet" href="../Content/css/admin/registrator.css">
        <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script type="text/javascript" src="../Content/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="wrapper">
            <form class="form-signin" role="form" method="post" action="LoginController">       
                <h2 class="form-signin-heading">Please login</h2>
                <input type="text" class="form-control" name="username" placeholder="Username" required="" autofocus=""/>
                <input type="password" class="form-control" name="password" placeholder="Password" required=""/>      
                <!--<label class="checkbox">
                    <input type="checkbox" value="remember-me" id="rememberMe" name="rememberMe"> Remember me
                </label>
                -->
                <button class="btn btn-lg btn-primary btn-block" type="submit">Login</button>   
            </form>
        </div>       
    </body>
</html>
