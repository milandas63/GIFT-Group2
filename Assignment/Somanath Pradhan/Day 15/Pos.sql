########################## 
 ###   MEDICINE       ##### 
 ########################## 
 SELECT "Medicine"; 
 DROP TABLE IF EXISTS medicine; 
 CREATE TABLE IF NOT EXISTS medicine( 
     medicine_id     INT(6)          NOT NULL AUTO_INCREMENT, 
     medicine_name   VARCHAR(100)    NOT NULL UNIQUE, 
     manufacturer    VARCHAR(100)    NOT NULL, 
     unit_price      DECIMAL(10, 2)  NOT NULL, 
     quantity        INT(6)          NOT NULL, 
     PRIMARY KEY(medicine_id) 
 ); 
 INSERT INTO medicine VALUES 
     (1, "Paracetamol", "ABC Pharma", 5.99, 100), 
     (2, "Ibuprofen", "XYZ Pharmaceuticals", 7.49, 50), 
     (3, "Aspirin", "PQR Meds", 4.25, 75), 
     -- Add more medicines as needed 
     (4, "Amoxicillin", "LMN Drugs", 12.99, 30); 
  
  
 ########################## 
 ###   CUSTOMER       ##### 
 ########################## 
 SELECT "Customer"; 
 DROP TABLE IF EXISTS customer; 
 CREATE TABLE IF NOT EXISTS customer( 
     customer_id     INT(6)          NOT NULL AUTO_INCREMENT, 
     customer_name   VARCHAR(100)    NOT NULL, 
     email           VARCHAR(50)     DEFAULT NULL, 
     phone           VARCHAR(20)     DEFAULT NULL, 
     address         VARCHAR(150)    DEFAULT NULL, 
     PRIMARY KEY(customer_id) 
 ); 
 INSERT INTO customer VALUES 
     (1, "John Doe", "john.doe@example.com", "+1 123-456-7890", "123 Main St, City, Country"), 
     (2, "Jane Smith", "jane.smith@example.com", "+1 987-654-3210", "456 Elm St, Town, Country"), 
     -- Add more customers as needed 
     (3, "Michael Johnson", "michael@example.com", "+1 111-222-3333", "789 Oak St, Village, Country"); 
  
  
 ########################## 
 ###   SALES          ##### 
 ########################## 
 SELECT "Sales"; 
 DROP TABLE IF EXISTS sales; 
 CREATE TABLE IF NOT EXISTS sales( 
     sale_id         INT(6)          NOT NULL AUTO_INCREMENT, 
     customer_id     INT(6)          NOT NULL REFERENCES customer(customer_id), 
     sale_date       DATE            NOT NULL, 
     total_amount    DECIMAL(10, 2)  NOT NULL, 
     PRIMARY KEY(sale_id) 
 ); 
 INSERT INTO sales (customer_id, sale_date, total_amount) VALUES 
     (1, '2023-07-26', 15.98), 
     (2, '2023-07-25', 22.47), 
     -- Add more sales records as needed 
     (1, '2023-07-24', 9.50); 
  
  
 ########################## 
 ###   SALE_ITEMS     ##### 
 ########################## 
 SELECT "Sale_Items"; 
 DROP TABLE IF EXISTS sale_items; 
 CREATE TABLE IF NOT EXISTS sale_items( 
     sale_item_id    INT(6)          NOT NULL AUTO_INCREMENT, 
     sale_id         INT(6)          NOT NULL REFERENCES sales(sale_id), 
     medicine_id     INT(6)          NOT NULL REFERENCES medicine(medicine_id), 
     quantity        INT(6)          NOT NULL, 
     item_price      DECIMAL(10, 2)  NOT NULL, 
     subtotal        DECIMAL(10, 2)  NOT NULL, 
     PRIMARY KEY(sale_item_id) 
 ); 
 INSERT INTO sale_items (sale_id, medicine_id, quantity, item_price, subtotal) VALUES 
     (1, 1, 2, 5.99, 11.98), 
     (1, 3, 1, 4.25, 4.25), 
     (2, 2, 3, 7.49, 22.47), 
     -- Add more sale items as needed 
     (3, 1, 2, 5.99, 11.98);
