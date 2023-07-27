public class PalindromeTriangle {
    public static void main(String[] args) {
        int numRows = 5;
        drawPalindromeTriangle(numRows);
    }

    public static void drawPalindromeTriangle(int numRows) {
        char currentChar = 'A';
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(currentChar);
                currentChar++;
            }
            
            for (int j = i - 1; j >= 1; j--) {
                System.out.print((char)(currentChar - 1));
                currentChar--;
            }
            
            System.out.println();
        }
    }
}
