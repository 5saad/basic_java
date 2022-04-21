package com.qa.helloworld;

public class calculator {

	public static void main(String[] args) {
		
		addTwoIntegers(1, 5);
		multiplyTwoNumbers(2, 10);
		subtractTwoNumbers(100, 50);
		divideTwoNumbers(30, 7);
		
	}

	private static void divideTwoNumbers(double i, double j) {
		System.out.println(i / j);
		
	}

	private static void subtractTwoNumbers(float i, float j) {
		System.out.println(i - j);
		
	}

	private static void multiplyTwoNumbers(float i, float j) {
		System.out.println(i * j);
		
	}

	private static void addTwoIntegers(int i, int j) {
	
		System.out.println(i + j);
		
	}


}
