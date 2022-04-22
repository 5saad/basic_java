package com.qa.helloworld;

public class Encapsulation {
	
	private String name;
	private int accountNumber;
	private long sortcode;
	private double balance;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public long getSortcode() {
		return sortcode;
	}
	public void setSortcode(long sortcode) {
		this.sortcode = sortcode;
	}
	public Encapsulation(String name, int accountNumber, double balance, long sortcode) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.sortcode = sortcode;
	}
	public Encapsulation() {
	}
	@Override
	public String toString() {
		return "Encapsulation [Name: " + name + ", Account Number: " + accountNumber + ", Sortcode: " + sortcode
				+ ", balance: £" + balance + "]";
	}
	
	

}
