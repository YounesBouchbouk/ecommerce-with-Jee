package Ecom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {
    String db = "magasin_bd";
    String user = "root";
    String pwd = "pwd";
    String url = "jdbc:mysql://localhost:3306/" + db;
    private static Connection connection = null;

    private dbConnection() {
        try {
            connection = DriverManager.getConnection(url, user, pwd);
            System.out.println("instance cree!!");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static Connection getConnection() {
        if (connection == null)
            new dbConnection();
        return connection;
    }
}
