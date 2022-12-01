package Ecom.Controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Ecom.dbConnection;
import Ecom.pojo.User;


/**
 * Servlet implementation class register
 */
@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public register() {
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 HttpSession session = request.getSession();

		 Connection connection = dbConnection.getConnection();
		if(request.getParameter("password").equals(request.getParameter("password-confirm"))){
			User  user = new User();
		    user.setUsername(request.getParameter("username"));
		    user.setPassword(request.getParameter("password"));
		    user.setFirstName(request.getParameter("firstName"));
		    user.setLastName(request.getParameter("lastName"));
		    user.setEmail(request.getParameter("email"));
		    System.out.println(user.toString());
		   // BaseDao baseDao = new BaseDaoImpl();
		   // msg = baseDao.register(user);
		    PreparedStatement pst = null;
	        String sql = "insert into utilisateur  values (null,?,?,?,?,?)";
	        try {
	            pst = connection.prepareStatement(sql);
	            pst.setString(1, user.getFirstName());
	            pst.setString(2, user.getLastName());
	            pst.setString(3, user.getEmail());
	            pst.setString(4, user.getUsername());
	            pst.setString(5, user.getPassword());

	            int result =  pst.executeUpdate();
	            
	            session.setAttribute("User_id", 1);
				session.setMaxInactiveInterval(60*30*30*1000);
	            
	            request.setAttribute("succ", "u have registred successfully");
				request.setAttribute("error", null);
				
	        } catch (SQLException exp) {
	            System.out.println(exp.getMessage());
	            request.setAttribute("succ", null);
				request.setAttribute("error", exp.getMessage());
	        }
		}else {
			System.out.println("Password and Conform Passwords must be same");
			request.setAttribute("succ", null);
			request.setAttribute("error", "Password and Conform Passwords must be same");
		}
		
		request.getRequestDispatcher("/register.jsp").include(request, response);
	}

}
