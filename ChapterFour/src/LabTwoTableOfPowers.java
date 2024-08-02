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
public class LabTwoTableOfPowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Power of 1\tPower of 2\tPower of 3\tPower of 4\tPower of 5");
		for (int i = 10; i<21; i++) {
			for (int j = 1; j<6; j++) {
				System.out.print((int)Math.pow(i, j)+"\t\t");
			}
			System.out.println();
		}
		
		
		
	}

}
