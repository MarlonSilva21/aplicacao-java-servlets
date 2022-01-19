<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nova empresa criada</title>
</head>
<body>
	<c:if test="${not empty Empresa}">
		<p style="color: green;"> Empresa ${Empresa} cadastrada com sucesso! </p>
	</c:if>
	
	<c:if test="${empty Empresa}">
		<p style="color: red;">Nenhuma empresa cadastrada</p>
	</c:if>
</body>
</html>







