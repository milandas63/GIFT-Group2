public class PrimeNo {
	public static void main(String[] args) {
		int start = 1000;
		int end = 4000;
		int count = 0;
		boolean yesPrime;

		for(int i=start; i<=end; i++) {
			yesPrime = true;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					yesPrime = false;
					break;
				}
			}
			if(yesPrime) {
				System.out.print(i+" ");
				count++;
				if(count>=10) {
					System.out.println();
					count = 0;
				}
			}
		}
	}
}
