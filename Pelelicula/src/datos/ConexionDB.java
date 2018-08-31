package datos;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
*
* @author Antonio Santos
*/

/* NOTA
   Recuerda que debes incluir el driver de Mysql en la Librerias
*/

public class ConexionDB {

    private static Connection connection = null;
    
    public ConexionDB() {

        // ¿Cómo se puede acceder a una BBDD?
        
        // Forma 01 - Configurar un DataSource
        // http://www.mkyong.com/tomcat/how-to-configure-mysql-datasource-in-tomcat-6/
        // http://theopentutorials.com/tutorials/java-ee/servlet/servlet-datasource-resource-injection-in-tomcat/
        // http://www.journaldev.com/2513/tomcat-datasource-jndi-example-for-servlet-web-application
        
        // Forma 02 - Leyendo un fichero Properties
        // https://programmingenthusiast.wordpress.com/2015/05/02/a-simple-crud-tutorial-using-java-servletjsp-and-mysql/

        // Forma 03 - Mediante un gestor tipo Hibernate
        
        // Forma 04 - Forma cutre
        //      this.BD =   "jdbc:mysql:///" + "restaurante";
        //      this.user = "root";
        //      this.password = "root";
        
        // Forma 05 - El Servlet realiza el acceso
        //    El problema está en que no puedo acceder directamente al web.xml desde otro sitio
        //    Necesito hacerlo de forma indiretca... pero con el servlet se puede hacer de forma directa
        //    por eso, a veces, se ve que es el servlet el que arranca la BBDD        
    }


    public static Connection getConection() {
 
        InputStream inputStream = ConexionDB.class.getClassLoader().getResourceAsStream( "/db.properties" );
        Properties properties = new Properties();
        try {
            System.out.println("--- Leyendo Fichero Propiedades");
            properties.load( inputStream );
            String driver = properties.getProperty( "driver" );
            String url = properties.getProperty( "url" );
            String user = properties.getProperty( "user" );
            String password = properties.getProperty( "password" );
            try {
            	Class.forName( driver );
    		    System.out.println("Driver loaded!");
    		} catch (ClassNotFoundException e) {
    		    throw new IllegalStateException("Cannot find the driver in the classpath!", e);
    		}
            connection = DriverManager.getConnection( url, user, password );
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Excepcion SQL: " + e.getMessage());
            System.out.println("Estado SQL: " + e.getSQLState());
            System.out.println("Código del Error: " + e.getErrorCode());
        } catch (Exception e) {
            System.out.println("Otro problema: " + e);
        } finally {
            
        }
        return connection;

    }

    public void desconectar() {
        try {
            connection.close();
            connection = null;
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
