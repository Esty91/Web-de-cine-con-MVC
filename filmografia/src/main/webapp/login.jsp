<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="styles.css">
<title>Insert title here</title>
</head>
<body>
	<h3>Identificacion usuario administrador:</h3>

	<form
		action="ServletLogin"
		method="post">
		<table>
			<tr>
				<td>Nombre usuario:</td>
				<td><input type="text" name="usuario"></td>
			</tr>
			<tr>
				<td>Clave:</td>
				<td><input type="text" name="clave"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Acceder"></td>
			</tr>
		</table>
		
	</form>
</body>
</html>