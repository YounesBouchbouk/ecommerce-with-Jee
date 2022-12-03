package Ecom.Controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		HttpSession session = request.getSession();
		
		System.out.println(request.getParameter("id"));
		System.out.println(request.getParameter("amount"));
		System.out.println(request.getParameter("address"));
		System.out.println(request.getParameter("recipiendaire"));
		Commande  Onecommande = new Commande(request.getParameter("ville"), request.getParameter("address"), request.getParameter("recipiendaire") ,Integer.valueOf(request.getParameter("amount")) );
	   
	    System.out.println(Onecommande.toString());
	   // BaseDao baseDao = new BaseDaoImpl();
	   // msg = baseDao.register(user);
	    PreparedStatement pst = null;
	    PreparedStatement pst2 = null;

        String sql = "insert into commande  values (null,?,?,?,?,?,?,?)";
        String sqlproduits_commande = "insert into produits_commande  values (null,9,?,10,1)";
        
        Connection connection = dbConnection.getConnection();
        try {
            pst = connection.prepareStatement(sql);
            pst2 = connection.prepareStatement(sqlproduits_commande);
            pst2.setInt(1,Integer.valueOf(request.getParameter("id")));
            pst.setInt(1, 13);
            pst.setString(2, Onecommande.getAddress());
            pst.setString(3, Onecommande.getVille());
            pst.setString(4, Onecommande.getRecipiendaire());
            pst.setString(5,Onecommande.getData_commande());
            pst.setString(6,Onecommande.getDate_arrive());
            pst.setInt(7,Onecommande.getTotal());
            
            System.out.println(Onecommande.getData_commande().toString());
            System.out.println(session.getAttribute("userId"));
            System.out.println(pst);
            System.out.println(pst2);
            pst.executeUpdate();
              pst2.executeUpdate();
            
              response.sendRedirect("/Ecom/successfully.jsp");


        } catch (SQLException exp) {
            System.out.println(exp.getMessage());
            request.getRequestDispatcher("/Ecom/successfully.jsp");
        }
	}

}
