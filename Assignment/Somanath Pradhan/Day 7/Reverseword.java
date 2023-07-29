import java.util.StringTokenizer; 
  
 public class ReverseWords { 
  
     public static String reverseWords(String str) { 
         StringTokenizer st = new StringTokenizer(str, " "); 
         String reversedWords = ""; 
         while (st.hasMoreTokens()) { 
             String word = st.nextToken(); 
             String reversedWord = ""; 
             for (int i = word.length() - 1; i >= 0; i--) { 
                 reversedWord += word.charAt(i); 
             } 
             reversedWords += reversedWord + " "; 
         } 
         return reversedWords.trim(); 
     } 
  
     public static void main(String[] args) { 
         String str = "Gandhi Institute For Technology"; 
         System.out.println("Original string: " + str); 
         String reversedString = reverseWords(str); 
         System.out.println("Reversed string: " + reversedString); 
     } 
 }
