package Ecom.Controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Ecom.Categorie;
import Ecom.dbConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Servlet implementation class AdminLogin
 */
@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLogin() {
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
		int adminId=Integer.parseInt(request.getParameter("adminId"));
		String pass=request.getParameter("password");
		java.sql.Connection conn = dbConnection.getConnection();
		PreparedStatement pst = null;
        String sql = "SELECT * FROM administrateur";
        try {
			pst=conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			boolean exist=false;
		    while ( rs.next() ){
		    	if(adminId==rs.getInt("adminId") && pass==rs.getString("adminMotPass")){
		    		exist=true;
		    	}
		    }
		    if(exist==true) {
		    	HttpSession session = request.getSession();
		    	session.setAttribute("adminId", adminId);
				session.setMaxInactiveInterval(60*30*30*1000);
	        }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		
	}

}
