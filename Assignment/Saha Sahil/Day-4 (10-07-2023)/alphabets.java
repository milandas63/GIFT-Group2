public class MultiplicationTable {
    public static void main(String[] args) {
        int tableSize = 10; // Specify the size of the multiplication table

        for (int i = 2; i <= tableSize; i++) {
            System.out.println("Multiplication Table of " + i + ":");

            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }

            System.out.println(); // Print a blank line after each table
        }
    }
}
