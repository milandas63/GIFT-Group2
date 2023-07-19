public class ReverseWords {
    public static void main(String[] args) {
        String input = "Hello World! OpenAI is amazing.";
        String reversedString = reverseWords(input);
        System.out.println(reversedString);
    }

    public static String reverseWords(String input) {
        String[] words = input.split(" ");
        StringBuilder reversedString = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedString.append(reversedWord.reverse()).append(" ");
        }

        return reversedString.toString().trim();
    }
}

