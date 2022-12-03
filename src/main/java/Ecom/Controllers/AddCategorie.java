package Ecom.Controllers;

import java.io.IOException;
import Ecom.dbConnection;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.mysql.cj.xdevapi.Statement;
import com.mysql.jdbc.Connection;

/**
 * Servlet implementation class AddCategorie
 */
@WebServlet("/AddCategorie")
public class AddCategorie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCategorie() {
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
		String catagorie_name=request.getParameter("categorie_name");
		int categorie_id=Integer.parseInt(request.getParameter("categorie_id"));
		java.sql.Connection conn = dbConnection.getConnection();
		PreparedStatement pst = null;
        String sql = "INSERT INTO categories(categorie,nom)VALUES (?,?)";
        
        	try {
				pst =conn.prepareStatement(sql);
				pst.setInt(1, categorie_id);
				pst.setString(2,catagorie_name);
				pst.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
        response.sendRedirect("/Ecom/dashboard/category.jsp");  
	}

}
