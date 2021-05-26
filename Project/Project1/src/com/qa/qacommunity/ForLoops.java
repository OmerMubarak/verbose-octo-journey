package com.qa.qacommunity;

import java.util.ArrayList;

public class ForLoops {
	public static void main(String[] args) {
		ArrayList<Integer> numbersArray = new ArrayList<>();
		numbersArray.add(1);
		numbersArray.add(2);
		numbersArray.add(3);
		numbersArray.add(4);
		numbersArray.add(5);
		numbersArray.add(6);
		numbersArray.add(7);
		numbersArray.add(8);
		numbersArray.add(9);
		numbersArray.add(10);
		numbersArray.add(11);
		numbersArray.add(12);
		numbersArray.add(13);
		numbersArray.add(14);
		numbersArray.add(15);
		numbersArray.add(16);
		numbersArray.add(17);
		numbersArray.add(18);
		numbersArray.add(19);
		numbersArray.add(20);
		
		for (int numbers: numbersArray) {
			System.out.println(numbers*numbers);
		}
		
		
		
		
		
	}
	
//		ArrayList<String> namesArray = new ArrayList<>();
//		namesArray.add("Omer");
//		namesArray.add("Jacob");
//		namesArray.add("Yusuf");
//		namesArray.add("Yunus");
//		
//		
//		for (String names: namesArray) {
//			System.out.println(names);
//		}
}
