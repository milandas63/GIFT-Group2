package com.algorithm;

import com.oops.Routine;

public class Example {
	Example() {
//		System.out.println(padL(100200,35));
//		System.out.println(padC(100200,35));
//		System.out.println(padR(100200,35));

		Routine r = new Routine();
		System.out.println(r.padL(100300,35));
		System.out.println(r.padC(100300,35));
		System.out.println(r.padR(100300,35));
	}

	public static void main(String[] args) {
		new Example();
	}

}
