package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection connection = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/"
                    + "dbmatryuska", "root", "root");
        } catch (ClassNotFoundException e) {
            throw new ClassNotFoundException();
        } catch (SQLException e) {
            throw new SQLException();
        }

        return connection;

    }
}