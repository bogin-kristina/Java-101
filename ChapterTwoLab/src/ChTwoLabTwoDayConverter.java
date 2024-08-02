/*
* Kristina Bogin
* 
* February 7, 2024
* 
* CS A170
*/

import java.util.Scanner;

/**
 * Task 4 from Lab 2 in Chapter 2. 
 * This program asks the user to enter a number of days and outputs 
 * the equivalent duration in hours, in minutes, and in seconds.
 */
public class ChTwoLabTwoDayConverter {

	public static void main(String[] args) {

		// Creating an instance of the Scanner class
				Scanner in = new Scanner(System.in);
				
				// Prompting user to input a number of days
				System.out.print("Enter a number of days: "); 
				int days = in.nextInt();
				
				
				final int HOURS_IN_DAY = 24;
				int hours = days * HOURS_IN_DAY;
				
				
				final int MIN_IN_DAY = 60 * HOURS_IN_DAY;
				int min = days * MIN_IN_DAY;
				
				
				final int SEC_A_DAY = 60 * MIN_IN_DAY;
				int sec = days * SEC_A_DAY;
				
				
				System.out.printf("%d days is %d hours or %d minutes or %d seconds", 
						days, hours, min, sec);
				
				
	}
}
