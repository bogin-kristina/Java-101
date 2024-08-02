/*
* Kristina Bogin
* 
* February 15, 2024
* 
* CS A170
*/

import java.util.Scanner;

/**
 * Task 2 from Lab 3 in Chapter 2. 
 * This program asks the user to enter an EVEN length string. Then, this program prints out the first half. 
 */
public class ChTwoLabThreeHalfString {

	public static void main(String[] args) {
		// Creating an instance of the Scanner class
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter an even length string: ");//getting user input
		String evenString = in.next();

		int halfIndex = evenString.length()/2; // storing index from the middle of the string
		
		String halfTheString = evenString.substring(0,halfIndex ); //getting the answer (first half of the string)
		
		System.out.printf("%nhalf the string is: %s", halfTheString); //printing output	
		
		
	}

}
