package com.javaBWD.springBootIntro2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    public DatabaseConnection databaseConnection;

    @Autowired//wstrzyknięcie beana z DatabaseConnection
    public UserService(DatabaseConnection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    public void registerUser(String name){
        databaseConnection.addUserToDatabase(name);
    }
}
