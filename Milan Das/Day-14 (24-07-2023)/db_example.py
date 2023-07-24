"""
	SQL stands for Structured Query Language.
	SQL is used for communicating with the database engine.
	All database engines understand SQL.
	RDBMS stands for Relational Database Management System.
	There are 2 types of database engine:
		1.	Embedded
			Sqlite, BerkeleyDB, CloudScape, etc.
		2.	External
			Oracle, MS-SQL Server, DB2, Unify, Ingress, Informix, Gupta, etc.
	
	All database engines understand SQL language.
	SQL language is categorised into 3 parts:
		1.	DDL - Data Definition Language
			CREATE, ALTER, DROP, TRUNCATE, etc.

		2.	DML - Data Manipulation Language
			INSERT, UPDATE, DELETE, SELECT, etc.

		3.  DCL - Data Control Language
			COMMIT, REVOKE, SAVEPOINT, etc.

"""
import sqlite3

# Step-1: Create a connector object
conn = sqlite3.connect('student_info.db')

# Step-2: Create a cursor
curs = conn.cursor()

# Step-3: Execute SQL command
curs.execute("""
	CREATE TABLE addressbook(
		id          integer,
		first_name	text,
		last_name	text,
		address		text,
		location	text,
		email_id	text,
		mobile_no	integer,
		PRIMARY KEY(id)
	)
""")

curs.execute('INSERT INTO addressbook VALUES(1, "Debasis","Sahu","New Bus Stand","Berhampur","debasis2020@gmail.com","7656063213")')
curs.execute('INSERT INTO addressbook VALUES(2, "Somya","Bidhar","New Bus Stand","Khurda","srbidhar2020@gmail.com","7848098290")')
curs.execute('INSERT INTO addressbook(id,first_name,last_name,address,location,email_id,mobile_no) VALUES(3,"Sandip","Nayak","Unit-IV","Bhubaneswar","sandipnayak2000@gmail.com","9978168568")')

conn.commit()
conn.close()
