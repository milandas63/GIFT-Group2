/* Solve deep nesting of for loop to generate multiplication tables
    a)  Print all multiplication tables from 2 to 10? Five tables are supposed to
        be arranged horizontally and subsequently five more in the next row horizontally
        and so on */
public class Tables {
	public static void main() {
		System.out.println("Hello World-2!");

	}

	public static void main(String[] args) {
		int start = 2;
		int end = 25;
		
		for(int i=2; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				System.out.println(i+" x "+j+" = "+(i*j));
			}
		}
		
		System.out.println("------------------------------------------------");
		for(int h=start; h<=end; h+=5) {
			for(int i=1; i<=10; i++) {
				for(int j=h; j<=(h+4); j++) {
					System.out.print(padL(j,2)+" x "+padL(i,2)+" = "+padL((i*j),3)+"  ");
					//System.out.print(j+" x "+i+" = "+(i*j)+"  ");
					if(j>=end) break;
				}
				System.out.println();
			}
			System.out.println();
		}
	}

	public static String padL(int n, int len) {
		String retVal = ""+n;
		for(int i=retVal.length(); i<len; i++) {
			retVal = " "+retVal;
		}
		return retVal;
	}

}
