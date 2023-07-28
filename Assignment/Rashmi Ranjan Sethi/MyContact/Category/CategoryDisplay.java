package MyContact.Category;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CategoryDisplay {
    public Statement stmt;
    public ResultSet rs;
    public ResultSetMetaData rsmd;

    public CategoryDisplay(Connection conn, Scanner scan) {
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM category");
            rsmd = rs.getMetaData();

            for(int i=1; i<=rsmd.getColumnCount(); i++) {
                System.out.print(rsmd.getColumnName(i)+"\t");
            }
            System.out.println();
            while(rs.next()) {
                for(int i=1; i<=rsmd.getColumnCount(); i++) {
                    System.out.print(rs.getString(i)+"\t");
                }
                System.out.println();
            }

            System.out.println();
            System.out.println();
            System.out.println("Press enter to display category menu");
            scan.nextLine();
        } catch(SQLException e) {
        } catch(Exception e) {
        } finally {
            try {
                stmt.close();
            } catch(SQLException e) {
            } catch(Exception e) {
            }
        }
    }
}
