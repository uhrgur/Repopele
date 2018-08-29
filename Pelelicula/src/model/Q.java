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
	
}