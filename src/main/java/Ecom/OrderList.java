package Ecom;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OrderList {
	private String cid;
	private String userName;
	private String productName;
	private String dateCommande;
	private String dateLivraison;
	private String dateEnvoi;
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDateCommande() {
		return dateCommande;
	}
	public void setDateCommande(String dateCommande) {
		this.dateCommande = dateCommande;
	}
	public String getDateLivraison() {
		return dateLivraison;
	}
	public void setDateLivraison(String dateLivraison) {
		this.dateLivraison = dateLivraison;
	}
	public String getDateEnvoi() {
		return dateEnvoi;
	}
	public void setDateEnvoi(String dateEnvoi) {
		this.dateEnvoi = dateEnvoi;
	}
	
	public static ArrayList<OrderList> getAllOrders(){
		ArrayList<OrderList> orders=new ArrayList<OrderList>();
		java.sql.Connection conn = dbConnection.getConnection();
		PreparedStatement pst = null;
        String sql = "SELECT commande.cid,utilisateur.prenon,utilisateur.nom,produit.nom,commande.date_commande,commande.date_livraison,commande.date_envoi from utilisateur inner join commande using (uid) inner join produits_commande using (cid) inner join produit using (pid)";
        try {
			pst=conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
		    while ( rs.next() )
		    {
		      OrderList order = new OrderList();
		      order.setCid(rs.getString("commande.cid"));
		      order.setUserName(rs.getString("utilisateur.prenon")+rs.getString("utilisateur.nom"));
		      order.setProductName(rs.getString("produit.nom"));
		      order.setDateCommande(rs.getDate("commande.date_commande").toString());
		      order.setDateLivraison(rs.getDate("commande.date_livraison").toString());
		      order.setDateEnvoi(rs.getDate("commande.date_envoi").toString());
		      orders.add(order);
		    }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return orders;
	}
}
