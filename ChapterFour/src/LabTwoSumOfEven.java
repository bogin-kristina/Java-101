/*
* Kristina Bogin
* 
* March 18, 2024
* 
* CS A170
*/

/**
 * Task 2, Lab 2, Chapter 4. 
 * This program sums up all the even numbers 
 * between 0 and 50 using a for loop. 
 */
public class LabTwoSumOfEven {

	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 0; i < 51; i++) {
			if ( i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("The result of all the even numbers between 0 and 50 is "+sum);


		

	}

}
