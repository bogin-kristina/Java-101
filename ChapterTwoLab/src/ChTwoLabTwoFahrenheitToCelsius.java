/*
* Kristina Bogin
* 
* February 7, 2024
* 
* CS A170
*/

import java.util.Scanner;

/**
 * Task 3 from Lab 2 in Chapter 2. 
 * This program asks the user to enter a temperature in 
 * Fahrenheit and convert that temperature to Celsius.
 */
public class ChTwoLabTwoFahrenheitToCelsius {

	public static void main(String[] args) {
		

		// Creating an instance of the Scanner class
		Scanner in = new Scanner(System.in);
		
		
		// Prompting user to input a temperature		
		System.out.print("Enter a temperature in Fahrenheit: "); 
		double farTemp = in.nextDouble();
				
		double celTemp = (farTemp - 32) * 5/9 ;
				
		System.out.printf("The temperature in Celsius is:  %.3f", celTemp);

	}

}
