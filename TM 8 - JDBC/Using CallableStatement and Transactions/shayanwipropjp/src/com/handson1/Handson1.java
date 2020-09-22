package com.handson1;

import java.sql.*;

class Handson1 {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        int empid=Integer.parseInt(args[0]);
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
        } catch (Exception e) {
            e.printStackTrace();
        }
       try {
           String sql = "select\n" +
                   "    employee_id,\n" +
                   "    first_name,\n" +
                   "    salary,\n" +
                   "    commission,\n" +
                   "    (salary)-(salary)*0.1 AS net_salary\n" +
                   "     from HR.employees\n" +
                   "     where commission is null and employee_id = ? \n" +
                   "     union\n" +
                   "     select\n" +
                   "    employee_id,\n" +
                   "    first_name,\n" +
                   "    salary,\n" +
                   "    commission,\n" +
                   "      (salary+commission)-(salary+commission)*0.15 AS net_salary\n" +
                   "    from HR.employees\n" +
                   "    where commission is not null and commission<500 and employee_id = ? \n" +
                   "    union\n" +
                   "    select\n" +
                   "    employee_id,\n" +
                   "    first_name,\n" +
                   "    salary,\n" +
                   "    commission,\n" +
                   "    (salary+commission)-(salary+commission)*0.2 AS net_salary\n" +
                   "    from HR.employees\n" +
                   "    where commission is not null and commission>=500 and employee_id = ?";

            statement.setInt(1, empid);
            statement.setInt(2, empid);
            statement.setInt(3, empid);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
               System.out.println("empno. : "+rs.getInt("employee_id")+", empName : "+rs.getString("FIRST_NAME")+", net_Salary : "+ rs.getString("net_salary"));
            }
        }
            catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error");
            statement.close();
            connection.close();
        }
    }

}