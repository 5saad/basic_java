package com.qa.helloworld;

public class Person {
	
	private String name;
	private int age;
	private double height;
	private double shoeSize;
	private String job;
	
	
	public Person(String name, int age, double height, double shoeSize, String job) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.shoeSize = shoeSize;
		this.job = job;
		
		
		
	}
	
	public Person(String name, double height) {
		super();
		this.name = name;
		this.height = height;
	}

	public void greet( ) {
		System.out.println("Hello, my name is "+name+" and I am "+age+" years old.");
		System.out.println("My height is "+height+"cm and my shoe size is "+shoeSize+".");
		System.out.println("I work as a "+job+".");
	}
	
	public void nameHeight() {
		
		System.out.println("Height: "+height+"cm");
		System.out.println("Shoe size: "+shoeSize);
	}


}
