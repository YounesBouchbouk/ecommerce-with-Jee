package Ecom.pojo;

import java.util.Calendar;
import java.util.Date;

public class Commande {
		
	private String address;
	private String ville ;
	private String recipiendaire;
	private Date Data_commande;
	private Date Date_arrive;
	private int Total;
	Date curDate = new Date();
		
	
	// Add days to a date in Java
    public Date addDays(Date date, int days) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, days);
        return cal.getTime();
    }
    
   
	public Commande(String address, String ville, String recipiendaire , int total) {
		super();
		this.address = address;
		this.ville = ville;
		this.recipiendaire = recipiendaire;
		Data_commande = curDate;
		Date_arrive = this.addDays(curDate, 2);
		this.Total = total;
	}
	
	
	
	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public String getRecipiendaire() {
		return recipiendaire;
	}


	public void setRecipiendaire(String recipiendaire) {
		this.recipiendaire = recipiendaire;
	}


	public Date getData_commande() {
		return Data_commande;
	}


	public void setData_commande(Date data_commande) {
		Data_commande = data_commande;
	}


	public Date getDate_arrive() {
		return Date_arrive;
	}


	public void setDate_arrive(Date date_arrive) {
		Date_arrive = date_arrive;
	}


	public int getTotal() {
		return Total;
	}


	public void setTotal(int total) {
		Total = total;
	}


	public Date getCurDate() {
		return curDate;
	}


	public void setCurDate(Date curDate) {
		this.curDate = curDate;
	}


	@Override
	public String toString() {
		return "Commande [address=" + address + ", ville=" + ville + ", recipiendaire=" + recipiendaire
				+ ", Data_commande=" + Data_commande + ", Date_arrive=" + Date_arrive + "]";
	}
	
	
	
	
}
