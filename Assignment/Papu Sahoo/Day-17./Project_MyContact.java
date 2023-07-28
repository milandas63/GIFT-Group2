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

//  LOCATION

// New Location Add

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

//  Location Delete

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

//    Location Display

package MyContact.Location;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LocationDispaly {
    public Statement stmt;
    public ResultSet rs;
    public ResultSetMetaData rsmd;

    public LocationDispaly(Connection conn, Scanner scan) {
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM LOCATION");
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

//  Location Menu

package MyContact.Location;

import java.sql.Connection;
import java.util.Scanner;

public class LocationMenu {
    public LocationMenu(Connection conn, Scanner scan) {
        String choice;
        boolean yn = true;
        while(yn) {
            for(int i=0; i<10; i++) System.out.println();
            System.out.println("Location Menu");
            System.out.println("1. Display");
            System.out.println("2. Add New");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.println();
            System.out.print("Choice: ");
            choice = scan.nextLine();
            if(choice.equals("1")) {
                new LocationDispaly(conn, scan);
            } else if(choice.equals("2")) {
                new LocationAddNew(conn, scan);
            } else if(choice.equals("3")) {
                new LocationUpdate(conn, scan);
            } else if(choice.equals("4")) {
                new LocationDelete(conn, scan);
            } else if(choice.equals("5")) {
                yn = false;
            }
        }

    }
}

//   Location Update

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

//  My Contact SQL

use mycontact;

    create table CATEGORY(
		CAT_ID 		int(6) 			not null auto_increment,
		CAT_NAME 	varchar(40) 	not null unique,
    primary key(CAT_ID)
);
    insert into CATEGORY values
		(1, "Family"),
        (2, "Friend"),
        (3, "Professional Friend"),
        (4, "Relative");
    drop table CATEGORY;

    create table LOCATION(
	LOC_ID		int(6)			not null auto_increment,
    LOC_NAME	varchar(50)		not null unique,
    primary key(LOC_ID)
);
    insert into LOCATION values
            (1, "Odisha"),
			(2, "Jharkanda"),
            (3, "Bhadrak"),
            (4, "Mayurbhanj"),
            (5, "Cuttack"),
            (6, "Baleswara"),
            (7, "Delhi"),
            (8, "Jajapur");
    drop table LOCATION;
    select *from LOCATION;

    create table CONTACT(
	CON_ID			int(6)			not null auto_increment,
    CON_NAME		varchar(50)		not null ,
    GENDER			enum("M", "F")	default null,
    CAT_ID			int(6)			not null references CATEGORY(CAT_ID),
    LOC_ID			int(6)			not null references LOCATION(LOC_ID),
    ADDRESS			varchar(150)	default null,
    PINCODE			varchar(10)		default null,
    EMAIL_ID		varchar(50)		default null,
    MOBILE_NO1		varchar(15)		not null,
    primary key(CON_ID)
    );
    drop table CONTACT;
    select * from CONTACT;

    insert into CONTACT values
            (1, "Papu Sahoo", "S", 1, 2, "Bhubaneswar", "751024", "[papu9876@gmail.com","88950674"),
			      (2, "Sukhendu Datta", "S", 2, 1, "Khurdha", "752050", "suku0372@gmail.com","9437856640"),
            (3, "Abhilash Mahanta ", "S", 3, 1, "Khurdha", "752050", "abhi0923gmail.com","9438256177"),
            (4, "Prakash Sahoo", "S", 2, 4, "Odia Bajar", "544890", "prakash6969@gmail.com","9138546277"),
            (5, "Gourab Kumar Sahoo", "S", 4, 2, "Ogalapada", "853460", "goura2244@gmail.com","9777559635");


    SELECT c.con_id, c.con_name, c.gender, g.cat_name, l.loc_name, c.mobile_no1 FROM contact AS c
    LEFT JOIN category AS g ON c.cat_id=g.cat_id
    LEFT JOIN location AS l ON c.loc_id=l.loc_id;

    select * from Contact;
