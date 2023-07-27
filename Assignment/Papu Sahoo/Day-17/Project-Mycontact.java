// CATAGORY DISPLAY //

package com.category;
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

// CATAGORY DISPLAY //

package com.contact.main;

import java.sql.Connection;
import java.util.Scanner;
import com.category.CategoryDisplay;

public class CategoryMenu {
	public CategoryMenu(Connection conn, Scanner scan) {
		String choice;
		boolean yn = true;
		while(yn) {
			for(int i=0; i<10; i++) System.out.println();
			System.out.println("Category Menu");
			System.out.println("1. Display");
			System.out.println("2. Add New");
			System.out.println("3. Update");
			System.out.println("4. Delete");
			System.out.println("5. Exit");
			System.out.println();
			System.out.print("Choice: ");
			choice = scan.nextLine();
			if(choice.equals("1")) {
				new CategoryDisplay(conn, scan);
			} else if(choice.equals("2")) {
			} else if(choice.equals("3")) {
			} else if(choice.equals("4")) {
			} else if(choice.equals("5")) {
				yn = false;
			}
		}
	}
}


// CONTACT //


