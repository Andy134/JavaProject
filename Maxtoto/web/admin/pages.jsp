<%-- 
    Document   : pages
    Created on : Aug 2, 2016, 10:57:46 AM
    Author     : TuanAnh
--%>
<%
    if (session.getAttribute("user_id") == null) {
%> 
<p>You are not login</p>
<a href="index.jsp">Please Login</a>
<%} else {
%>
<jsp:forward page="PageController?action=listPage" />
<%
}
%>
