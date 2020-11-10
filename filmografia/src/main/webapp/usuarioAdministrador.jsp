<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="styles.css">
<title>Usuario Administrador</title>
</head>
<body>
	<table>
		<tbody>
			<tr>
				<th>Nombre usuario</th>
				<th>Clave</th>
			</tr>
			<c:forEach var="user" items="${usuarioAdministrador}">
				<tr>
					<td><c:out value="${user.sNombreUsuario}" /></td>
					<td><c:out value="${user.sClave}"></c:out></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
		<a href="login.jsp"><input type="submit"
			name="Opcion" value="Volver" ></a>
			<form action="ServletMantenimientoDePeliculas" method="post"><br>
			<input type="submit" value="Mantenimiento de peliculas">
			</form>
</body>
</html>