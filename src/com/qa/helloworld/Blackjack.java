package com.qa.helloworld;

public class Blackjack {

	public static void main(String[] args) {

		values(15, 22);
	}

	private static void values(int i, int j) {

		int num1 = 21 - i;
		int num2 = 21 - j;

		if (i > 0 && j > 0 && i < 22 && j < 22) {
			System.out.println("WOOO BLACKJACK!");
			if (num1 < num2) {
				System.out.println(i);
			} else {
				System.out.println(j);
			}
		} else if (i > 21 || j > 21) {
			System.out.println("greater than 21");
		} else {
			System.out.println("CAN'T USE 0");
		}
	}

}
