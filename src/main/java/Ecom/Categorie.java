package Ecom;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Categorie {
	private int no;
	private String name;
	
	public void setNo(int no) {
		this.no=no;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getNo() {
		return this.no;
	}
	
	public String getName() {
		return this.name;
	}
	
	public static ArrayList<Categorie> getAllCategories() {
		ArrayList<Categorie> categories = new ArrayList<Categorie>();
		java.sql.Connection conn = dbConnection.getConnection();
		PreparedStatement pst = null;
        String sql = "SELECT * FROM categories";
        try {
			pst=conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
		    while ( rs.next() )
		    {
		      Categorie categorie = new Categorie();
		      categorie.setNo  ( rs.getInt("categorie") );
		      categorie.setName( rs.getString("nom") );
		      categories.add(categorie);
		    }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        return categories;
	}
}
