/*
Q:- Draw a triangle of palindrome alphabets pyramid  */

public class PalindromeTriangle {
    public static void main(String[] args) {
        int rows = 5; // Specify the number of rows for the pyramid
        
        for (int i = 0; i < rows; i++) {
            // Print spaces for alignment
            for (int j = 0; j < rows - i; j++) {
                System.out.print("  ");
            }
            
            // Print alphabets in ascending order
            for (int j = 0; j <= i; j++) {
                System.out.print((char)('A' + j) + " ");
            }
            
            // Print alphabets in descending order
            for (int j = i - 1; j >= 0; j--) {
                System.out.print((char)('A' + j) + " ");
            }
            
            System.out.println(); // Move to the next line
        }
    }
}

/* When you run this code, it will generate the following output:

css
Copy code
          A 
        A B A 
      A B C B A 
    A B C D C B A 
  A B C D E D C B A    */

