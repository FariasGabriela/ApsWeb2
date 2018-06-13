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
		Nome: <input type="text" name="nome" /> <br />
		Telefone: <input type="text"name="telefone" /> <br />
		Ramal: <input type="text" name="ramal" /> <br />
		Sala: <input type="text" name= "sala" /> <br/>
		Cargo: <input type="text" name="cargo" /> <br>
		<input type="submit" />
	</form>
</body>
</html>