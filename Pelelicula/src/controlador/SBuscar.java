package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
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
 * Servlet implementation class SBuscar
 */
@WebServlet("/SBuscar")
public class SBuscar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SBuscar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String busqueda = request.getParameter("titulo");
		System.out.println("El valor del string busqueda es: " + busqueda);
		List<Pelicula> y = new ArrayList<Pelicula>();
		y = Dao.daoBuscarPelicula("'" + busqueda + "'");
		Iterator<Pelicula> it = y.iterator();

		while(it.hasNext()){
		  System.out.println(it.next());
		}
		
		request.setAttribute("peli", y);
		RequestDispatcher view = request.getRequestDispatcher("Buscar.jsp");
		view.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
