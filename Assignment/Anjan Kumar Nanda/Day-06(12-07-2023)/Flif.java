public class CaseFlip {
    public static void main(String[] args) {
        String original = "Quick Brown Fox Jumps Over The Lazy Dog";
        String inverted = flipCase(original);
        System.out.println("Original: " + original);
        System.out.println("Inverted: " + inverted);
    }

    public static String flipCase(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}

