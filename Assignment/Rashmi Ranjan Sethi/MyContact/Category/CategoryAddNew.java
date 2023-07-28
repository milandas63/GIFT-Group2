package MyContact.Category;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CategoryAddNew {
    Statement stmt;

    public CategoryAddNew(Connection conn, Scanner scan) {
        for(int i=0; i<10; i++) System.out.println();
        System.out.println("Category Add");
        System.out.println("");
        System.out.print("Enter New Category Name: ");
        String name = scan.nextLine();

        try {
            stmt = conn.createStatement();
            int count = stmt.executeUpdate("INSERT INTO category(cat_name) VALUE('"+name+"')");
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
