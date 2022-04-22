package com.qa.helloworld;

public class PetRunner {

	public static void main(String[] args) {
		
		Pet cow = new Pet();
		
		cow.noise();
		cow.doThing();
		
		
		Cat cat = new Cat();
		
		cat.noise();
		cat.doThing();
		
		Dog dog = new Dog();
		
		dog.noise();
		dog.doThing();
		
	}
}
