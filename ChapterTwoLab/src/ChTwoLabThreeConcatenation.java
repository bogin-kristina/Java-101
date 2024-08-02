/*
* Kristina Bogin
* 
* February 15, 2024
* 
* CS A170
*/

import java.util.Scanner;

/**
 * Task 3 from Lab 3 in Chapter 2. 
 * This program asks the user to enter any string. 
 * Then, this program prints out a new string formulated in the following manner:
 * last character + middle string + first character
 */
public class ChTwoLabThreeConcatenation {

	public static void main(String[] args) {
		
		// Creating an instance of the Scanner class
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String myString = in.nextLine();// getting user input
		
		char firstChar = myString.charAt(0);// storing first character 
		
		char lastChar = myString.charAt(myString.length()-1);// storing last character 
		
		String leftover = myString.substring(1,myString.length()-1);// storing middle of the string  
		
		System.out.println(lastChar + leftover + firstChar);//printing output
		
	}

}
