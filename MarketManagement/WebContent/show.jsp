<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="font-family:verdana;font-size:50px;text-align:center">Commodity List</h1>
<br>
<br>
<%="Commodity List:" %>
<br>
 <%
 Connection con=(Connection)application.getAttribute("con");
 String sql="select * from commodity";
 Statement stmt=con.createStatement();
 ResultSet rs=stmt.executeQuery(sql);
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
	</div>
	<%} %>
</body>
</html>