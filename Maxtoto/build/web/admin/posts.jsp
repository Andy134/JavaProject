<%-- 
    Document   : posts
    Created on : Aug 3, 2016, 3:42:34 PM
    Author     : TuanAnh
--%>

<%
    if (session.getAttribute("user_id") == null) {
%> 
<p>You are not login</p>
<a href="index.jsp">Please Login</a>
<%} else {
%>
<jsp:forward page="PostController?action=listPost" />
<%
}
%>