/*
* Kristina Bogin
* 
* February 20, 2024
* 
* CS A170
*/

import java.util.Scanner;

/**
 * Task 2, Lab 1, Chapter 3. 
 * This program reports whether a number is even or odd.
 */
public class ChThreeLabOneOddEven {

	public static void main(String[] args) {
		// Creating an instance of the Scanner class
				Scanner in = new Scanner(System.in);
				
				System.out.print("Input a number: ");
				int num = in.nextInt();// getting user input
				
				if (num % 2 == 0) { //if expression is true
					System.out.println("The number "+num+" is even");//execute this line
				}
				else {
					System.out.println("The number "+num+" is odd");//otherwise this one
				}

	}

}
