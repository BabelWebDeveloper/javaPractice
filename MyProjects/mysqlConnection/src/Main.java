import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Databse {
    public static Connection getConnection(String dburl, String user, String password) throws SQLException {
        Connection connection = DriverManager.getConnection(dburl, user, password);
        connection.setAutoCommit(true);
        return connection;
    }
    public static void main(String[] args) {
        Connection connection = null;

        String dbUrl = "jdbc://localhost:3306/shop";
        String user = "root";
        String password = "password";

        try{
            connection = Databse
        }
    }
}
