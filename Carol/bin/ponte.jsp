<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<html>
<head>
<title>Pontos Criticos da Cidade - Facilitando o Dia-a-Dia</title>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description"
	content="indicando os pontos criticos da cidade de sao jose dos campos" />
<meta
	name"keywords" content="problemas,ruas,acidentes,inchentes,congestionamento" />
<meta name="author" content="Caroline Teixeira" />
<link rel="stylesheet" type="text/css" href="css/estilo.css" />


</head>
<body>
<%-- 	<h1>Bem-Vindo ${user}</h1> --%>
	<img id="imagem" src="imagem/fundo.jpg" />
	<div class="texto">Pontos Criticos - Filtre ou Adicione</div>
 <form class="baseForm" method="post" action="">  
		<br>
		<br>
		<!-- Filtre pelo nome da rua: <input class="formInput formTextInput" id=rua
			type="text" name="rua"> <input class="formInput submit"
			type="submit" value="Filtrar"> -->
		<h2>Noticias</h2>
		<c:forEach var="contato" items="${lista}">
			<tr>
			
				<td>${contato.nome}</td>
				<td>${contato.tipo} </td>
				<td>${contato.endereco}</td>
				<td>${contato.mensagem}</td><br>
			</tr>
		</c:forEach>
		<br>
		<a href="addponto?user=${user}">Adicionar</a> <a
			href="atualizar?user=${user}">Atualizar</a> <a
			href="deletar?user=${user}">Deletar</a> <a href="sair">Sair</a>








</form> 



</body>
</html>
