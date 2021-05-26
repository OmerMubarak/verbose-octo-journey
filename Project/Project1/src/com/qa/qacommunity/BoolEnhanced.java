package com.qa.qacommunity;

public class BoolEnhanced {
	public static void main(String[] args) {
		int number = 20;
		boolReturn(number);


	}
	
	public static int boolReturn(int parameter) {
		if (parameter %2 == 0) {
			System.out.println(true);
			}
		else 
			System.out.println(false);
		
		return parameter;
	}
}
