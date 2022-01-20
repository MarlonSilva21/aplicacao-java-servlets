<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="br.com.alura.gerenciador.model.Empresa"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Lista de empresas</title>
</head>
<body>

	<h5>
		Usuario logado: <span style="color: blue;">${usuarioLogado.login}</span>
	</h5>

	<c:import url="logout-parcial.jsp" />
	
	<form style="margin-right:10px;" align="center" action="/gerenciador/controller">

			<input type="hidden" name="acao" value="FormCadastrarEmpresa">
			<button type="submit">Cadastrar nova empresa</button>
		</form>

	<h2 align="center" style="color: blue;">Lista de empresas
		cadastradas:</h2>

	<ul align="center" style="list-style: none;">
		<c:forEach items="${empresas}" var="empresa">
			<li>${empresa.nome} - <fmt:formatDate
					value="${empresa.dataAbertura}" pattern="dd/MM/yyyy" /> -- <a
				href="/gerenciador/controller?acao=RemoveEmpresa&id=${empresa.id}">Remover</a>
				- <a
				href="/gerenciador/controller?acao=MostraEmpresa&id=${empresa.id}">Editar</a>
			</li>
		</c:forEach>
	</ul>

</body>
</html>


