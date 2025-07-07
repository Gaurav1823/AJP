package multithreading;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MySQLConnectionTest {
	public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/myjavadb";
        String user = "root"; // your MySQL username
        String password = "@Calculator"; // your MySQL password

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection: " + connection); // Print reference to confirm success
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
	}
}
