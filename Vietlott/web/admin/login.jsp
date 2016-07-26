<%-- 
    Document   : signin
    Created on : Jul 26, 2016, 5:35:33 PM
    Author     : tuananh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form role="form" method="post" action="login.jsp">
            <div class="form-group">
                <input type="text" name="uname" class="form-control" placeholder="Your username">
            </div>
            <div class="form-group">
                <input type="password" name="pass" class="form-control" placeholder="Your password">
            </div>
            <button type="submit" class="btn btn-primary btn-lg">Login</button>
        </form>
    </body>
</html>
