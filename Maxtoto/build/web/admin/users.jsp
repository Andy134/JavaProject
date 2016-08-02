<%-- 
    Document   : users.jsp
    Created on : Jul 28, 2016, 8:15:26 PM
    Author     : TuanAnh
--%>
<%
    if (session.getAttribute("user_id") == null) {
%> 
<p>You are not login</p>
<a href="index.jsp">Please Login</a>
<%} else {
%>
<jsp:forward page="UserController?action=listUser" />
<%
}
%>


