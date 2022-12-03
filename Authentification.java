package Login;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.*;
import jakarta.servlet.http.HttpSession;


public class Authentification extends HttpServlet {

    
    private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
		response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String username = request.getParameter("Username");
            String pwd =request.getParameter("Password");

            try {
                if (username!=null) {
                    Object newInstance = Class.forName("com.mysql.jdbc.Driver");
                    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/magasin_bd","root","pwd");
                    String sql = "select * from login where email=? and pwd=?";
                    PreparedStatement s = c.prepareStatement(sql);
                    s.setString(1, username);   
                    s.setString(2, pwd);
                    ResultSet r = s.executeQuery();
                    
                    if (r.next()) {
                        
                        HttpSession se=request.getSession(true);
                        se.setAttribute("email", username);
                        se.setMaxInactiveInterval(30);
                        response.sendRedirect("");
                    }
                    else{
                        out.println("erreur!");
                    }

                    
                    
                }
            } 
            catch (Exception ex) {
                out.println("Exeption : "+ ex.getMessage());
            }
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

}
