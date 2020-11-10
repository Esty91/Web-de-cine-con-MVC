<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Introduce los datos de la pelicula que deseas añadir:</h3>
	<form action="ServletAniadirPelicula" method="post">
		<table>
			<tr>
				<td>Nombre del director:</td>
				<td><input type="text" name="director"></td>
			</tr>
			<tr>
				<td>Titulo:</td>
				<td><input type="text" name="titulo"></td>
			</tr>
			<tr>
				<td>Fecha de estreno:</td>
				<td><input type="text" name="fecha"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Consultar"></td>
			</tr>
		</table>
	</form>
</body>
</html>