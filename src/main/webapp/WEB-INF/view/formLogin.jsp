<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/controller" var="linkServletNovaEmpresa" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Realizar login</title>
</head>
<body>

	<h1 align="center" style="color:blue;">Entre na plataforma!</h1>
	
	<form align="center" action=" ${linkServletNovaEmpresa}" method="post">
		
		<label for="login">Login: </label>
		<input type="text" name="login" />
		
		<label for="senha">Senha: </label>
		<input type="password" name="senha" /> 
		
		<input type="hidden" name="acao" value="Login" />
		
		<button type="submit">Entrar</button>
	
	</form>

</body>
</html>