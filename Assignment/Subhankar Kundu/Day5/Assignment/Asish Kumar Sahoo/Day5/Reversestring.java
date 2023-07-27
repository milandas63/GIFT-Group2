/*
	1.    Write a program to reverse a String
	      Example: Gandhi Institute For Technology
	      Result:  ygolonhceT roF etutitsnI ihdnaG
	
	2.    Write a program to reverse the words in a given String?
	      Example: God is Omnipotent and Omniscient
	      Result:  Omniscient and Omnipotent is God
	
	3.    Write a program to reverse every word within a String?
	      Example: Gandhi Institute For Technology
	      Result:  ihdnaG etutitsnI roF ygolonhceT
 */

public class ReserveString {
	public static void main(String[] args) {
		// Question-1
		String text = "Gandhi Institute For Technology";
		String reverse = "";
		char[] alphas = text.toCharArray();
		for(int i=alphas.length-1; i>=0; i--) {
			reverse = reverse+alphas[i];
		}
		
		System.out.println("Original: "+text);
		System.out.println("Reverse:  "+reverse);

		System.out.println("----------------------------------------------------");
		
		text = "God is Omnipotent and Omniscient";
		reverse = "";
		String[] words = text.split(" ");
		for(int i=words.length-1; i>=0; i--) {
			reverse = reverse + words[i]+ " ";
    }
