// klasa do wykonywania operacji na użytkowniku (rejestracja, walidacja użytkownika)
public class UserService {
    private DatabaseConnection databaseConnection;

    public UserService(DatabaseConnection databaseConnection) {//zależność wstrzyknięta w konstruktorze
        this.databaseConnection = databaseConnection;
    }

    public void registerUser(String name) {
//        DatabaseConnection databaseConnection = new DatabaseConnection("localhost","Przemek","password"); //
//        validate(name);
        databaseConnection.addUserToDatabase(name);
    }
}
