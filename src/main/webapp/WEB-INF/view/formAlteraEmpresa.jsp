<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/controller" var="linkServletAlteraEmpresa" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Altere a empresa</title>
</head>
<body>

	<c:import url="logout-parcial.jsp" />

	<h3 align="center" style="color: blue;">Edite as informações da
		empresa cadastrada</h3>

	<form align="center" action=" ${linkServletAlteraEmpresa}"
		method="post">

		<label for="nome"> Nome: </label> <input type="text" name="nome"
			id="nome" value="${empresa.nome}"> <label for="data">Data
			de Abertura</label> <input type="text" name="data"
			value=" <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy" />">

		<input type="hidden" name="id" value="${empresa.id}"> <input
			type="hidden" name="acao" value="AlteraEmpresa">

		<button type="submit">Salvar alterações</button>

	</form>

</body>
</html>