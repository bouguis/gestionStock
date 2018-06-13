<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


	<div class="col-lg-6">
		<div class="card">
			<div class="card-title">
				<h4>Table Categorie</h4>

			</div>
			<div class="card-body">
				<div class="table-responsive">
					<form action="listeCategorie" method="get">
						<table class="table table-hover ">
							<thead>
								<tr>
									<th>ID</th>
									<th>CATEGORIE</th>
									<th>ACTION</th>


								</tr>
							</thead>
							<tbody>
								<c:forEach items="${categorie}" var="rep">

									<tr>
										<td>${rep.idCategorie}</td>
										<td>${rep.libelle}</td>


									</tr>
								</c:forEach>

							</tbody>
						</table>
					</form>
				</div>
			</div>
		</div>
		<!-- /# card -->
	</div>

</body>
</html>