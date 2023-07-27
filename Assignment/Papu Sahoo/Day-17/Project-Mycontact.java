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

package com.contact.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Contact {
	public Connection conn;
	public Statement stmt;
	public ResultSet rs;
	public ResultSetMetaData rsmd;
	public Scanner scan;
	public Contact() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");   //	Step-1 Load and Register Driver
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact_db", "root", "");  // 	Step-2 Create Connection Object
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
		new Contact();
	}
}

// CONTACT.SQL //

DROP DATABASE IF EXISTS contact_db;
CREATE DATABASE IF NOT EXISTS contact_db;
USE contact_db;
#####################
###   LOCATION    ###
#####################
SELECT "Location";
DROP TABLE IF EXISTS location;
CREATE TABLE IF NOT EXISTS location(
    loc_id      INT(6)          NOT NULL AUTO_INCREMENT,
    loc_name    VARCHAR(100)    NOT NULL UNIQUE,
    PRIMARY KEY(loc_id)
);
INSERT INTO location VALUES
    (1, "Bhubaneswar"),
    (2, "Cuttack"),
    (3, "Banagalore"),
    (4, "Mumbai"),
    (5, "USA"),
    (6, "Rourkela");

########################
###    CATEGORY     ####
########################
SELECT "Category";
DROP TABLE IF EXISTS category;
CREATE TABLE IF NOT EXISTS category(
    cat_id          INT(6)          NOT NULL AUTO_INCREMENT,
    cat_name        VARCHAR(50)     NOT NULL UNIQUE,
    PRIMARY KEY(cat_id)
);
INSERT INTO category VALUES
    (1, "School Friends"),
    (2, "College Friends"),
    (3, "Professional Friends"),
    (4, "Family Friends"),
    (5, "Family Relatives"),
    (6, "Blood Relation");
#######################
###    CONTACT     ####
#######################
SELECT "Contact";
DROP TABLE IF EXISTS contact;
CREATE TABLE IF NOT EXISTS contact(
    contact_id      INT(6)          NOT NULL AUTO_INCREMENT,
    contact_name    VARCHAR(50)     NOT NULL,
    cat_id          INT(6)          NOT NULL REFERENCES category(cat_id),
    loc_id          INT(6)          NOT NULL REFERENCES location(loc_id),
    address         VARCHAR(150)    DEFAULT NULL,
    pincode         VARCHAR(10)     DEFAULT NULL,
    email_id1       VARCHAR(50)     DEFAULT NULL,
    email_id2       VARCHAR(50)     DEFAULT NULL,
    mobile_no1      VARCHAR(50)     DEFAULT NULL,
    mobile_no2      VARCHAR(50)     DEFAULT NULL,
    mobile_no3      VARCHAR(50)     DEFAULT NULL,
    PRIMARY KEY(contact_id)
);
INSERT INTO contact VALUES
    (1, "Milan Das",     3, 1, NULL, "751024", "milandas63@gmail.com",   NULL, "7978168568", NULL, NULL),
    (2, "Papu Sahoo", 3, 1, NULL, "751024", "papusahoo@gmail.com", NULL, "9437168568", NULL, NULL);


// CONTACT MENU //

