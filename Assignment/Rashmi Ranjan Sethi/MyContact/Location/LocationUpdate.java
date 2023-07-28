package MyContact.Location;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LocationUpdate {
    Statement stmt;
    String name;
    public LocationUpdate(Connection conn, Scanner scan) {
        for (int i = 0; i < 10; i++)
            System.out.println();
        System.out.println("Location Update");
        System.out.println("");
        System.out.print("Enter Location ID: ");
        int id = scan.nextInt();
        System.out.print("Enter Location Name to update: ");
         name = scan.next();

        String updateQuery = "UPDATE LOCATION SET LOC_NAME = ? WHERE LOC_ID = ?";

        try{
             PreparedStatement preparedStatement = conn.prepareStatement(updateQuery);
             preparedStatement.setString(1, name);
            preparedStatement.setInt(2, id);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Name updated successfully for ID : " + id);
				
            } else {
                System.out.println("No records found for ID " + id);
            }
            System.out.println("Press enter to proceed");
            scan.nextLine();
        } catch(SQLException e) {
            System.out.println("unsuccessfull operation");
        } finally {
            try {
                stmt.close();
            } catch(SQLException e) {

            }
        }
    }
}
