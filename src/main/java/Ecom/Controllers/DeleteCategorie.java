package Ecom.Controllers;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Ecom.dbConnection;

/**
 * Servlet implementation class DeleteCategorie
 */
@WebServlet("/DeleteCategorie")
public class DeleteCategorie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteCategorie() {
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
//		doGet(request, response);
		String delete=request.getParameter("deleteId");
		java.sql.Connection conn = dbConnection.getConnection();
		PreparedStatement pst = null;
		String sql="DELETE FROM produit WHERE categorie=?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, Integer.parseInt(delete));
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		pst = null;
        sql = "DELETE FROM categories WHERE categorie=?";
        try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, Integer.parseInt(delete));
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        response.sendRedirect("/Ecom/dashboard/category.jsp"); 
	}

}
