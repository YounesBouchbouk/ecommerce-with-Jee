package Ecom.Controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Ecom.dbConnection;
import Ecom.pojo.Commande;
import Ecom.pojo.User;

/**
 * Servlet implementation class order
 */
@WebServlet("/order")
public class order extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public order() {
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
		// TODO Auto-generated method stub
		doGet(request, response);
		
		System.out.println(request.getParameter("ville"));
		System.out.println(request.getParameter("amount"));
		System.out.println(request.getParameter("address"));
		System.out.println(request.getParameter("recipiendaire"));
		Commande  Onecommande = new Commande(request.getParameter("ville"), request.getParameter("address"), request.getParameter("recipiendaire") ,Integer.valueOf(request.getParameter("amount")) );
	   
	    System.out.println(Onecommande.toString());
	   // BaseDao baseDao = new BaseDaoImpl();
	   // msg = baseDao.register(user);
	    PreparedStatement pst = null;
        String sql = "insert into commande  values (?,?,?,?)";
        Connection connection = dbConnection.getConnection();
        try {
            pst = connection.prepareStatement(sql);
         

            pst.executeUpdate();
        } catch (SQLException exp) {
            System.out.println(exp.getMessage());
        }
	}

}
