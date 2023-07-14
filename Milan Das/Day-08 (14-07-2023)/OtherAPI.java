package com.day8;

import java.io.PrintStream;
import java.text.DateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class OtherAPI {

	public static void main(String[] args) {
		String out = "GIFT";
		PrintStream ps = System.out;
		ps.println("HELLO WORLD!");
		
		String text = "Quick Brown Fox Jumps Over The Lazy Dog";
		StringTokenizer tokens = new StringTokenizer(text);
		while(tokens.hasMoreTokens()) {
			System.out.println(tokens.nextToken());
		}

		text = "Quick,Brown,Fox,Jumps,Over,The,Lazy,Dog";
		tokens = new StringTokenizer(text,",");
		while(tokens.hasMoreTokens()) {
			System.out.println(tokens.nextToken());
		}
		
		Date today = new Date();
		System.out.println(today);
		DateFormat format = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(format.format(today));

	}

}

abstract class Mathematics {
	public double getPIvalue() {
		return 3.141;
	}

	public abstract String logValue();
}

class Trigonometry extends Mathematics {
	public String logValue() {
		return "";
	}
}
