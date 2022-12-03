package Ecom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {
    String db = "comm";
    String user = "root";
    String pwd = "";
    String url = "jdbc:mysql://localhost:3306/comm?useSSL=false";
    private static Connection connection = null;
 


    private dbConnection() {
        try {
        	
                 try {
                	 Class.forName("com.mysql.jdbc.Driver");

				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
             
           
            connection = DriverManager.getConnection(url, user, pwd);
            System.out.println("instance cree!!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }

    public static Connection getConnection() {
        if (connection == null)
            new dbConnection();
        return connection;
    }
}
