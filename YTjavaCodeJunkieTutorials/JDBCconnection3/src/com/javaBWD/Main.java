package com.javaBWD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
//        Connect to database:
        Connection connection = null;
        String dbUrl = "jdbc:mariadb://localhost:3306/tutorial";
        String user = "root";
        String password = "nieznamDix37";

//        Statement:
        Statement statement = null;

//        ResultSet:
        ResultSet resultSet = null;

        try {
//        Connect to database:
            connection = Database.getConnection(dbUrl,user,password);
            System.out.println("Connection success!");
//            Statement:
            statement = connection.createStatement();
            String sql = "SELECT * FROM users";
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                System.out.println(resultSet.getString("user_id"));
            }

        } catch (SQLException exception){
            exception.printStackTrace();
        } finally {
            Database.closeResultSet(resultSet);
            Database.closeStatement(statement);
            Database.closeConnection(connection);
        }

    }
}
