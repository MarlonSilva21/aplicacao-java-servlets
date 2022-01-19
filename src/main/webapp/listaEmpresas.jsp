<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="br.com.alura.gerenciador.servlet.Empresa"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standard TagLib</title>
</head>
<body>

	<h2 align="center" style="color:blue;">Lista de empresas cadastradas: </h2>

	<ul align="center" style="list-style:none;">
		<c:forEach items="${empresas}" var="empresa">
			<li> 
				${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy" /> 
				-- <a href="/gerenciador/removeEmpresa?id=${empresa.id}">Remover</a>
				 - <a href="/gerenciador/pegarEmpresa?id=${empresa.id}">Editar</a>
			</li>
		</c:forEach>
	</ul>

</body>
</html>

