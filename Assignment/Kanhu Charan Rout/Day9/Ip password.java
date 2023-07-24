
import java.util.Scanner; 
  
 public class UserValidation { 
     private static final String[][] users = { 
             {"Teacher", "milan"}, 
             {"Gift", "college"}, 
             {"Language", "java"}, 
             {"Animal", "tiger"}, 
             {"Student", "gift"}, 
             {"Session", "second"} 
     }; 
  
     public static void main(String[] args) { 
         Scanner scanner = new Scanner(System.in); 
  
         System.out.print("Enter username: "); 
         String username = scanner.nextLine().trim(); 
  
         System.out.print("Enter password: "); 
         String password = scanner.nextLine().trim(); 
  
         try { 
             validateUser(username, password); 
             System.out.println("Login successful!"); 
         } catch (UserException e) { 
             System.out.println("Login failed: " + e.getMessage()); 
         } 
     } 
  
     private static void validateUser(String username, String password) throws UserException { 
         if (username.isEmpty()) { 
             throw new EmptyUsernameException("Username cannot be empty."); 
         } 
  
         if (password.isEmpty()) { 
             throw new EmptyPasswordException("Password cannot be empty."); 
         } 
  
         for (String[] user : users) { 
             String storedUsername = user[0]; 
             String storedPassword = user[1]; 
  
             if (username.equals(storedUsername)) { 
                 if (password.equals(storedPassword)) { 
                     return; // Valid username and password 
                 } else { 
                     throw new WrongPasswordException("Incorrect password."); 
                 } 
             } 
         } 
  
         throw new WrongUsernameException("Username not found."); 
     } 
 }