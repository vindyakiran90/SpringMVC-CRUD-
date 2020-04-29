<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee</title>
</head>
<body>
	<fieldset>
		<legend>Update Employee</legend>
		<form action="./updateEmp">

			<table>
				<tr>
					<td>Employee ID</td>
					<td><input type="number" name="id" required></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password"></td>
				</tr>

				<tr>
					<td><input type="submit" value="update"></td>
				</tr>
			</table>


		</form>
	</fieldset>
</body>
</html>