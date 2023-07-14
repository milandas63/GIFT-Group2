public class SeriesCompletion {
    public static void main(String[] args) {
        int n = 21;
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
Output:
43 85 171 341 683 1365 2731 5461 10923 21845 
