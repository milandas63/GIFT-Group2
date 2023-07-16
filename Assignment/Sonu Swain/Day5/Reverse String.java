public class ReserveString {
	public static void main(String[] args) {
		String text = "Gandhi Institute For Technology";
		String reverse = "";
		char[] alphas = text.toCharArray();
		for(int i=alphas.length-1; i>=0; i--) {
			reverse = reverse+alphas[i];
		}
		System.out.println("Original: "+text);
		System.out.println("Reverse:  "+reverse);
System.out.println("----------------------------");
  }
}
Output:
  Result:  ygolonhceT roF etutitsnI ihdnaG 

