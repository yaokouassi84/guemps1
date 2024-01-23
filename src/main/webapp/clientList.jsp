<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Liste de nos clients</title>
</head>
<body>

	<div>
		<c:forEach items="${clients}" var="c">
			<p>${c.nom} ${c.prenom}</p>		
		</c:forEach>	
	
	</div>
</body>
</html>