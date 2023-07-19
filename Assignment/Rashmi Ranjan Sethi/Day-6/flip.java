public class FlipCharacters {
    public static void main(String[] args) {
        String input = "Hello, World!";
        String flippedString = flipCharacters(input);
        System.out.println(flippedString);
    }

    public static String flipCharacters(String input) {
        StringBuilder flippedString = new StringBuilder(input);
        return flippedString.reverse().toString();
    }
}

