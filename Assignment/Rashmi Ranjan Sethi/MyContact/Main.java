package MyContact;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import MyContact.Category.CategoryMenu;
import MyContact.Contact.ContactMenu;
import MyContact.Location.LocationMenu;

public class Main {
	public Connection conn;
	public Statement stmt;
	public ResultSet rs;
	public ResultSetMetaData rsmd;
	public Scanner scan;
	
	public Main() {
		try {
			//	Step-1 Load and Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 	Step-2 Create Connection Object
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mycontact","root","Whoami@2000");

			scan = new Scanner(System.in);
			String choice = "0";
			boolean yn = true;
			while(yn) {
				for(int i=0; i<10; i++) System.out.println();
				System.out.println("MAIN MENU");
				System.out.println("1. Category");
				System.out.println("2. Location");
				System.out.println("3. Contact");
				System.out.println("4. Exit");
				System.out.println();
				System.out.print("Choice: ");
				choice = scan.nextLine();
				if(choice.equals("1")) {
					new CategoryMenu(conn, scan);
				} else if(choice.equals("2")) {
					new LocationMenu(conn, scan);
				} else if(choice.equals("3")) {
					new ContactMenu(conn, scan);
				} else if(choice.equals("4")) {
					conn.close();
					System.out.println("Thank you for using Contact App");
					System.exit(0);
				}
			}
			
		} catch(ClassNotFoundException e) {
		} catch(SQLException e) {
		} catch(Exception e) {
		} finally {
			try {
				//	Step-6 Close ResultSet, Statement and Connection
				rs.close();
				stmt.close();
				conn.close();
			} catch(SQLException e1) {
			} catch(Exception e1) {
			}
		}
	}

	public static void main(String[] args) {
		new Main();
	}

}