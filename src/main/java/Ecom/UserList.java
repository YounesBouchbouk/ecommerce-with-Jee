package Ecom;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserList {
	private int uid;
	private String prenom;
	private String nom;
	private String email;
	private String username;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public static ArrayList<UserList> getUsersList() {
		ArrayList<UserList> usersList = new ArrayList<UserList>();
		java.sql.Connection conn = dbConnection.getConnection();
		PreparedStatement pst = null;
        String sql = "SELECT * FROM utilisateur";
        try {
			pst=conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
		    while ( rs.next() )
		    {
		      UserList userList = new UserList();
		      userList.setUid(rs.getInt("uid"));
		      userList.setPrenom(rs.getString("prenon"));
		      userList.setNom(rs.getString("nom"));
		      userList.setEmail(rs.getString("email"));
		      userList.setUsername(rs.getString("username"));
		      usersList.add(userList);
		    }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        return usersList;
	}
	
}
