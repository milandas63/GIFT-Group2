import java.util.StringTokenizer;

public class ReverseWords {

    public static String reverseWords(String str) {
        StringTokenizer st = new StringTokenizer(str, " ");
        String reversedWords = "";
        while (st.hasMoreTokens()) {
            reversedWords += st.nextToken() + " ";
        }
        return reversedWords.trim();
    }

    public static void main(String[] args) {
        String str = "God is Omnipotent and Omniscient";
        System.out.println("Original string: " + str);
        String reversedString = reverseWords(str);
        System.out.println("Reversed string: " + reversedString);
    }
}
