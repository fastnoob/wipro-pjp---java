package com.handson2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Handson2 {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        int rollno=0;
        boolean lower;
        double fees = 0.0;
        String standard = "";
        String studentName = "";
        Connection conn = null;
        PreparedStatement statement = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
        } catch (Exception e) {
            e.printStackTrace();
        }
        do {
            System.out.print("ENTER ROLL NO : ");
            String rollstr = sc.nextLine();
            try {
                rollno = Integer.parseInt(rollstr);
                if (String.valueOf(rollno).length() != 4) rollno = 0;
            } catch (Exception e) {}
        } while (rollno == 0);

        do {
            System.out.print("ENTER NAME : ");
            studentName = sc.nextLine();
            lower = false;
            for (int i = 0; i < studentName.length(); i++) {
                if (Character.isLowerCase(studentName.charAt(i))) {
                    lower = true;
                    break;
                }
            }
        } while (studentName.length()>20);

        String[] standards = {"I", "II", "III", "IV", "V", "Vi", "VII", "VIII", "IX", "X"};
        List<String> list = new ArrayList<>(Arrays.asList(standards));
        do {
            System.out.print("ENTER STANDARD : ");
            standard = sc.nextLine();
        } while (!list.contains(standard));

        System.out.print("ENTER DATE OF BIRTH : ");
        String dob = sc.nextLine();

        do {
            System.out.print("Enter fees: ");
            if (sc.hasNextDouble()) {
                fees = sc.nextDouble();
            }
        } while (fees == 0.0);


        String sql = "INSERT INTO STUDENT VALUES(?, ?, ?, ?, ?)";
        try {
            statement = conn.prepareStatement(sql);
            statement.setInt(1, rollno);
            statement.setString(2, studentName);
            statement.setString(3, standard);
            statement.setString(4, dob);
            statement.setDouble(5, fees);
            statement.executeQuery();

            System.out.println("ADDED SUCCESSFULLY");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("ERROR");
            statement.close();
            conn.close();
        }
        sc.close();
    }
}