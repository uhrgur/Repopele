package model;

public class Q {

	public String getqAnadirPelicula(String titulo, String descripcion, String trailer, int puntuacion, String categoria, int anio, float precio, String portada) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT INTO peliculas (titulo, descripcion, trailer, puntuacion, categoria, anio, precio, portada) VALUES ('");
		sb.append(titulo);
		sb.append("', '");
		sb.append(descripcion);
		sb.append("', '");
		sb.append(trailer);
		sb.append("', ");
		sb.append(puntuacion);
		sb.append(", '");
		sb.append(categoria);
		sb.append("', ");
		sb.append(anio);
		sb.append(", ");
		sb.append(precio);
		sb.append(", '");
		sb.append(portada);
		sb.append("');");
		//NO ESTA TERMINADO
		return sb.toString();
	}
	

<<<<<<< HEAD
	public String getqEliminarPelicula(String titulo) {
	}
	public void QMostrar(){
	}
	public String getqEliminarPelicula(String titulo){
		
		//"SELECT titulo from peliculas;"
		
		StringBuilder sb = new StringBuilder();
		sb.append(titulo);
		return sb.toString();
=======
	public String getqEliminarPelicula(String titulo){
		
		StringBuilder sc = new StringBuilder();
		sc.append("DELETE FROM peliculas WHERE titulo = '");
		sc.append(titulo);
		sc.append( "'");
		return sc.toString();
>>>>>>> 63202960202d6fb287450a2254f2debed123514c
	}
}