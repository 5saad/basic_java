package com.qa.helloworld;

public class CalcCondtional {

	public static void main(String[] args) {

		divideTwoNumbers(5, 3);
	}

	private static void divideTwoNumbers(double num1, double num2) {

		if (num1 < num2) {
			System.out.println(num2 / num1);
		} else {
			System.out.println("answer less than 1");

		}
	}
}
