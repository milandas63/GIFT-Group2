public class ReverseWordsWithinString {
    public static void main(String[] args) {
        String input = "Hello World! OpenAI is amazing.";
        String reversedString = reverseWordsWithinString(input);
        System.out.println(reversedString);
    }

    public static String reverseWordsWithinString(String input) {
        StringBuilder reversedString = new StringBuilder();
        String[] words = input.split(" ");

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            reversedString.append(reversedWord).append(" ");
        }

        return reversedString.toString().trim();
    }
}

