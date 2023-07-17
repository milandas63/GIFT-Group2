public class AsteriskTriangle {
    public static void main(String[] args) {
        int numRows = 5;
        drawAsteriskTriangle(numRows);
    }

    public static void drawAsteriskTriangle(int numRows) {
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

