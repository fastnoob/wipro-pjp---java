package com.handson1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Handson1 {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager");
            System.out.println("Connection established successfully");
        }
        catch (Exception e) {
            System.out.println("Connection could not be established");
        }
        finally {
            if (conn != null) {
                conn.close();
            }
        }
    }
}