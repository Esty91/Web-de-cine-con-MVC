<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Consultar directores</title>
</head>
<body>
	<h3>Introduce el nombre del director:</h3>
	<form action="ServletBuscarPeliculasPorDirector" method="post">
		<table>
			<tr>
				<td>Nombre del director:</td>
				<td><input type="text" name="director"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Consultar"></td>
			</tr>
		</table>
	</form>
</body>
</html>