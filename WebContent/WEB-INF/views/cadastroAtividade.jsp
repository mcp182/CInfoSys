<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type="text/css" href="resources/css/tarefas.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>

<h3>Adicionar Ordem de Serviço</h3>
	<form action="ordemAdicionada" method="post">

		 Título: <input type="text" name="nome"  /><br />
		 Descrição: <br /><textarea name="descricao" rows="5" cols="50"></textarea><br />
		 Prioridade: <input type="text" name="prioridade"  /><br />
		 
		 		 <input type="submit" value="Gravar">
		 </form>
</body>
</html>