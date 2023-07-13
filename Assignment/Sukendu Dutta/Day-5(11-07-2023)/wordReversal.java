public class WordReversal {
    public static void main(String[] args) {
        String input = "Hello, World! How are you?";
        String reversed = reverseWords(input);
        System.out.println("Original string: " + input);
        System.out.println("Reversed words: " + reversed);
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

