//   Catagory New Add  //

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


//  Catagory Delete


package MyContact.Category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CategoryDelete {
    Statement stmt;
    String name;

    public CategoryDelete(Connection conn, Scanner scan) {
        for (int i = 0; i < 10; i++)
            System.out.println();
        System.out.println("Category Delete");
        System.out.println();
        System.out.print("Enter Category ID: ");
        int id = scan.nextInt();
        String deleteQuery = "DELETE FROM CATEGORY WHERE CAT_ID = ?";


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


//   Catagory Display



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


//    Catagory Menu


package MyContact.Category;

import java.sql.Connection;
import java.util.Scanner;

public class CategoryMenu {
    public CategoryMenu(Connection conn, Scanner scan) {
        String choice;
        boolean yn = true;
        while (yn) {
            for (int i = 0; i < 10; i++)
                System.out.println();
            System.out.println("Category Menu");
            System.out.println("1. CategoryDisplay");
            System.out.println("2. Add New");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.println();
            System.out.print("Choice: ");
            choice = scan.nextLine();
            if (choice.equals("1")) {
                new CategoryDisplay(conn, scan);
            } else if (choice.equals("2")) {
                new CategoryAddNew(conn, scan);
            } else if (choice.equals("3")) {
                new CategoryUpdate(conn,scan);
            } else if (choice.equals("4")) {
                new CategoryDelete(conn,scan);
            } else if (choice.equals("5")) {
                yn = false;
            }
        }
    }
}


// Catagory Upadete


package MyContact.Category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CategoryUpdate {
    Statement stmt;
    String name;
    public CategoryUpdate(Connection conn, Scanner scan) {
        for (int i = 0; i < 10; i++)
            System.out.println();
        System.out.println("Category Update");
        System.out.println("");
        System.out.print("Enter Category ID: ");
        int id = scan.nextInt();
        System.out.print("Enter Name to update: ");
         name = scan.next();

        String updateQuery = "UPDATE CATEGORY SET CAT_NAME = ? WHERE CAT_ID = ?";

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




// CONTACT



//  Add New Conatct

package MyContact.Contact;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ContactAddNew {
    Statement stmt;
    int LOC_ID;
    int CAT_ID;
    String ADDRESS=null,PINCODE=null,EMAIL_ID=null,Mobile_NO1=null;

    public ContactAddNew(Connection conn, Scanner scan) {
        for (int i = 0; i < 10; i++)
            System.out.println();
        System.out.println("Contact Add");
        System.out.println("");
        System.out.print("Enter New Contact Name: ");
        String CON_NAME = scan.nextLine();
        System.out.print("Enter Gender: ");
        String GENDER = scan.nextLine();

        System.out.print("Choose Category Id:");
        System.out.println();
        try {
            Statement stmt0 = conn.createStatement();
            ResultSet rs0 = stmt0.executeQuery("SELECT * FROM category ORDER BY cat_id");
            ResultSetMetaData rsmd0 = rs0.getMetaData();

            for (int i = 1; i <= rsmd0.getColumnCount(); i++) {
                System.out.print(rsmd0.getColumnName(i) + "\t");
            }
            System.out.println();
            while (rs0.next()) {
                for (int i = 1; i <= rsmd0.getColumnCount(); i++) {
                    System.out.print(rs0.getString(i) + "\t");
                }
                System.out.println();
            }
            System.out.println();
            CAT_ID = scan.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.print("Choose Location Id: ");
        System.out.println();
        try {
            Statement stmt1 = conn.createStatement();
            ResultSet rs1 = stmt1.executeQuery("SELECT * FROM location ORDER BY loc_id");
            ResultSetMetaData rsmd1 = rs1.getMetaData();

            for (int i = 1; i <= rsmd1.getColumnCount(); i++) {
                System.out.print(rsmd1.getColumnName(i) + "\t");
            }
            System.out.println();
            while (rs1.next()) {
                for (int i = 1; i <= rsmd1.getColumnCount(); i++) {
                    System.out.print(rs1.getString(i) + "\t");
                }
                System.out.println();
            }
            System.out.println();
            LOC_ID = scan.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("");
        System.out.println("Enter Address in 100 characters : ");
        ADDRESS = scan.nextLine();

        System.out.println("Enter Pincode : ");
        PINCODE = scan.nextLine();
        
        System.out.println("Enter Email : ");
        EMAIL_ID = scan.nextLine();

        System.out.println("Enter mobile no. : ");
        String Mobile_NO1 = scan.nextLine();

        try {
            stmt = conn.createStatement();
            // String quer = "INSERT INTO CONTACT(CON_NAME,GENDER,CAT_ID,LOC_ID,ADDRESS,PINCODE,EMAIL_ID,Mobile_NO1) VALUE ("+CON_NAME+","+GENDER+","+CAT_ID+","+LOC_ID+","+ADDRESS+","+PINCODE+","+EMAIL_ID+","+Mobile_NO1+")";
            int count = stmt.executeUpdate("INSERT INTO LOCATION(LOC_NAME) VALUE("+CON_NAME+","+GENDER+","+CAT_ID+","+LOC_ID+","+ADDRESS+","+PINCODE+","+EMAIL_ID+","+Mobile_NO1+")");
            if (count == 0) {
                System.out.println("There was an error!");   
            } else {
                System.out.println("Data Added Successfully");
                System.out.println();
                 System.out.println("Press enter to proceed");
                scan.nextLine();
            }
        } catch (SQLException e) {
          e.printStackTrace();
        } finally {
            try {
                stmt.close();
            } catch (SQLException e) {
            }
        }
    }
}
//  preparedStatement.setString(1, CON_NAME);
//             preparedStatement.setString(2, GENDER);
//             preparedStatement.setInt(3, CAT_ID);
//             preparedStatement.setInt(4, LOC_ID);
//             preparedStatement.setString(5, ADDRESS);
//             preparedStatement.setString(6, PINCODE);
//             preparedStatement.setString(7, EMAIL_ID);
//             preparedStatement.setString(8, Mobile_NO1)



//  Delete Contact


package MyContact.Contact;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ContactDelete {
    Statement stmt;
    String name;
    
    public ContactDelete(Connection conn, Scanner scan) {
        for (int i = 0; i < 10; i++)
            System.out.println();
        System.out.println("Category Delete");
        System.out.println();
        System.out.print("Enter Category ID: ");
        int id = scan.nextInt();
        String deleteQuery = "DELETE FROM CONTACT WHERE CON_ID = ?";


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


//  Conatct Display

package MyContact.Contact;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ContactDisplay {
    public Statement stmt;
    public ResultSet rs;
    public ResultSetMetaData rsmd;

    public ContactDisplay(Connection conn, Scanner scan) {
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM CONTACT");
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



//    contact menu

package MyContact.Contact;

import java.sql.Connection;
import java.util.Scanner;

public class ContactMenu {
    public ContactMenu(Connection conn, Scanner scan) {
        String choice;
        boolean yn = true;
        while(yn) {
            for(int i=0; i<10; i++) System.out.println();
            System.out.println("Contact Menu");
            System.out.println("1. Display");
            System.out.println("2. Add New");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.println();
            System.out.print("Choice: ");
            choice = scan.nextLine();
            if(choice.equals("1")) {
                new ContactDisplay(conn, scan);
            } else if(choice.equals("2")) {
                new ContactAddNew(conn, scan);
            } else if(choice.equals("3")) {
                new ContactUpdate(conn, scan);
            } else if(choice.equals("4")) {
                new ContactDelete(conn, scan);
            } else if(choice.equals("5")) {
                yn = false;
            }
        }
    }
}



//  Contact Update

package MyContact.Contact;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ContactUpdate {
    Statement stmt;
    String name;

    public ContactUpdate(Connection conn, Scanner scan) {
        for (int i = 0; i < 10; i++)
            System.out.println();
        System.out.println("Contact Update");
        System.out.println("");
        System.out.print("Enter Contact ID: ");
        int id = scan.nextInt();
        System.out.print("Enter Name to update: ");
         name = scan.next();

        String updateQuery = "UPDATE CONTACT SET CON_NAME = ? WHERE CON_ID = ?";

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
