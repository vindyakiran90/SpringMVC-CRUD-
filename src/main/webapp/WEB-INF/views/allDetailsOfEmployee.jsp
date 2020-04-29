<%@page import="com.tyss.springmvc.beans.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<% List<Employee> info = (List<Employee>)request.getAttribute("list"); %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employees List</title>
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
			<%for(Employee info1 : info) { %>
			<tr>
				<td><%=info1.getId() %></td>
				<td><%=info1.getName() %></td>
				<td><%=info1.getSalary() %></td>
				<td><%=info1.getDesignation() %></td>
				<td><%=info1.getAge() %></td>
				<td><%=info1.getPassword() %></td>
			</tr>
			<%} %>
		</table>

	</div>
	<% } %>
</body>
</html>