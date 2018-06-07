<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Liste des utilsateurs</title>
</head>
<body>
	<h2>La liste des utilisateurs de l'application</h2>
	<table border="1" align="center">
		<tr>
			<th>Nom</th>
			<th>Prénom</th>
			<th>Email</th>
			<th>Téléphone</th>
			<th>Login</th>
		</tr>
		<c:forEach items="${users}" var="user">
			<%-- Utilisation d'un tag jstl --%>
			<tr>
				<td>${user.nom}</td>
				<%-- Utilisation d'une EL --%>
				<td>${user.prenom}</td>
				<td>${user.email}</td>
				<td>${user.telephone}</td>
				<td>${user.login}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>