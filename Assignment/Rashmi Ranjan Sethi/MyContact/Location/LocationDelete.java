package MyContact.Location;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class LocationDelete {
    Statement stmt;
    String name;

    public LocationDelete(Connection conn, Scanner scan) {
        for (int i = 0; i < 10; i++)
            System.out.println();
        System.out.println("Location Delete");
        System.out.println();
        System.out.print("Enter Location ID: ");
        int id = scan.nextInt();
        String deleteQuery = "DELETE FROM LOCATION WHERE LOC_ID = ?";


        try {
            PreparedStatement preparedStatement = conn.prepareStatement(deleteQuery);
            preparedStatement.setInt(1, id);
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Row with ID " + id + " deleted successfully.");
            } else {
                System.out.println("No records found for ID " + id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("unsuccessfull operation");
        } finally {
            try {
                stmt.close();
            } catch (SQLException e) {

            }
        }
    }
    
}
