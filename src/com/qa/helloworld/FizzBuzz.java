package com.qa.helloworld;

public class FizzBuzz {
	
	public static void main(String[] args) {
		
		input(4);
	}

	private static void input(int i) {
		
		if (i % 3 == 0 && i % 5 != 0) {
			System.out.println("Fizz");
		} else if (i % 5 == 0 && i % 3 !=0) {
			System.out.println("Buzz");
		} else if (i % 3 == 0 && i % 5 == 0){
			System.out.println("FizzBuzz");
		} else {
			System.out.println("No Fizz, No Buzz");
		}
		
	}

}
