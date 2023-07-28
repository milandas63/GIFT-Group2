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
			(2, "Gujurat"),
            (3, "Mumbai"),
            (4, "Rajhesthan"),
            (5, "Punjab"),
            (6, "Uttar Pradesh"),
            (7, "Delhi"),
            (8, "Chandigarh");
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
            (1, "Rahul Mohanty", "M", 1, 2, "Bhubaneswar", "751024", "montyrahul4495@gmail.com","9510207475"),
			(2, "Abinash Dash", "M", 2, 1, "Khurdha", "752050", "abhi5648@gmail.com","9778945547"),
            (3, "A.Srinibash ", "M", 3, 1, "Khurdha", "752050", "srinu5689@gmail.com","9713545547"),
            (4, "Sahil Jain", "M", 2, 4, "Banswada", "544890", "mrsj1698@gmail.com","7894554756"),
            (5, "Bikram Dash", "M", 4, 2, "Gandhinagar", "853460", "bikrambkd5648@gmail.com","9456687547");


    SELECT c.con_id, c.con_name, c.gender, g.cat_name, l.loc_name, c.mobile_no1 FROM contact AS c
    LEFT JOIN category AS g ON c.cat_id=g.cat_id
    LEFT JOIN location AS l ON c.loc_id=l.loc_id;

    select * from Contact;
