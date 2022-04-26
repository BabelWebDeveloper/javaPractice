package com.javaBWD;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {

//        Connect to database:
        Connection connection = null;
        String dbUrl = "jdbc:mariadb://localhost:3306/tutorial";
        String user = "root";
        String password = "nieznamDix37";

//        Statement:
        Statement statement = null;

        try {
//        Connect to database:
            connection = Database.getConnection(dbUrl,user,password);
            System.out.println("Connection successful!");
//        Statement:
            statement = connection.createStatement();
            // Type 1 - DDL (data definition language) - String sql:
            String sql = "CREATE TABLE IF NOT EXISTS users (id int NOT NULL AUTO_INCREMENT, user_id VARCHAR(30) NOT NULL, PRIMARY KEY (id), UNIQUE KEY (user_id))";
            statement.execute(sql);

        } catch (SQLException exception){
            exception.printStackTrace();
        } finally {
            Database.closeStatement(statement);
//            connection.close();
            Database.closeConnection(connection);
        }
    }
}
