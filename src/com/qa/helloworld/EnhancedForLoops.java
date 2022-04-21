package com.qa.helloworld;

public class EnhancedForLoops {

	public static void main(String[] args) {
		
//		Q1		
//		String[] nameArray = {"John", "Jeff","Dave", "Sam"};
//		
//		
//		for (String name : nameArray) {
//			System.out.println(name);
//		}
//		
//		
//		Q2
//		int[] squaredNumbers = new int[20];
//		int number = 1;
//		for (int i : squaredNumbers) {
//			squaredNumbers[i] = number*number;
//			System.out.println(squaredNumbers[i]);
//			number++;
//		}
//		Q3
//		int[] number = {1,2,3,4,5,6,7,8};
//		
//		for (int i : number) {
//			
//			if (i%2 ==0) {
//				System.out.println(true);
//			}else {
//				System.out.println(false);
//			}
//		}
//		Q4
		int[] squaredNumbers = new int[20];
		int number = 1;
		for (int i : squaredNumbers) {
			if (i%2 ==0) {
				squaredNumbers[i] = number*number*number;
				System.out.println(squaredNumbers[i]);
			}else {
				squaredNumbers[i] = number*number;
				System.out.println(squaredNumbers[i]);
			}
			number++;
		}
	}
}
