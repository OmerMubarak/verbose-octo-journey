package com.qa.qacommunity;

import java.io.*;
import java.lang.*;

public class StringManipulation {
	public static void main(String[] args) {
		String sentence = new String("This is the task that I am doing currently.");
		//System.out.println(countReturn(sentence));
		//System.out.println(verticalPrint(sentence));
		//System.out.println(reverseVerticalPrint(sentence));
		findStringMethod(sentence);
		
	}

	public static int countReturn(String words) {
		String space = " ";
		int countWords = 1;
		
		for (int i = 0; i < words.length(); i++) {
			String currentChar = words.substring(i, i+1);
			if (currentChar.equals(space)) {
				countWords++;
			}

		}
		return countWords;
	}

	public static String verticalPrint(String words) {
		String space = " ";
		int lastPos = 0;
		for (int i = 0; i <words.length(); i++) {
			String currentChar = words.substring(i, i+1);
				if (currentChar.equals(space)) {
					System.out.println(words.substring(lastPos, i +1));
					lastPos = i+1;
				}
		}
		return words.substring(lastPos, words.length());
		
	}
//
	public static String reverseVerticalPrint(String words) {
		String space = " ";
		int lastPos = words.length();
		for (int i = (words.length()) - 1 ; i > 0; i--) {
			String currentChar = words.substring(i, i+1);
				if (currentChar.equals(space)) {
					System.out.println(words.substring(i+1, lastPos));
					lastPos = i;
				}
		}
		return words.substring(0, lastPos);
		
	}
	
	public static void findStringMethod(String words) {
		String space = " ";
		String message = "task";
		boolean bool = false;
		int lastPos = words.length();
		for (int i = (words.length()) - 1 ; i > 0; i--) {
			String currentChar = words.substring(i, i+1);
				if ((words.substring(i, words.length()-1).equals(message))) {
					bool = true;
					System.out.println("The Answer is !!: " + bool);
					lastPos = i;
				}
		}
		System.out.println("The answer is :" + bool);
	}
}
		//	public static void findStringMethod(String words) {
//		CharSequence seq = "task";
//		boolean bool = words.contains(seq);
//		System.out.println("Found task?: "+ bool);
//		
//		CharSequence seq2 = "tasks";
//		boolean bool2 = words.contains(seq2);
//		System.out.println("Found tasks?: "+ bool2);
//	}
//}

// String rainy = new String("yesterday it was raining, ");
//String sunny = new String("today it is sunny");
//System.out.println(rainy.toUpperCase + sunny.toUpperCase);
//System.out.println(sunny.substring(0, 12)+ rainy.substring(17, 24));