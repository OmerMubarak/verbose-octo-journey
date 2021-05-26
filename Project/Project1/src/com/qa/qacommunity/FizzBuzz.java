package com.qa.qacommunity;

public class FizzBuzz {

	public static int number1;
	public static int bizz;
	
	public static void main(String[] args) {
			number1 = 73;
			System.out.println(returnMultiples(number1));
	}

	public static String returnMultiples(int number1) {
		int output = number1;
		if (number1 %3 == 0 && number1 %5==0) {
			return "FizzBuzz";
		} else if 
			(number1 %3 == 0) {
				return "Fizz";
		} else if
		(number1 %5 == 0) {
			return "Buzz";
		} else 
		return output + " is not divisible by 3 or 5";
	}
}
