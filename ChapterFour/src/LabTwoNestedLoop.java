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
public class LabTwoNestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i<3; i++) {
			for (int j = 0; j<5; j++) {
				if (j%2==0) {
					System.out.print("-");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
