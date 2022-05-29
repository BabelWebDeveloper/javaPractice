import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        Connection connection = null;

        String dbUrl = "jdbc://localhost:3306/test";
        String user = "root";
        String password = "nieznamDix37";

        try{
            connection = Database.getConnection(dbUrl,user,password);
            System.out.println("Database connection successfully.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            connection.close();
        }
    }
}
