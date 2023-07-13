public class TriangleOutline {
    public static void main(String[] args) {
        int height = 5; // Specify the height of the triangle

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= (height - i); j++) {
                System.out.print(" "); // Print spaces for indentation
            }

            if (i == 1 || i == height) {
                // Print a full row of stars for the base and top of the triangle
                for (int j = 1; j <= i * 2 - 1; j++) {
                    System.out.print("*");
                }
            } else {
                // Print the outline of the triangle
                System.out.print("*"); // Print the left edge of the triangle

                for (int j = 1; j <= (i - 2) * 2 + 1; j++) {
                    System.out.print(" "); // Print spaces for the middle part
                }

                System.out.print("*"); // Print the right edge of the triangle
            }

            System.out.println(); // Move to the next line
        }
    }
}

