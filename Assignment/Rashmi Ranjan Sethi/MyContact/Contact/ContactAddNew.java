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
