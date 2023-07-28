package MyContact.Location;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LocationAddNew {
    Statement stmt;
    public LocationAddNew(Connection conn, Scanner scan) {
        for(int i=0; i<10; i++) System.out.println();
        System.out.println("Location Add");
        System.out.println("");
        System.out.print("Enter New Location Name: ");
        String name = scan.nextLine();

        try {
            stmt = conn.createStatement();
            int count = stmt.executeUpdate("INSERT INTO LOCATION(LOC_NAME) VALUE('"+name+"')");
            if(count==0) {
                System.out.println("There was an error!");
                System.out.println("Press enter to proceed");
                scan.nextLine();
            }
        } catch(SQLException e) {

        } finally {
            try {
                stmt.close();
            } catch(SQLException e) {

            }
        }
    }
}
