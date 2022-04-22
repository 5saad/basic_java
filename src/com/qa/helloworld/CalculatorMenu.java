package com.qa.helloworld;

import java.util.Scanner;

public class CalculatorMenu {

	Scanner scan = new Scanner(System.in);

	public void menu() {

		int num1;
		int num2;
		boolean calcOn = true;

		System.out.println("WELCOME TO THE CALCULATOR");
		System.out.println();

		while (calcOn) {
			System.out.println("=".repeat(30));
			System.out.println("What would you like to use?");
			System.out.println("=".repeat(30));
			System.out.println("\t1). Addition");
			System.out.println("\t2). Subtraction");
			System.out.println("\t3). Division");
			System.out.println("\t4). Multiplication");
			System.out.println("=".repeat(30));
			System.out.println("\t0). Exit");
			
			String selection = scan.nextLine();
			
			switch (selection) {
				
			case "1":
				System.out.println("You selected addition");
				System.out.println("Please enter your first number");
				num1 = scan.nextInt();
				System.out.println("Please enter your second number");
				num2 = scan.nextInt();
				scan.nextLine();
				System.out.println("*".repeat(30));
				System.out.print("Your answer is: ");
				System.out.println(CalculatorScanner.add(num1, num2));
				System.out.println("*".repeat(30));
				
				break;
			case "2":
				System.out.println("You selected subtraction");
				System.out.println("Please enter your first number");
				num1 = scan.nextInt();
				System.out.println("Please enter your second number");
				num2 = scan.nextInt();
				scan.nextLine();
				System.out.println("*".repeat(30));
				System.out.print("Your answer is: ");
				System.out.println(CalculatorScanner.sub(num1, num2));
				System.out.println("*".repeat(30));
				break;
			case "3":
				System.out.println("You selected division");
				System.out.println("Please enter your first number");
				num1 = scan.nextInt();
				System.out.println("Please enter your second number");
				num2 = scan.nextInt();
				scan.nextLine();
				System.out.println("*".repeat(30));
				System.out.print("Your answer is: ");
				System.out.println(CalculatorScanner.div(num1, num2));
				System.out.println("*".repeat(30));
				break;
			case "4":
				System.out.println("You selected multiplication");
				System.out.println("Please enter your first number");
				num1 = scan.nextInt();
				System.out.println("Please enter your second number");
				num2 = scan.nextInt();
				scan.nextLine();
				System.out.println("*".repeat(30));
				System.out.print("Your answer is: ");
				System.out.println(CalculatorScanner.mul(num1, num2));
				System.out.println("*".repeat(30));
				break;
			case "0":
				System.out.println("*".repeat(30));
				System.out.println("Goodbye");
				System.out.println("*".repeat(30));
				calcOn = false;
				break;
			default:
				System.out.println("*".repeat(30));
				System.out.println("INVALID INPUT!! TRY AGAIN!");
				System.out.println("*".repeat(30));
			}
		}

	}

}
