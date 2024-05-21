<%-- 
    Document   : compute
    Created on : May 2, 2024, 3:29:56 PM
    Author     : Esron
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
int a=Integer.parseInt(request.getParameter("num1"));
int b=Integer.parseInt(request.getParameter("num2"));
out.print(a+"+"+b+"="+(a+b));
%>
</body>
</html>
