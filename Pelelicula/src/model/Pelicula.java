package model;
import java.util.*;
public class Pelicula {

	private String titulo;  //Nombre de la pelicula
	private String descripcion; //Sinopsis de la pelicula
	private String trailer; //insertar url
	private float puntuacion; //puntuacion de la pelicula
	private String categoria; //categoria de la pelicula
	private int ano; // a�o de la pelicula
	private float precio; //precio de la pelicula
	private String portada; // insertar url portada
	
	public Pelicula() {
		super();
	}

	public Pelicula(String titulo, String descripcion, String trailer, float puntuacion, String categoria, int ano,
			float precio, String portada) {
		super();
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.trailer = trailer;
		this.puntuacion = puntuacion;
		this.categoria = categoria;
		this.ano = ano;
		this.precio = precio;
		this.portada = portada;
	}
	
	public Pelicula buscarPelicula(String pelele){
		
		
		
		
		
		Pelicula p = new Pelicula();
		
		return p;
	}
	
	
	
	
	
	//Metodos Getters y Setters.
	
	// StringBuilder
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pelicula [titulo=");
		builder.append(titulo);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append(", trailer=");
		builder.append(trailer);
		builder.append(", puntuacion=");
		builder.append(puntuacion);
		builder.append(", categoria=");
		builder.append(categoria);
		builder.append(", ano=");
		builder.append(ano);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", portada=");
		builder.append(portada);
		builder.append("]");
		return builder.toString();
	}
	//Fin StringBuilder

	//Getters y Setters.
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTrailer() {
		return trailer;
	}

	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}

	public float getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(float puntuacion) {
		this.puntuacion = puntuacion;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getPortada() {
		return portada;
	}

	public void setPortada(String portada) {
		this.portada = portada;
	}

	//Fin Setters y Getters
	
	
	//M�todos
	
	public void Mostrar(){
		
	}
	
	
	
	
}
