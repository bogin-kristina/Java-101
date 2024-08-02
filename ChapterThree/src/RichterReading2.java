/*
 * Kristina Bogin
 * 
 * February 20, 2024
 * 
 * CS A170
 */

/**
 * Task 4(2), Lab 1, Chapter 3.
 * This program only use if statements.
 *
 */

import java.util.Scanner;

public class RichterReading2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter a magnitude on the Richter scale: ");
		double value = in.nextDouble();
		
		String effect ="";
		
		if (value >= 8) {
			effect = "Most structures fall";
		}
		if (value >= 7) {
			effect = "Many buildings destroyed";                           
		}
		if (value >= 6) {
			effect = "Many buildings considerably damaged, some collapse";
		}
		if (value >= 4.5) {
			effect = "Damage to poorly constructed buildings";
		}
		
		// even if i enter 9, then every condition is going to be met
		// and the final value of effect is going to be from the last met condition 
		// in this case "Damage to poorly constructed buildings"
		
		
		System.out.println(effect);

	}

}
