package com.wiley.assignment1;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;


public class Factorial {
	
	 private Scanner scanner;
	 private PrintStream printStream;
	 private int inputNum;
	 

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

		 // Use a try/catch block to check whether number is valid; return error message if input not a number.
		 try {
			 inputNum = Integer.parseInt(scanner.nextLine());

			 // Checks whether num is within the bounds of 1 and 10.
			 // *Note: Test case seems to be different (ln and no ln) for < 1 and > 10 numbers, hence two code blocks
			 // where there could have been one for efficiency.

			 if (inputNum < 1 || inputNum > 10) { // Case 1: negative numbers/zero.
				 this.printStream.print("Invalid entry. Please enter an integer between 1 and 10, inclusive.");
				 return -1;
			 }
			 return inputNum;

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

		 // Case 1: 1 and 2 require no calculations.
		 if (num <= 2) {
			 result = num;
		 } else { // Case 2: increment to num, multiplying to result each time we increment.
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
