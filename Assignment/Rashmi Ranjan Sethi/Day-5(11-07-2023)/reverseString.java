public class PalindromePyramid {
    public static void main(String[] args) {
        int height = 5; 

        for (int i = 1; i <= height; i++) {
            // Print spaces
            for (int j = 1; j <= height - i; j++) {
                System.out.print("  ");
            }

            
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (j + 64) + " ");
            }

            
            for (int j = i - 1; j >= 1; j--) {
                System.out.print((char) (j + 64) + " ");
            }

            System.out.println();
        }
    }
}

