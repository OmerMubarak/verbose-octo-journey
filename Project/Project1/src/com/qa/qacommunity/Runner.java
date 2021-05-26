package com.qa.qacommunity;

public class Runner {
	
	public static void main(String[] args) {
		Person omer = new Person("Omer", 26, 5.6, true);
		Person jill = new Person("Jill", 99, 5.3, false, 9);
		omer.aboutMe();
		omer.isAdmin();
		jill.aboutMe();
		jill.isAdmin();
		jill.hasTeeth();
	}
}