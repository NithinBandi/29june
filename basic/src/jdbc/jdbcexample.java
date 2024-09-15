package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcexample {
    static Connection con = null;

    jdbcexample() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver"); // Correct driver class name
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "Luffy");
            System.out.println("Connection created: " + con);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void CreateTable() throws SQLException {
        Statement st = con.createStatement();
        String query = "CREATE TABLE emp1(empid NUMBER, ename VARCHAR2(25), sal NUMBER)";
        st.execute(query);
        System.out.println("Table created successfully.");
    }

    public void insert_Data() throws SQLException {
        Statement st = con.createStatement();
        String query = "INSERT INTO emp1(empid, ename, sal) VALUES (1, 'A', 3000)"; // Ensure column names match the table definition
        int i = st.executeUpdate(query);
        System.out.println(i + " record(s) inserted");
    }

    public static void main(String[] args) {
        jdbcexample obj = new jdbcexample();
        try {
            obj.CreateTable();
            obj.insert_Data();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null && !con.isClosed()) {
                    con.close();
                    System.out.println("Connection closed.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
