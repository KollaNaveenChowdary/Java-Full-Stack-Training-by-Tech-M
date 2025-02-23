 
package task8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCInsert {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter ID:");
            int id = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            System.out.println("Enter Name:");
            String name = scanner.nextLine();

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password");
            String sql = "INSERT INTO employees (id, name) VALUES (?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.setString(2, name);
            stmt.executeUpdate();

            System.out.println("Data Inserted Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
