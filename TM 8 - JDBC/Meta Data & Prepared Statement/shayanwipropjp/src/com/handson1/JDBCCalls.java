package com.handson1;
import java.sql.*;

class DAOClass {

    private Connection conn = null;
    PreparedStatement statement = null;

    DAOClass() {
        Connection conn = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public boolean insert(int rollno, String name, String grade, String dob, int fee) {
        String sql = "INSERT INTO STUDENT VALUES(?, ?, ?, ?, ?)";
        try {
            statement = conn.prepareStatement(sql);
            statement.setInt(1, rollno);
            statement.setString(2, name);
            statement.setString(3, grade);
            statement.setString(4, dob);
            statement.setInt(5, fee);
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean delete(int rollno) {
        String sql = "DELETE FROM STUDENT WHERE ROLL_NO = ?";

        try {
            statement = conn.prepareStatement(sql);
            statement.setInt(1, rollno);
            statement.executeUpdate();

            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean modify(int rollno, int fee) {
        String sql = "UPDATE STUDENT SET FEE = ? WHERE ROLL_NO = ?";

        try {
            statement = conn.prepareStatement(sql);
            statement.setInt(1, fee);
            statement.setInt(2, rollno);
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    public boolean display(int rollno) {
        String sql = "SELECT ROLL_NO,STUDENT_NAME,GRADE,DOB,FEE FROM STUDENT WHERE ROLL_NO = ?";

        try {
            statement = conn.prepareStatement(sql);
            statement.setInt(1, rollno);
            ResultSet rs = statement.executeQuery();
            Statement s=null;
            s = conn.createStatement();
            while (rs.next()) {
                System.out.println(rs.getInt("ROLL_NO")+" "+rs.getString("STUDENT_NAME")+" "+rs.getString("GRADE")+" "+rs.getString("DOB")+" "+rs.getDouble("FEE"));
            }
            if (s != null) s.close();
            if (conn != null) conn.close();

            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean display() {
        String sql = "SELECT ROLL_NO,STUDENT_NAME,GRADE,DOB,FEE FROM STUDENT";

        try {
            statement = conn.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();

            while (rs.next()) {
                StringBuilder sb = new StringBuilder();
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    String colName = rsmd.getColumnName(i);
                    sb.append(rs.getObject(colName));
                    if (i != rsmd.getColumnCount()) sb.append(", ");
                }
                System.out.println(sb);
            }

            return true;
        } catch (SQLException e) {
            return false;
        }
    }
}
class JDBCCalls {
    public static void main(String[] args) {
        int option = Integer.parseInt(args[0]);
        DAOClass dao = new DAOClass();

        switch (option) {
            case 1:
                int rollno = Integer.parseInt(args[1]);
                String name = args[2];
                String grade = args[3];
                String dob = args[4];
                int fee = Integer.parseInt(args[5]);

                if (dao.insert(rollno, name, grade, dob, fee))
                    System.out.println("Inserted successfully");
                else
                    System.out.println("Insertion error");
                break;

            case 2:
                rollno = Integer.parseInt(args[1]);

                if (dao.delete(rollno))
                    System.out.println("Deleted successfully");
                else
                    System.out.println("Deletion error");
                break;

            case 3:
                rollno = Integer.parseInt(args[1]);
                fee = Integer.parseInt(args[2]);

                if (dao.modify(rollno, fee))
                    System.out.println("Modified successfully");
                else
                    System.out.println("Modification error");
                break;

            case 4:
                try {
                    rollno = Integer.parseInt(args[1]);
                    dao.display(rollno);
                    break;
                } catch (Exception e) {
                    dao.display();
                    break;
                }
        }

    }

}