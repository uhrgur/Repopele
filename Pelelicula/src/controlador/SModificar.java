package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import datos.Dao;
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
		// TODO Auto-generated method stub
		String titulo = request.getParameter(titulo);
		String descripcion = request.getParameter(descripcion);
		String trailer = request.getParameter(trailer);
		float puntuacion = Float.parseFloat(request.getParameter("puntuacion"));
		String categoria = request.getParameter(categoria);
		Integer ano = Integer.parseInt(request.getParameter("ano"));
		float precio = Float.parseFloat(request.getParameter("precio"));
		String portada = request.getParameter(portada);
		String m = request.getParameter("submit");
		System.out.println("cuidado que m se imprime en 3, 2 , 1 ..." + m);
		
		//RECOGER DATOS USUARIO
		
		Dao.daoModificarPelicula();
		
		RequestDispatcher view = request.getRequestDispatcher("Modificar.jsp");
		view.forward(request, response);
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
