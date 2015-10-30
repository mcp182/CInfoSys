<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
<script type="text/javascript" src="resources/js/jquery.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type="text/css" href="resources/css/tarefas.css" rel="stylesheet">
<title>Historico Retirada Chave</title>
</head>
<body>

<h3>Consulta Retirada de Chave</h3>


	<script type="text/javascript">
	
		function finalizaAgora(carteirinha) {
			$.post("finalizaRetirada", {'carteirinha' : carteirinha}, function() {
				$("#tarefa_"+carteirinha).html("Finalizado"); 
			});
		}
	
	</script>

	<table>
	<tr>
		<th>Carteirinha</th>
		<th>Nome</th>
		<th>SalaLab</th>
		<th>Retirada</th>
		<th>Finalizado</th>
	</tr>
	<c:forEach items="${cc}" var="ch">
	<tr>
		<td>${ch.carteirinha}</td>
		<td>${ch.nome}</td>
		<td>${ch.salaLab}</td>
		<td>
			<fmt:formatDate 
				value="${ch.retirada.time}"
				pattern="dd/MM/yyyy hh:mm:ss" />
		</td>
		
		<c:if test="${ch.finalizado eq false}">
			<td id="tarefa_${ch.carteirinha}">
			<a href="#" onClick="finalizaAgora(${ch.carteirinha})">
			Finaliza agora!
			</a>
			</td>
		</c:if>
		<c:if test="${ch.finalizado eq true}">
			<td>Finalizado</td>
		</c:if>
	</tr>	
	
	</c:forEach>
	</table>	
</body>
</html>