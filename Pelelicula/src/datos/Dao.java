package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.Pelicula;
//import model.Pelicula;

public class Dao {
	
	
	//Sera pelicula pero estoy realizando pruebas con void
	public static Pelicula daoBuscarPelicula(String pelele){

		System.out.println("Loading driver...");
		
		Pelicula peli = null;
		
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            
        	con = ConexionDB.getConection();
            pst = con.prepareStatement("SELECT * FROM peliculas WHERE titulo = " + pelele + ";");
            rs = pst.executeQuery();

            while (rs.next()) {
            	
            	String titulo = rs.getString("titulo"); 
            	String descripcion = rs.getString("descripcion");
            	String trailer = rs.getString("trailer");
            	float puntuacion = rs.getFloat("puntuacion");
            	String categoria = rs.getString("categoria");
            	int ano = rs.getInt("ano");
    			float precio = rs.getFloat("precio");
    			String portada = rs.getString("portada");
                
                peli = new Pelicula(titulo, descripcion, trailer, puntuacion, categoria, ano, precio, portada);

                
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
		
        return peli;
        
	}
    	public static ArrayList<Pelicula> daoLista(){
    		List<Pelicula> x = new ArrayList<Pelicula>();
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
                	
                	String titulo = rs.getString("titulo"); 
                	String descripcion = rs.getString("descripcion");
                	String trailer = rs.getString("trailer");
                	float puntuacion = rs.getFloat("puntuacion");
                	String categoria = rs.getString("categoria");
                	int ano = rs.getInt("ano");
        			float precio = rs.getFloat("precio");
        			String portada = rs.getString("portada");
                	
                	
                    String nombre = rs.getString("titulo");
                    System.out.println(nombre);
                    
                    x.add(new Pelicula(titulo, descripcion, trailer, puntuacion, categoria, ano, precio, portada));
                    System.out.println(x);
                    
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
            
            return (ArrayList<Pelicula>) x;

	}
    	public static void SModificar(String elm){
    		
    		List<Pelicula> x = new ArrayList<Pelicula>();
    		System.out.println("Loading driver...");
    		
            Connection con = null;
            PreparedStatement pst = null;
            ResultSet rs = null;

            try {
                
            	con = ConexionDB.getConection();
                pst = con.prepareStatement("UPDATE");
                rs = pst.executeQuery();

                while (rs.next()) {
                	
                	String titulo = rs.getString("titulo"); 
                	String descripcion = rs.getString("descripcion");
                	String trailer = rs.getString("trailer");
                	float puntuacion = rs.getFloat("puntuacion");
                	String categoria = rs.getString("categoria");
                	int ano = rs.getInt("ano");
        			float precio = rs.getFloat("precio");
        			String portada = rs.getString("portada");
                    
                    x.add(new Pelicula(titulo, descripcion, trailer, puntuacion, categoria, ano, precio, portada));
                    System.out.println(x);
                    
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
            
        //RETURN

    }
}
