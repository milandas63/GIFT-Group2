package MyContact;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class MyContact {
    public Connection conn;
    public Statement stmt;
    public ResultSet rs;
    public ResultSetMetaData rsmd;

    public MyContact() {
        try {
            // Step-1 Load and Register the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Class.forName("com.mysql.jdbc.Driver");
            //Class.forName("org.gjt.mm.mysql.Driver");

            // Step-2 Create Connection Object
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mycontact","root","srinu123");
            System.out.println("connection Successfull");
            // Step-3 Create Statement Object
            stmt = conn.createStatement();

            // Step-4 Create ResultSet Object
            rs = stmt.executeQuery("SELECT c.con_id, c.con_name, c.gender, g.cat_name, l.loc_name, c.mobile_no1 FROM contact AS c LEFT JOIN category AS g ON c.cat_id=g.cat_id LEFT JOIN location AS l ON c.loc_id=l.loc_id;");
            rsmd = rs.getMetaData();

            // Step-5 Manipulate the ResultSet
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
        } catch(ClassNotFoundException e) {
            System.out.println("not connected");
        } catch(SQLException e) {
                        System.out.println("not connected");

        } catch(Exception e) {
                        System.out.println("not connected");

        } finally {
            try {
            
                //rs.close();
               // stmt.close();
                conn.close();
            } catch(SQLException e1) {
            } catch(Exception e1) {
            }
        }
    }

    public static void main(String[] args) {
        new MyContact();
    }
}