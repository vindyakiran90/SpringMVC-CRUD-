<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
</head>
<body>
	<div align="center">
		<fieldset>
			<legend>Add Employee</legend>
			<form action="./added" method="post">
				<table>
					<tr>
						<td>Id</td>
						<td><input type="number" name="id"></td>
					</tr>
					<tr>
						<td>Name</td>
						<td><input type="text" name="name"></td>
					</tr>
					<tr>
						<td>Salary</td>
						<td><input type="number" name="salary"></td>
					</tr>
					<tr>
						<td>Age</td>
						<td><input type="number" name="age"></td>
					</tr>
					<tr>
						<td>Password</td>
						<td><input type="password" name="password"></td>
					</tr>
					<tr>
						<td>Designation</td>
						<td><input type="text" name="designation"></td>
					</tr>
					<tr>
						<td><input type="submit" value="Register"></td>
					</tr>
				</table>
			</form>
		</fieldset>
	</div>
</body>
</html>