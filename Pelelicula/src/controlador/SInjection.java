package controlador;
 
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
 
public class SInjection extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    @Resource(name = "jdbc/proyecto")
    DataSource ds;
 
    public SInjection() {
        super();
    }
 
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            Connection con = ds.getConnection();
 
            Statement stmt = con.createStatement();
            String query = "select * from peliculas";
            ResultSet rs = stmt.executeQuery(query);
 
            PrintWriter out = response.getWriter();
            response.setContentType("text/html");
            out.print("<center><h1>Employee Details</h1></center>");
            out.print("<html><body>");
            out.print("<table border=\"1\" cellspacing=10 cellpadding=5>");
            out.print("<tr><th>Employee ID</th>");
            out.print("<th>Employee Name</th>");
            out.print("<th>Salary</th>");
            out.print("<th>Department</th></tr>");
 
            while (rs.next()) {
                out.print("<tr>");
                out.print("<td>" + rs.getString("titulo") + "</td>");
                out.print("</tr>");
            }
            out.print("</table></body></html>");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
 
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
}