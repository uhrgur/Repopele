 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>A�adir Peliculas</title>
</head>
<body>
	
	<form action="anadirBD" method="post">
     Titulo:
    <input type="text" name="titulo">
    <br/>
     Autor:
    <input type="text" name="autor">
    <br/>
     Descripci�n:
    <input type="text" name="descripci�n">
    <br/>
     Trailer:
    <input type="text" name="trailer">
    <br/>
     Puntuaci�n:
    <input type="text" name="puntuacion">
    <br/>
     Categor�a:
    <input type="text" name="categoria">
    <br/>
     A�o:
    <input type="text" name="ano">
    <br/>
     Precio:
    <input type="text" name="precio">
    <br/>
     Portada:
    <input type="text" name="portada">
    <br/>
	<input type="submit" name="submit" value="enviar">
	<input type="reset" name="reset" value="borrar datos">
	</form>
	
</body>
</html>