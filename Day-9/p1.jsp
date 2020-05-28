* JSP program to print current date and time.*


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Current Date</title>
</head>
<body>
Today's date: <%= (new java.util.Date()).toLocaleString()%>
</body>
</html>
