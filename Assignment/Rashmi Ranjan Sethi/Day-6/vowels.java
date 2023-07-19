public class CountVowels {
    public static void main(String[] args) {
        String input = "Hello World! OpenAI is amazing.";
        int vowelCount = countVowels(input);
        System.out.println("Number of vowels: " + vowelCount);
    }

    public static int countVowels(String input) {
        int count = 0;
        input = input.toLowerCase(); 

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }
}

