package com.javaBWD;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        Connection connection = null;
        CallableStatement callableStatement = null;
        ResultSet resultSet = null;

        String dbUrl = "jdbc:mariadb://localhost:3306/tutorial";
        String user = "root";
        String password = "nieznamDix37";

//        getAllEmployees(dbUrl,user,password,connection,callableStatement,resultSet);
        getEmployee(dbUrl,user,password,connection,callableStatement,resultSet,4);
    }

//    private static void listOfEmployees(){
//        getAllEmployees(dbUrl,user,password,connection,callableStatement,resultSet);
//    }

    private static void getAllEmployees(String dbUrl, String user, String password, Connection connection, CallableStatement callableStatement, ResultSet resultSet){
        try {
            connection = Database.getConnection(dbUrl,user,password);
            System.out.println("Connection successful!");

//            1. Create SQL for CallableStatement
            String sql = "{call GetAllEmployees()}";

//            2. Create a CallableStatement
            callableStatement = connection.prepareCall(sql);

//            3. Execute the CallableStatement
            resultSet = callableStatement.executeQuery();

//            4. Process the ResultSet
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id") + " " + resultSet.getInt("employee_id") + " "
                        + resultSet.getString("first_name") + " " + resultSet.getString("last_name"));
            }


        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            Database.closeResultSet(resultSet);
            Database.closeCallableStatement(callableStatement);
            Database.closeConnection(connection);
        }
    }

    private static void getEmployee(String dbUrl, String user, String password, Connection connection, CallableStatement callableStatement, ResultSet resultSet, int iempid){
        try {
            connection = Database.getConnection(dbUrl,user,password);
            System.out.println("Connection successful!");

//            1. Create SQL for CallableStatement
            String sql = "{call GetEmployee(?)}";

//            2. Create a CallableStatement
            callableStatement = connection.prepareCall(sql);

//            3. Insert parameter value
            callableStatement.setInt("iempid",iempid);

//            4. Execute the CallableStatement
            resultSet = callableStatement.executeQuery();

//            5. Process the ResultSet
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id") + " " + resultSet.getInt("employee_id") + " "
                        + resultSet.getString("first_name") + " " + resultSet.getString("last_name"));
            }


        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            Database.closeResultSet(resultSet);
            Database.closeCallableStatement(callableStatement);
            Database.closeConnection(connection);
        }
    }
}
