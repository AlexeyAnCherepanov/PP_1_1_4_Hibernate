package jm.task.core.jdbc.util;
import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

public class Util {
    private static final String url = "jdbc:mysql://localhost:3306/new_schema" ;
    private static final String user = "root" ;
    private static final String password = "root" ;
    public static Connection getConnection() {
        Connection connection;
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }


}
