package com.javaBWD;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        String dbUrl = "jdbc:mariadb://localhost:3306/tutorial";
        String user = "root";
        String password = "nieznamDix37";

        try {
            connection = DriverManager.getConnection(dbUrl,user,password);
            System.out.println("Connection successful!");

            statement = connection.createStatement();
            String sql = "SELECT id, employee_id, first_name, last_name, birth_date FROM employees";

            resultSet = statement.executeQuery(sql);
            while (resultSet.next()){

//                1st way:
//                int id = resultSet.getInt("id");
//                int employeeId = resultSet.getInt("employee_id");
//                String first_name = resultSet.getString("first_name");
//                String last_name = resultSet.getString("last_name");
//                Date birth_date = resultSet.getDate("birth_date");

//                2nd way:
                int id = resultSet.getInt(1);
                int employeeId = resultSet.getInt(2);
                String first_name = resultSet.getString(3);
                String last_name = resultSet.getString(4);
                Date birth_date = resultSet.getDate(5);

                System.out.println(id + " " + employeeId + " " + first_name + " " + last_name + " " + birth_date);

            }
        } catch (SQLException e){
            System.out.println(e.getStackTrace());
        } finally {
            Database.closeResultSet(resultSet);
            Database.closeStatement(statement);
            Database.closeConnection(connection);
        }
    }
}
