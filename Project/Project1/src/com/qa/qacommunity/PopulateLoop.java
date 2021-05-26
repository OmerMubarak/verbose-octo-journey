package com.qa.qacommunity;

public class PopulateLoop {

	
	public static void main(String[] args) {
		int[] ageArray = new int[10];
		for (int i = 0; i<=9; i++) {
			ageArray[i] = i;
			System.out.println(i*10);
		}
	}
}
