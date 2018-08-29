package model;

public class Q {

	public String getqAnadirPelicula(String titulo, String descripcion, String trailer, int puntuacion, String categoria, int anio, float precio, String portada) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT INTO peliculas (titulo, descripcion, trailer, puntuacion, categoria, anio, precio, portada) VALUES ('");
		sb.append("', '");
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
	

	public String QMostrar() {
		
		String mostrar = ("SELECT * FROM peliculas;");
		return mostrar;
	}
	
	public String getqModificarPelicula(String titulo, String descripcion, String trailer, int puntuacion, String categoria, int anio, float precio, String portada){
	StringBuilder sd = new StringBuilder();
	sd.append("UPDATE peliculas (titulo, descripcion, trailer, puntuacion, categoria, anio, precio, portada) VALUES ('");
	sd.append("', '");
	sd.append(titulo);
	sd.append("', '");
	sd.append(descripcion);
	sd.append("', '");
	sd.append(trailer);
	sd.append("', ");
	sd.append(puntuacion);
	sd.append(", '");
	sd.append(categoria);
	sd.append("', ");
	sd.append(anio);
	sd.append(", ");
	sd.append(precio);
	sd.append(", '");
	sd.append(portada);
	sd.append("');");
	return sd.toString();
}

	public String getqEliminarPelicula(String titulo){
		
		StringBuilder sc = new StringBuilder();
		sc.append("DELETE FROM peliculas WHERE titulo = '");
		sc.append(titulo);
		sc.append("'");
		return sc.toString();
	}
	
}