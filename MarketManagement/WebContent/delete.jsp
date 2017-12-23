<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Result</title>
</head>
<body>
<h1 style="font-family:verdana;font-size:50px;text-align:center">Delete Result</h1>
<br>
<br>
<%="delete completed!" %>
<%=" "%>
<%="Result of delete:" %>
<br>
<% ResultSet rs=(ResultSet)request.getAttribute("rs");
	while(rs.next())
	{%>
	<div class="text" style=" text-align:center;">
	<%=rs.getString(1) %>
	<%=" "%>
	<%=rs.getString(2) %>
	<%=" "%>
	<%=rs.getString(3) %>
	<%=" "%>
	<%=rs.getString(4) %>
	<%=" "%>
	<br>
	</div>
	<%} %>
</body>
</html>