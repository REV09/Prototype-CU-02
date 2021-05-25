package Prototype.DataAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConecctionDB {
    private static String url = "jdbc:mariadb://localhost:3306/CentroComputo";
    private static String driverName = "org.mariadb.jdbc.Driver";
    private static String username = "root";
    private static String password = "PASSWORD";
    private static Connection connection;

    public Connection getConnection() throws SQLException {
        connection = DriverManager.getConnection(url, username, password);
        return connection;
    }

    public void closeConnection() throws SQLException {
        if (connection != null) {
            if(!connection.isClosed()) {
                connection.close();
            }
        }
    }
}
