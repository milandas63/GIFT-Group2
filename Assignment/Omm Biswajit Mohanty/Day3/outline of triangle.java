/* Draw a outline of a triangle using stars */

public class Pyramidoutline {

	public static void main(String[] args) {
		int spaces = 40;
		int stars = 1;
		 for(int i=1; i<=10; i++) {
			for(int j=1; j<=spaces; j++) System.out.print(" ");
			for(int j=0; j<stars; j++) {
				if(j>0 && j<(stars-1) && i<10) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
			spaces--; stars+=2;
		}
	}
}
Output:
					   
                                                 *
					        * *
					       *   *
					      *     *
					     *       *
					    *         *
					   *           *
					  *             *
					 *               *
					*******************

