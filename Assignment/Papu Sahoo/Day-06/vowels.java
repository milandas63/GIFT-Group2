//Count the number of vowels in a given string //
public class VowelCount {
    public static void main(String[] args) {
        String input = "Life is full of fun";
        int vowelCount = countVowels(input);
        System.out.println("Number of vowels: " + vowelCount);
    }
 public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase(); 
   for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
         count++;
      }
   }
    return count;
 }
}
Output:
  Number of vowels:6
