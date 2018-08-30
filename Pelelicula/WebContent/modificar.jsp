<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cuestionario modificar</title>
</head>
<body>
	<form action="SModificar" method="post">
     	Titulo:
	    <input type="text" name="titulo">
	    <br/>
	     Descripción:
	    <input type="text" name="descripción">
	    <br/>
	     Trailer:
	    <input type="text" name="trailer">
	    <br/>
	     Puntuación:
	    <input type="text" name="puntuacion">
	    <br/>
	     Categoría:
	    <input type="text" name="categoria">
	    <br/>
	     Año:
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