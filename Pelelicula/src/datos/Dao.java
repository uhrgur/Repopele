package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.Pelicula;
//import model.Pelicula;
import model.Q;

public class Dao implements IDao{
	
	public Pelicula daoBuscarPelicula(String pelele){
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
    	public ArrayList<Pelicula> daoLista(){
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

            String url = "jdbc:mysql://10.90.36.16:3306/proyecto";
            String user = "enrique";
            String password = "enrique";

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
    	public void daoModificarPelicula(String elm, Pelicula pelicula){
    		
    		System.out.println("Loading driver...");
    		
            String tit = pelicula.getTitulo();
            int ano = pelicula.getAno();
            String cat = pelicula.getCategoria();
            String desc = pelicula.getDescripcion();
            String port = pelicula.getPortada();
            float precio = pelicula.getPrecio();
            int punt = (int) pelicula.getPuntuacion();
            String tra = pelicula.getTrailer();
            
            String query = Q.getqModificarPelicula(elm, tit, desc, tra, punt, cat, ano, precio, port);
            Connection con = null;
            PreparedStatement pst = null;
            boolean rs = false;

            try {
                

            	con = ConexionDB.getConection();
                pst = con.prepareStatement(query);
                rs = pst.execute();
                System.out.println("PSTQuery");
                	
                	System.out.println("Query ejecutada.");
                    
                
            } catch (SQLException ex) {
                    Logger lgr = Logger.getLogger(Dao.class.getName());
                    lgr.log(Level.SEVERE, ex.getMessage(), ex);

            } finally {
            	        	
                try {

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
            
            System.out.println("Finalizado procedimiento update");

    }
    	public void daoAnadirPelicula(Pelicula pelicula){
    		
    		System.out.println("Loading driver...");
    		
            String tit = pelicula.getTitulo();
            int ano = pelicula.getAno();
            String cat = pelicula.getCategoria();
            String desc = pelicula.getDescripcion();
            String port = pelicula.getPortada();
            float precio = pelicula.getPrecio();
            int punt = (int) pelicula.getPuntuacion();
            String tra = pelicula.getTrailer();
            
            String query = Q.getqAnadirPelicula(tit, desc, tra, punt, cat, ano, precio, port);
            Connection con = null;
            PreparedStatement pst = null;
            boolean rs = false;

            try {
                

            	con = ConexionDB.getConection();
                pst = con.prepareStatement(query);
                rs = pst.execute();
                System.out.println("PSTQuery");
                	
                	System.out.println("Query ejecutada.");
                    
                
            } catch (SQLException ex) {
                    Logger lgr = Logger.getLogger(Dao.class.getName());
                    lgr.log(Level.SEVERE, ex.getMessage(), ex);

            } finally {
            	        	
                try {

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
            
            System.out.println("Finalizado procedimiento update");

    }
    	
    	public void daoEliminarPelicula(String elm){
    		
    		System.out.println("Loading driver...");
            
            String query = Q.getqEliminarPelicula(elm);
            Connection con = null;
            PreparedStatement pst = null;
            boolean rs = false;

            try {
                

            	con = ConexionDB.getConection();
                pst = con.prepareStatement(query);
                rs = pst.execute();
                System.out.println("ELIMINARQuery");
                	
                	System.out.println("Query eliminar ejecutada.");
                    
                
            } catch (SQLException ex) {
                    Logger lgr = Logger.getLogger(Dao.class.getName());
                    lgr.log(Level.SEVERE, ex.getMessage(), ex);

            } finally {
            	        	
                try {

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
            
            System.out.println("Finalizado procedimiento eliminar");

    }

    	
}
