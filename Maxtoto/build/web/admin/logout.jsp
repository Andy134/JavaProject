<%-- 
    Document   : logout
    Created on : Jul 28, 2016, 5:47:14 PM
    Author     : TuanAnh
--%>

<%
session.setAttribute("user_name", null);
session.setAttribute("user_role", null);
session.setAttribute("user_id", null);
session.invalidate();
response.sendRedirect("index.jsp");
%>
