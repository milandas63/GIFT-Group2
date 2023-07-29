public class ReserveString {
	public static void main(String[] args) {
		text = "Gandhi Institute For Technology";
		reverse = "";
		words = text.split(" ");
		for(int i=0; i<words.length; i++) {
			alphas = words[i].toCharArray();
			for(int j=alphas.length-1; j>=0; j--) {
				reverse = reverse + alphas[j];
			}
			reverse = reverse + " ";
		}
		System.out.println("Original: "+text);
		System.out.println("Reverse:  "+reverse);
	}
}

Output:
         ihdnaG etutitsnI roF ygolonhceT
