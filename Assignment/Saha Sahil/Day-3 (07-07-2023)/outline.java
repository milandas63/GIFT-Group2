public class TriangleOutline {
    public static void main(String[] args) {
        int height = 5;

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= (height - i); j++) {
                System.out.print(" "); 
            }

            if (i == 1 || i == height) {
                
                for (int j = 1; j <= i * 2 - 1; j++) {
                    System.out.print("*");
                }
            } else {
                
                System.out.print("*"); 

                for (int j = 1; j <= (i - 2) * 2 + 1; j++) {
                    System.out.print(" "); 
                }

                System.out.print("*"); 
            }

            System.out.println(); // Move to the next line
        }
    }
}
