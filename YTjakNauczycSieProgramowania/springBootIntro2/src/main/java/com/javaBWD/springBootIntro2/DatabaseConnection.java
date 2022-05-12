package com.javaBWD.springBootIntro2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component//stworzenie beana
public class DatabaseConnection {
    @Value("localhost") //przekazanie wartości fieldsów dalej
    private String host;

    @Value("Przemo")
    private String username;

    @Value("password")
    private String password;

    public void addUserToDatabase(String name) {
        System.out.println("User added.");
    }
}
