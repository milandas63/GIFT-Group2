
Q:- Complete the series of 10 numbers in the series?
        1, 3, 5, 11, 21, ......      (n, n*2+1, n*2-1, n*2+1, n*2-1, ...  */

public class SeriesCompletion {
    public static void main(String[] args) {
        int n = 21; // Specify the last number in the given series
        
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                n = n * 2 + 1;
            } else {
                n = n * 2 - 1;
            }
            System.out.print(n + " ");
        }
    }
}
/*
Output
When you run this code, it will output the next 10 numbers in the series
43 85 171 341 683 1365 2731 5461 10923 21845 */
