package com.qa.qacommunity;

public class UniqueSum {

	public static void main(String[] args) {
		System.out.println(integerValues(4, 4, 3));

	}

	public static int integerValues(int unique1, int unique2, int unique3) {

		if (unique1 == unique2 && unique1 == unique3 && unique2 == unique3) {
			return 0;
		} else {
			if (unique1 != unique2 && unique1 != unique3) {
				return unique1 + unique2 + unique3;
			} else if (unique1 != unique2 && unique1 == unique3) {
				return unique2;
			} else if (unique1 == unique2 && unique1 != unique3) {
				return unique3;
			} else {
				return unique1;
			}

		}
	}

}
