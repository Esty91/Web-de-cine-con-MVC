<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="styles.css">
<title>Pelicula por director</title>
</head>
<body>
	<table>
		<tbody>
			<tr>
				<th>Director</th>
				<th>Titulo</th>
				<th>Fecha</th>
			</tr>
			<c:forEach var="pelicula" items="${peliculaPorDirector}">
				<tr>
					<td><c:out value="${pelicula.sDirector}" /></td>
					<td><c:out value="${pelicula.sTitulo}"></c:out></td>
					<td><c:out value="${pelicula.fecha}"></c:out></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br>
	<p>Desea realizar otra consulta?</p>
	<a href="consultarDirectores.jsp"><input type="submit"
			name="Opcion" value="Si" /></a>
	<form action="ServletDirectoresConsultados" method="post">
		 <a href="directoresConsultados.jsp"><input
			type="submit" name="Opcion" value="Finalizar" /></a>
	</form>
</body>
</html>