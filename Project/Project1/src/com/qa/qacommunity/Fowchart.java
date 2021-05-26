package com.qa.qacommunity;

public class Fowchart {

	public static int sum1;
	public static int sum2;
	public static void main(String[] args) {
		System.out.println(mixedPara(2,3,false));
	}


	public static int mixedPara(int int1,int int2,boolean bool1){
		sum1 = int1+int2;
		sum2 = int1*int2;
	if (bool1 == true){
		
		return sum1;
		}
		else {
			return sum2;
		}
	}
}


