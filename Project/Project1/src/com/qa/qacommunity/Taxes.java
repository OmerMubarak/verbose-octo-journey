package com.qa.qacommunity;

public class Taxes {

	public static double salary;
	public static double tax;

	public static void main(String[] args) {
		salary = 70000;
		percentSalary(salary);
		System.out.println(exactAmount(salary));
	}

	public static double percentSalary(double salary2) {

		if (salary2 < 15000) {
			tax = 0;
		} else {
			if (salary2 >= 15000 && salary2 <= 19999) {
				tax = 0.1;
			} else if (salary2 >= 20000 && salary2 <= 29999) {
				tax = 0.15;
			} else if (salary2 >= 30000 && salary2 <= 44999) {
				tax = 0.2;
			} else {
				tax = 0.25;
			}
		}
		return tax;
	}

	public static double exactAmount(double salary) {

		if (salary < 15000) {
			return salary * tax;
		} else {
			if (salary >= 15000 && salary <= 19999) {
				return salary * tax;
			} else if (salary >= 20000 && salary <= 29999) {
				return salary * tax;
			} else if (salary >= 30000 && salary <= 44999) {
				return salary * tax;
			} else {
				return salary * tax;
			}
		}
	}
}
