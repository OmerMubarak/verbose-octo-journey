package com.qa.qacommunity;

public class HelloWorld {

	public static void main(String[] args) {

		System.out.println(canSum(1, 2));
		System.out.println(canMultiply(3, 4));
		System.out.println(canDiv(10, 5));
	}

	public static int canSum(int num1, int num2) {
		return num1 + num2;

	}

	public static int canMultiply(int num1, int num2) {

		return num1 * num2;

	}

	public static String canDiv(double num1, double num2) {
		String result;
		if (num1 > num2) {
			result = "" + num1 / num2;
			return result;
		} else {
			result = "The division cannot be performed.";
			return result;
		}
	}

	public static void canSub() {

		int num1 = 8;
		int num2 = 4;
		int result = (num1 - num2);
		System.out.println(result);

	}
}
