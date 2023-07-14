write a program to reverse a given string ?
  example - Original : Gandhi Institute For Technology
            Reversed : ygolonhceT roF etutitsnI ihdnaG

      public class StringReversal {
    public static void main(String[] args) {
        String input = "Gandhi Institute For Technology";
        String reversed = reverseString(input);
        System.out.println("Original : " + input);
        System.out.println("Reversed : " + reversed);
    }

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
}
Out put -- Original : Gandhi Institute For Technology
           Reversed : ygolonhceT roF etutitsnI ihdnaG

