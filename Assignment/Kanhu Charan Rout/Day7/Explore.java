
import java.util.Scanner; 
  
 import com.oops.Routine; 
  
 public class ExploreAPI { 
         public static void main(String[] args) { 
                 String words = "India"; 
                 String country = "India"; 
                 String x = "America"; 
                 String y = "India"; 
  
                 Routine r = new Routine(); 
                 System.out.println(r.padL(23415164, 50)); 
                 System.out.println(r.padC(23415164, 50)); 
                 System.out.println(r.padR(23415164, 50)); 
  
  
                 System.out.println("What is your name?"); 
                 Scanner scan = new Scanner(System.in); 
                 String name = scan.nextLine(); 
                 System.out.println(name); 
         } 
  
 }