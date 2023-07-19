public class ReverseWords {
    public static void main(String[] args) {
        String input = "Hello World! OpenAI is amazing.";
        String reversedString = reverseWords(input);
        System.out.println(reversedString);
    }

    public static String reverseWords(String input) {
        String[] words = input.split(" ");
        StringBuilder reversedString = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]).append(" ");
        }

        return reversedString.toString().trim();
    }
}

