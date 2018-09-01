<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formulario eliminar</title>
</head>
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="style.css">

<body>
    <nav class="navbar navbar-toggleable-md navbar-inverse fixed-top bg-inverse">
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
        <a class="navbar-brand" href="mostrar.jsp">MovieCHEN</a>
        <div class="collapse navbar-collapse" id="navbarCollapse">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item">
                    <a class="nav-link" href="mostrar.jsp">Home <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="anadir.jsp">Añadir</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="modificar.jsp">Modificar</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="eliminar.jsp">Eliminar</a>
                </li>
            </ul>
            <form class="form-inline mt-2 mt-md-0">
                <input class="form-control mr-sm-2" type="text" placeholder="Search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
            </form>
        </div>
    </nav>
    <br>
    <br>
    <br>

<h1>Seleccione una película de la siguiente lista para ser eliminada.</h1>
	<form action="SEliminar" id="eliminarPelicula">
	<select name="titulo">
	  <option value=""></option>
	  <option value=""></option>
	  <option value=""></option>
	  <option value=""></option>
	</select>	
	<input type="hidden" name="flag" value="1">
    <input type="submit" name="submit" value="enviar">
	</form>

</body>
</html>