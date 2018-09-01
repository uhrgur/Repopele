<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Añadir Peliculas</title>
</head>
<meta charset="UTF-8">
    <title>Anadir</title>
</head>
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="style.css">

<body>
    <nav class="navbar navbar-toggleable-md navbar-inverse fixed-top bg-inverse">
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
        <a class="navbar-brand" href="SMostrar">MovieCHEN</a>
        <div class="collapse navbar-collapse" id="navbarCollapse">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item">
                    <a class="nav-link" href="SMostrar">Home <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="SAnadir">Añadir</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="SModificar">Modificar</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="SEliminar">Eliminar</a>
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
    <div class="align-middle dropdown ml-4">
        <form action="SAnadir" method="post">
            <h2>Introduce la pelicula que quieres añadir papichulo</h2>
            <div class="c1">Titulo:</div>
            <div class="c2"><input type="text" name="titulo"></div>
            <br/>
            <div class="c1">Trailer:</div>
            <div> <input type="text" name="trailer"></div>
            <br/>
            <div class="c1">Puntuación:</div>
            <div><input type="text" name="puntuacion"></div>
            <br/>
            <div class="c1">Categoría:</div>
            <div><input type="text" name="categoria"></div>
            <br/>
            <div class="c1">Año:</div>
            <div><input type="number" name="ano"></div>
            <br/>
            <div class="c1">Precio:</div>
            <div><input type="number" step="0.01" name="precio"></div>
            <br/>
            <div class="c1">Portada:</div>
            <div><input type="text" name="portada"></div>
            <br/>
            <div class="c1 desc">Descripción:</div>
            <div class="c2"> <textarea type="text" name="descripcion" rows="4" cols="50">
            </textarea></div>
            <input type="hidden" name="flag" value="1">
            <input type="submit" name="submit" value="enviar">
            <input type="reset" name="reset" value="borrar datos">
        </form>
    </div>
    <br>

</body>

</html>


