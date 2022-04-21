package com.qa.helloworld;

public class Taxes {

	public static void main(String[] args) {
		
		percTaxed(90000);
		amountTaxed(90000);
		
	}

	private static void amountTaxed(double i) {
		if (i >=0 && i < 15000) {
			System.out.println("£" + 0 + " tax");
		} else if (i >= 15000 && i < 20000) {
			System.out.println("£" + i*0.1 + " tax");
		} else if (i >= 20000 && i < 30000) {
			System.out.println("£" + i*0.15 + " tax");
		} else if (i >= 30000 && i < 45000) {
			System.out.println("£" + i*0.2 + " tax");
		} else if (i >= 45000) {
			System.out.println("£" + i*0.25 + " tax");
		}
		
	}

	private static void percTaxed(int i) {
		
		if (i >=0 && i < 15000) {
			System.out.println("Tax to pay is 0%");
		} else if (i >= 15000 && i < 20000) {
			System.out.println("Tax to pay is 10%");
		} else if (i >= 20000 && i < 30000) {
			System.out.println("Tax to pay is 15%");
		} else if (i >= 30000 && i < 45000) {
			System.out.println("Tax to pay is 20%");
		} else if (i >= 45000) {
			System.out.println("Tax to pay is 25%");
		}
		
	}
}
