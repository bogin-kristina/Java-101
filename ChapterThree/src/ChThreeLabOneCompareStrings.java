/*
* Kristina Bogin
* 
* February 20, 2024
* 
* CS A170
*/

import java.util.Scanner;

/**
 * Task 3, Lab 1, Chapter 3. 
 * This program asks the user to enter two words and then 
 * reports which of the words comes first in the alphabet.
 */
public class ChThreeLabOneCompareStrings {

	public static void main(String[] args) {
		// Creating an instance of the Scanner class
				Scanner in = new Scanner(System.in);
				
				System.out.print("Enter your first word using all lowercase: ");
				String str1 = in.next();// getting user input
				
				System.out.print("Enter your second word using all lowercase: ");
				String str2 = in.next();// getting user input
				
				if (str1.compareTo(str2)<0) {
					System.out.printf("%s comes before %s in the alphabet%n", str1, str2);
				}
				else if(str1.compareTo(str2)>0) {
					System.out.printf("%s comes after %s in the alphabet%n", str1, str2);
				}
				else {
					System.out.printf("%s and %s are equal%n", str1, str2);
				}
	}

}
