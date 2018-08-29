package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import model.Pelicula;

public class Dao {
	//Sera pelicula pero estoy realizando pruebas con void
	public void daoBuscarPelicula(String pelele){
		
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        String url = "jdbc:mysql://localhost:3306/proyecto";
        String user = "root";
        String password = "1111";

        try {
            
            con = DriverManager.getConnection(url, user, password);
            pst = con.prepareStatement("SELECT * FROM peliculas");
            rs = pst.executeQuery();

            while (rs.next()) {
                System.out.print(rs.next());
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
