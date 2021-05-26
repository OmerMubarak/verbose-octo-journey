package com.qa.qacommunity;

public class Runner2 {
	public static int total;
	public static double percentage;
	public static double percentagephys;
	public static double percentagechem;
	public static double percentagebio;
	public static int passes;

	public static void main(String[] args) {

		System.out.println(revisitedResults(120, 90, 90));
	}

	public static String revisitedResults(int Phys, int Chem, int Bio) {

		total = Phys + Chem + Bio;
		percentage = total * 100 / 450;
		percentagephys = Phys * 100 / 150;
		percentagechem = Chem * 100 / 150;
		percentagebio = Bio * 100 / 150;
		String result;
		if (percentagephys < 60 && percentagechem < 60 && percentagebio < 60) {
			result = "Ya failed.";
			return result;

		} else {
			result = "Physics: " + Phys + " Percentage Phys " + percentagephys + " Chemistry: " + Chem
					+ " Percentage Chem " + percentagechem + " Biology: " + Bio + " Percentage Bio " + percentagebio
					+ " Total: " + total;
			return result;

		}
	}
}