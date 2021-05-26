
package com.qa.qacommunity;

public class BlackJack {

	public static void main(String[] args) {
		System.out.println(blackJackNum(22, 21));

	}

	public static int blackJackNum(int player1, int player2) {
		if (player1 > 21 && player2 > 21) {
			return 0;
		} else {
			if (player1 > player2) {
				if (player1 > 21) {
					return player2;
				} else {
					return player1;
				}

			} else {
				if (player2 > 21) {
					return player1;
				} else {
					return player2;
				}
			}
		}
	}
}
