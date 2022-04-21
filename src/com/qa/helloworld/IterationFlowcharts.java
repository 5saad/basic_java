package com.qa.helloworld;

public class IterationFlowcharts {
	public static void main(String[] args) {

		// flowchart1(100);
		// flowchart2(100);
		// oneToTen();
		// flowchart1For();
		// flowchart2For();
		oneToTen2();
	}

	private static void oneToTen2() {

		int i = 0;
		boolean notDone = true;

		while (notDone) {
			i++;
			for (int j = 1; j <= i; j++) {
				System.out.println(i);
			}
			if (i == 10) {
				notDone = false;
			}
		}

	}

	private static void flowchart2For() {
		for (int i = 100; i <= 200; i++) {

			if (i % 2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
		}

	}

	private static void flowchart1For() {
		for (int i = 100; i <= 200; i++) {
			System.out.println(i);
		}

	}

	private static void oneToTen() {

		for (int i = 1; i < 11; i++) {
			System.out.println(i);
			System.out.println(i);
			System.out.println(i);
			System.out.println(i);
			System.out.println(i);
			System.out.println(i);
			System.out.println(i);
			System.out.println(i);
			System.out.println(i);
			System.out.println(i);
		}

	}

	private static void flowchart2(int i) {

		boolean looping = true;

		do {
			if (i % 2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
			i++;

			if (i > 200) {
				looping = false;
			}

		} while (looping);

	}

	private static void flowchart1(int i) {

		boolean lessThan200 = true;

		while (lessThan200) {
			System.out.println(i);
			i++;

			if (i > 200) {
				lessThan200 = false;
			}
		}
	}

}
