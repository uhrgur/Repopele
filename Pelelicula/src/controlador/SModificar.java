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
 * Servlet implementation class SModificar
 */
@WebServlet("/SModificar")
public class SModificar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SModificar() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if (request.getParameter("submit1") != null){
			
			String peliMod = request.getParameter("modificar");
			Pelicula ppmod = Dao.daoBuscarPelicula(peliMod);
			request.setAttribute("pelicula", ppmod);
			request.setAttribute("peliantigua", peliMod);
			
			RequestDispatcher view = request.getRequestDispatcher("modificarOP.jsp");
			view.forward(request, response);
			
		}

		else if (request.getParameter("submit2") != null) {
			System.out.println(request.getParameter("flag")+" estoy en el flag 2");
			String peli = request.getParameter("peliantigua");
			String titulo = request.getParameter("titulo");
			String trailer = request.getParameter("trailer");
			float puntuacion = Float.parseFloat(request.getParameter("puntuacion"));
			String categoria = request.getParameter("categoria");
			int ano = Integer.parseInt(request.getParameter("ano"));
			float precio = Float.parseFloat(request.getParameter("precio"));
			String portada = request.getParameter("portada");
			String descripcion = request.getParameter("desc");

			Pelicula pelele = new Pelicula(titulo,descripcion,trailer,puntuacion,categoria,ano,precio,portada);

			Dao.daoModificarPelicula(peli,pelele);

			RequestDispatcher view = request.getRequestDispatcher("SMostrar");
			view.forward(request, response);
		} 
		else {
			System.out.println(request.getParameter("flag")+" estoy en el flag 3");
			List<Pelicula> lista = new ArrayList<Pelicula>();
			lista = Dao.daoLista();
			request.setAttribute("peliculas", lista);
			RequestDispatcher view = request.getRequestDispatcher("modificar.jsp");
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
