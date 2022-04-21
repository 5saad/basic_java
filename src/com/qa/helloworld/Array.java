package com.qa.helloworld;

public class Array {

	public static void main(String[] args) {
		
		int array[] = new int[10];
		
//		array[0] = 1;
//		array[1] = 2;
//		array[2] = 3;
//		array[3] = 4;
//		array[4] = 5;
//		array[5] = 6;
//		array[6] = 7;
//		array[7] = 8;
//		array[8] = 9;
//		array[9] = 10;
		
		
//		for (int i : array) {
//			
//			array[i] = i;
//			System.out.println(array[i]);
//		}
//		
		for (int i = 0; i < array.length; i++) {
			
			array[i] = i*10;
			System.out.println(array[i]);
		}
	}
}
