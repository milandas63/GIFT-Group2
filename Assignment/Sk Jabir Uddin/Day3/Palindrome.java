public class Pyramidnumber {

	public static void main(String[] args) {
		int spaces = 40;
		 for(int i=1; i<=9; i++) {
			for(int j=1; j<=spaces; j++) System.out.print(" ");
			for(int j=1; j<=i; j++)      System.out.print(j);
			for(int j=(i-1); j>0; j--)   System.out.print(j);
			System.out.println();
			spaces--;
		}
	}

}
