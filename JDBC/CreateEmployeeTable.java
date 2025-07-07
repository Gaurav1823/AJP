package multithreading;

import java.sql.*;



public class CreateEmployeeTable {
    public static void main(String[] args) {
    	String url = "jdbc:mysql://localhost:3306/myjavadb";
        String user = "root";
        String password = "@Calculator";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

           
            String createTable = """
                CREATE TABLE IF NOT EXISTS Employee (
                    eid INT AUTO_INCREMENT PRIMARY KEY,
                    name VARCHAR(100) NOT NULL,
                    address VARCHAR(255) NOT NULL,
                    salary INT NOT NULL
                )
                """;
            stmt.executeUpdate(createTable);
            System.out.println("Employee table created .");

       
            ResultSet rs = stmt.executeQuery("SELECT * FROM Employee");

            System.out.println("Employee Records:");
            while (rs.next()) {
                System.out.printf("ID: %d | Name: %s | Address: %s | Salary: ₹%d%n",
                        rs.getInt("eid"),
                        rs.getString("name"),
                        rs.getString("address"),
                        rs.getInt("salary"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
