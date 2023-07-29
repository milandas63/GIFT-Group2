public class ReserveString { 
         public static void main(String[] args) { 
                 text = "God is Omnipotent and Omniscient"; 
                 reverse = ""; 
                 String[] words = text.split(" "); 
                 for(int i=words.length-1; i>=0; i--) { 
                         reverse = reverse + words[i]+ " "; 
                 } 
                 System.out.println("Original: "+text); 
                 System.out.println("Reverse:  "+reverse); 
     System.out.println("-----------------------------------"); 
         } 
 } 
 Output: 
       Omniscient and Omnipotent is God 
