package com.algorithm;

/*
	b)  Draw a diamond style of asterisks?
					        *        
					       ***       
					      *****      
					     *******     
					    *********    
					   ***********   
					  *************  
					 *************** 
					*****************
					 *************** 
					  *************  
					   ***********   
					    *********    
					     *******     
					      *****      
					       ***       
					        *        
 */

public class Diamond {

	public static void main(String[] args) {
		int spaces = 40;
		int stars = 1;
		
		for(int i=1; i<=17; i++) {
			for(int j=1; j<=spaces; j++) System.out.print(" ");
			for(int j=1; j<=stars; j++)	 System.out.print("*");
			System.out.println();
			if(i<9) {
				spaces--; stars+=2;
			} else {
				spaces++; stars-=2;
			}
		}
		
	}

}
