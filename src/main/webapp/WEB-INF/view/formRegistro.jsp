<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/controller" var="linkServletNovaUsuario" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Realizar Registro</title>
</head>
<body>

	<h1 align="center" style="color:blue;">Cadastre-se na plataforma!</h1>
	
	<form align="center" action=" ${linkServletNovaUsuario}" method="post">
		
		<label for="login">Login: </label>
		<input type="text" name="login" />
		
		<label for="senha">Senha: </label>
		<input type="password" name="senha" /> 
		
		<input type="hidden" name="acao" value="RegistroUsuario" />
		
		<button type="submit">Cadastre-se</button>
	
	</form>

</body>
</html>