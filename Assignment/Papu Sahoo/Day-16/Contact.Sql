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
    (2, "Prakash Sahoo", 3, 1, NULL, "751024", "prakashsahoo@gmail.com", NULL, "7967168568", NULL, NULL);



