package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import model.Pelicula;

public class Dao {
	public Pelicula daoBuscarPelicula(String pelele){
		
	    try {
	        Class.forName("com.mysql.jdbc.Driver");
	    } catch (ClassNotFoundException e) {
	        System.out.println("No hay driver");
	        e.printStackTrace();
	        return;
	    }

	    System.out.println("Driver correcto");
	    Connection connection = null;

	    try {
	        connection = DriverManager
	        .getConnection("jdbc:mysql://localhost/proyecto","root", "1111");

	    } catch (SQLException e) {
	        System.out.println("Fallo de conexi�n, comprueba la consola.");
	        e.printStackTrace();
	        return;
	    }

	    if (connection != null) {
	        System.out.println("Conectado");
	    } else {
	        System.out.println("Fallo");
	    }
		
		
	    
	    
	    
	    
	    
		Pelicula p = new Pelicula();
		return p;
	}
}
