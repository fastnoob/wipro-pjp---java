package com.handson3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

class Handson3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Connection connection = null;
        PreparedStatement statement1 = null,statement2=null;
        String sql1 = "",sql2="";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
        } catch (Exception e) {
            e.printStackTrace();
        }
        int rollno = Integer.parseInt(args[0]);

        try {
            sql1 = "INSERT INTO STUDENT_LOG SELECT * FROM STUDENT WHERE ROLL_NO = ?";
            statement1 = connection.prepareStatement(sql1);
            statement1.setInt(1, rollno);
            int logged = statement1.executeUpdate();

            sql2 = "DELETE FROM STUDENT WHERE ROLL_NO = ?";
            statement2 = connection.prepareStatement(sql2);
            statement2.setInt(1, rollno);

            if (statement2.executeUpdate() == 1 && logged == 1)
                System.out.println("DELETED SUCCESSFULLY");
            else
                System.out.println("ERROR");
        } catch (Exception e) {
            e.printStackTrace();
        }
        sc.close();
    }

}