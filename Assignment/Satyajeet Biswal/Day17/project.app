import java.util.Scanner;

public class ContactApp {
    public static void main(String[] args) {
        ContactList contactList = new ContactList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. View All Contacts");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add a new contact
                    // contactList.updateContact();
                    break;
                case 2:
                    // View all contacts
                    // contactList.ViewallContacts();
                    break;
                case 3:
                    // Update a contact
                    // contactList.updateContact();
                    break;
                case 4:
                    // Delete a contact
                    // contactList.deleteContact();
                    break;
                case 5:
                    // Exit the program
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
