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

<h3>Adicionar Material</h3>
	<form action="materialAdicionado" method="post">

		 Nome: <input type="text" name="nome"  /><br />
		 Descri��o: <br /><textarea name="descricao" rows="3" cols="50"></textarea><br />
		 
		 		 <input type="submit" value="Gravar">
		 </form>

</body>
</html>