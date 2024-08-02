/*
* Kristina Bogin
* 
* February 20, 2024
* 
* CS A170
*/

import java.util.Scanner;

/**
 * Task 4(1), Lab 1, Chapter 3. 
 * This program uses Multi-branching methods. (if -  else if -  else if -  else)
 */
public class RichterReading1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a magnitude on the Richter scale: ");
		double value = in.nextDouble();
		String effect;
		
		if (value >= 8) {
			effect = "Most structures fall";
		}
		else if (value >= 7) {
			effect = "Many buildings destroyed";
		}
		else if (value >= 6) {
			effect = "Many buildings considerably damaged, some collapse";
		}
		else if (value >= 4.5) {
			effect = "Damage to poorly constructed buildings";
		}
		else {
			effect = "No damage was done";
		}
		
		System.out.println(effect);

	}

}
