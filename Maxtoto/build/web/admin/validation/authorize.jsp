<%-- 
    Document   : authorize
    Created on : Aug 4, 2016, 9:43:38 AM
    Author     : TuanAnh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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