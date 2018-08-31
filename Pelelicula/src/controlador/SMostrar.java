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
import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;
import model.Pelicula;
/**
 * Servlet implementation class SMostrar
 */
@WebServlet("/SMostrar")
public class SMostrar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SMostrar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Pelicula> lista = new ArrayList<Pelicula>();
		
		lista = Dao.daoLista();
		
		System.out.println("--Servlet: Estamos en mostrar lista"+lista);
		
		/*Iterator<Pelicula> itr = lista.iterator();
		while(itr.hasNext()){
			
			System.out.println("lista: "+ itr.next());
		}*/
		
		
		request.setAttribute("peliculas", lista);
		RequestDispatcher view = request.getRequestDispatcher("mostrar.jsp");
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
