package model;

import java.util.ArrayList;

public class Q {

	public String getqAnadirPelicula(String titulo, String descripcion, String trailer, int puntuacion,
			String categoria, int anio, float precio, String portada) {

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

		return sb.toString();
	}

	public String getqMostrar() {

		String mostrar = ("SELECT * FROM peliculas;");
		return mostrar;
	}

	public static String getqModificarPelicula(String tituloAntiguo, String tituloNuevo, String descripcion, String trailer, int puntuacion,
			String categoria, int ano, float precio, String portada) {
		StringBuilder sd = new StringBuilder();
		sd.append("UPDATE peliculas SET titulo = '");
		sd.append(tituloNuevo);
		sd.append("',");
		sd.append("descripcion ='");
		sd.append(descripcion);
		sd.append("',");
		sd.append("trailer ='");
		sd.append(trailer);
		sd.append("',");
		sd.append("puntuacion ='");
		sd.append(puntuacion);
		sd.append("',");
		sd.append("categoria ='");
		sd.append(categoria);
		sd.append("',");
		sd.append("ano ='");
		sd.append(ano);
		sd.append("',");
		sd.append("precio ='");
		sd.append(precio);
		sd.append("',");
		sd.append("portada ='");
		sd.append(portada);
		sd.append("'");
		sd.append("WHERE titulo = '");
		sd.append(tituloAntiguo);
		sd.append("';");
		System.out.println("Imprimiendo return getqModificar: " + sd.toString());
		return sd.toString();
	}

	public String getqEliminarPelicula(String titulo) {

		StringBuilder sc = new StringBuilder();
		sc.append("DELETE FROM peliculas WHERE titulo = '");
		sc.append(titulo);
		sc.append("';");
		return sc.toString();
	}

	public String getqBuscarPelicula(String titulo) {
		StringBuilder ss = new StringBuilder();
		ss.append("SELECT * FROM peliculas WHERE titulo = '");
		ss.append(titulo);
		ss.append("';");
		return ss.toString();

	}

	public String getqOrdenarCategoria(String categoria) {
		StringBuilder oc = new StringBuilder();
		oc.append("SELECT * from peliculas where categoria = ' ");
		oc.append(categoria);
		oc.append("';");
		return oc.toString();
	}
	
	public String getqOrdenarPrecio(String precio) {
		StringBuilder op = new StringBuilder();
		op.append("SELECT * from peliculas where precio = ' ");
		op.append(precio);
		op.append("';");
		return op.toString();
	}

}
