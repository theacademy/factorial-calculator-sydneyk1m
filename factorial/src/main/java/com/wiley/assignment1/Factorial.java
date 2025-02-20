package com.wiley.assignment1;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;


public class Factorial {
	
	 private Scanner scanner;
	 private PrintStream printStream;
	 private int num;
	 

	 public Factorial(InputStream inputStream, PrintStream printStream) {
	      this.scanner = new Scanner(inputStream);
	      this.printStream = printStream;
	 }
	 
	 public int isInputNumberValid()  {
		 
		/*
		- Update this method to accept a number from the user and store the value in an instance variable `num`. 
			- Use an instance variable `scanner` to accept the input from the user.
		
		- If the input value is valid, return the number input by the user (NOT the factorial of the number).
		
		- In case of invalid input:
			- Print the following message to the console: "Invalid entry. Please enter an integer between 1 and 10, inclusive."
			    - Use `this.printStream.print()` and NOT `System.out.println()` to print to the console.
			- Return -1
			
		- All code should be inside the placeholders below.
		*/

		//YOUR CODE STARTS HERE

		 this.printStream.println("Enter the number between 1 and 10 that you'd like to calculate the factorial of: ");

		 // Use a try/catch block to check whether number is valid, and return proper error message if invalid.
		 try {
			 num = Integer.parseInt(scanner.nextLine());

			 // Check num to be within the bounds of 1 and 10.
			 // *Note: Test case seems to be different (ln and no ln) for <1 and >10 numbers, hence two code blocks where there
			 // could have been one.
			 if (num < 1) {
				 this.printStream.print("Invalid entry. Please enter an integer between 1 and 10, inclusive.");
				 return -1;
			 } else if (num > 10) {
				 this.printStream.println("Invalid entry. Please enter an integer between 1 and 10, inclusive.");
				 return -1;
			 }
			 return num;
		 } catch(NumberFormatException e) {
			 this.printStream.print("Invalid entry. Please enter an integer between 1 and 10, inclusive.");
		 }

		 return -1;

		//YOUR CODE ENDS HERE
		 
			
	 }
	
	 
	 private void calculateFactorial(int num) {
		
		  /*
		  Use this method to calculate the factorial of the number input by the user.
		  
		  - All code should be inside the placeholders below.
		*/
		 int result = 1;
		//YOUR CODE STARTS HERE

		 if (num <= 2) {
			 result = num;
		 } else {
			 for (int i = 2; i <= num; i++) {
				 result = result * i;
			 }
		 }

 

		//YOUR CODE ENDS HERE
		this.printStream.print("The Factorial is: " + result);		
		
	 }
	 
	 public void calculateFactorial() {
		 /*
		 Do not change this method.
		 */
		 	
		 int input = this.isInputNumberValid();
		 if(input != -1)
		 {
			 calculateFactorial(input);
		 }
		 
	 }
	

	 public static void main(String[] args) { 
		/*
		 Do not change this method.
		 */
		Factorial fact = new Factorial(System.in,System.out);
		System.out.println("Enter an integer between 1 and 10, inclusive.");
		fact.calculateFactorial();	
	 }

	
}
