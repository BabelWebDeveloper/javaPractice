package com.javaBWD.springBootIntro;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConnection {
    @Value("localhost")
    private String host;

    @Value("password")
    private String password;

    @Value("Przemek")
    private String username;

    void addUserToDB(String name) {
        System.out.println("User added to DB.");
    }
}
