package com.qa.qacommunity;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

	public static void main(String[] args) {
		List<String> games = new ArrayList<>();
		games.add("League of Legends");
		games.add("Dota 2");
		games.add("Call of Duty");
		games.add("Clash of Clans");
		games.add("Apex Legends");
		games.set(3, "Legends of Runeterra");
		games.remove(2);
		
		//Iterate through arraylist - normal
		//for (int i = 0; i < games.size(); i++) {
			//System.out.println(games.get(i));
		
		//Iterate through arraylist - for enhanced
		//for (String i : games) {
			//System.out.println(i);
		//System.out.println(games.get(3));
		Collections.sort(games);
		Collections.reverse(games);
		System.out.println(games);
		
	}
	
	}


