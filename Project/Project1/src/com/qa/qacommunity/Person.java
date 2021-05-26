package com.qa.qacommunity;

public class Person {
	String name;
	int age;
	double height;
	boolean admin;
	int teeth;
	
	public Person (String name, int age, double height, boolean admin) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.admin = admin;
	}
	
	public Person (String name, int age, double height, boolean admin, int teeth) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.admin = admin;
		this.teeth = teeth;
	}
	
	public void aboutMe() {
		System.out.println("I am " + name + " My height is "+ height +"m tall"+ " I am " + age + " years old" );
		
	}
	
	public void hasTeeth() {
		System.out.println("I have this many teeth: " + teeth);
	}
	
	public void isAdmin() {
		System.out.println("is Admin? " + admin);
	}
}
