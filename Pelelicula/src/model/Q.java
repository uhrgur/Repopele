package model;

public class Q {

	public String getqAnadirPelicula(String titulo, String descripcion, String trailer, int puntuacion, String categoria, int anio, float precio, String portada) {
		
		StringBuilder sb = new StringBuilder();
		sb.append(titulo);
		sb.append(descripcion);
		sb.append(trailer);
		sb.append(puntuacion);
		sb.append(categoria);
		sb.append(anio);
		sb.append(precio);
		sb.append(portada);
		//NO ESTA TERMINADO
		return sb.toString();
	}
	
<<<<<<< HEAD
	public void QMostrar(){
=======
	public String getqEliminarPelicula(String titulo){
		
		//"SELECT titulo from peliculas;"
>>>>>>> c0aaa5193fe6456d12721eea534c97ca1fdcba4d
		
	}
	
}