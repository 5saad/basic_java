package com.qa.helloworld;

public class Runner {
	
	public static void main(String[] args) {
		
		Person john = new Person("John", 52, 175, 9.5, "Carpenter");
		Person bill = new Person("Bill", 30, 130, 11.0, "Doctor");
		Person mary = new Person("Mary", 45, 137, 6, "Optician");
		Person harry = new Person("Harry", 24, 180, 7.0, "Cashier");
		
		john.greet();
		john.nameHeight();
		bill.greet();
		bill.nameHeight();
		mary.greet();
		mary.nameHeight();
		harry.greet();
		harry.nameHeight();
	}

}
