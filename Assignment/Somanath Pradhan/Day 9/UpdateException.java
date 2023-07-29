import java.util.Scanner; 
  
 public class UsernamePasswordValidator { 
  
     private static final String[] users = { 
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
         String username = scanner.nextLine(); 
  
         System.out.print("Enter password: "); 
         String password = scanner.nextLine(); 
  
         boolean isAuthenticated = false; 
  
         for (String[] user : users) { 
             if (user[0].equals(username) && user[1].equals(password)) { 
                 isAuthenticated = true; 
                 break; 
             } 
         } 
  
         if (isAuthenticated) { 
             System.out.println("Authentication successful!"); 
         } else { 
             System.out.println("Authentication failed!"); 
         } 
     } 
 }
