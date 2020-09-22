package com.handson5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class Handson5 {
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

        int rollno = 0;
        try {
            rollno = Integer.parseInt(args[0]);
        } catch (Exception e) {}

        try {
            if (rollno != 0) {
                sql = "SELECT ROLL_NO,STUDENT_NAME,GRADE,DOB,FEE FROM STUDENT WHERE ROLL_NO = ?";
            }else {
                sql = "SELECT ROLL_NO,STUDENT_NAME,GRADE,DOB,FEE FROM STUDENT";
            }
            statement = connection.prepareStatement(sql);
            if (rollno != 0){
                statement.setInt(1, rollno);
            }
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
               System.out.println(rs.getInt("ROLL_NO")+" "+rs.getString("STUDENT_NAME")+" "+ rs.getString("GRADE") +" "+rs.getString("DOB")+" "+ rs.getDouble("FEE"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}