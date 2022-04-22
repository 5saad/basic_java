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

		// countWords("my string has words");
		// verticalWords("this is a sentence to list");
		reverseVertical("will this work for all");

	}

	private static void reverseVertical(String string) {

		int charCount = 0;

		for (int i = string.length(); i > 0; i--) {
			
			if (string.substring(i - 1, i).equals(" ")) {
				int end = string.length() - charCount;
				System.out.println(string.substring(i, end));
				charCount = 0;

			} else if (i == 1) {

				System.out.println(string.substring(0, string.length() - charCount));

			} else {

				charCount++;
			}

		}

	}

	private static void verticalWords(String string) {

		int charCount = 0;

		for (int i = 0; i < string.length(); i++) {

			if (string.substring(i, i + 1).equals(" ")) {
				System.out.println(string.substring(i - charCount, i + 1));
				charCount = 0;
			} else if (i == string.length() - 1) {
				System.out.println(string.substring(i - charCount));
			} else {
				charCount++;
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
