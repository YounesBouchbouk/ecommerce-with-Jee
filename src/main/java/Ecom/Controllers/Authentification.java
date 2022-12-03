package Ecom.Controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/authentication")

public class Authentification extends HttpServlet {

    
    private static final long serialVersionUID = 1L;


    public Authentification() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        
        System.out.println("i'm here");
       
            
            String email = request.getParameter("email");
            String pwd =request.getParameter("password");

            try {
                if (email!=null) {
                	System.out.println("i'm here");
                     Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecomm","root","toor");
                    String sql = "select * from utilisateur where email=? and password=?";
                    PreparedStatement s = c.prepareStatement(sql);
                    s.setString(1, email);   
                    s.setString(2, pwd);
                    ResultSet r = s.executeQuery();
                    
                    if (r.next()) {
                        
                 
                        HttpSession se= request.getSession(true);
                        se.setAttribute("userId", r.getString(1));
                        
                        se.setMaxInactiveInterval(30);
                        
                        System.out.println(r.getString(5));
                        
                        if(r.getString(5).equals("admin")) {
                        	response.sendRedirect("/Ecom/dashboard/order_list.jsp");

                        }else {
                        	
                        	request.getRequestDispatcher("/index.jsp").include(request, response);
                        }
                        
                    }
                    else{
        				request.setAttribute("error", "login or password are incorret ! ");
        				request.getRequestDispatcher("/login.jsp").include(request, response);
                    }

                    
                    
                }
            } 
            catch (Exception ex) {
               
            }
       
    }

}
