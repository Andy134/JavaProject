<%-- 
    Document   : users.jsp
    Created on : Jul 28, 2016, 8:15:26 PM
    Author     : TuanAnh
--%>
<%
    if (((Integer) session.getAttribute("user_id") <= 0)) {
%> 
<p>You are not login</p>
<a href="index.html">Please Login</a>
<%} else {
%>
<jsp:forward page="UserController?action=listUser" />
<%
}
%>


