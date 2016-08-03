<%-- 
    Document   : categories
    Created on : Aug 3, 2016, 4:20:58 PM
    Author     : TuanAnh
--%>

<%
    if (session.getAttribute("user_id") == null) {
%> 
<p>You are not login</p>
<a href="index.jsp">Please Login</a>
<%} else {
%>
<jsp:forward page="CategoryController?action=listCategory" />
<%
}
%>
