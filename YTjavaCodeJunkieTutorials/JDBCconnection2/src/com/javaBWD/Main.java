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

        try{
//        Connect to database:
            connection = Database.getConnection(dbUrl,user,password);
            System.out.println("Connection successful!");
//            Statement:
            statement = connection.createStatement();
            // Type 2 - DML (data manipulation language)
            String sql = "INSERT INTO users (user_id) VALUES ('santa69')";
            statement.executeUpdate(sql);

        } catch (SQLException exception){
            exception.printStackTrace();
        } finally {
            Database.closeStatement(statement);
            Database.closeConnection(connection);
        }
    }
}
