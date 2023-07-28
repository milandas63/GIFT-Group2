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
