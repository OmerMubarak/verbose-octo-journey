package exercise2;

public class Calculator {

	public static void main(String[] args) {
		System.out.println(masterCalc(9,2,5));

	}

	public static double masterCalc(double number1, double number2, int operation) {
		double resultAdd;
		if(operation == 1) {
			resultAdd = number1 + number2;
			return resultAdd;
		}
			else if (operation == 2) {
				resultAdd = number1 * number2;
				return resultAdd;
		}
			else if (operation == 3) {
				resultAdd = number1 - number2;
				return resultAdd;
			}
			else if (operation == 4) {
				resultAdd = number1 / number2;
				return resultAdd;
			}
			else
				System.out.println("Please input an operation from 1-4.");
			return 0;
	}
}
//	public static int addition(int number1, int number2) {
//		int resultAdd;
//		resultAdd = number1 + number2;
//		return resultAdd;
//	}
//
//	public static int multiply(int number1, int number2) {
//		int resultAdd;
//		resultAdd = number1 * number2;
//		return resultAdd;
//	}
//
//	public static int subtraction(int number1, int number2) {
//		int resultAdd;
//		resultAdd = number1 - number2;
//		return resultAdd;
//	}
//
//	public static double division(double number1, double number2) {
//		double resultAdd;
//		resultAdd = number1 / number2;
//		return resultAdd;
//	}
//
//}
