<%@page import="com.tyss.springmvc.beans.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<% Employee info = (Employee)request.getAttribute("bean"); %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
	<% if(info != null) { %>
	<div align="center">
		<table border="1" style="width: 70%">
			<tr style="background: navy; color: white;">
				<th>Employee Id</th>
				<th>Name</th>
				<th>Salary</th>
				<th>Designation</th>
				<th>Age</th>
				<th>Password</th>
			</tr>
			<tr>
				<td><%=info.getId() %></td>
				<td><%=info.getName() %></td>
				<td><%=info.getSalary() %></td>
				<td><%=info.getDesignation() %></td>
				<td><%=info.getAge() %></td>
				<td><%=info.getPassword() %></td>
			</tr>

		</table>

	</div>
	<% } %>
</body>
</html>