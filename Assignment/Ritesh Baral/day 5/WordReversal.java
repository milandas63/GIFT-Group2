Q-1) write a program  to reverse  a word  in the given string ?
  example - Gandhi Institute For Technology
  Reversed : Technology For Institute Gandhi

public class WordReversal {
    public static void main(String[] args) {
        String input = "Gandhi Institute For Technology";
        String reversed = reverseWords(input);
        System.out.println("Original : " + input);
        System.out.println("Reversed : " + reversed);
    }

    public static String reverseWords(String input) {
        String[] words = input.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        return reversed.toString().trim();
    }
}
out put-   Original : Gandhi Institute For Technology
           Reversed : Technology For Institute Gandhi


