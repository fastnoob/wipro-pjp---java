package com.handson4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

class Handson4 {

    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement statement = null;
        String sql = "";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
        } catch (Exception e) {
            e.printStackTrace();
        }

        int rollno = Integer.parseInt(args[0]);
        double fees = Double.parseDouble(args[1]);

        try {
            // update student data from stdnt table
            sql = "UPDATE STUDENT SET FEE = ? WHERE ROLL_NO = ?";
            statement = connection.prepareStatement(sql);
            statement.setDouble(1, fees);
            statement.setInt(2, rollno);
            if (statement.executeUpdate() == 1)
                System.out.println("FEE OF STUDENT WITH ROLL_NO = " + rollno + " HAS BEEN UPDATED");
            else
                System.out.println("ERROR");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}