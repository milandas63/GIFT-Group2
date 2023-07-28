
package com.contact.main; 
  
 import java.sql.Connection; 
 import java.util.Scanner; 
  
 import com.category.CategoryAddNew; 
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
                                 new CategoryAddNew(conn, scan); 
                         } else if(choice.equals("3")) { 
                         } else if(choice.equals("4")) { 
                         } else if(choice.equals("5")) { 
                                 yn = false; 
                         } 
                 } 
         } 
 }