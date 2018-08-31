<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modificar Peliculas</title>
</head>
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="style.css">

<body>
    <nav class="navbar navbar-toggleable-md navbar-inverse fixed-top bg-inverse">
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
        <a class="navbar-brand" href="#">Carousel</a>
        <div class="collapse navbar-collapse" id="navbarCollapse">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item">
                    <a class="nav-link" href="index.jsp">Home <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="anadir.jsp">A�adir</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="modificar.jsp">Modificar</a>
                </li>
                <li class="nav-item active">
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
<div class="align-middle dropdown ml-4">


        <form action="SModificar" method="post">
        <select name="peliculas">
            <h2>Obtener peliculas</h2>
            <div class="c1">Titulo:</div>
            <div class="c2"><input type="text" name="titulo" value="${titulo}"></div>
            <br/>
            <div class="c1">Trailer:</div>
            <div> <input type="text" name="trailer" values=${"Trailer"}></div>
            <br/>
            <div class="c1">Puntuaci�n:</div>
            <div><input type="text" name="puntuacion"  values=${"puntuacion"}></div>
            <br/>
            <div class="c1">Categor�a:</div>
            <div><input type="text" name="categoria" values=${"categoria"}></div>
            <br/>
            <div class="c1">A�o:</div>
            <div><input type="number" name="ano" values=${"ano"}></div>
            <br/>
            <div class="c1">Precio:</div>
            <div><input type="number" step="0.01" name="precio" values=${"precio"}></div>
            <br/>
            <div class="c1">Portada:</div>
            <div><input type="text" name="portada" values=${"portada"}></div>
            <br/>
            <div class="c1 desc" name="descripcion" >Descripci�n:</div>
            <div class="c2"> <textarea input type="text" name="titulo" rows="4" cols="50" values=${"portada"}>
            </textarea></div>
            <input type="submit" name="submit" value="enviar">
            <input type="reset" name="reset" value="borrar datos">
        </select>
        </form>
    </div>
</body>
</html>