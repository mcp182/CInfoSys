<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type="text/css" href="resources/css/tarefas.css" rel="stylesheet">
<title>Historico Estoque</title>
</head>
<body>

<h3>Consulta Estoque</h3>

	<table>
	<tr>
	
		<th>Id</th>
		<th>Nome</th>
		<th>Descrição</th>
		<th>Chegada</th>
		<th>Destino</th>
		<th>Retirada</th>
		
	</tr>
	<c:forEach items="${ce}" var="es">
	<tr>
	
		<td>${es.id}</td>
		<td>${es.nome}</td>
		<td>${es.descricao}</td>
		<td>
			<fmt:formatDate 
				value="${es.chegada.time}"
				pattern="dd/MM/yyyy" />
		</td>
		
		<td>${es.destino}</td>
		<td>${es.retirada}</td>

	</tr>	
	
	</c:forEach>
	</table>
</body>
</html>