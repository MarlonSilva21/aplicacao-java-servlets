<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/controller" var="linkServletNovaEmpresa" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastre uma nova empresa</title>
</head>
<body>

	<c:import url="logout-parcial.jsp" />

	<h1 align="center" style="color: blue;">Cadastre uma nova empresa</h1>

	<form align="center" action=" ${linkServletNovaEmpresa}" method="post">

		<label for="nome"> Nome: </label> <input type="text" name="nome"
			id="nome"> <label for="data">Data de Abertura</label> <input
			type="text" name="data" placeholder="dd/mm/yyyy"> <input
			type="hidden" name="acao" value="CadastrarEmpresa">

		<button type="submit">Cadastrar</button>

	</form>

</body>
</html>