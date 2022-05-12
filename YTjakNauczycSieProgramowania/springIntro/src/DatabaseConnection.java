// klasa do wykonywania opercji na bazie danych
public class DatabaseConnection {
    private String host;
    private String username;
    private String password;

    public DatabaseConnection(String host, String username, String password) {
        this.host = host;
        this.username = username;
        this.password = password;
    }

    public void addUserToDatabase(String name) {
        System.out.println("User added to db.");
    }
}
