package exercise3;

public class CheckString {
	
	public static void main(String[] args) {
		checkThis("Standard for test.");
	}
	
	public static void checkThis(String input) {
		String message = "Standard for test.";
		if(input.equals(message)) {
			System.out.println("Test Pass");
		}
		else
			System.out.println("Test Fail");
	}
}
