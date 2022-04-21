package com.qa.helloworld;

public class Flowchart {

	public static void main(String[] args) {

//		input(5, 2, true);
		flowchart(450);

	}

	private static void flowchart(int i) {

		if (i > 2000) {
			System.out.println("A");
			if (i > 6000) {
				System.out.println("C");
			} else {
				System.out.println("B");
				if (i > 4000) {
					System.out.println("D");
				} else {
					System.out.println("E");
				}
			}

		} else {
			System.out.println("1");
			if (i > 100) {
				System.out.println("3");
				if (i > 600) {
					System.out.println("5");
				} else {
					System.out.println("4");
					if (i > 500) {
						System.out.println("6");
					} else {
						System.out.println("7");
					}
				}
			} else {
				System.out.println("2");
			}
		}
	}

	private static void input(int num1, int num2, boolean b) {

		if (b) {
			System.out.println(num1 + num2);

		} else {
			System.out.println(num1 * num2);

		}
	}
}
