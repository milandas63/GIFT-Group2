public class NumberSeries {
    public static void main(String[] args) {
        int n = 1;
        int seriesLength = 10;
        generateSeries(n, seriesLength);
    }

    public static void generateSeries(int n, int seriesLength) {
        for (int i = 1; i <= seriesLength; i++) {
            System.out.print(n + " ");
            if (i % 2 == 1) {
                n = n * 2 + 1;
            } else {
                n = n * 2 - 1;
            }
        }
    }
