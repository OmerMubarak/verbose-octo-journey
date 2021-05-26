package com.qa.qacommunity;

public class Results {
	public static int total;
	public static double percentage;
	public static double percentagephys;
	public static double percentagechem;
	public static double percentagebio;

	public static void main(String[] args) {

		System.out.println(revisitedResults(14, 15, 15));
	}

	public static String revisitedResults(int Phys, int Chem, int Bio) {

		total = Phys + Chem + Bio;
		percentage = total * 100 / 450;
		percentagephys = Phys * 100 / 150;
		percentagechem = Chem * 100 / 150;
		percentagebio = Bio * 100 / 150;
		String result;
		if (percentagephys > 60 && percentagechem > 60 && percentagebio > 60) {
			result = "Ya passed all exams.";
			return result;
		} else if (percentagephys < 60 && percentagechem > 60 && percentagebio > 60) {
			result = "Ya failed physics exam..";
			return result;
		} else if (percentagephys > 60 && percentagechem < 60 && percentagebio > 60) {
			result = "Ya failed Chem exam..";
			return result;
		} else if (percentagephys > 60 && percentagechem > 60 && percentagebio < 60) {
			result = "Ya failed Bio exam..";
			return result;
		} else if (percentagephys < 60 && percentagechem < 60 && percentagebio > 60) {
			result = "Ya failed Physics and Chem exam..";
			return result;
		} else if (percentagephys < 60 && percentagechem > 60 && percentagebio < 60) {
			result = "Ya failed Physics and Bio exam..";
			return result;
		} else if (percentagephys > 60 && percentagechem < 60 && percentagebio < 60) {
			result = "Ya failed Chem and Bio exam..";
			return result;
		} else
			result = "You Failed ALL";
		return result;

	}
}
