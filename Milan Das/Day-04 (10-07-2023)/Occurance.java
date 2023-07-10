public class Occurance {
	public static void main(String[] args) {
		int count[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		String text = "We are students of GIFT College";
		char c;
		for(int i=0; i<text.length(); i++) {
			c = text.charAt(i);
			if(c>=65 && c<=90) {
				count[c-65]++;
			} else if(c>=97 && c<=122) {
				count[c-97]++;
			}
		}

		for(int i=0; i<count.length; i++) {
			if(count[i]>0) {
				System.out.println( (char)(i+65) + " = " + count[i]);
			}
		}
	}
}
