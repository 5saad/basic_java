package com.qa.helloworld;

public class BottlesOfBeer {

	public static void main(String[] args) {
		
		int numBottles = 99;
		
		for (int i=numBottles ; i >= 0 ; i--) {
			
			
			if (numBottles > 1) {
				System.out.println(numBottles + " bottles of beer on the wall, " + numBottles+ " bottles of beer.");
				System.out.println("Take one down and pass it around, " + (numBottles-1) + " bottles of beer on the wall.");
				System.out.println("");
				numBottles--;
			} else if (numBottles == 1) {
				System.out.println(numBottles + " bottle of beer on the wall, " + numBottles+ " bottle of beer.");
				System.out.println("Take it down and pass it around, " + (numBottles-1) + " bottles of beer on the wall.");
				System.out.println("");
				numBottles--;
			} else {
				System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
				System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
			}
			
		}
	}
	
}
