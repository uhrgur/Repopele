package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.mysql.jdbc.Driver;
//import model.Pelicula;

public class Dao {
	//Sera pelicula pero estoy realizando pruebas con void
	public static void daoBuscarPelicula(String pelele){
		
		System.out.println("Loading driver...");

		try {
		    Class.forName("com.mysql.jdbc.Driver");
		    System.out.println("Driver loaded!");
		} catch (ClassNotFoundException e) {
		    throw new IllegalStateException("Cannot find the driver in the classpath!", e);
		}
		
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        String url = "jdbc:mysql://localhost:3306/proyecto";
        String user = "root";
        String password = "1111";

        try {
            
            con = DriverManager.getConnection(url, user, password);
            pst = con.prepareStatement("SELECT * FROM peliculas;");
            rs = pst.executeQuery();

            while (rs.next()) {
                System.out.print("imprimiendo dentro de dao" + rs.next());
            }

        } catch (SQLException ex) {
                Logger lgr = Logger.getLogger(Dao.class.getName());
                lgr.log(Level.SEVERE, ex.getMessage(), ex);

        } finally {

            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (SQLException ex) {
                Logger lgr = Logger.getLogger(Dao.class.getName());
                lgr.log(Level.WARNING, ex.getMessage(), ex);
            }
        }
  

		//Pelicula p = new Pelicula();
		//return p;
	}
}
