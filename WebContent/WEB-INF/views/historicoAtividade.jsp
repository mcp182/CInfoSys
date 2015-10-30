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
<title>Historico Ordem de Serviço</title>
</head>
<body>
<h3>Historico Ordem de Serviço</h3>

<script type="text/javascript">
	
		function finalizaAgora(id) {
			$.post("finalizaServico", {'id' : id}, function() {
				$("#tarefa_"+id).html("Finalizado");  
			});
		}
	
	</script>

<table>
	<tr>
		<th>Id</th>
		<th>Nome</th>
		<th>Descrição</th>
		<th>Prioridade</th>
		<th>Finalizado</th>
		
		
	</tr>
	<c:forEach items="${os}" var="od">
	<tr>
		<td>${od.id}</td>
		<td>${od.nome}</td>
		<td>${od.descricao}</td>
		<td>${od.prioridade}</td>
		<c:if test="${od.finalizado eq false}">
			<td id="tarefa_${od.id}">
			<a href="#" onClick="finalizaAgora(${od.id})">
			Finaliza agora!
			</a>
			</td>
		</c:if>
		<c:if test="${od.finalizado eq true}">
			<td>Finalizado</td>
		</c:if>
		
	
	</tr>	
	
	</c:forEach>
	</table>
</body>
</html>