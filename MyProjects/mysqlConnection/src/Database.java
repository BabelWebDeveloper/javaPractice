import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    public static Connection getConnection(String dburl, String user, String password) throws SQLException {
        Connection connection = DriverManager.getConnection(dburl, user, password);
        connection.setAutoCommit(true);
        return connection;
    }
}
