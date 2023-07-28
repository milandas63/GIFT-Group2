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
