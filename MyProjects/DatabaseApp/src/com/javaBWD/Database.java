package com.javaBWD;

import java.sql.*;

public class Database {

    public static Connection getConnection(String dbUrl, String user, String password) throws SQLException{
        Connection connection = DriverManager.getConnection(dbUrl, user, password);
        connection.setAutoCommit(true);
        return connection;
    }

    public static void closeConnection(Connection connection) {

        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException exception) {
             exception.printStackTrace();
        }

    }

    public static void closePreparedStatement(PreparedStatement preparedstatement) {

        try {
            if (preparedstatement != null) {
                preparedstatement.close();
            }
        } catch (SQLException exception) {
             exception.printStackTrace();
        }

    }

    public static void closeCallableStatement(CallableStatement callableStatement) {

        try {
            if (callableStatement != null) {
                callableStatement.close();
            }
        } catch (SQLException exception) {
             exception.printStackTrace();
        }

    }

    public static void closeResultSet(ResultSet resultSet) {

        try {
            if (resultSet != null) {
                resultSet.close();
            }
        } catch (SQLException exception) {
             exception.printStackTrace();
        }
    }
}
