package com.qa.helloworld;

public class CalculatorScanner {

	public static double result;				

	public static double div(double i, double j) {
		result = i/j;
		return result;
		
	}

	public static double sub(double i, double j) {
		result = i-j;
		return result;
		
	}

	public static double mul(double i, double j) {
		result = i*j;
		return result;
		
	}

	public static double add(double i, double j) {
		result = i+j;
		return result;
		
	}
	
	public static double mod(double i, double j) {
		result = i%j;
		return result;
		
	}
	

}
