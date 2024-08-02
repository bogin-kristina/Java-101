/*
* Kristina Bogin
* 
* February 7, 2024
* 
* CS A170
*/

import java.util.Scanner;

/**
 * Task 2 from Lab 2 in Chapter 2. 
 * This program calculates and prints weekly paycheck. 
 */
public class ChTwoLabTwoCalcPaycheck {

	public static void main(String[] args) {
		// Creating an instance of the Scanner class
		Scanner in = new Scanner(System.in);

		double weeklyHours, overTimeHours, payRate;  // Declaring variables
		
		// Prompting user to input a value
		System.out.print("How many hours did you work this week? "); 
		weeklyHours = in.nextDouble();
		
		System.out.print("How many hours overtime? ");
		overTimeHours = in.nextDouble();
		
		System.out.print("What is your hourly wage? ");
		payRate = in.nextDouble();
		
		
		//Calculating a paycheck total
		
		double overTimePayRate = payRate*1.5;
		
	    double regPaycheck = (weeklyHours - overTimeHours) * payRate;
	    
	    double overTimePaycheck = overTimeHours *overTimePayRate;
	    
	    double totalPaycheck = regPaycheck + overTimePaycheck;
		
		System.out.printf("This week I worked %d hours and my paycheck is %.2f", 
				(int)weeklyHours, totalPaycheck); 

	
	}

}
