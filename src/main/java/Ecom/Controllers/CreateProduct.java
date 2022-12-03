package Ecom.Controllers;

import java.io.IOException;
import Ecom.dbConnection;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.mysql.cj.xdevapi.Statement;
import com.mysql.jdbc.Connection;

/**
 * Servlet implementation class CreateProduct
 */
@WebServlet("/CreateProduct")
@MultipartConfig(
  fileSizeThreshold = 1024 * 1024 * 1, // 1 MB
  maxFileSize = 1024 * 1024 * 10,      // 10 MB
  maxRequestSize = 1024 * 1024 * 100   // 100 MB
)
public class CreateProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String nom=request.getParameter("product_name");
		String prix=request.getParameter("price");
		String descript=request.getParameter("descript");
		int stock=Integer.parseInt(request.getParameter("stock"));
		int categorie=Integer.parseInt(request.getParameter("categorie"));
		int nbEtoile=Integer.parseInt(request.getParameter("nbEtoile"));

		java.sql.Connection conn = dbConnection.getConnection();
		PreparedStatement pst = null;
        String sql = "INSERT INTO produit(pid,nom,prix,categorie,descript,etoiles,image_url,stock)VALUES (null,?,?,?,?,?,?,?)";
        int result=0;
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, nom);
            pst.setString(2, prix);
            pst.setInt(3, categorie);
            pst.setString(4, descript);
            pst.setInt(5,nbEtoile );
            
            /* Receive file uploaded to the Servlet from the HTML5 form */
            Part filePart = request.getPart("file");
            String fileName = filePart.getSubmittedFileName();
            for (Part part : request.getParts()) {
              part.write("C:\\Users\\Lenovo\\Desktop\\jee\\ecommerce-with-Jee\\src\\main\\images\\"+fileName);
            }
            
            pst.setString(6,"C:\\Users\\Lenovo\\Desktop\\jee\\ecommerce-with-Jee\\src\\main\\images\\"+fileName);
            pst.setInt(7, stock);

            result =  pst.executeUpdate();
        }
        catch (SQLException exp) {
            System.out.println(exp.getMessage());
            request.setAttribute("succ", null);
			request.setAttribute("error", exp.getMessage());
        }
		
		
//		PrintWriter out = response.getWriter(); 
//		out.println(result + " lignes");
        response.sendRedirect("/Ecom/dashboard/product.jsp"); 
		
		
	}

}
