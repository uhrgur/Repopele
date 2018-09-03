package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datos.Dao;
import model.Pelicula;

/**
 * @author Edgar Arabaolaza
 * Servlet implementation class SEliminar
 */
@WebServlet("/SEliminar")
public class SEliminar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	
	public SEliminar() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// --------------------
		// Atributos
		// --------------------
		
		/**
		 * Lógica para decidir dispatcher.
		 * 
		 * @param flag
		 * 			  Se verifica si existe la variable "flag"
		 * 
		 * @param titulo
		 *            Se guarda aquí la película a eliminar.
		 *            
		 */
		
		if (request.getParameter("flag") != null) {
			String titulo = request.getParameter("borrar");
			
			Dao.daoEliminarPelicula(titulo);

			RequestDispatcher view = request.getRequestDispatcher("SMostrar");
			view.forward(request, response);
		} 
		
		/**
		 * Si no se ha realizado el formulario:
		 * 
		 * @param lista
		 *            Recoge la información de la base de datos y la envía a eliminar.jsp.
		 *            
		 */
		
		else {
			List<Pelicula> lista = new ArrayList<Pelicula>();
			lista = Dao.daoLista();
			request.setAttribute("peliculas", lista);
			RequestDispatcher view = request.getRequestDispatcher("eliminar.jsp");
			view.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
