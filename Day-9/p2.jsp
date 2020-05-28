<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP page count</title>
</head>
<body>
<%! static int hit=0; %>
<%
if (hit == 0) 
{
%>
<h4><%
hit ++;
out.println("Welcome Visitor"); %> <br> 
<% out.println("Visitor Number : ");%> <%=hit %>.</h4>
<% 
hit++;
}
else
{
%>
<h4><% out.print("Welcome Visitor, Visitor Number : "); %> <%=hit %>.</h4>
<%
hit++;
}
%>
</body>
</html>