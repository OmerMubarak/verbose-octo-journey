package com.qa.qacommunity;

public class Numbers {
	public static int digit;
	public static void main(String[] args) {
		digit = 15;
		System.out.println(addTDigits(digit));
		
	}

	public static int addTDigits(int digit) {
		boolean tooHigh = true;
		
		while(tooHigh) {
			System.out.println(digit);
			digit++;
			
			if(digit >= 99 || digit <= 10) {
				tooHigh = false;
			}
			
		}
		return digit;
	}
}
