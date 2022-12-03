package Ecom;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Product {
	private int pid;
	private String nom;
	private String prix;
	private String categorieName;
	private String descript;
	private int etoiles;
	private int stock;
	
	public static ArrayList<Product> getAllProducts() {
		ArrayList<Product> products = new ArrayList<Product>();
		java.sql.Connection conn = dbConnection.getConnection();
		PreparedStatement pst = null;
        String sql = "Select p.pid,p.nom,p.prix,c.nom,p.descript,p.etoiles,p.stock from produit p inner join categories c using (categorie) ";
        try {
			pst=conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
		    while ( rs.next() )
		    {
		      Product product = new Product();
		      product.setPid(rs.getInt("p.pid"));
		      product.setNom(rs.getString("p.nom"));
		      product.setPrix(rs.getString("p.prix"));
		      product.setCategorieName(rs.getString("c.nom"));
		      product.setDescript(rs.getString("p.descript"));
		      product.setEtoiles(rs.getInt("p.etoiles"));
		      product.setStock(rs.getInt("p.stock"));
		      products.add(product);
		    }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return products;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrix() {
		return prix;
	}

	public void setPrix(String prix) {
		this.prix = prix;
	}

	public String getCategorieName() {
		return categorieName;
	}

	public void setCategorieName(String categorieName) {
		this.categorieName = categorieName;
	}

	public String getDescript() {
		return descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	public int getEtoiles() {
		return etoiles;
	}

	public void setEtoiles(int etoiles) {
		this.etoiles = etoiles;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
}
