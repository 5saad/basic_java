package com.qa.helloworld;

public class UniqueSum {

	public static void main(String[] args) {

		input(5, 5, 5);

	}

	private static void input(int i, int j, int k) {

		if (i != j && i != k && j != k) {
			System.out.println(i + j + k);
		} else if (i == j && k != i) {
			System.out.println(k);
		} else if (i == k && j != i) {
			System.out.println(j);
		} else if (j == k && i != k) {
			System.out.println(i);
		} else {
			System.out.println("0");
		}

	}
}