package com.day9;

public class VoterIdCard {
	int[] ages = {36, 25, 11, 47, 61, -19, 77, 93, 0, 72, 12, 15, 84};
	
	public VoterIdCard() {
		int age = 0;
		for(int i=0; i<ages.length; i++) {
			try {
				age = ages[i];
				checkAge(age);
				System.out.println(age + " is a valid age");
			} catch(TooYoungAgeException e) {
				System.err.println(age + " " + e.getMessage());
			} catch(TooOldAgeException e) {
				System.err.println(age + " " + e.getMessage());
			} catch(NegativeAgeException e) {
				System.err.println(age + " " + e.getMessage());
			} catch(ZeroAgeException e) {
				System.err.println(age + " " + e.getMessage());
			}
		}
	}

	public static void main(String[] args) {
		new VoterIdCard();
	}

	public void checkAge(int age) throws TooYoungAgeException,
 										 TooOldAgeException,
										 NegativeAgeException,
										 ZeroAgeException {
		if(age<0) throw new NegativeAgeException("age is negative");
		else if(age==0) throw new ZeroAgeException("age is equals to 0");
		else if(age<18) throw new TooYoungAgeException("age is less than 18");
		else if(age>90) throw new TooOldAgeException("age is greater than 90");
	}
}

class AgeException extends Exception {
	public AgeException() {super();}
	public AgeException(String mess) {super(mess);}
}

class WrongAgeException extends AgeException {
	public WrongAgeException() {super();}
	public WrongAgeException(String mess) {super(mess);}
}

class TooYoungAgeException extends WrongAgeException {
	public TooYoungAgeException() {super();}
	public TooYoungAgeException(String mess) {super(mess);}
}

class TooOldAgeException extends WrongAgeException {
	public TooOldAgeException() {super();}
	public TooOldAgeException(String mess) {super(mess);}
}

class InvalidAgeException extends AgeException {
	public InvalidAgeException() {super();}
	public InvalidAgeException(String mess) {super(mess);}
}

class NegativeAgeException extends InvalidAgeException {
	public NegativeAgeException() {super();}
	public NegativeAgeException(String mess) {super(mess);}
}

class ZeroAgeException extends InvalidAgeException {
	public ZeroAgeException() {super();}
	public ZeroAgeException(String mess) {super(mess);}
}
