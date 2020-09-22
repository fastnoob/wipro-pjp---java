package com.handson2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Handson2 {
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
        String sql = "SELECT FIRST_NAME,JOB_ID,SALARY,COMMISSION_PCT FROM HR.EMPLOYEES WHERE COMMISSION_PCT IS NOT NULL";
        statement = connection.createStatement();
        rs = statement.executeQuery(sql);
        while (rs.next()) {
            System.out.println( "ename - " + rs.getString("FIRST_NAME") + ", job - " + rs.getString("JOB_ID") + ", sal - " + rs.getString("SALARY")+", comm - " + rs.getString("COMMISSION_PCT"));
        }
        if (statement != null){
            statement.close();
        }
        if (connection != null){
            connection.close();
        }
    }

}