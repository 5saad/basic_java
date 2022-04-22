package com.qa.helloworld;

public class EncapsulationRunner {
	
	public static void main(String[] args) {
		
		Encapsulation info = new Encapsulation();
		
		info.setName("John Doe");
		info.setAccountNumber(11568413);
		info.setSortcode(602665);
		info.setBalance(105620.62);
		
		System.out.println(info.getName());
		System.out.println(info.getAccountNumber());
		System.out.println(info.getSortcode());
		System.out.println(info.getBalance());
		
		System.out.println(info);
	}

}
