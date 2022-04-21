package com.qa.helloworld;

public class Coins {

	public static void main(String[] args) {

		moneyRecieved();

	}

	private static void moneyRecieved() {

		double cost = 4.58;
		double moneyGiven = 20;
		boolean bool = true;
		double change = moneyGiven - cost;

		while (bool) {

			//System.out.println(change);
			if (change >= 20) {
				change = change - 20;
				System.out.println("£20 note");
			} else if (change >= 10) {
				change = change - 10;
				System.out.println("£10 note");
			} else if (change >= 5) {
				change = change - 5;
				System.out.println("£5 note");
			} else if (change >= 1) {
				change = change - 1;
				System.out.println("£1 coin");
			} else if (change >= 0.5) {
				change = Math.round(change * 1.0) / 1.0 - 0.5;
				System.out.println("50p coin");
			} else if (change >= 0.2) {
				change = change - 0.2;
				System.out.println("20p coin");
			} else if (change >= 0.1) {
				change = change - 0.1;
				System.out.println("10p coin");
			} else if (change >= 0.05) {
				change = change - 0.05;
				System.out.println("5p coin");
			} else if (change > 0.019) {
				change = change - 0.02;
				System.out.println("2p coin");
			} else if (change >= 0) {
				change = change - 0.01;
				System.out.println("1p coin");
			} else {
				bool = false;
			}
		}
	}

}
