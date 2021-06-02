package exercise1;

public class HelloWorld {

	static String message;

	public static void main(String[] args) {
		setMessage("Hello World");
		System.out.println(getMessage());
	}

	public static void setMessage(String passMessage) {
		message = passMessage;
	}

	public static String getMessage() {
		return message;
	}
}
