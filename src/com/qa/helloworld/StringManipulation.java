package com.qa.helloworld;

public class StringManipulation {

	public static void main(String[] args) {

//		Q1
//		String myString1 = "yesterday it was raining";
//		String myString2 = "today it is sunny";
//	
//		String newString = myString2 + ", " + myString1;
//		
//		System.out.println(newString.toUpperCase());
//		System.out.println(myString2.toUpperCase().substring(0,12) 
//				+ myString1.toUpperCase().substring(17));

		// Q2

		//countWords("my string has words");
		verticalWords("p yr amid");

	}

	private static void verticalWords(String string) {

		for (int i = 0; i < string.length(); i++) {

			if (string.substring(i, i + 1).equals(" ")) {
				System.out.println(string.substring(i));
			}else {
				System.out.println(string.substring(i));
			}
		}

	}

	private static void countWords(String string) {

		int wordCount = 1;

		for (int i = 0; i < string.length(); i++) {

			if (string.substring(i, i + 1).equals(" ")) {
				wordCount++;
			}
		}
		System.out.println("Number of words: " + wordCount);

	}

}
