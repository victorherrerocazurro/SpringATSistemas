<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="registro" modelAttribute="usuario" method="POST">
	<form:errors></form:errors>
	<form:label path="nombre">Nombre:</form:label> <form:input path="nombre"/><form:errors path="nombre"></form:errors>
	<form:label path="password">Password:</form:label><form:password path="password"/><form:errors path="password"></form:errors>
	<form:label path="altura">Altura:</form:label><form:input path="altura"/><form:errors path="altura"></form:errors>
	<form:label path="fechaNacimiento">Fecha Nacimiento:</form:label><form:input path="fechaNacimiento"/><form:errors path="fechaNacimiento"></form:errors>
	<form:label path="genero">Genero:</form:label><form:select path="genero">
		<form:option value="Masculino"/>
		<form:option value="Femenino"/>
	</form:select><form:errors path="genero"></form:errors>
	<input type="submit" value="Enviar"/> 
</form:form>
</body>
</html>