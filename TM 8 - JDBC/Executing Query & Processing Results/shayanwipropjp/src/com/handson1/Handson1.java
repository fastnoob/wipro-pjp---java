package com.handson1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Handson1 {

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        Statement statement = null;
        ResultSet rs;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager");
        } catch (Exception e) {
            System.out.println("Connection could  not be established");
            if (connection != null) connection.close();
        }

        String sql = "SELECT EMPLOYEE_ID, FIRST_NAME FROM HR.EMPLOYEES";
        statement = connection.createStatement();
        rs = statement.executeQuery(sql);
        while (rs.next()) {
            System.out.println("empno: " + rs.getInt(1) + ", ename: " + rs.getString("FIRST_NAME"));
        }

        if (statement != null) statement.close();
        if (connection != null) connection.close();
    }

}