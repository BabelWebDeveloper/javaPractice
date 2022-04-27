package com.javaBWD;

import java.sql.*;
import java.text.ParseException;

public class Main {

    private static String dbUrl = "jdbc:mariadb://localhost:3306/myproject";
    private static String user = "root";
    private static String password = "nieznamDix37";
    private static Connection connection = null;
    private static PreparedStatement preparedStatement = null;
    private static CallableStatement callableStatement = null;
    private static ResultSet resultSet = null;

    public static void main(String[] args) throws ParseException {
//        listOfEmployees();
//        employeeInfo(4);
//        newEmployee("Przemek","Babel","1984-12-05",2);
//        fireEmployee(12);
//        fireEmployee(13);
//        fireEmployee(11);
        newEmployee("Przemek","Babel","1984-12-05",2);
        listOfEmployees();
    }

    private static void newEmployee(String firstName, String lastName, String date, int ideptId){
        try {
            connection = Database.getConnection(dbUrl,user,password);
            System.out.println("Connection successful!");

//            1. Create SQL for CallableStatement
            String sql = "{call AddNewEmployee(?,?,?,?)}";

//            2. Create a CallableStatement
            callableStatement = connection.prepareCall(sql);
            callableStatement.setString("firstName",firstName);
            callableStatement.setString("lastName",lastName);
            callableStatement.setString("birthDate",date);
            callableStatement.setInt("ideptId",ideptId);

//            3. Execute the CallableStatement
            resultSet = callableStatement.executeQuery();

//            4. Process the ResultSet
//            while (resultSet.next()){
//                System.out.println(resultSet.getInt("id") + " "
//                        + resultSet.getString("first_name") + " " + resultSet.getString("last_name"));
//            }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Database.closeResultSet(resultSet);
            Database.closeCallableStatement(callableStatement);
            Database.closeConnection(connection);
        }
    }

    private static void listOfEmployees(){
        try {
            connection = Database.getConnection(dbUrl,user,password);
            System.out.println("Connection successful!");

//            1. Create SQL for CallableStatement
            String sql = "{call GetListOfEmployees()}";

//            2. Create a CallableStatement
            callableStatement = connection.prepareCall(sql);

//            3. Execute the CallableStatement
            resultSet = callableStatement.executeQuery();

//            4. Process the ResultSet
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id") + " "
                        + resultSet.getString("first_name") + " " + resultSet.getString("last_name"));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Database.closeResultSet(resultSet);
            Database.closeCallableStatement(callableStatement);
            Database.closeConnection(connection);
        }
    }

    private static void employeeInfo(int iemId){
        try {
            connection = Database.getConnection(dbUrl, user, password);
            System.out.println("Database connecion successful");

            // 1. Create SQL for PreparedStatement using Parameters
            String sql = "SELECT id, first_name, last_name, birth_date, dept_id FROM employees where id = ?;";

            // 2. Create a Prepared Statement
            preparedStatement = connection.prepareStatement(sql);

            // 3. Insert Parameter value(s) into PreparedStatement
            preparedStatement.setInt(1, iemId);

            // 4. Execute the PreparedStatement
            resultSet = preparedStatement.executeQuery();

            // 5. Process the ResultSet (if applicable)
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " "
                        + resultSet.getString("first_name") + " " + resultSet.getString("last_name") + " " + resultSet.getString("birth_date"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Database.closeResultSet(resultSet);
            Database.closePreparedStatement(preparedStatement);
            Database.closeConnection(connection);
        }
    }

    private static void fireEmployee(int iemId){
        try {
            connection = Database.getConnection(dbUrl, user, password);
            System.out.println("Database connecion successful");

            // 1. Create SQL for PreparedStatement using Parameters
            String sql = "DELETE FROM employees WHERE id = ?;";

            // 2. Create a Prepared Statement
            preparedStatement = connection.prepareStatement(sql);

            // 3. Insert Parameter value(s) into PreparedStatement
            preparedStatement.setInt(1, iemId);

            // 4. Execute the PreparedStatement
            resultSet = preparedStatement.executeQuery();

            // 5. Process the ResultSet (if applicable)
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " "
                        + resultSet.getString("first_name") + " " + resultSet.getString("last_name") + " " + resultSet.getString("birth_date"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Database.closeResultSet(resultSet);
            Database.closePreparedStatement(preparedStatement);
            Database.closeConnection(connection);
        }
    }
}
