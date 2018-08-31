package controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datos.Dao;
import model.Pelicula;

/**
 * Servlet implementation class SAnadir
 */
@WebServlet("/SAnadir")
public class SAnadir extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SAnadir() {
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if (request.getParameter("flag") !=null) {
		String titulo = request.getParameter("titulo");
		String trailer = request.getParameter("trailer");
		float puntuacion = Float.parseFloat(request.getParameter("puntuacion"));
		String categoria = request.getParameter("categoria");
		int ano = Integer.parseInt(request.getParameter("ano"));
		float precio = Float.parseFloat(request.getParameter("precio"));
		String portada = request.getParameter("portada");
		String descripcion = request.getParameter("descripcion");
		
	
		
		Pelicula peli = new Pelicula(titulo, descripcion, trailer, puntuacion, categoria, ano, precio, portada);
		
		Dao.daoAnadirPelicula(peli);
		
		RequestDispatcher view = request.getRequestDispatcher("mostrar.jsp");
		view.forward(request, response);
		}else{
		RequestDispatcher view = request.getRequestDispatcher("anadir.jsp");
		view.forward(request, response);
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
