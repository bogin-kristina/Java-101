/*
* Kristina Bogin
* 
* February 15, 2024
* 
* CS A170
*/

import java.util.Scanner;

/**
 * Task 1 from Lab 3 in Chapter 2. 
 * This program functions as a change machine.
 */
public class ChTwoLabThreeDivision {

	public static void main(String[] args) {
		
		// Creating an instance of the Scanner class
		Scanner in = new Scanner(System.in);
		
		final int DOLLAR = 100;
		final int QUARTER = 25;
		final int DIME = 10;
		final int NICKEL = 5;
		
		
		
		int pennies, dollars, quarters, dimes, nickels;
		
		System.out.println("How many pennies do you have: ");
		pennies = in.nextInt();
		
		dollars = pennies / DOLLAR;
	    pennies = pennies % DOLLAR;//pennies left after dollars calculated
	    
	    quarters = pennies / QUARTER;
	    pennies = pennies % QUARTER;//pennies left after quarters calculated
	    
	    dimes = pennies / DIME;
	    pennies = pennies % DIME;//pennies left after dimes calculated
	    
	    nickels = pennies / NICKEL;
	    pennies = pennies % NICKEL;//pennies left after nickels calculated
	      
	    
		
		System.out.printf("%nYour change is %d dollar, %d quarter, %d dime, %d nickel, and %d pennies.", 
				dollars, quarters, dimes, nickels, pennies);
		
	}

}
