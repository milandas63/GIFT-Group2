package com.oops;

public class Family {
	
	public static String name = "Mahatma Gandhi";
	public String child = "Harilal Gandhi";

	public static void main(String[] args) {
		Family f1 = new Family();
		Family f2 = new Family();
		Family f3 = new Family();
		System.out.println("f1= Father: "+f1.name+"  Child: "+f1.child);
		System.out.println("f2= Father: "+f2.name+"  Child: "+f2.child);
		System.out.println("f3= Father: "+f3.name+"  Child: "+f3.child);

		f2.name = "Biju Patnaik";
		f2.child = "Naveen Patnaik";
		System.out.println("f1= Father: "+f1.name+"  Child: "+f1.child);
		System.out.println("f2= Father: "+f2.name+"  Child: "+f2.child);
		System.out.println("f3= Father: "+f3.name+"  Child: "+f3.child);
	}

}

class Community {
	public static void main(String[] args) {
		System.out.println(Family.name);
	}
}