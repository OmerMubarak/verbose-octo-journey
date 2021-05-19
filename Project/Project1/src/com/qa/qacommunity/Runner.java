package com.qa.qacommunity;

public class Runner {

	public static void main(String[] args) {
		helloWorld();
		String message = "Hello Students";
		System.out.println(message);
		killerMethod("hello Killer Queen");
	}

	private static void killerMethod(String message) {
		System.out.println(message);
	}

	private static void helloWorld() {
		System.out.println("Hello World");
	}

}
