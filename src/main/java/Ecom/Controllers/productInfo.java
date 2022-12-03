package Ecom.Controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Ecom.dbConnection;

/**
 * Servlet implementation class productInfo
 */
@WebServlet("/productInfo")
public class productInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public productInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		Connection connection = dbConnection.getConnection();
		PreparedStatement pst = null;
	    String sql = "select * from produit  where pid = ?";
		int id = Integer.parseInt(request.getParameter("id")) ;
		int price = 0 ;
		String name = "";
		try {
			pst = connection.prepareStatement(sql);
			pst.setInt(1, id);
			System.out.println(pst);
			ResultSet resultset = pst.executeQuery();
			 while(resultset.next()){
				 	System.out.println(resultset.getString(2));
				 	name = resultset.getString(2);
				 	price = resultset.getInt(3);
				 	
			 }
			 response.sendRedirect("/Ecom/commande.jsp?id="+ id + "&productname=" + name + "&price="+ price);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
