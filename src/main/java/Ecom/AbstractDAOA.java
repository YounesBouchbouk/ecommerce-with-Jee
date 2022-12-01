package Ecom;

import java.sql.Connection;

public class AbstractDAOA {
    protected Connection connection = dbConnection.getConnection();
}