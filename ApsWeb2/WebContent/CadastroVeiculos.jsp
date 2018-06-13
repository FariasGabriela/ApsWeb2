<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="index.jsp">
		<button> Voltar </button>
	</form>
	<form action="VeiculosServlet" method="POST">
		Tipo: <input type="text" name="tipo" /> <br />
		Modelo: <input type="text"name="modelo" /> <br />
		Fabricante: <input type="text" name="fabricante" /> <br />
		Cor: <input type="text" name= "cor" /> <br/>
		Placa: <input type="text" name="placa" /> <br>
		<input type="submit" />
	</form>
</body>
</html>