package com.day9;

public class ExceptionExample {

	public static void main(String[] args) {
		int x = 71;
		int y = 0;
		String name = "NARENDRA MODI";
		char vowels[] = { 'A','E','I','O','U' };
		
		try {
			System.out.println("Start of try block");
			System.out.println(vowels[5]);
			System.out.println(name.charAt(10));
			double z = x/y;
			System.out.println(z);
			System.out.println("There is no exception");
		} catch(ClassCastException e) {
			System.err.println("ClassCastException");
		} catch(NumberFormatException e) {
			System.err.println("NumberFormatException");
		} catch(ArithmeticException e) {
			System.err.println("ArithmeticException");
		} catch(StringIndexOutOfBoundsException e) {
			System.err.println("StringIndexOutOfBoundsException");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("ArrayIndexOutOfBoundsException");
		} catch(WrongException e) {
			System.err.println("WrongException");
		} finally {
			System.out.println("finally block must be executed");
		}
	}
}


class WrongException extends RuntimeException {
	
}